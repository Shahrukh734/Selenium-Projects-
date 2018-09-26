package com.pack.common.tests.Dream;




import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.advanceSearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

// anj-2 --> true--> c.p --> Excel

public class AdvancedSearch_File_search extends TestBaseSetup {

	public homePage homepage;
	public advanceSearch advancesearch;
	public fetchingReports fetchingreports;
   
	@Test(enabled = true)
	public void TC_001_Sub_AdvancedSearch_File_Search() throws Throwable {

		Reporter.log("Advancesearch saved Search", true);
		homepage = new homePage(driver);
		advancesearch = new advanceSearch(driver);
		fetchingreports = new fetchingReports(driver);

		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		Thread.sleep(5000);
		advancesearch.selectadvanceSearch();

		advancesearch.selectFrame();
		Reporter.log("switched to frame", true);
		Thread.sleep(3000);
		advancesearch.drpdownList(advancesearch.getdrpdowncboSearchCriteria(), "Wellbore Name");
		Thread.sleep(5000);
		advancesearch.fileUploader();
		advancesearch.cmdSearch();
		
		Reporter.log("fileUploader clicked  ", true);
		/*advancesearch.selectcmdTopSearch();
		// advancesearch.selectFrame();

		fetchingreports.fetchDailyWellReport(true, "currentpage", "excel");
		*/

	}

	
	
				
}