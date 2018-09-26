package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

/*TestScript Designed On 25/04/2018
 TestScript Designed By  Mudassir */

public class FetchingReportsTest_Petrophysical_Log_Films extends TestBaseSetup {

	public homePage homepage;

	// ContextSearch->Petrophysical-> Log Films

	// unit conversion --> false --> currentpage --> excel
	@Test(enabled = true)
	public void TC_001_contextSearch_Petrophysical_Log_Films_WithoutCheckAll_currentPage_Excel() throws Throwable {

		Reporter.log("Log Films", true);
		homepage = new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

		contextsearch contextpage = homepage.selectText("Anjum*");

		Reporter.log("All Fields Selected", true);
		contextsearch selectCores = contextpage.selectFewcheck().selectPetrophysical();
		// selectAllcheck()
		fetchingReports fetchingReports = selectCores.selectreporting("Log Films");

		fetchingReports.switchWindows();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		Reporter.log("Unit Conversion Options selected", true);
		fetchingReports.fetchDailyWellReport(false, "currentpage", "excel");
		Reporter.log("without check currentpage excel selected", true);
		
	}

	// unit conversion --> false --> All --> excel
	@Test(enabled = true)
	public void TC_002_contextSearch_Petrophysical_Log_Films_WithoutCheckAll_currentPage_Excel() throws Throwable {

		Reporter.log("Log Films", true);
		homepage = new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

		contextsearch contextpage = homepage.selectText("Anjum*");

		Reporter.log("All Fields Selected", true);
		contextsearch selectCores = contextpage.selectFewcheck().selectPetrophysical();
		// selectAllcheck()
		fetchingReports fetchingReports = selectCores.selectreporting("Log Films");
		Thread.sleep(3000);
		fetchingReports.switchWindows();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		Reporter.log("Unit Conversion Options selected", true);
		fetchingReports.fetchDailyWellReport(false, "All", "excel");
		
		Reporter.log("without check All excel selected", true);
		
	}

	// unit conversion --> true --> All --> excel
	@Test(enabled = true)
	public void TC_003_contextSearch_Petrophysical_Log_Films_WithoutCheckAll_currentPage_Excel() throws Throwable {

		Reporter.log("Log Films", true);
		homepage = new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

		contextsearch contextpage = homepage.selectText("Anjum*");

		Reporter.log("All Fields Selected", true);
		contextsearch selectCores = contextpage.selectFewcheck().selectPetrophysical();
		// selectAllcheck()
		fetchingReports fetchingReports = selectCores.selectreporting("Log Films");

		fetchingReports.switchWindows();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		Reporter.log("Unit Conversion Options selected", true);
		fetchingReports.fetchDailyWellReport(true, "All", "excel");
		
		Reporter.log("check All excel selected", true);
		
	}

	// unit conversion --> meters--> true --> All --> excel
	@Test(enabled = true)
	public void TC_004_contextSearch_Petrophysical_Log_Films_WithoutCheckAll_currentPage_Excel() throws Throwable {

		Reporter.log("Log Films", true);
		homepage = new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

		contextsearch contextpage = homepage.selectText("Anjum*");

		Reporter.log("All Fields Selected", true);
		contextsearch selectCores = contextpage.selectFewcheck().selectPetrophysical();
		// selectAllcheck()
		fetchingReports fetchingReports = selectCores.selectreporting("Log Films");

		fetchingReports.switchWindows();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		Reporter.log("Unit Conversion Options selected", true);
		fetchingReports.fetchDailyWellReport(true, "All", "excel");
		Reporter.log("check All excel selected", true);
		
	}

}
