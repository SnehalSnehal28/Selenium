package report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.WebDriver;
import base.BaseTest;

public class TestListener implements ITestListener {

    private static ExtentReports extent = ExtentManager.getInstance();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().log(Status.PASS, "Test Passed");

        // Take screenshot on success
        Object currentClass = result.getInstance();
        WebDriver driver = ((BaseTest) currentClass).driver;
        String screenshotPath = ScreenshotUtil.captureScreenshot(driver, result.getMethod().getMethodName() + "_pass");
        if (screenshotPath != null) {
            test.get().pass("Screenshot on Pass", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.get().log(Status.FAIL, "Test Failed: " + result.getThrowable());

        // Take screenshot on failure
        Object currentClass = result.getInstance();
        WebDriver driver = ((BaseTest) currentClass).driver;

        if (driver != null) {
            String screenshotPath = ScreenshotUtil.captureScreenshot(driver, result.getMethod().getMethodName() + "_fail");
            if (screenshotPath != null) {
                test.get().fail("Screenshot on Failure", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
            }
        } else {
            test.get().fail("Driver is null, screenshot not captured");
        }
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        test.get().log(Status.SKIP, "Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush(); // save report
    }
}
