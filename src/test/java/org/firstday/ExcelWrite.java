package org.firstday;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\k.y.v.r\\Documents\\CLASS\\Frame Work\\Day 5\\write.xlsx");

		Workbook book = new XSSFWorkbook();

		Sheet sheet = book.createSheet("vithya");

		Row row = sheet.createRow(0);

		Cell cell = row.createCell(0);

		cell.setCellValue("vithyasagar");

		Row row1 = sheet.createRow(1);

		Cell cell1 = row1.createCell(0);

		cell1.setCellValue("vithya");

		FileOutputStream stream = new FileOutputStream(file);

		book.write(stream);
	}

}
