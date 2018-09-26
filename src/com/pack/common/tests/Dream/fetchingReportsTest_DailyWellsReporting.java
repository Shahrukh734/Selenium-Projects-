package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;


  /**TestScript Designed On 03/04/2018
    TestScript Designed By Mudassir */

public class fetchingReportsTest_DailyWellsReporting extends TestBaseSetup{

	
	public homePage homepage ;
	
	//	ContextSearch->Well Engineering/PT->DailyWellsreporting
		
		
		

         // DailyWellsreporting -> Daily Summary
@Test(enabled=true)
public void TC_001_contextSearch_DailySummary_Tabular_currentPage_AllCheckRecords() throws Throwable{
	
    Reporter.log("Daily Summary"); 
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	 contextsearch contextpage = homepage.selectText("Anjum*");
 	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Daily Summary");
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	fetchingReports.submitEventReport("Yes", "Tabular");
	fetchingReports.fetchDailyWellReport(true,"currentpage","excel");

}

@Test(enabled=true)
public void TC_002_contextSearch_DailySummary_Tabular_currentPage_NoCheckRecords() throws Throwable{
	
    Reporter.log("Daily Summary"); 
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
 	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Daily Summary");
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	fetchingReports.submitEventReport("Yes", "Tabular");
	fetchingReports.fetchDailyWellReport(false,"currentpage","excel");

}

@Test(enabled=true)
public void TC_003_contextSearch_DailySummary_Tabular_currentPage_EventAsNO() throws Throwable{
	
    Reporter.log("Daily Summary"); 
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
 	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Daily Summary");
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	fetchingReports.submitEventReport("No", "Tabular");
	Thread.sleep(10000);
	fetchingReports.fetchDailyWellReport(true,"currentpage","excel");

}



@Test(enabled=true)
public void TC_004_contextSearch_DailySummary_Tabular_AllPage() throws Throwable{
	
    Reporter.log("Daily Summary"); 
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
 	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Daily Summary");
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	fetchingReports.submitEventReport("Yes", "Tabular");
	fetchingReports.fetchDailyWellReport(true,"All","excel");

}


//DailyWellsreporting -> Events

@Test(enabled=true)
public void TC_005_contextSearch_Events_Tabular_currentPage_AllCheckRecords() throws Throwable{
	
    Reporter.log("Daily Summary"); 
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
 	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Daily Summary");
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	fetchingReports.submitEventReport("Yes", "Tabular");
	fetchingReports.fetchDailyWellReport(true,"currentpage","excel");

}

@Test(enabled=true)
public void TC_006_contextSearch_Events_Tabular_currentPage_NoCheckRecords() throws Throwable{
	
    Reporter.log("Events"); 
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
 	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Events");
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	fetchingReports.submitEventReport("Yes", "Tabular");
	fetchingReports.fetchDailyWellReport(false,"currentpage","excel");

}

@Test(enabled=true)
public void TC_007_contextSearch_Events_Tabular_currentPage_EventAsNO() throws Throwable{
	
    Reporter.log("Events"); 
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Events");
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	fetchingReports.submitEventReport("No", "Tabular");
	fetchingReports.fetchDailyWellReport(true,"currentpage","excel");

}



@Test(enabled=true)
public void TC_008_contextSearch_Events_Tabular_AllPage() throws Throwable{
	
    Reporter.log("Events"); 
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
 	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Events");
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	fetchingReports.submitEventReport("Yes", "Tabular");
	fetchingReports.fetchDailyWellReport(true,"All","excel");

}



// Report activities

@Test(enabled=true)
public void TC_009_contextSearch_ReportedActivities_Tabular_currentPage_AllCheckRecords() throws Throwable{
	
    Reporter.log("Reported Activities"); 
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
 	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Reported Activities");
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	fetchingReports.submitEventReport("Yes", "Tabular");
	fetchingReports.fetchDailyWellReport(true,"currentpage","excel");

}

@Test(enabled=true)
public void TC_010_contextSearch_ReportedActivities_Tabular_currentPage_NoCheckRecords() throws Throwable{
	
    Reporter.log("Reported Activities"); 
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	 contextsearch contextpage = homepage.selectText("Anjum*");
 	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Reported Activities");
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	fetchingReports.submitEventReport("Yes", "Tabular");
	fetchingReports.fetchDailyWellReport(false,"currentpage","excel");

}

@Test(enabled=true)
public void TC_011_contextSearch_ReportedActivities_Tabular_currentPage_EventAsNO() throws Throwable{
	
    Reporter.log("Reported Activities"); 
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
 	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Reported Activities");
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	fetchingReports.submitEventReport("No", "Tabular");
	fetchingReports.fetchDailyWellReport(true,"currentpage","excel");

}



@Test(enabled=true)
public void TC_012_contextSearch_ReportedActivities_Tabular_AllPage() throws Throwable{
	
    Reporter.log("Reported Activities"); 
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	 contextsearch contextpage = homepage.selectText("Anjum*");
 	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Reported Activities");
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	fetchingReports.submitEventReport("Yes", "Tabular");
	fetchingReports.fetchDailyWellReport(true,"All","excel");

}
/*@Test(enabled=true)
public void TC_019_contextSearch_ReportedActivities_Hierarchical_Print() throws Throwable{
	
    Reporter.log("Reported Activities"); 
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
 	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Reported Activities");
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	//fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "--Select--");
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	fetchingReports.submitEventReport("Yes", "Hierarchical");
	//fetchingReports.getSelectAllResults().click();
	fetchingReports.getPrintIcon().click();
	
}*/

/*@Test(enabled=true)
public void TC_020_contextSearch_ReportedActivities_Hierarchical_Print_EventNo() throws Throwable{
	
    Reporter.log("Reported Activities"); 
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	 contextsearch contextpage = homepage.selectText("Anjum*");
 	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Reported Activities");
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	//fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "--Select--");
	 
 	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
 
	
	fetchingReports.submitEventReport("NO", "Hierarchical");
	 
	//fetchingReports.getSelectAllResults().click();
	 
	fetchingReports.getPrintIcon().click();
	

}*/
/*
@Test(enabled=true)
public void TC_021_contextSearch_DailySummary_Tabular_Print() throws Throwable{
	
    Reporter.log("Reported Activities"); 
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	
	
    contextsearch contextpage = homepage.selectText("Anjum*");
 	
	
	
	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Reported Activities");
	
	
 	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
 	
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	
 	//fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "--Select--");
	 
	//fetchingReports.selectDate("01/Feb/2018", "22/Feb/2018");
 
	
	fetchingReports.submitEventReport("Yes", "Tabular");
	 
	fetchingReports.getSelectAllResults().click();
	 
	fetchingReports.getPrintIcon().click();
	

}
*/
/*@Test(enabled=true)
public void TC_005_contextSearch_DailySummary_Hierarchical_Print() throws Throwable{
	
    Reporter.log("Daily Summary"); 
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
 	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Daily Summary");
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	//fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "--Select--");
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	fetchingReports.submitEventReport("Yes", "Hierarchical");
	//fetchingReports.getSelectAllResults().click();
	fetchingReports.getPrintIcon().click();
	

}
*/
/*@Test(enabled=true)
public void TC_007_contextSearch_DailySummary_Tabular_Print() throws Throwable{
	
    Reporter.log("Daily Summary"); 
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
 	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Daily Summary");
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
 	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	//fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "--Select--");
	//fetchingReports.selectDate("01/Feb/2018", "22/Feb/2018");
 	fetchingReports.submitEventReport("Yes", "Tabular");
	fetchingReports.getSelectAllResults().click();
	fetchingReports.getPrintIcon().click();
	

}*/
/*@Test(enabled=true)
public void TC_012_contextSearch_Events_Hierarchical_Print() throws Throwable{
	
    Reporter.log("Events"); 
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
 	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Events");
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	//fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "--Select--");
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	fetchingReports.submitEventReport("Yes", "Hierarchical");
	//fetchingReports.getSelectAllResults().click();
	fetchingReports.getPrintIcon().click();
	

}
*/
/*@Test(enabled=true)
public void TC_013_contextSearch_Events_Hierarchical_Print_EventNo() throws Throwable{
	
    Reporter.log("Events"); 
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
 	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Events");
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	//fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "--Select--");
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	fetchingReports.submitEventReport("NO", "Hierarchical");
	//fetchingReports.getSelectAllResults().click();
	fetchingReports.getPrintIcon().click();
	

}*/
/*
@Test(enabled=true)
public void TC_014_contextSearch_Events_Tabular_Print() throws Throwable{
	
    Reporter.log("Events"); 
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
 	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Events");
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
 	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	//fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "--Select--");
	//fetchingReports.selectDate("01/Feb/2018", "22/Feb/2018");
 	fetchingReports.submitEventReport("Yes", "Tabular");
	fetchingReports.getSelectAllResults().click();
	fetchingReports.getPrintIcon().click();
	

}
*/
        
/*@Test(enabled=true)
public void TC_005_contextSearch_DailySummary_Hierarchical_Print_EventNo() throws Throwable{
	
    Reporter.log("Daily Summary"); 
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
 	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Daily Summary");
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	//fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "--Select--");
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	fetchingReports.submitEventReport("NO", "Hierarchical");
	//fetchingReports.getSelectAllResults().click();
	fetchingReports.getPrintIcon().click();
	

}
*/

}
