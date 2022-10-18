package org.firstday;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateTheCell {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\k.y.v.r\\Documents\\CLASS\\Frame Work\\Day 5\\Multi.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook book=new XSSFWorkbook(stream);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				
				if (value.equalsIgnoreCase("sagar@21")) {
					cell.setCellValue("sagar@22");
					FileOutputStream out = new FileOutputStream(f);
					book.write(out);
					
					
				}
				String stringCellValue = cell.getStringCellValue();
				System.out.print("\t"+stringCellValue);
				
				
			}
			System.out.println();
			
		}
		
	}

}
