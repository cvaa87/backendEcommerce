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
				WebElement editlink = element.findElement(By.xpath("//*[@id='reviwGrid_table']/tbody/tr[1]/td[10]/a"));
				if (item.equals(editlink)) {
					item.click();
				}

			}

		}

	}
}

