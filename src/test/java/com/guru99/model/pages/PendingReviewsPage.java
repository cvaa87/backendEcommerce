package com.guru99.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.guru99.model.ui.PendingReviewsTable;

public class PendingReviewsPage extends LoginPage {
	
	PendingReviewsTable pTable;
	
	public PendingReviewsPage(WebDriver driver) {
		super(driver);
		
	}
    /*public void selectEditLink()
    {
    	pTable = new PendingReviewsTable(driver.findElement(By.cssSelector(".grid")));
    	pTable.clickEditLink();
    }*/
	public void clickEditLink()
	{
		driver.findElement(By.cssSelector("#reviwGrid_table > tbody > tr:nth-child(1) > td.last > a")).click();
	}
	
	
	
}
