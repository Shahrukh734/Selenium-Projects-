package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

public class fetchingReportsTest_DirectionalSurveyData1 extends TestBaseSetup{

	
	public homePage homepage ;
	/*TestScript Designed On 25/04/2018
    TestScript Designed By Sireesha  */


@Test(enabled=true)
public void TC_001_DirectionalSurveyData1_currentPage_Excel_SingleSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("Select the DirectionalSurveyData1 from Context Search");
	 contextpage.selectAllcheck();
	 contextpage.selectGenWellOrSurvey();
	 fetchingReports fetchingReports = contextpage.selectreporting("DirectionalSurveyData1");
	 Reporter.log("Swtich to report window and perfrom operations");
	 fetchingReports.switchWindows();
	//fetchingReports.selectPrintReport();	
	fetchingReports.FetchExportReportResultData(true,"currentpage", "excel","single");
	 Reporter.log("Directional Survey Data1 Report Generation is completed");
}

@Test(enabled=true)
public void TC_002_DirectionalSurveyData1_currentPage_Excel_MultySheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("Select the DirectionalSurveyData1 from Context Search");
	 contextpage.selectAllcheck();
	 contextpage.selectGenWellOrSurvey();
	 fetchingReports fetchingReports = contextpage.selectreporting("DirectionalSurveyData1");
	 Reporter.log("Swtich to report window and perfrom operations");
	 fetchingReports.switchWindows();
	//fetchingReports.selectPrintReport();	
	fetchingReports.FetchExportReportResultData(true,"currentpage", "excel","Multi");
	 Reporter.log("Directional Survey Data1 Report Generation is completed");
}

@Test(enabled=true)
public void TC_003_DirectionalSurveyData1_All_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("Select the DirectionalSurveyData1 from Context Search");
	 contextpage.selectAllcheck();
	 contextpage.selectGenWellOrSurvey();
	 fetchingReports fetchingReports = contextpage.selectreporting("DirectionalSurveyData1");
	 Reporter.log("Swtich to report window and perfrom operations");
	 fetchingReports.switchWindows();
	//fetchingReports.selectPrintReport();
	fetchingReports.FetchExportReportResultData(true,"All", "excel","Multi");
	 Reporter.log("Directional Survey Data1 Report Generation is completed");
}
@Test(enabled=true)
public void TC_004_DirectionalSurveyData1_All_Excel_SingleSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("Select the DirectionalSurveyData1 from Context Search");
	 contextpage.selectAllcheck();
	 contextpage.selectGenWellOrSurvey();
	 fetchingReports fetchingReports = contextpage.selectreporting("DirectionalSurveyData1");
	 Reporter.log("Swtich to report window and perfrom operations");
	 fetchingReports.switchWindows();
	//fetchingReports.selectPrintReport();
	fetchingReports.FetchExportReportResultData(true,"All", "excel","single");
	 Reporter.log("Directional Survey Data1 Report Generation is completed");
}
@Test(enabled=true)
public void TC_005_DirectionalSurveyData1_NotCheck_Excel_SingleSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("Select the DirectionalSurveyData1 from Context Search");
	 contextpage.selectAllcheck();
	 contextpage.selectGenWellOrSurvey();
	 fetchingReports fetchingReports = contextpage.selectreporting("DirectionalSurveyData1");
	 Reporter.log("Swtich to report window and perfrom operations");
	 fetchingReports.switchWindows();
	//fetchingReports.selectPrintReport();
	fetchingReports.FetchExportReportResultData(false, "currentpage", "excel","single");
	 Reporter.log("Directional Survey Data1 Report Generation is completed");
}

}
