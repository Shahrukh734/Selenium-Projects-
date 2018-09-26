package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

public class fetchingReportsTest_Douments_CompositeWellLogs extends TestBaseSetup{

	
	public homePage homepage ;
	public contextsearch contextpage;
	public fetchingReports Reports;
	
	//	ContextSearch->Documents_Composite Well Logs
		

	
@Test(enabled=true)
public void TC_001_CompositeWellLogs_Export_CurrentPage_Excel() throws Throwable
{
	Reporter.log("Composite Well Logs Report Export with Currentpage in Excel");
	homepage=new homePage(driver);
	contextpage=new contextsearch(driver);
	Reports=new fetchingReports(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextpage = homepage.selectText("Anjum*");
	contextpage.selectFewcheck();
	Reports.selectDocuments();
	Reports.selectreporting("Composite Well Logs");
	Reports.isAlertPresent();
	Thread.sleep(1000);
	Reports.switchWindows();
	// driver.manage().window().maximize();
	//Reports.exportClick();
	Reports.selectExportoptionsadmin("Current Page Only","excel");
	Reporter.log("Composite Well Logs Report Export with Currentpage in Excel is done successfully");
}
@Test(enabled=true)
public void TC_002_CompositeWellLogs_Export_All_Excel() throws Throwable
{
	Reporter.log("Composite Well Logs Report Export with All in Excel");
	homepage=new homePage(driver);
	contextpage=new contextsearch(driver);
	Reports=new fetchingReports(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextpage = homepage.selectText("Anjum*");
	contextpage.selectFewcheck();
	Reports.selectDocuments();
	Reports.selectreporting("Composite Well Logs");
	Reports.isAlertPresent();
	Reports.switchWindows();
	//Reports.exportClick();
	Reports.selectExportoptionsadmin("All","excel");;
	Reporter.log("Composite Well Logs Report Export with All in Excel is done successfully");
}
}
