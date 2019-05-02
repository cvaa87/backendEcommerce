package com.guru99.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubmitReviewPage extends LoginPage {

	public SubmitReviewPage(WebDriver driver) {
		super(driver);
		
	}
	public void goToFrontEndWebsite()
	{
		driver.get("http://live.guru99.com/index.php/review/product/list/id/1/");
	}
	public void submitReview(String review, String summary, String nickname)
	{
		driver.findElement(By.id("review_field")).sendKeys(review);
		driver.findElement(By.id("summary_field")).sendKeys(summary);
		driver.findElement(By.id("nickname_field")).sendKeys(nickname);
		driver.findElement(By.cssSelector("button[title = 'Submit Review']")).click();
	}
	public void goToBackEndWebsite()
	{
		driver.get("http://live.guru99.com/index.php/backendlogin");
	}

}
