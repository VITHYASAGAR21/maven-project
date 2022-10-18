package org.firstday;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class MultiLoginUseExcel {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		File file = new File("C:\\Users\\k.y.v.r\\Documents\\CLASS\\Frame Work\\Day 4\\Multi.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook book = new XSSFWorkbook(stream);
		
		Sheet sheet = book.getSheet("sheet1");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheet.getRow(i);
			
			
			
			WebElement mail = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
			mail.sendKeys(row);
			
			
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
				
				String value = cell.getStringCellValue();
				
				System.out.println(value);
				
				
				WebElement pass = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
				pass.sendKeys(cell);
			}

			
			
			
			
		}
		
		
		
	}

}
