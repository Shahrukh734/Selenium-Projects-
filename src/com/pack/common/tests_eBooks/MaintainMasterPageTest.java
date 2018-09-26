package com.pack.common.tests_eBooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects_eBooks.AddMasterPage;
import com.pack.common.pageobjects_eBooks.MaintainBooks;
import com.pack.common.pageobjects_eBooks.ebooks_BookViewer;
import com.pack.common.pageobjects_eBooks.homePage;

public class MaintainMasterPageTest extends TestBaseSetup{
	
	//public  WebDriver driver;
	public homePage homepage ;


	
	@Test(enabled=true)
	public void TC_001_eBooks_Page() throws Throwable{
		
		homepage = new homePage(driver);
		
		Reporter.log("To select BookName from MaintainBooks");
		MaintainBooks selectBookName = homepage.clickOnMaintainBooks().selectBookName("Koula Wellbook 2015");
		
		Reporter.log("To AddMasterPageToChapters");
	    homePage addMasterPageToChapters = selectBookName.AddMasterPageToChapters("Wellbore","TextFieldControl_8May");
	     
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = addMasterPageToChapters.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("TextFieldControl_8May");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("TextFieldControl_8May").TypeInField("demo",2000,0);

	}


	
}
