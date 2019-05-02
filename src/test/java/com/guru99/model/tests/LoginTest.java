package com.guru99.model.tests;

import org.testng.annotations.Test;

import com.guru99.model.dialogs.IncomingMessagePopUp;
import com.guru99.model.pages.LoginPage;


public class LoginTest extends BaseTest {
	
	@Test
	public void loginToAdminTest()
	{
		LoginPage lP = new LoginPage(driver);
		lP.setUsername("user01");
		lP.setPassword("guru99com");
		IncomingMessagePopUp incomingMessagePopUp = lP.clickLoginButton();
		incomingMessagePopUp.closePopUp();
		
	}

}