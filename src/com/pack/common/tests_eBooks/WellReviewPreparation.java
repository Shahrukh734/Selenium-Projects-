package com.pack.common.tests_eBooks;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects_eBooks.eBooksPage;
import com.pack.common.pageobjects_eBooks.ebooks_BookViewer;
import com.pack.common.pageobjects_eBooks.homePage;

public class WellReviewPreparation extends TestBaseSetup{

	public homePage homepage ;
	
	@Test
	public void createAWR() throws Throwable{
		homepage = new homePage(driver);
		
		
		Reporter.log("Naviagting to ebooks Page",true);
	    eBooksPage eBooksPage = homepage.clickon_eBooks();
	    Reporter.log("ebooks Page is loaded",true);
	    
	    Reporter.log("clickOn wellReviewPreparation from well review menu",true);
	    com.pack.common.pageobjects_eBooks.WellReviewPreparation wellReviewPreparation = eBooksPage.clickOn_wellReviewPreparation();
	    Reporter.log("wellReviewPreparation page is loaded",true);
	    
	 // date should be in format = 12/07/2014
	    Reporter.log("Enter the awrName and awrDate to create the AnnualWellReview",true);
	    wellReviewPreparation.CreateAnnualWellreview().Enter_awrName("AWRTest").select_awrDate("25/07/2018");
	    
	     
	    
	    
		
	}

}
