package com.guru99.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EditReviewPage extends LoginPage {

	public EditReviewPage(WebDriver driver) {
		super(driver);
		
	}
	public void selectStatusofReview(String value)
	{
		Select s = new Select(driver.findElement(By.id("status_id")));
		s.selectByValue(value);
	}
	public void clickSaveReviewButton()
	{
		driver.findElement(By.id("save_button")).click();
	}

}
