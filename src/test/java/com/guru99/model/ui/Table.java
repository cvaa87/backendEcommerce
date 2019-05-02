package com.guru99.model.ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Table {

	public WebElement element;

	public Table(WebElement element) {
		this.element = element;
	}

	public void clickCheckBox() {

		WebElement table = element.findElement(By.tagName("tbody"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for (int i = 0; i < rows.size(); i++) {
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			System.out.println(columns.size());
			for (int j = 0; j < columns.size(); j++) {
				WebElement item = columns.get(j);
				WebElement checkbox = element
						.findElement(By.xpath("//*[@id=\"sales_order_grid_table\"]/tbody/tr[1]/td[1]"));
				if (item.equals(checkbox)) {
					item.click();
				}

			}

		}

	}
}
