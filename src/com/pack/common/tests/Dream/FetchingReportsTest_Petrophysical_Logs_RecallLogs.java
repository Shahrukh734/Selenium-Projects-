package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

/*TestScript Designed On 23/04/2018
 TestScript Designed By  Mudassir */

public class FetchingReportsTest_Petrophysical_Logs_RecallLogs extends TestBaseSetup {

	public homePage homepage;

	// ContextSearch->Petrophysical-> Logs

	// withoutCheck --> --> false -->c.p--> excel
	@Test(enabled = true)
	public void TC_001_contextSearch_Petrophysical_Logs_WithoutCheckAll_currentPage_Excel() throws Throwable {

		Reporter.log("Logs Recall Logs", true);
		homepage = new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

		contextsearch contextpage = homepage.selectText("Anjum*");

		Reporter.log("All Fields Selected", true);
		contextsearch selectCores = contextpage.selectAllcheck().selectPetrophysical();

		fetchingReports fetchingReports = selectCores.selectreporting("Logs");
		
		fetchingReports.isAlertPresent();// for pop up added 28/05/2018
		
		fetchingReports.switchWindows();
		driver.manage().window().maximize();

		Thread.sleep(300);
		Reporter.log("Cores selected", true);
		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectLogServices(), "FPP");
		Reporter.log("FPP selected", true);

		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectLogType(), "00J");
		Reporter.log("00J selected", true);

		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
		Reporter.log("ALL selected", true);
		fetchingReports.getclickLogsSubmitButton();
		Thread.sleep(300);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		Reporter.log("Unit Conversion selected", true);
		Thread.sleep(300);
		fetchingReports.fetchHoldUpDepthReportResult(false, "currentpage", "excel", "single");
		Thread.sleep(300);

		Reporter.log("currentpage selected", true);
		Reporter.log("export options Withoutcheck", true);

	}

	// withoutCheck --> false --> All --> excel
	@Test(enabled=true)
	public void TC_002_contextSearch_Petrophysical_Logs_WithoutCheckAll_All_Excel() throws Throwable {

		Reporter.log("Logs Recall Logs", true);
		homepage = new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

		contextsearch contextpage = homepage.selectText("Anjum*");

		Reporter.log("All Fields Selected", true);
		contextsearch selectCores = contextpage.selectAllcheck().selectPetrophysical();

		fetchingReports fetchingReports = selectCores.selectreporting("Logs");
		fetchingReports.isAlertPresent();// for pop up added 28/05/2018

		fetchingReports.switchWindows();
		driver.manage().window().maximize();

		Thread.sleep(300);
		Reporter.log("Cores selected", true);
		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectLogServices(), "FPP");
		Reporter.log("FPP selected", true);

		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectLogType(), "00J");
		Reporter.log("00J selected", true);

		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
		Reporter.log("ALL selected", true);
		fetchingReports.getclickLogsSubmitButton();
		Thread.sleep(300);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		Reporter.log("Unit Conversion selected", true);
		Thread.sleep(300);
		fetchingReports.fetchHoldUpDepthReportResult(false, "All", "excel", "single");
		Thread.sleep(300);

		Reporter.log("All selected", true);
		Reporter.log("export options Withoutcheck", true);

	}

	// CheckAll -->c.p --> excel
	@Test(enabled=true)
	public void TC_003_contextSearch_Petrophysical_Logs_CheckAll_All_Excel() throws Throwable {

		Reporter.log("Logs Recall Logs", true);
		homepage = new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

		contextsearch contextpage = homepage.selectText("Anjum*");

		Reporter.log("All Fields Selected", true);
		contextsearch selectCores = contextpage.selectAllcheck().selectPetrophysical();

		fetchingReports fetchingReports = selectCores.selectreporting("Logs");
		fetchingReports.isAlertPresent();// for pop up added 28/05/2018
		fetchingReports.switchWindows();
		driver.manage().window().maximize();

		Thread.sleep(300);
		Reporter.log("Cores selected", true);
		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectLogServices(), "FPP");
		Reporter.log("FPP selected", true);

		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectLogType(), "00J");
		Reporter.log("00J selected", true);

		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
		Reporter.log("ALL selected", true);
		fetchingReports.getclickLogsSubmitButton();
		Thread.sleep(300);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		Reporter.log("Unit Conversion selected", true);
		Thread.sleep(300);
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel", "single");
		Thread.sleep(300);

		Reporter.log("All selected", true);
		Reporter.log("export options With check All", true);

	}

	// CheckAll -->All --> excel --> multiple
	@Test(enabled=true)
	public void TC_004_contextSearch_Petrophysical_Logs_CheckAll_All_Excel() throws Throwable {

		Reporter.log("Logs Recall Logs", true);
		homepage = new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

		contextsearch contextpage = homepage.selectText("Anjum*");

		Reporter.log("All Fields Selected", true);
		contextsearch selectCores = contextpage.selectAllcheck().selectPetrophysical();

		fetchingReports fetchingReports = selectCores.selectreporting("Logs");
		fetchingReports.isAlertPresent();// for pop up added 28/05/2018
		fetchingReports.switchWindows();
		driver.manage().window().maximize();

		Thread.sleep(300);
		Reporter.log("Cores selected", true);
		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectLogServices(), "FPP");
		Reporter.log("FPP selected", true);

		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectLogType(), "00J");
		Reporter.log("00J selected", true);

		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
		Reporter.log("ALL selected", true);
		fetchingReports.getclickLogsSubmitButton();
		Thread.sleep(300);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		Reporter.log("Unit Conversion selected", true);
		Thread.sleep(300);
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel", "Multi");
		Thread.sleep(300);

		Reporter.log("All selected", true);
		Reporter.log("export options With check All", true);

	}

	// CheckAll -->All --> excel --> multiple --> EDITED
	@Test(enabled=true)
	public void TC_005_contextSearch_Petrophysical_Logs_CheckAll_All_Excel() throws Throwable {

		Reporter.log("Logs Recall Logs", true);
		homepage = new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

		contextsearch contextpage = homepage.selectText("Anjum*");

		Reporter.log("All Fields Selected", true);
		contextsearch selectCores = contextpage.selectAllcheck().selectPetrophysical();

		fetchingReports fetchingReports = selectCores.selectreporting("Logs");
		fetchingReports.isAlertPresent();// for pop up added 28/05/2018
		fetchingReports.switchWindows();
		driver.manage().window().maximize();

		Thread.sleep(300);
		Reporter.log("Cores selected", true);
		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectLogServices(), "FPP");
		Reporter.log("FPP selected", true);

		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectLogType(), "EDITED");
		Reporter.log("00J selected", true);

		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
		Reporter.log("ALL selected", true);
		fetchingReports.getclickLogsSubmitButton();
		Thread.sleep(300);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		Reporter.log("Unit Conversion selected", true);
		Thread.sleep(300);
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel", "Multi");
		Thread.sleep(300);

		Reporter.log("All selected", true);
		Reporter.log("export options With check All", true);

	}

	// CheckAll -->All --> excel --> multiple --> RAW
	@Test(enabled=true)
	public void TC_006_contextSearch_Petrophysical_Logs_CheckAll_All_Excel() throws Throwable {

		Reporter.log("Logs Recall Logs", true);
		homepage = new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

		contextsearch contextpage = homepage.selectText("Anjum*");

		Reporter.log("All Fields Selected", true);
		contextsearch selectCores = contextpage.selectAllcheck().selectPetrophysical();

		fetchingReports fetchingReports = selectCores.selectreporting("Logs");
		fetchingReports.isAlertPresent();// for pop up added 28/05/2018
		fetchingReports.switchWindows();
		driver.manage().window().maximize();

		Thread.sleep(300);
		Reporter.log("Cores selected", true);
		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectLogServices(), "FPP");
		Reporter.log("FPP selected", true);

		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectLogType(), "RAW");
		Reporter.log("00J selected", true);

		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
		Reporter.log("ALL selected", true);
		fetchingReports.getclickLogsSubmitButton();
		Thread.sleep(300);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		Reporter.log("Unit Conversion selected", true);
		Thread.sleep(300);
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel", "Multi");
		Thread.sleep(300);

		Reporter.log("All selected", true);
		Reporter.log("export options With check All ", true);

	}

}
