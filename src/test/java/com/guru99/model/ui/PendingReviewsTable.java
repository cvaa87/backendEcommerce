package com.guru99.model.ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PendingReviewsTable {

	public WebElement element;

	public PendingReviewsTable(WebElement element) {
		this.element = element;
	}

	public void clickEditLink() {

		WebElement table = element.findElement(By.tagName("tbody"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for (int i = 0; i < rows.size(); i++) {
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			System.out.println(columns.size());
			for (int j = 0; j < columns.size(); j++) {
				WebElement item = columns.get(j);
				String text = item.getText();
				System.out.println("Text is" + text);
				WebElement editlink = element.findElement(By.cssSelector("#reviwGrid_table > tbody > tr:nth-child(1) > td.last > a"));
				String etext = editlink.getText();
				System.out.println("eText is" + etext);
				if (item.equals(editlink)) {
					item.click();
					
				}

			}

		}

	}
}

