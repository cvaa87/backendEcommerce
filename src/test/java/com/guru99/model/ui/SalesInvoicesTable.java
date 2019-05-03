package com.guru99.model.ui;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SalesInvoicesTable {
	
	public WebElement rootElement;
	
	
	public SalesInvoicesTable(WebElement rootElement)
	{
		this.rootElement = rootElement;
	}
	public ArrayList<String> getListOfSalesInvoiceDates(String searchcoloumn)
	{
		WebElement headings = rootElement.findElement(By.cssSelector(".headings")); 
		List<WebElement> tableheader=headings.findElements(By.tagName("th"));
		System.out.println("No of header elements:" + tableheader.size());
		int searchindex = 0;
		int i;
		for(i=1;i<tableheader.size();i++)
		{
			String c = tableheader.get(i).getText();
			System.out.println("Value of c:" + c);
			if(c.equalsIgnoreCase(searchcoloumn))
			{
				 searchindex=i;
				 break;
			}
						
		}
		System.out.println("Index of Invoice date is:" + searchindex);
		
		WebElement body = rootElement.findElement(By.tagName("tbody"));
		List<WebElement> tablerows = body.findElements(By.tagName("tr"));
		System.out.println("Number of rows:" + tablerows.size() );
		ArrayList<String> array = new ArrayList<String>();
		for(int j=0;j<tablerows.size();j++)
		{
			
			List<WebElement> coloumn = tablerows.get(j).findElements(By.tagName("td"));
		    array.add(coloumn.get(searchindex).getText());
			
		}
		System.out.println("List of Dates" + array);
		return array;
		
	}

}
