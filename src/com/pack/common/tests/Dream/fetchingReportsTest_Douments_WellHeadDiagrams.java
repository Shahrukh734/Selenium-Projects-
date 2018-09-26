package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

public class fetchingReportsTest_Douments_WellHeadDiagrams extends TestBaseSetup{

	
	public homePage homepage ;
	public contextsearch contextpage;
	public fetchingReports Reports;
	
	//	ContextSearch->Documents->Well Head Diagrams
		

	
@Test(enabled=true)
public void TC_001_WellHeadDiagrams_Export_CurrentPage_Excel() throws Throwable
{
	Reporter.log("Well Head Diagrams Report Export with Currentpage in Excel");
	homepage=new homePage(driver);
	contextpage=new contextsearch(driver);
	Reports=new fetchingReports(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextpage = homepage.selectText("Anjum*");
	contextpage.selectFewcheck();
	Reports.selectDocuments();
	Reports.selectreporting("Well Head Diagrams");
	Reports.switchWindows();
	Reports.exportClick();
	Reports.selectExportoptions("currentpage","excel");
	Reporter.log("Well Head Diagrams Report Export with Currentpage in Excel is successfully done");
}
@Test(enabled=true)
public void TC_002_WellHeadDiagrams_Export_All_Excel() throws Throwable
{
	Reporter.log("Well Head Diagrams Report Export with All in Excel");
	homepage=new homePage(driver);
	contextpage=new contextsearch(driver);
	Reports=new fetchingReports(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextpage = homepage.selectText("Anjum*");
	contextpage.selectFewcheck();
	Reports.selectDocuments();
	Reports.selectreporting("Well Head Diagrams");
	Reports.switchWindows();
	Reports.exportClick();
	Reports.selectExportoptions("All","excel");
	Reporter.log("Well Head Diagrams Report Export with All in Excel is successfully done");
}
}
