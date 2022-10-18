package org.firstday;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelPractice {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();

		File file = new File("C:\\Users\\k.y.v.r\\Documents\\CLASS\\Frame Work\\Day 3\\test.xlsx");

		FileInputStream f = new FileInputStream(file);

		Workbook book = new XSSFWorkbook(f);

		Sheet sheet = book.getSheet("Sheet1");

		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);

		String value = cell.getStringCellValue();
		System.out.println(value);

		WebElement findElement = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		findElement.sendKeys(value);

		Row row2 = sheet.getRow(1);
		Cell cell2 = row2.getCell(0);
		String value2 = cell2.getStringCellValue();
		System.out.println(value2);

		WebElement pass = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		pass.sendKeys(value2);

	}

}
