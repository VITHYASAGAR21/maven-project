package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotelBookUseParameter {
	private static WebDriver driver;

	@Test(priority = -3)
	private void webConfigration() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
	}

	@Parameters({ "user", "password" })
	@Test(priority = -2)
	private void login(String name, String pass) {
		WebElement userText = driver.findElement(By.id("username"));
		userText.sendKeys(name);
		WebElement textPass = driver.findElement(By.id("password"));
		textPass.sendKeys(pass);
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

	@Parameters({ "location", "hotels", "types" })
	@Test(priority = -1)
	public void registerHotel(String loc, String hot, String typ) {
		WebElement locations = driver.findElement(By.id("location"));
		Select s = new Select(locations);
		s.selectByValue(loc);

		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s2 = new Select(hotel);
		s2.selectByVisibleText(hot);

		WebElement type = driver.findElement(By.id("room_type"));
		Select s3 = new Select(type);
		s3.selectByValue(typ);

	}

	@Parameters({ "noRooms", "inDate", "outDate" })
	@Test(priority = 0)
	private void registerHotel2(String three, String nowDate, String afterDate) {
		WebElement number = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(number);
		s4.selectByValue(three);

		WebElement inDate = driver.findElement(By.id("datepick_in"));
		inDate.sendKeys(nowDate);

		WebElement outDate = driver.findElement(By.id("datepick_out"));
		outDate.sendKeys(afterDate);

		

	}
	@Parameters({"adultPer","childPer"})
	@Test(priority=1)
	private void register3(String adult,String child) {
		WebElement adults = driver.findElement(By.id("adult_room"));
		Select s5 = new Select(adults);
		s5.selectByValue(adult);

		WebElement childs = driver.findElement(By.id("child_room"));
		Select s6 = new Select(childs);
		s6.selectByValue(child);

		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		

	}
	
	@Test(priority=2)
	private void selectHote() {
		WebElement tap = driver.findElement(By.id("radiobutton_0"));
		tap.click();
		
	    WebElement contin = driver.findElement(By.id("continue"));
		contin.click();
		
		

	}
	@Parameters({"firstName","lastName","userAdress","cardNumber"})
	@Test(priority=3)
	private void bookHotel(String firstn,String Lastn,String adressUser,String card ) {
		WebElement first = driver.findElement(By.id("first_name"));
		first.sendKeys(firstn);
		
		WebElement last = driver.findElement(By.id("last_name"));
		last.sendKeys(Lastn);
		
		WebElement address  = driver.findElement(By.id("address"));
		address.sendKeys(adressUser);
		
		WebElement cardNo = driver.findElement(By.id("cc_num"));
	    cardNo.sendKeys(card);
	    
	  
		

	}
	@Parameters({"cardType","bookMonth","bookYear","cvvNumber"})
	@Test(priority=4)
	private void bookHotel2(String name,String bookingMonth,String bookingYear,String cardCvv) {
		  WebElement cardName = driver.findElement(By.id("cc_type"));
		    Select s = new Select(cardName);
		    s.selectByValue(name);
		    
		    WebElement month = driver.findElement(By.id("cc_exp_month"));
		    Select s2 = new Select(month);
		    s2.selectByValue(bookingMonth);
		    
		    WebElement year = driver.findElement(By.id("cc_exp_year"));
		    Select s3 = new Select(year);
		    s3.selectByValue(bookingYear);
		    
		    WebElement cvv = driver.findElement(By.id("cc_cvv"));
		    cvv.sendKeys(cardCvv);
		    
		    WebElement book = driver.findElement(By.id("book_now"));
		    book.click();
		

	}

}
