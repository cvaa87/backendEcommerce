package com.guru99.model.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.guru99.model.ui.Table;



public class SalesOrdersPage extends LoginPage {

	public Table orderTable;

	public SalesOrdersPage(WebDriver driver) {

		super(driver);
		
	}

	public void selectExportType(String exporttype) {
		Select s = new Select(driver.findElement(By.id("sales_order_grid_export")));
		s.selectByVisibleText(exporttype);
	}

	public void clickExportButton() {
		driver.findElement(By.cssSelector("button[title='Export']")).click();
	}

	public void selectStatusOfOrders(String value) {
		Select s = new Select(driver.findElement(By.id("sales_order_grid_filter_status")));
		s.selectByValue(value);
	}

	public void clickSearchButton() throws InterruptedException {
		driver.findElement(By.cssSelector("button[title='Search']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> load = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div#loading-mask")));
        load.clear();
        Thread.sleep(1000);
        driver.switchTo().activeElement();

	}
	public void selectCheckBox()
	{
		orderTable = new Table(driver.findElement(By.cssSelector("table#sales_order_grid_table.data")));
		orderTable.clickCheckBox();
	}
	public void selectActions(String value) {
        Select sel = new Select(driver.findElement(By.id("sales_order_grid_massaction-select")));
        sel.selectByValue(value);
    }
	public void selectSubmitButton()
	{
		driver.findElement(By.cssSelector("button[title='Submit']")).click();

	}
	public String getErrorMessage()
	{
		return driver.findElement(By.cssSelector(".error-msg")).getText();
	}


}
