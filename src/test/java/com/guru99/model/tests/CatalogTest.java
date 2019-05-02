package com.guru99.model.tests;

import org.testng.annotations.Test;

import com.guru99.model.dialogs.IncomingMessagePopUp;
import com.guru99.model.pages.AdminPanelBasePage;
import com.guru99.model.pages.EditReviewPage;
import com.guru99.model.pages.FrontEndHomePage;
import com.guru99.model.pages.LoginPage;
import com.guru99.model.pages.PendingReviewsPage;
import com.guru99.model.pages.SubmitReviewPage;

public class CatalogTest extends BaseTest {
	
	
	@Test
	public void verifyProductReviewMechanism()
	{
		SubmitReviewPage sRP = new SubmitReviewPage(driver);
		sRP.goToFrontEndWebsite();
		sRP.submitReview("Siva's review-Test", "Siva's summary", "TTTTTeeeeeee");
		sRP.goToBackEndWebsite();
		LoginPage lP = new LoginPage(driver);
		lP.setUsername("user01");
		lP.setPassword("guru99com");
		IncomingMessagePopUp incomingMessagePopUp = lP.clickLoginButton();
		incomingMessagePopUp.closePopUp();
		AdminPanelBasePage aPBP = new AdminPanelBasePage(driver);
		aPBP.selectPendingReviews();
		PendingReviewsPage pRP = new PendingReviewsPage(driver);
		pRP.selectEditLink();
		EditReviewPage eDP = new EditReviewPage(driver);
		eDP.selectStatusofReview("1");
		eDP.clickSaveReviewButton();
		sRP.goToFrontEndWebsite();
		FrontEndHomePage fEHP = new FrontEndHomePage(driver);
		fEHP.clickMobileLink();
		fEHP.selectImageOfSonyXperia();
		fEHP.selectReviewsTab();
		
	}

}
