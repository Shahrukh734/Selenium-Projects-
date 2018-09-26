package com.pack.common.tests.Dream;


import org.testng.Reporter;

import org.testng.annotations.Test;

import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

public class fetchingReportsTest_AllDocuments extends contextsearchTest {

	public fetchingReports fetchingReports;
	

	
	// ContextSearch->Documents->AllDocuments By Sireesha
	///////////////////// All Wellbore /////////////////////
	@Test(enabled=true)
	public void TC_001_AllDocuments_AllWellbore_Export_All_Excel() throws Throwable
	{
		Reporter.log("AllDocuments Report All WellBore Selection Export with All in Excel",true);
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectAllcheck();
		contextpage.selectDocuments();
		 fetchingReports fetchingReports = contextpage.selectAllDocuments();
		 Reporter.log("AllDocuments Report Generated", true);
		 fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore_AllDocuments(),"AllWelbore" );
		 fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
		 fetchingReports.selectSubmitButton();
		 fetchingReports.clickonExport();
		 fetchingReports.fetchDocumentReport(true,"All","excel");
		 Reporter.log("AllDocuments Report All WellBore Selection Export with All in Excel is done",true); 
		
		
	}
	@Test(enabled=false)
	public void TC_002_AllDocuments_AllWellbore_Export_Currentpage_Excel()throws Throwable
	{
		Reporter.log("AllDocuments Report All WellBore Selection Export with currentpage option in Excel",true);
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch contextpage=homepage.selectText("Anjum*");
		contextpage.selectAllcheck();
		contextpage.selectDocuments();
		fetchingReports fetchingReports =contextpage.selectAllDocuments();
		Reporter.log("AllDocuments Report Generated", true);
		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore_AllDocuments(),"AllWelbore");
		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		 fetchingReports.fetchDocumentReport(true, "currentpage", "excel");
		 Reporter.log("AllDocuments Report All WellBore Selection Export with currentpage option in Excel done",true);
				
		
	}
	/////////////////////////////false condition //////////////////////////////
	@Test(enabled=false)
	public void TC_003_AllDocuments_AllWellbore_Export_Currentpage_Excel_False()throws Throwable
	{
		Reporter.log("AllDocuments Report Export with currentpage option in Excel Not selected check box ",true);
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch contextpage=homepage.selectText("Anjum*");
		contextpage.selectAllcheck();
		contextpage.selectDocuments();
		fetchingReports fetchingReports =contextpage.selectAllDocuments();
		Reporter.log("AllDocuments Report Generated", true);
		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore_AllDocuments(),"AllWelbore");
		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		 fetchingReports.fetchDocumentReport(false, "currentpage", "excel");
		 Reporter.log("AllDocuments Report Export with currentpage option in Excel Not selected check box is done ",true);		
		
	}
	
	//////////////////////////////// All Wellbore with time period selection all excel ///////////////////
	@Test(enabled=false)
	public void TC_004_AllDocuments_AllWellbore_Export_All_Excel_TimePeriod() throws Throwable
	{
		Reporter.log("AllDocuments Report Select AllWellbore And time Period Selection Export with All option in Excel ",true);
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectAllcheck();
		contextpage.selectDocuments();
		 fetchingReports fetchingReports = contextpage.selectAllDocuments();
		 Reporter.log("AllDocuments Report Generated", true);
		 fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore_AllDocuments(),"AllWelbore" );
		// fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
		 fetchingReports.selectDate("01/Apr/2014", "12/Apr/2018");
		 fetchingReports.selectSubmitButton();
		 fetchingReports.clickonExport();
		 fetchingReports.fetchDocumentReport(true,"All","excel");
		 Reporter.log("AllDocuments Report Select AllWellbore And time Period Selection Export with All option in Excel is done",true);
		
	}
	@Test(enabled=false)
	public void TC_005_AllDocuments_AllWellbore_Export_CurrentPage_Excel_TimePeriod() throws Throwable
	{
		Reporter.log("AllDocuments Report Select AllWellbore And time Period Selection Export with currentPage option in Excel ",true);
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectAllcheck();
		contextpage.selectDocuments();
		 fetchingReports fetchingReports = contextpage.selectAllDocuments();
		 Reporter.log("AllDocuments Report Generated", true);
		 fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore_AllDocuments(),"AllWelbore" );
		 fetchingReports.selectDate("01/Apr/2014", "12/Apr/2018");
		 fetchingReports.selectSubmitButton();
		 fetchingReports.clickonExport();
		 fetchingReports.fetchDocumentReport(true,"currentpage","excel");
		 Reporter.log("AllDocuments Report Select AllWellbore And time Period Selection Export with currentPage option in Excel is done ",true);
		
		
	}
///////singleWellbore Selection--->time period---->Current---->Excel
	@Test(enabled=false)
	public void TC_006_AllDocuments_SingleWellbore_Export_Currentpage_Excel()throws Throwable
	{
		Reporter.log("AllDocuments Report Select SingleWellbore Selection Export with currentpage option in Excel",true);
		
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch contextpage=homepage.selectText("Anjum*");
		contextpage.selectAllcheck();
		contextpage.selectDocuments();
		fetchingReports fetchingReports =contextpage.selectAllDocuments();
		Reporter.log("AllDocuments Report Generated", true);
		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore_AllDocuments(), "ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.fetchDocumentReport(true, "currentpage", "excel");
		Reporter.log("AllDocuments Report  Select SingleWellbore Exported with currentpage in excel in done  ", true);
				
		
	}
	@Test(enabled=false)
	public void TC_007_AllDocuments_SingleWellbore_Export_All_Excel()throws Throwable
	{
		Reporter.log("AllDocuments Report Select SingleWellbore Selection Export with All option in Excel",true);
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch contextpage=homepage.selectText("Anjum*");
		contextpage.selectAllcheck();
		contextpage.selectDocuments();
		fetchingReports fetchingReports =contextpage.selectAllDocuments();
		Reporter.log("AllDocuments Report Generated", true);
		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore_AllDocuments(), "ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.fetchDocumentReport(true, "All", "excel");
		Reporter.log("AllDocuments Report Select SingleWellbore Selection Export with All option in Excel is done  ", true);
				
		
	}
	////////////////////////////////////////// single Well bore  with time Period selection current page excel/////////////
	@Test(enabled=false)
	public void TC_008_AllDocuments_SingleWellbore_Export_All_Excel_timePeriod() throws Throwable
	{
		 Reporter.log("AllDocuments Report Select SingleWellbore And time Period Selection Export with All option in Excel ",true);
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectAllcheck();
		contextpage.selectDocuments();
		 fetchingReports fetchingReports = contextpage.selectAllDocuments();
		 Reporter.log("AllDocuments Report Generated", true);
		 fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore_AllDocuments(),"ANJUM- 1" );
		 fetchingReports.selectDate("01/Apr/2014", "12/Apr/2018");
		 fetchingReports.selectSubmitButton();
		 fetchingReports.clickonExport();
		 fetchingReports.fetchDocumentReport(true,"All","excel");
		 Reporter.log("AllDocuments Report Select SingleWellbore And time Period Selection Export with All option in Excel is done ",true);
		
	}
	@Test(enabled=false)
	public void TC_009_AllDocuments_SingleWellbore_Export_Current_Excel_TimePeriod() throws Throwable
	{
		 Reporter.log("AllDocuments Report Select SingleWellbore And time Period Selection Export with currentpage in Excel ",true);
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectAllcheck();
		contextpage.selectDocuments();
		 fetchingReports fetchingReports = contextpage.selectAllDocuments();
		 Reporter.log("AllDocuments Report Generated", true);
		 fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore_AllDocuments(),"ANJUM- 1" );
		 fetchingReports.selectDate("01/Apr/2014", "12/Apr/2018");
		 fetchingReports.selectSubmitButton();
		fetchingReports.clickonExport();
		 fetchingReports.fetchDocumentReport(true,"currentpage","excel");
		 Reporter.log("AllDocuments Report Select SingleWellbore And time Period Selection Export with currentpage in Excel is done ",true);
		
	}
}
