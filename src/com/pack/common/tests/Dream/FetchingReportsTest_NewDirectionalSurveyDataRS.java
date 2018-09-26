package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;


   /*TestScript Designed On 24/04/2018
    TestScript Designed By Sireesha  */

public class FetchingReportsTest_NewDirectionalSurveyDataRS extends TestBaseSetup{

	
	public homePage homepage ;
	
	//	ContextSearch->Gen. Well / Survey->DirectionalSurveyDataRS
	
         //   feet --->  Check
@Test(enabled=true)
public void TC_001_DirectionalSurveyDataRS_Feet_currentPage_Excel_Single() throws Throwable{
	
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
	fetchingReports fetchingReports = selectTime_Depth_Data.selectreporting("Directional Survey Data RS");
	fetchingReports.switchWindows();
	fetchingReports.selectUnitConversionOptions_FromList("length","feet");
	 Thread.sleep(300);
	 Reporter.log("feet selected", true);
	 fetchingReports.FetchExportReportResultData(true, "currentpage", "excel", "single");
	 Reporter.log("Directional Survey DataRS export options Withcheck", true);

}
@Test(enabled=true)
public void TC_002_DirectionalSurveyDataRS_Feet_currentPage_Excel_Multi() throws Throwable{
	
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
	fetchingReports fetchingReports = selectTime_Depth_Data.selectreporting("Directional Survey Data RS");
	fetchingReports.switchWindows();
	fetchingReports.selectUnitConversionOptions_FromList("length","feet");
	Thread.sleep(300);
	Reporter.log("feet selected", true);
	fetchingReports.FetchExportReportResultData(true, "currentpage", "excel", "Multi");
	Reporter.log("Directional Survey DataRS export options Withcheck", true);

}

//feet --->  CheckALL -->multiple selection
@Test(enabled=true)
public void TC_003_DirectionalSurveyDataRS_Feet_ALL_Excel_Multi() throws Throwable{
	
   Reporter.log("Directional Survey Data RS", true); 
	homepage=new homePage(driver);
	Reporter.log("Browser Opened", true);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectTime_Depth_Data = contextpage.selectAllcheck();
	contextpage.selectGenWellOrSurvey();
	fetchingReports fetchingReports = selectTime_Depth_Data.selectreporting("Directional Survey Data RS");
	fetchingReports.switchWindows();
	fetchingReports.selectUnitConversionOptions_FromList("length","feet");
	Thread.sleep(300);
	Reporter.log("feet selected", true);
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel", "Multi");
	Reporter.log("Directional Survey DataRS export options checked All excel multiple selected", true);
	 
	 
} 
@Test(enabled=true)
public void TC_004_DirectionalSurveyDataRS_Feet_ALL_Excel_Single() throws Throwable{
	
	Reporter.log("Directional Survey Data RS", true); 
	homepage=new homePage(driver);
	Reporter.log("Browser Opened", true);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectTime_Depth_Data = contextpage.selectAllcheck();
	contextpage.selectGenWellOrSurvey();
	fetchingReports fetchingReports = selectTime_Depth_Data.selectreporting("Directional Survey Data RS");
	fetchingReports.switchWindows();
	fetchingReports.selectUnitConversionOptions_FromList("length","feet");
	Thread.sleep(300);
	Reporter.log("feet selected", true);
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel", "single");
	Reporter.log("Directional Survey DataRS export options checked All excel multiple selected", true);
	 
	 
} 
//feet --->  withoutCheck -->feet --> single
@Test(enabled=true)
public void TC_005_DirectionalSurveyDataRS_WithoutCheck_currentPage_Excel_Single() throws Throwable{

    Reporter.log("Directional Survey Data RS", true); 
	homepage=new homePage(driver);
	Reporter.log("Browser Opened", true);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
   contextsearch selectTime_Depth_Data = contextpage.selectAllcheck();
   contextpage.selectGenWellOrSurvey();
   fetchingReports fetchingReports = selectTime_Depth_Data.selectreporting("Directional Survey Data RS");
   fetchingReports.switchWindows();
   fetchingReports.selectUnitConversionOptions_FromList("length","feet");
   Thread.sleep(300);
    Reporter.log("feet selected", true);
   fetchingReports.FetchExportReportResultData(false, "currentpage", "excel", "single");
   Reporter.log("Directional Survey DataRS export options Withoutcheck", true);

} 

//meters --->  Check --> --> ALL Multiple
@Test(enabled=true)
public void TC_006_DirectionalSurveyDataRS_ALL_Excel_Multi() throws Throwable{

	    Reporter.log("Directional Survey Data RS", true); 
		homepage=new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	    contextsearch contextpage = homepage.selectText("Anjum*"); 	
	    Reporter.log("All Fields Selected", true);
		contextsearch selectTime_Depth_Data = contextpage.selectAllcheck();
		 contextpage.selectGenWellOrSurvey();
		fetchingReports fetchingReports = selectTime_Depth_Data.selectreporting("Directional Survey Data RS");
		fetchingReports.switchWindows();
		fetchingReports.selectUnitConversionOptions_FromList("length","meters");
		 Thread.sleep(300);
		 Reporter.log("Meter selected", true);
		 fetchingReports.FetchExportReportResultData(true, "All", "excel", "Multi");
		 Reporter.log("Directional Survey DataRS export options Withcheck", true);
} 
@Test(enabled=true)
public void TC_007_DirectionalSurveyDataRS_ALL_Excel_Single() throws Throwable{

    Reporter.log("Directional Survey Data RS", true); 
	homepage=new homePage(driver);
	Reporter.log("Browser Opened", true);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
    contextsearch contextpage = homepage.selectText("Anjum*"); 	
    Reporter.log("All Fields Selected", true);
	contextsearch selectTime_Depth_Data = contextpage.selectAllcheck();
	 contextpage.selectGenWellOrSurvey();
	fetchingReports fetchingReports = selectTime_Depth_Data.selectreporting("Directional Survey Data RS");
	fetchingReports.switchWindows();
	fetchingReports.selectUnitConversionOptions_FromList("length","meters");
	 Thread.sleep(300);
	 Reporter.log("Meter selected", true);
	 fetchingReports.FetchExportReportResultData(true, "All", "excel", "single");
	 Reporter.log("Directional Survey DataRS export options Withcheck", true);
} 


           //meters --->  Check --> Data Prefrence --> 
 @Test(enabled=true)
public void TC_008_DirectionalSurveyDataRS_True_currentPage_Excel_Single() throws Throwable{

	    Reporter.log("Directional Survey Data RS", true); 
		homepage=new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	    Reporter.log("All Fields Selected", true);
		contextsearch selectTime_Depth_Data = contextpage.selectAllcheck();
		 contextpage.selectGenWellOrSurvey();
		fetchingReports fetchingReports = selectTime_Depth_Data.selectreporting("Directional Survey Data RS");
		fetchingReports.switchWindows();
		fetchingReports.selectUnitConversionOptions_FromList("length","meters");
		 Thread.sleep(300);
		 Reporter.log("meters selected", true);
		 fetchingReports.FetchExportReportResultData(true, "currentpage", "excel", "single");
		 Reporter.log("Directional Survey DataRS export options check", true);


} 

 @Test(enabled=true)
 public void TC_009_DirectionalSurveyDataRS_currentPage_Excel_Multi() throws Throwable{

 	    Reporter.log("Directional Survey Data RS", true); 
 		homepage=new homePage(driver);
 		Reporter.log("Browser Opened", true);
 		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
 		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
 		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
 		contextsearch contextpage = homepage.selectText("Anjum*");
 	    Reporter.log("All Fields Selected", true);
 		contextsearch selectTime_Depth_Data = contextpage.selectAllcheck();
 		 contextpage.selectGenWellOrSurvey();
 		fetchingReports fetchingReports = selectTime_Depth_Data.selectreporting("Directional Survey Data RS");
 		fetchingReports.switchWindows();
 		fetchingReports.selectUnitConversionOptions_FromList("length","meters");
 		 Thread.sleep(300);
 		 Reporter.log("meters selected", true);
 		 fetchingReports.FetchExportReportResultData(true, "currentpage", "excel", "Multi");
 		 Reporter.log("Directional Survey DataRS export options check", true);


 } 
              //meters --->  WithOutCheckALL
   /*@Test(enabled=true)
public void TC_010_DirectionalSurveyDataRS_WithOutCheck_currentPage_Excel_Single() throws Throwable{
	
	   Reporter.log("Directional Survey Data RS", true); 
		homepage=new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	    contextsearch contextpage = homepage.selectText("Anjum*");
        Reporter.log("All Fields Selected", true);
		contextsearch selectTime_Depth_Data = contextpage.selectAllcheck();
		contextpage.selectGenWellOrSurvey();
		fetchingReports fetchingReports = selectTime_Depth_Data.selectreporting("Directional Survey Data RS");
		fetchingReports.switchWindows();
		fetchingReports.selectUnitConversionOptions_FromList("length","meters");
		 Thread.sleep(300);
		 Reporter.log("meters selected", true);
		 fetchingReports.FetchExportReportResultData(false, "currentpage", "excel", "single");
		 Reporter.log("Directional Survey DataRS export options WithOutcheck", true);
	 
  } 
 */

} 
	 
	 
	 