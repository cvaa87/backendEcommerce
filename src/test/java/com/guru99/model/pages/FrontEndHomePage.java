package com.guru99.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrontEndHomePage extends LoginPage {

	public FrontEndHomePage(WebDriver driver) {
		super(driver);
	}

	public void clickMobileLink() {

		driver.findElement(By.cssSelector(".level0.nav-1.first")).click();

	}
	public void selectImageOfSonyXperia()
	{
		driver.findElement(By.id("product-collection-image-1")).click();
	}
	public void selectReviewsTab()
	{
		driver.findElement(By.xpath("//ul[@class='toggle-tabs']/li[2]")).click();
	}
	

}
