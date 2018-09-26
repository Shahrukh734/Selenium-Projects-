package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;


   /*TestScript Designed On 13/04/2018
    TestScript Designed By Mudassir  */

public class FetchingReportsTest_Utilities_TimeDepthData extends TestBaseSetup{

	
	public homePage homepage ;
	
	//	ContextSearch->Utilities-> Time Depth Data
		
		
		

         //   feet --->  withoutCheck
/*@Test(enabled=true)
public void TC_001_contextSearch_Utilities_Time_Depth_Data_WithoutCheckAll_DataPreference_True_currentPage_Excel_Single() throws Throwable{
	
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
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"TRUE");
	fetchingReports.selectUnitConversionOptions("feet");
	 Thread.sleep(300);
	 Reporter.log("feet selected", true);
	
	 fetchingReports.fetchHoldUpDepthReportResult(false, "currentpage", "excel", "single");
	 Reporter.log("export options Withoutcheck", true);

}


           //meters --->  withoutCheck --> Data Prefrence --> 
 @Test(enabled=true)
public void TC_002_contextSearch_Utilities_Time_Depth_Data_WithoutCheckAll_DataPreference_True_currentPage_Excel_Single() throws Throwable{

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

fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"FALSE");
fetchingReports.selectUnitConversionOptions("meters");
Thread.sleep(300);
Reporter.log("feet selected", true);

fetchingReports.fetchHoldUpDepthReportResult(false, "currentpage", "excel", "single");
Reporter.log("export options Withoutcheck", true);

} 

//   feet --->  withoutCheck -->feet --> Multiple
 @Test(enabled=true)
public void TC_003_contextSearch_Utilities_Time_Depth_Data_WithoutCheckAll_currentPage_Excel_Multi() throws Throwable{
	
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
	
	 fetchingReports.fetchHoldUpDepthReportResult(false, "currentpage", "excel", "multiple");
	 Reporter.log("export options Withoutcheck", true);

} 


//meters --->  withoutCheck -->feet --> Multiple
 @Test(enabled=true)
public void TC_004_contextSearch_Utilities_Time_Depth_Data_WithoutCheckAll_currentPage_Excel_Multi() throws Throwable{

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


fetchingReports.selectUnitConversionOptions("meters");
Thread.sleep(300);
Reporter.log("feet selected", true);

fetchingReports.fetchHoldUpDepthReportResult(false, "currentpage", "excel", "multiple");
Reporter.log("export options Withoutcheck", true);

} 

//feet --->  withoutCheck --> --> ALL Single
 @Test(enabled=true)
public void TC_005_contextSearch_Utilities_Time_Depth_Data_WithoutCheckAll_ALL_Excel_Single() throws Throwable{

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

fetchingReports.fetchHoldUpDepthReportResult(false, "All", "excel", "single");
Reporter.log("export options Withoutcheck", true);

} 

//meters --->  withoutCheck --> --> ALL Single
 @Test(enabled=true)
public void TC_006_contextSearch_Utilities_Time_Depth_Data_WithoutCheckAll_ALL_Excel_Single() throws Throwable{

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


fetchingReports.selectUnitConversionOptions("meters");
Thread.sleep(300);
Reporter.log("feet selected", true);

fetchingReports.fetchHoldUpDepthReportResult(false, "All", "excel", "single");
Reporter.log("export options Withoutcheck", true);

} 

//feet --->  withoutCheck --> --> ALL Multiple
 @Test(enabled=true)
public void TC_007_contextSearch_Utilities_Time_Depth_Data_WithoutCheckAll_ALL_Excel_Multi() throws Throwable{

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

fetchingReports.fetchHoldUpDepthReportResult(false, "All", "excel", "multiple");
Reporter.log("export options Withoutcheck", true);

} 
*/
//meters --->  withoutCheck --> --> ALL Multiple
 @Test(enabled=true)
public void TC_008_contextSearch_Utilities_Time_Depth_Data_WithoutCheckAll_ALL_Excel_Multi() throws Throwable{

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


fetchingReports.selectUnitConversionOptions("meters");
Thread.sleep(300);
Reporter.log("feet selected", true);

fetchingReports.fetchHoldUpDepthReportResult(false, "All", "excel", "multiple");
Reporter.log("export options Withoutcheck", true);

} 


	 
             //feet --->  CheckALL
  @Test(enabled=true)
public void TC_009_contextSearch_Utilities_Time_Depth_Data_CheckAll_currentPage_Excel_Single() throws Throwable{
	
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
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"TRUE");

	
	 fetchingReports.selectUnitConversionOptions("feet");
	 Thread.sleep(300);
	 Reporter.log("feet selected", true);
	 
	 
	 
	 fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel", "single");
	 Reporter.log("export options checked", true);
	 
	 
  }
  
              //meters --->  CheckALL
   @Test(enabled=true)
public void TC_010_contextSearch_Utilities_Time_Depth_Data_CheckAll_currentPage_Excel_Single() throws Throwable{
	
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
	
	
	 fetchingReports.selectUnitConversionOptions("meters");
	 Thread.sleep(300);
	 Reporter.log("feet selected", true);
	 
	 fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel", "single");
	 Reporter.log("export options checked", true);
	 
	 
  } 
  
  //feet --->  CheckALL --> multiple selection
  @Test(enabled=true)
public void TC_011_contextSearch_Utilities_Time_Depth_Data_CheckAll_currentPage_Excel_Multi() throws Throwable{
	
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
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"TRUE");
	
	 fetchingReports.selectUnitConversionOptions("feet");
	 Thread.sleep(300);
	 Reporter.log("feet selected", true);
	 
	 fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel", "multi");
	 Reporter.log("export options checked multiple selected", true);
	 
	 
 } 
 
 //meters --->  CheckALL--> multiple selection
 @Test(enabled=true)
public void TC_012_contextSearch_Utilities_Time_Depth_Data_CheckAll_currentPage_Excel_multi() throws Throwable{
	
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
	
	
	 fetchingReports.selectUnitConversionOptions("meters");
	 Thread.sleep(300);
	 Reporter.log("meters selected", true);
	 
	 fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel", "multi");
	 Reporter.log("export options checked multiple selected", true);
	 
	 
} 

 
  
//feet --->  CheckALL All Excel --> single selection
 @Test(enabled=true)
public void TC_013_contextSearch_Utilities_Time_Depth_Data_CheckAll_ALL_Excel_Single() throws Throwable{
	
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
	 
	 fetchingReports.fetchHoldUpDepthReportResult(true,"All", "excel", "single");
	 Reporter.log("export options checked All excel single selected", true);
	 
	 
} 

//meters --->  CheckALL --> single selection
 @Test(enabled=true)
public void TC_014_contextSearch_Utilities_Time_Depth_Data_CheckAll_ALL_Excel_Single() throws Throwable{
	
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
	
	
	 fetchingReports.selectUnitConversionOptions("meters");
	 Thread.sleep(300);
	 Reporter.log("feet selected", true);
	 
	 fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel", "single");
	 Reporter.log("export options checked All excel single selected", true);
	 
	 
} 

//feet --->  CheckALL -->multiple selection
 @Test(enabled=true)
public void TC_0015_contextSearch_Utilities_Time_Depth_Data_CheckAll_ALL_Excel_Multi() throws Throwable{
	
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
	 
	 fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel", "multi");
	 Reporter.log("export options checked All excel multiple selected", true);
	 
	 
} 


//feet --->  CheckALL -->multiple selection
 @Test(enabled=true)
public void TC_016_contextSearch_Utilities_Time_Depth_Data_CheckAll_All_Excel_Multi() throws Throwable{
	
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
	
	
	 fetchingReports.selectUnitConversionOptions("meters");
	 Thread.sleep(300);
	 Reporter.log("feet selected", true);
	 
	 fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel", "multi");
	 Reporter.log("export options checked All excel multiple selected", true);
	 
	 
} 

} 
	 
	 
	 