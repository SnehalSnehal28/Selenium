package com.tops.ExcelMaven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("TestData/Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("TestData");
		
		//Read the data foe Excel file
		
		for (Row row: sheet) {
			for(Cell cell: row) {
				System.out.print(cell.toString() + "\t");
			}
			System.out.println();
		}
		// ------Find the element is match or not------//
		     /*
		      * String s = "Snehal_Solanki"; for(Row row : sheet) {
		      * 
		      * for (Cell cell : row) {
		      * 
		      * //System.out.println(cell.toString()+ "\t");
		      * 
		      * if(s.equals(cell.toString())) { System.out.println("Match"); } }
		      * System.out.println(); } workbook.close(); fis.close();
		      */
		//----find the type of variable
		      //Row row = sheet.getRow(1);
		      //Cell cell = row.getCell(0);
		      //System.out.println(cell.toString());
		      //System.out.println(cell.getCellType());
		
		 }
	
	
	}

	


