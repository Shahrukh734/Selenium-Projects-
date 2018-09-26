package com.pack.common.SystemTests;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;

import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.advanceSearch;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

public class TC_Evergreen_Sprint12 extends TestBaseSetup {
	public homePage homepage;
	public advanceSearch advancesearch;
	public fetchingReports fetchingreports;
	
	@Test(enabled=false)
	public void TC_001_Some_Wells_not_visible_through_the_Well_Quick_Search() throws Throwable {
		Reporter.log("Quick Search For well name as Tripscom");
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Well");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Tripscom*");
		contextpage.selectAllcheck();
		Reporter.log("Records got displayed for the tripscom* quick Search.");
	}
		
	
	//WRFMSSW_PORTAL_UIE : Elevation Images window is not opening in Strings report when multiple wellbores are selected	

	//not executed
	@Test(enabled=false)
	public void TC_002_Elevation_Images_window() throws Throwable{
		

		homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		
		Thread.sleep(5000);
		Reporter.log("Select the String report from Context Search");
		 contextpage.selectFewcheck();
		 contextpage.selectWellEngineering();
		 contextpage.selectMechanicalWellData();
		 Thread.sleep(5000);
		 fetchingReports fetchingReports = contextpage.selectreporting("Strings");
		 Thread.sleep(5000);
		 Reporter.log("Swtich to report window and perfrom operations");
		 fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "AllWelbore");
		 Thread.sleep(5000);
		 fetchingReports.selectResultRecords(true);
		 fetchingReports.getbtninfo().click();
		 fetchingReports.switchWindows();
	     Assert.assertTrue(fetchingReports.getImage().isDisplayed()) ;
	     Reporter.log("Image got displayed Successfully");
		}
	//UIE: Change for functional email address of QC button in Dream-Recall Cores Report -> tab Core Reports from EP Catalog
	@Test(enabled = false)
	public void TC_001_contextSearch_Petrophysical_Cores_WithoutCheckAll_currentPage_Excel() throws Throwable {

		Reporter.log("Cores", true);
		homepage = new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

		contextsearch contextpage = homepage.selectText("Anjum*");

		Reporter.log("All Fields Selected", true);
		contextsearch selectCores = contextpage.selectAllcheck().selectPetrophysical();

		fetchingReports fetchingReports = selectCores.selectreporting("Cores");

		fetchingReports.switchWindows();
		driver.manage().window().maximize();

		Thread.sleep(3000);
		Reporter.log("Cores selected", true);
		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM- 1");
		Reporter.log("Anjum1 selected", true);
		fetchingReports.selectUnitConversionOptions("feet");
		//click on qc button
		fetchingReports.getbtnQCClick();
		Thread.sleep(1000);
		//fetchingReports.switchWindows();
		fetchingReports.gettextSend_to_recall_core();
		Reporter.log("Expected and Actual mail address retrived both are same.");
		

	}
	@Test(enabled = true)
	public void TC_002_contextSearch_Petrophysical_Cores_WithoutCheckAll_currentPage_Excel() throws Throwable {

		Reporter.log("Cores", true);
		homepage = new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

		contextsearch contextpage = homepage.selectText("Anjum*");

		Reporter.log("All Fields Selected", true);
		contextsearch selectCores = contextpage.selectAllcheck().selectPetrophysical();

		fetchingReports fetchingReports = selectCores.selectreporting("Cores");

		fetchingReports.switchWindows();
		driver.manage().window().maximize();

		Thread.sleep(300);
		Reporter.log("Cores selected", true);
		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM- 1");
		Reporter.log("Anjum1 selected", true);
		fetchingReports.selectUnitConversionOptions("feet");
	    fetchingReports.getCoreReportsfromEPCatalogClick();
	    fetchingReports.getbtnQCClick();
	    fetchingReports.switchWindows();
		fetchingReports.gettextSend_to_core__report();
		Reporter.log("Expected and Actual mail address retrived both are same.");
	}
}
