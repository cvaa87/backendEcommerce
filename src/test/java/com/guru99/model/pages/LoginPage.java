package com.guru99.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.guru99.model.dialogs.IncomingMessagePopUp;



public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUsername(String username)
	{
		driver.findElement(By.id("username")).sendKeys(username);
	}
	public void setPassword(String password)
	{
		driver.findElement(By.id("login")).sendKeys(password);
	}
	public IncomingMessagePopUp clickLoginButton()
	{
		driver.findElement(By.cssSelector(".form-button")).click();
		return new IncomingMessagePopUp(driver.findElement(By.id("message-popup-window")));
	}
}
