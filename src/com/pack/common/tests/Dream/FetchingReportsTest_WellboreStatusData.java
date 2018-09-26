package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;


   /*TestScript Designed On 18/04/2018
    TestScript Designed By Sireesha  */

public class FetchingReportsTest_WellboreStatusData extends TestBaseSetup{

	
	public homePage homepage ;
	
	//	ContextSearch->
		
		

         //   feet 
@Test(enabled=true)
public void TC_001_WellboreStatusData_Feet_currentPage_CSV() throws Throwable{
	
    Reporter.log("WellboreStatusData", true); 
	homepage=new homePage(driver);
	Reporter.log("Browser Opened", true);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
 	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Status Data(WSD)");
	fetchingReports.switchWindows();
	fetchingReports.selectUnitConversionOptionsStatus("feet");
	Thread.sleep(300);
	Reporter.log("feet selected", true);
	fetchingReports.selectExportoptionsStatious("currentpage","CSV");
	Reporter.log("export WellboreStatusData done", true);

}

//feet ---> excel selection
@Test(enabled=true)
public void TC_002_WellboreStatusData_Feet_currentPage_Excel() throws Throwable{
	
    Reporter.log("WellboreStatusData", true); 
	homepage=new homePage(driver);
	Reporter.log("Browser Opened", true);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
 	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Status Data(WSD)");
	fetchingReports.switchWindows();
	fetchingReports.selectUnitConversionOptionsStatus("feet");
	Thread.sleep(300);
	Reporter.log("feet selected", true);
	fetchingReports.selectExportoptionsStatious("currentpage","excel");
	Reporter.log("export WellboreStatusData done", true);

}
//---------meters--------
@Test(enabled=true)
public void TC_003_WellboreStatusData_Meter_currentPage_CSV_Meters() throws Throwable{
	
    Reporter.log("WellboreStatusData", true); 
	homepage=new homePage(driver);
	Reporter.log("Browser Opened", true);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
 	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Status Data(WSD)");
	fetchingReports.switchWindows();
	fetchingReports.selectUnitConversionOptionsStatus("meters");
	Thread.sleep(300);
	Reporter.log("meters selected", true);
	fetchingReports.selectExportoptionsStatious("currentpage","CSV");
	Reporter.log("export WellboreStatusData done", true);

}

//meters --->  
@Test(enabled=true)
public void TC_004_WellboreStatusData_Meter_currentPage_Excel_Meters() throws Throwable{
	
    Reporter.log("WellboreStatusData", true); 
	homepage=new homePage(driver);
	Reporter.log("Browser Opened", true);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
 	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Status Data(WSD)");
	fetchingReports.switchWindows();
	fetchingReports.selectUnitConversionOptionsStatus("meters");
	 Thread.sleep(300);
	 Reporter.log("meters selected", true);
	 fetchingReports.selectExportoptionsStatious("currentpage","excel");
	 Reporter.log("export WellboreStatusData done", true);

}




} 
	 
	 
	 