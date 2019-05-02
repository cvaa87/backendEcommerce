package com.guru99.model.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
protected WebDriver driver;
	
	@BeforeMethod
	public void startUpTest()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://live.guru99.com/index.php/backendlogin");
	}
	
	@AfterMethod
	public void shutDownTest()
	{
		//driver.close();
	}
	
	

}
