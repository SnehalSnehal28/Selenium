package com.tops.ExcelMaven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("TestData");
		
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("Username");
		row.createCell(1).setCellValue("Password");
		
		Row row1 = sheet.createRow(1);
		row1.createCell(0).setCellValue("Admin");
		row1.createCell(1).setCellValue("Admin$123");
		
		XSSFSheet sheet1 = workbook.createSheet("TestData1");
		
		Row sheet1row = sheet1.createRow(0);
		sheet1row.createCell(0).setCellValue("First-Name");
		sheet1row.createCell(1).setCellValue("Second-Name");
		
		Row sheet1row1 = sheet1.createRow(1);
		sheet1row1.createCell(0).setCellValue("Solanki");
        sheet1row1.createCell(1).setCellValue("Snehal");
        
        FileOutputStream fos = new FileOutputStream("TestData/Data1.xlsx");
        workbook.write(fos);
        workbook.close();
        fos.close();
        System.out.println("Data written successfully");
        
}
}