package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;


   /*TestScript Designed On 17/04/2018
    TestScript Designed By Sireesha  */

public class FetchingReportsTest_Gen_TimeDepthDataRW extends TestBaseSetup{

	
	public homePage homepage ;
	
	//	ContextSearch->Gen Well / Wellbore-> Time Depth Data
	//   feet --->  Check
@Test(enabled=true)
public void TC_001_Time_Depth_DataRW__Feet_DataPreference_currentPage_Excel_Single() throws Throwable{
	
    Reporter.log("Time Depth Data", true); 
	homepage=new homePage(driver);
	Reporter.log("Browser Opened", true);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
    Reporter.log("All Fields Selected", true);
	contextsearch selectTime_Depth_Data = contextpage.selectAllcheck();
	 contextpage.selectGenWellOrSurvey();
	fetchingReports fetchingReports = selectTime_Depth_Data.selectreporting("Time Depth Data RW");
	fetchingReports.switchWindows();
	//selectUnitConversioniconRW();
	fetchingReports.selectUnitConversionOptions_FromList("length","feet");
	 Thread.sleep(300);
	 Reporter.log("feet selected", true);
	 fetchingReports.FetchExportReportResultData(true, "currentpage", "excel", "single");
	 Reporter.log("export options Withcheck", true);

}
@Test(enabled=true)
public void TC_002_Time_Depth_DataRW__Feet__DataPreference_currentPage_Excel_Multi() throws Throwable{
	
    Reporter.log("Time Depth Data", true); 
	homepage=new homePage(driver);
	Reporter.log("Browser Opened", true);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
    Reporter.log("All Fields Selected", true);
	contextsearch selectTime_Depth_Data = contextpage.selectAllcheck();
	 contextpage.selectGenWellOrSurvey();
	fetchingReports fetchingReports = selectTime_Depth_Data.selectreporting("Time Depth Data RW");
	fetchingReports.switchWindows();
	//selectUnitConversioniconRW();
	fetchingReports.selectUnitConversionOptions_FromList("length","feet");
	 Thread.sleep(300);
	 Reporter.log("feet selected", true);
	 fetchingReports.FetchExportReportResultData(true, "currentpage", "excel", "Multi");
	 Reporter.log("export options Withcheck", true);

}

//feet --->  CheckALL -->multiple selection
@Test(enabled=true)
public void TC_003_Time_Depth_Data_Feet_ALL_Excel_Single() throws Throwable{
	
	Reporter.log("Time Depth Data", true); 
	homepage=new homePage(driver);
	Reporter.log("Browser Opened", true);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectTime_Depth_Data = contextpage.selectAllcheck().selectUtilites();
	fetchingReports fetchingReports = selectTime_Depth_Data.selectreporting("Time Depth Data");
	fetchingReports.switchWindows();
	fetchingReports.selectUnitConversionOptions("feet");
	Thread.sleep(300);
	Reporter.log("feet selected", true); 
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel", "single");
	Reporter.log("export options checked All excel multiple selected", true);
	 
	 
} 
@Test(enabled=true)
public void TC_004_Time_Depth_Data_Feet_ALL_Excel_Multi() throws Throwable{
	
	Reporter.log("Time Depth Data", true); 
	homepage=new homePage(driver);
	Reporter.log("Browser Opened", true);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectTime_Depth_Data = contextpage.selectAllcheck().selectUtilites();
	fetchingReports fetchingReports = selectTime_Depth_Data.selectreporting("Time Depth Data");
	fetchingReports.switchWindows();
	fetchingReports.selectUnitConversionOptions("feet");
	Thread.sleep(300);
	Reporter.log("feet selected", true); 
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel", "Multi");
	Reporter.log("export options checked All excel multiple selected", true);
	 
	 
} 
//feet --->  withoutCheck -->feet --> single
@Test(enabled=true)
public void TC_005_Time_Depth_Data_Feet_WithoutCheckAll_currentPage_Excel_Single() throws Throwable{

	Reporter.log("Time Depth Data", true); 
	homepage=new homePage(driver);
	Reporter.log("Browser Opened", true);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectTime_Depth_Data = contextpage.selectAllcheck();
	contextpage.selectGenWellOrSurvey();
	fetchingReports fetchingReports = selectTime_Depth_Data.selectreporting("Time Depth Data RW");
	fetchingReports.switchWindows();
	//selectUnitConversioniconRW();
	fetchingReports.selectUnitConversionOptions_FromList("length","feet");
	 Thread.sleep(300);
	 Reporter.log("feet selected", true);
	fetchingReports.FetchExportReportResultData(false, "currentpage", "excel", "single");
	 Reporter.log("export options Withoutcheck", true);
} 

//meters --->  Check --> --> ALL Multiple
@Test(enabled=true)
public void TC_006_Time_Depth_Data_Meter_ALL_Excel_Multi() throws Throwable{

	    Reporter.log("Time Depth Data", true); 
		homepage=new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	 	Reporter.log("All Fields Selected", true);
		contextsearch selectTime_Depth_Data = contextpage.selectAllcheck();
		contextpage.selectGenWellOrSurvey();
		fetchingReports fetchingReports = selectTime_Depth_Data.selectreporting("Time Depth Data RW");
		fetchingReports.switchWindows();
		//selectUnitConversioniconRW();
		fetchingReports.selectUnitConversionOptions_FromList("length","meters");
		 Thread.sleep(300);
		 Reporter.log("feet selected", true);
		 fetchingReports.FetchExportReportResultData(true, "All", "excel", "Multi");
		 Reporter.log("export options Withcheck", true);
} 
@Test(enabled=true)
public void TC_007_Time_Depth_Data_Meter_ALL_Excel_Single() throws Throwable{

	    Reporter.log("Time Depth Data", true); 
		homepage=new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	 	Reporter.log("All Fields Selected", true);
		contextsearch selectTime_Depth_Data = contextpage.selectAllcheck();
		contextpage.selectGenWellOrSurvey();
		fetchingReports fetchingReports = selectTime_Depth_Data.selectreporting("Time Depth Data RW");
		fetchingReports.switchWindows();
		//selectUnitConversioniconRW();
		fetchingReports.selectUnitConversionOptions_FromList("length","meters");
		 Thread.sleep(300);
		 Reporter.log("feet selected", true);
		 fetchingReports.FetchExportReportResultData(true, "All", "excel", "single");
		 Reporter.log("export options Withcheck", true);
} 

           //meters --->  Check --> Data Prefrence --> 
 @Test(enabled=true)
public void TC_008_Time_Depth_Data_Meter_True_currentPage_Excel_Multi() throws Throwable{

	 	Reporter.log("Time Depth Data", true); 
		homepage=new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	 	Reporter.log("All Fields Selected", true);
		contextsearch selectTime_Depth_Data = contextpage.selectAllcheck();
		contextpage.selectGenWellOrSurvey();
		fetchingReports fetchingReports = selectTime_Depth_Data.selectreporting("Time Depth Data RW");
		fetchingReports.switchWindows();
		//selectUnitConversioniconRW();
		fetchingReports.selectUnitConversionOptions_FromList("length","meters");
		 Thread.sleep(300);
		 Reporter.log("meters selected", true);
		 fetchingReports.FetchExportReportResultData(true, "currentpage", "excel", "Multi");
		 Reporter.log("export options check", true);

} 

 @Test(enabled=true)
 public void TC_009_Time_Depth_Data_Meter_True_currentPage_Excel_Single() throws Throwable{

 	 	Reporter.log("Time Depth Data", true); 
 		homepage=new homePage(driver);
 		Reporter.log("Browser Opened", true);
 		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
 		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
 		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
 		contextsearch contextpage = homepage.selectText("Anjum*");
 	 	Reporter.log("All Fields Selected", true);
 		contextsearch selectTime_Depth_Data = contextpage.selectAllcheck();
 		contextpage.selectGenWellOrSurvey();
 		fetchingReports fetchingReports = selectTime_Depth_Data.selectreporting("Time Depth Data RW");
 		fetchingReports.switchWindows();
 		//selectUnitConversioniconRW();
 		fetchingReports.selectUnitConversionOptions_FromList("length","meters");
 		 Thread.sleep(300);
 		 Reporter.log("meters selected", true);
 		 fetchingReports.FetchExportReportResultData(true, "currentpage", "excel", "single");
 		 Reporter.log("export options check", true);

 } 

              //meters --->  WithOutCheckALL
 @Test(enabled=true)
public void TC_010_Time_Depth_Data_Meter_WithOutCheckAll_currentPage_Excel_Multi() throws Throwable{	
	   
		Reporter.log("Time Depth Data", true); 
		homepage=new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	 	Reporter.log("All Fields Selected", true);
		contextsearch selectTime_Depth_Data = contextpage.selectAllcheck();
		contextpage.selectGenWellOrSurvey();
		fetchingReports fetchingReports = selectTime_Depth_Data.selectreporting("Time Depth Data RW");
		fetchingReports.switchWindows();
		//selectUnitConversioniconRW();
		fetchingReports.selectUnitConversionOptions_FromList("length","meters");
		 Thread.sleep(300);
		 Reporter.log("meters selected", true);
		 fetchingReports.FetchExportReportResultData(false, "currentpage", "excel", "Multi");
		 Reporter.log("export options WithOutcheck", true);
	 
  } 
 

} 
	 
	 
	 