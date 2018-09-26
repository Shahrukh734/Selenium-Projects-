package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

public class fetchingReportsTest_Douments_CBL_VDL extends TestBaseSetup{

	
	public homePage homepage ;
	public contextsearch contextpage;
	public fetchingReports Reports;
	
	//	ContextSearch->Documents_CBL VDL
		

	
@Test(enabled=true)
public void TC_001_CBL_VDL_Export_CurrentPage_Excel() throws Throwable
{
	Reporter.log("CBL_VDL Report Export with Currentpage in Excel");
	homepage=new homePage(driver);
	contextpage=new contextsearch(driver);
	Reports=new fetchingReports(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextpage = homepage.selectText("Anjum*");
	contextpage.selectFewcheck();
	Reports.selectDocuments();
	Reports.selectreporting("CBL VDL");
	Reports.switchWindows();
	Reports.exportClick();
	Reports.selectExportoptions("currentpage","excel");
	Reporter.log("CBL_VDL Report Export with Currentpage in Excel is done successfully");
}
@Test(enabled=true)
public void TC_001_CBL_VDL_Export_All_Excel() throws Throwable
{
	Reporter.log("CBL_VDL Report Export with All in Excel");
	homepage=new homePage(driver);
	contextpage=new contextsearch(driver);
	Reports=new fetchingReports(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextpage = homepage.selectText("Anjum*");
	contextpage.selectFewcheck();
	Reports.selectDocuments();
	Reports.selectreporting("CBL VDL");
	Reports.switchWindows();
	Reports.exportClick();
	Reports.selectExportoptions("All","excel");
	Reporter.log("CBL_VDL Report Export with all in Excel is done successfully");
}
}
