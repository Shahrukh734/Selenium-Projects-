package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;
public class contextsearchTest extends TestBaseSetup{
	
	public homePage homepage ;
//	public WebDriver driver;
	public fetchingReports fetchingReports;
	@Test(enabled=false)
	public void TC_001_contextSearch_WellEgineeringReport() throws Throwable
	{
		
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectAllcheck().selectWellEngineering();

	
	}
	
	@Test(enabled=false)
	public void TC_002_contextSearch_Documents() throws Throwable{
		
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");		
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectAllcheck().selectDocuments();
		
	}
	
	@Test(enabled=false)
	public void TC_004_contextSearch_Allselectreport_DailySummaryReport() throws Throwable
	{
		homepage=new homePage(driver);
		Reporter.log("QuickSearch");
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		Reporter.log("Click on ContextSearch and Select DailySummary Report");
		contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting().selectreporting("Daily Summary");
		Reporter.log("DailySummary Report is selected");
		
	}
	
	@Test(enabled=false)
	public void TC_005_contextSearch_Noselectoptions() throws Throwable 
	{
		homepage=new homePage(driver);
		Reporter.log("QuickSearch");
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		Reporter.log("Unchecked the Data generated");
		Reporter.log("Click on ContextSearch and Select DailySummary Report");
		contextpage.selectWellEngineering().selectreporting("Daily Summary");
		fetchingReports.isAlertPresent();
		Reporter.log("DailySummary Report is selected");
	
	}	

	
	@Test(enabled=false)
	public void TC_006_contextSearch_Allselectreport_EventsReport() throws Throwable{
		homepage=new homePage(driver);
		Reporter.log("QuickSearch");
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		Reporter.log("Click on ContextSearch and Select DailyWellsReporting ");
		contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting().selectreporting("Events");
		Reporter.log("Events Report is selected");
	}
	
	@Test(enabled=false)
	public void TC_007_contextSearch_Allselectreport_ReportedActivitiesReport() throws Throwable{
		
		homepage=new homePage(driver);
		Reporter.log("QuickSearch");
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		Reporter.log("Click on ContextSearch and Select DailyWellsReporting ");
		contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting().selectreporting("Reported Activities");
		Reporter.log("Reported Activities Report is selected");
		
	}
	
	//@Test(dependsOnMethods={"com.pack.common.tests.homePageTest.TC_001_Quicksearch"},priority=7,enabled=false)
	public void TC_008_contextSearch_Allselectreport_Documents_AllDocuments() throws Throwable{
		
		homepage=new homePage(driver);
		Reporter.log("QuickSearch");
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		Reporter.log("Click on ContextSearch and Select DOcuments ");
		contextpage.selectAllcheck().selectDocuments().selectAllDocuments();
		Reporter.log("All Documents Report is selected");

	}
	
	//@Test(dependsOnMethods={"com.pack.common.tests.homePageTest.TC_001_Quicksearch"},priority=8,enabled=false)
	public void TC_009_contextSearch_Allselectreport_Documents_WellStatusDiagrams() throws Throwable{
		
	homepage=new homePage(driver);
		
		Reporter.log("QuickSearch");
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "--Any Country--");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		Reporter.log("Click on ContextSearch and Select WellStatusDiagrams ");
		contextpage.selectAllcheck().selectDocuments().selectWellStatusDiagrams();
		Reporter.log("WellStatusDiagrams Report is selected");

	}
	
	/*@Test(dependsOnMethods={"com.pack.common.tests.homePageTest.TC_001_Quicksearch"},priority=9,enabled=false)
	public void TC_007_contextSearch_Allselectreport_Documents_BHTWellTestReports() throws Throwable{
		
		context= new contextsearch(driver);
		context.selectAllcheck();
		context.selectDocuments();
		context.selectBHTWellTestReports();

	}
	
	@Test(dependsOnMethods={"com.pack.common.tests.homePageTest.TC_001_Quicksearch"},priority=10,enabled=false)
	public void TC_008_contextSearch_Allselectreport_Documents_DocumentsWithfilter() throws Throwable{
		
		context= new contextsearch(driver);
		context.selectAllcheck();
		context.selectDocuments();
		context.selectBHTWellTestReports();

	}
	
	
	
	@Test(dependsOnMethods={"com.pack.common.tests.homePageTest.TC_001_Quicksearch"},enabled=false)
	public void TC_009_contextSearch_MechanicalWellData_Strings() throws Throwable{
		
		context= new contextsearch(driver);
	
		
		//Thread.sleep(5000);
		context.selectAllcheck();
		context.selectWellEngineering();
		context.selectMechanicalWellData();
		//context.currentWindowHandle();
		context.selectreporting("Strings");
		
	}
	
	
	@Test(dependsOnMethods={"com.pack.common.tests.homePageTest.TC_001_Quicksearch"},enabled=false,priority=12)
	public void TC_010_contextSearch_MechanicalWellData_HoldUpDepth() throws Throwable{
		
		context= new contextsearch(driver);
	
		
		//Thread.sleep(5000);
		context.selectAllcheck();
		context.selectWellEngineering();
		context.selectMechanicalWellData();
		context.selectreporting("Hold-Up Depth");
		
	}
	
	
	@Test(dependsOnMethods={"com.pack.common.tests.homePageTest.TC_001_Quicksearch"},enabled=false,priority=13)
	public void TC_011_contextSearch_MechanicalWellData_WellStatusDiagramCached() throws Throwable{
		
		context= new contextsearch(driver);
	
		
		//Thread.sleep(5000);
		context.selectAllcheck();
		context.selectWellEngineering();
		context.selectMechanicalWellData();
		context.selectreporting("Well Status Diagrams Cached/Dynamic");
		
	}*/
	
}
