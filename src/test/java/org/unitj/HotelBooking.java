package org.unitj;


import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotelBooking {
	private static WebDriver driver;
	@BeforeClass
	public static void browserOpen() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");
		System.out.println("Browser successfully opened");
	

	}
	@Before
	public void enterPass() {
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("vithyasagar");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("12345678");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	    System.out.println("login succsess fully done");

	}
	@Test
	public void registerHotel() {
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByValue("New York");
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s2 = new Select(hotel);
		s2.selectByVisibleText("Hotel Hervey");
		
		WebElement type = driver.findElement(By.id("room_type"));
		Select s3 = new Select(type);
		s3.selectByValue("Double");
		
		WebElement number = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(number);
		s4.selectByValue("3");
		
		WebElement inDate = driver.findElement(By.id("datepick_in"));
		inDate.sendKeys("27\09\2022");
		
		WebElement outDate = driver.findElement(By.id("datepick_out"));
		outDate.sendKeys("28\09\2022");
		
		WebElement adults = driver.findElement(By.id("adult_room"));
		Select s5 = new Select(adults);
		s5.selectByValue("2");
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select s6 = new Select(child);
		s6.selectByValue("0");
		
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		
		System.out.println("registration proccess completed");
		
		
		

	}
	@After
	public void bokingConfirmation() {
		WebElement tap = driver.findElement(By.id("radiobutton_0"));
		tap.click();
		
	    WebElement contin = driver.findElement(By.id("continue"));
		contin.click();
		
		WebElement first = driver.findElement(By.id("first_name"));
		first.sendKeys("vithyasagar");
		
		WebElement last = driver.findElement(By.id("last_name"));
		last.sendKeys("k");
		
		WebElement address  = driver.findElement(By.id("address"));
		address.sendKeys("2/134 stret");
		
		WebElement cardNo = driver.findElement(By.id("cc_num"));
	    cardNo.sendKeys("1234567891234567");
	    
	    WebElement card = driver.findElement(By.id("cc_type"));
	    Select s = new Select(card);
	    s.selectByValue("MAST");
	    
	    WebElement month = driver.findElement(By.id("cc_exp_month"));
	    Select s2 = new Select(month);
	    s2.selectByValue("9");
	    
	    WebElement year = driver.findElement(By.id("cc_exp_year"));
	    Select s3 = new Select(year);
	    s3.selectByValue("2022");
	    
	    WebElement cvv = driver.findElement(By.id("cc_cvv"));
	    cvv.sendKeys("123");
	    
	    WebElement book = driver.findElement(By.id("book_now"));
	    book.click();
	    
	    System.out.println("Hotel Booked success fully");
	}
	@AfterClass
	public static void getBookinId() {
		WebElement get = driver.findElement(By.id("order_no"));
		String att = get.getAttribute("value");
		System.out.println(att);
		System.out.println("sucess fully get order id");

	}
	

}
