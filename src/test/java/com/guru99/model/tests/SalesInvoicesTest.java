package com.guru99.model.tests;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.guru99.model.dialogs.IncomingMessagePopUp;
import com.guru99.model.pages.AdminPanelBasePage;
import com.guru99.model.pages.LoginPage;
import com.guru99.model.pages.SalesInvoicePage;

public class SalesInvoicesTest extends BaseTest {
	
	@Test
	public void verifySortingSalesInvoicesDate()
	{
		LoginPage lP = new LoginPage(driver);
		lP.setUsername("user01");
		lP.setPassword("guru99com");
		IncomingMessagePopUp incomingMessagePopUp = lP.clickLoginButton();
		incomingMessagePopUp.closePopUp();
		AdminPanelBasePage aPBP = new AdminPanelBasePage(driver);
		aPBP.mouseoverSalesOption();
		aPBP.selectInvoicesFromSalesMenu();
		SalesInvoicePage sIP = new SalesInvoicePage(driver);
		sIP.sortSalesInvoiceByDate();
		ArrayList<String> sList = sIP.getSortedListOfSalesInvoice();
	}

}
