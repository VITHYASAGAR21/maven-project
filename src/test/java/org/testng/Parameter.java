package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter {
	@Parameters({"user","password"})
	@Test
	private void login(String name,String pass) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys(name);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pass);

	}

}
