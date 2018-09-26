package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

public class fetchingReportsTest_Douments_WellStatusDiagrams extends TestBaseSetup{

	
	public homePage homepage ;
	
	//	ContextSearch->Documents_WellStatusDiagrams
		


@Test(enabled=true)
public void TC_001_WellStatusDiagram_Export_CurrentPage_Excel() throws Throwable
{
	Reporter.log("Well Status Diagrams Report Export with Currentpage in Excel");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	contextsearch WellStatiousDiagrams = contextpage.selectAllcheck();
	WellStatiousDiagrams.selectDocuments();
	fetchingReports fetchingReports = WellStatiousDiagrams.selectWellStatusDiagrams();
	 fetchingReports.switchWindows();
	 fetchingReports.exportClick();
	 fetchingReports.selectExportoptions("currentpage","excel");
	
}
@Test(enabled=true)
public void TC_002_WellStatusDiagram_Export_CurrentPage_CSV() throws Throwable
{
	Reporter.log("Well Status Diagrams Report Export with Currentpage in CSV");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	contextsearch WellStatiousDiagrams = contextpage.selectAllcheck();
	WellStatiousDiagrams.selectDocuments();
	fetchingReports fetchingReports = WellStatiousDiagrams.selectWellStatusDiagrams();
	 fetchingReports.switchWindows();
	 fetchingReports.exportClick();
	 fetchingReports.selectExportoptions("currentpage","CSV");	
}

/*@Test(enabled=true)
public void TC_003_WellStatusDiagram_Print() throws Throwable
{
	Reporter.log("Well Status Diagrams Report Printing");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	contextsearch WellStatiousDiagrams = contextpage.selectAllcheck();
	WellStatiousDiagrams.selectDocuments();
	fetchingReports fetchingReports = WellStatiousDiagrams.selectWellStatusDiagrams();
	 fetchingReports.switchWindows();
	 fetchingReports.exportClick();
	 fetchingReports.getPrintIcon().click();
	
}*/


}
