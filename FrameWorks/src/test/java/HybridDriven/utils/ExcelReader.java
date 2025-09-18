package HybridDriven.utils;

import java.io.FileInputStream;
import java.io.File;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    public static String getData(String filePath, String sheetName, int row, int col) throws Exception {
        FileInputStream file = new FileInputStream(new File(filePath));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        String data = sheet.getRow(row).getCell(col).getStringCellValue();
        workbook.close();
        file.close();
        return data;
    }

   
}
