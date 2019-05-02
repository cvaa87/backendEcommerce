package com.guru99.model.tests;

import org.testng.annotations.Test;

import com.guru99.model.dialogs.IncomingMessagePopUp;
import com.guru99.model.pages.AdminPanelBasePage;
import com.guru99.model.pages.LoginPage;
import com.guru99.model.pages.SalesOrdersPage;

import junit.framework.Assert;


public class OrdersTest extends BaseTest {

	@Test(enabled = false)
	public void exportSalesOrdersInCSV()
	{
		LoginPage lP = new LoginPage(driver);
		lP.setUsername("user01");
		lP.setPassword("guru99com");
		IncomingMessagePopUp incomingMessagePopUp = lP.clickLoginButton();
		incomingMessagePopUp.closePopUp();
		AdminPanelBasePage aPBP = new AdminPanelBasePage(driver);
		aPBP.mouseoverSalesOption();
		aPBP.selectOrdersFromSalesMenu();
		SalesOrdersPage sOP = new SalesOrdersPage(driver);
		sOP.selectExportType("CSV");
		sOP.clickExportButton();
	}
	
	@Test
	public void printInvoice() throws InterruptedException
	{
		LoginPage lP = new LoginPage(driver);
		lP.setUsername("user01");
		lP.setPassword("guru99com");
		IncomingMessagePopUp incomingMessagePopUp = lP.clickLoginButton();
		incomingMessagePopUp.closePopUp();
		AdminPanelBasePage aPBP = new AdminPanelBasePage(driver);
		aPBP.mouseoverSalesOption();
		aPBP.selectOrdersFromSalesMenu();
		SalesOrdersPage sOP = new SalesOrdersPage(driver);
		sOP.selectStatusOfOrders("canceled");
		sOP.clickSearchButton();
		sOP.selectCheckBox();
		sOP.selectActions("pdfinvoices_order");
		sOP.selectSubmitButton();
		String errorMessage = sOP.getErrorMessage();
		Assert.assertEquals("There are no printable documents related to selected orders.", errorMessage);
		sOP.selectStatusOfOrders("complete");
		sOP.clickSearchButton();
		sOP.selectCheckBox();
		sOP.selectActions("pdfinvoices_order");
		sOP.selectSubmitButton();
	}
}
