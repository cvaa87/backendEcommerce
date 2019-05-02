package com.guru99.model.dialogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IncomingMessagePopUp {
			
		WebElement rootElement;

		public IncomingMessagePopUp(WebElement rootElement) {
			this.rootElement = rootElement;
		}
		
		public void closePopUp()
		{
			rootElement.findElement(By.cssSelector(".message-popup-head a")).click();
		}

	}


