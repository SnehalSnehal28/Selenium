package Assignment.DataDriven;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderUtil {
	
	@DataProvider(name = "LoginData")
	public Object[][] getData() throws IOException {
		FileInputStream fis = new FileInputStream("TestData/DataDriven.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		Object[][] data = new Object[rowCount -1][2];
		
		Iterator<Row> rowIterator = sheet.iterator();
		rowIterator.next(); // Skip header row
		int i = 0;
		
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			data[i][0] = row.getCell(0).getStringCellValue();
			data[i][1] = row.getCell(1).getStringCellValue();
			i++;
		}
		workbook.close();
		fis.close();
		return data;
		
	}

}
