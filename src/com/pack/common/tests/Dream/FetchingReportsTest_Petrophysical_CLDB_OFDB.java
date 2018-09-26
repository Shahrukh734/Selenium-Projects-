package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

/*TestScript Designed On 16/04/2018
 TestScript Designed By Mudassir  */

public class FetchingReportsTest_Petrophysical_CLDB_OFDB extends TestBaseSetup {

	public homePage homepage;

	// ContextSearch->Petrophysical-> CLDB/OFDB Links

	// withoutCheck --> --> false -->c.p--> excel
	@Test(enabled = true)
	public void TC_001_contextSearch_Petrophysical_CLDB_OFDB_Links_WithoutCheckAll_currentPage_Excel()
			throws Throwable {

		Reporter.log("CLDB/OFDB Links", true);
		homepage = new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

		contextsearch contextpage = homepage.selectText("Anjum*");

		Reporter.log("All Fields Selected", true);
		contextsearch selectCLDB_OFDB_Links = contextpage.selectAllcheck().selectPetrophysical();

		fetchingReports fetchingReports = selectCLDB_OFDB_Links.selectreporting("CLDB/OFDB Links");

		fetchingReports.switchWindows();
		driver.manage().window().maximize();

		Thread.sleep(300);
		Reporter.log("CLDB/OFDB Links selected", true);

		fetchingReports.fetchDailyWellReport(false, "currentpage", "excel");
		Reporter.log("export options Withoutcheck", true);

	}

	// withoutCheck --> false --> All --> excel
	@Test(enabled = true)
	public void TC_002_contextSearch_Petrophysical_CLDB_OFDB_Links_WithoutCheckAll_All_Excel() throws Throwable {

		Reporter.log("CLDB/OFDB Links", true);
		homepage = new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

		contextsearch contextpage = homepage.selectText("Anjum*");

		Reporter.log("All Fields Selected", true);
		contextsearch selectCLDB_OFDB_Links = contextpage.selectAllcheck().selectPetrophysical();

		fetchingReports fetchingReports = selectCLDB_OFDB_Links.selectreporting("CLDB/OFDB Links");

		fetchingReports.switchWindows();
		driver.manage().window().maximize();

		Thread.sleep(300);
		Reporter.log("CLDB/OFDB Links selected", true);

		fetchingReports.fetchDailyWellReport(false, "All", "excel");
		Reporter.log("export options Withoutcheck", true);

	}

	// CheckAll -->c.p --> excel
	@Test(enabled = true)
	public void TC_003_contextSearch_Petrophysical_CLDB_OFDB_Links_CheckAll_Currentpage_Excel() throws Throwable {

		Reporter.log("CLDB/OFDB Links", true);
		homepage = new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

		contextsearch contextpage = homepage.selectText("Anjum*");

		Reporter.log("All Fields Selected", true);
		contextsearch selectCLDB_OFDB_Links = contextpage.selectAllcheck().selectPetrophysical();

		fetchingReports fetchingReports = selectCLDB_OFDB_Links.selectreporting("CLDB/OFDB Links");

		fetchingReports.switchWindows();
		driver.manage().window().maximize();

		Thread.sleep(200);
		Reporter.log("CLDB/OFDB Links selected", true);

		fetchingReports.fetchDailyWellReport(true, "currentpage", "excel");
		Thread.sleep(300);
		Reporter.log("export options Withoutcheck", true);

	}

	// CheckAll -->All --> excel
	@Test(enabled = true)
	public void TC_004_contextSearch_Petrophysical_CLDB_OFDB_Links_CheckAll_All_Excel() throws Throwable {
		Reporter.log("CLDB/OFDB Links", true);
		homepage = new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

		contextsearch contextpage = homepage.selectText("Anjum*");

		Reporter.log("All Fields Selected", true);
		contextsearch selectCLDB_OFDB_Links = contextpage.selectAllcheck().selectPetrophysical();

		fetchingReports fetchingReports = selectCLDB_OFDB_Links.selectreporting("CLDB/OFDB Links");

		fetchingReports.switchWindows();
		driver.manage().window().maximize();

		Thread.sleep(200);
		Reporter.log("CLDB/OFDB Links selected", true);

		fetchingReports.fetchDailyWellReport(true, "All", "excel");
		Thread.sleep(300);
		Reporter.log("export options Withoutcheck", true);

	}

}
