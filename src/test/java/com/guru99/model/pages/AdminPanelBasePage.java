package com.guru99.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AdminPanelBasePage extends LoginPage {

	public AdminPanelBasePage(WebDriver driver) {
		super(driver);
		
	}
	
	public void mouseoverSalesOption()
	{
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//ul[@id='nav']/li[1]"))).build().perform();
		
	}
	public void selectOrdersFromSalesMenu()
	{
		driver.findElement(By.xpath("//ul[@id='nav']/li[1]/ul/li/a/span")).click();
	}
	public void selectPendingReviews()
	{
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//ul[@id='nav']/li[2]"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li/a/span"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li/ul/li[1]/a/span"))).build().perform();
		driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li/ul/li[1]/ul/li[1]/a/span")).click();
	
	}

}
