package com.actitime.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	}
	WebDriver driver= new ChromeDriver();
	@Test
	public void testDemo()
	{
		
		driver.get("https://www.google.com");
		
		Reporter.log("Google accessed", true);
	}
	
	@Test
	public void testDemoActi()
	{
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.close();
		Reporter.log("Actitime accessed", true);
	}

}
