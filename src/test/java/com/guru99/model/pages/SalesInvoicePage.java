package com.guru99.model.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.guru99.model.ui.SalesInvoicesTable;

public class SalesInvoicePage extends LoginPage {
	
	public SalesInvoicesTable sITable;
	ArrayList<String> items = new ArrayList<String>();

	public SalesInvoicePage(WebDriver driver) {
		super(driver);
		
	}
	public void sortSalesInvoiceByDate()
	{
		driver.findElement(By.xpath("//tr[@class='headings']/th[3]/span/a")).click();
	}
	public ArrayList<String> getSortedListOfSalesInvoice() {
		sITable = new SalesInvoicesTable(driver.findElement(By.id("sales_invoice_grid_table")));
		return items = sITable.getListOfSalesInvoiceDates("Invoice Date");
	}

}
