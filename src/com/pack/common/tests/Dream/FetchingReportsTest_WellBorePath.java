package com.pack.common.tests.Dream;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

public class FetchingReportsTest_WellBorePath extends TestBaseSetup{

	
	public homePage homepage ;
	
	//	ContextSearch->General WellBore Info->Well bore path
	
	// Feet - ShowAll

	/*TestScript Designed On 19/04/2018
    TestScript Designed By Sireesha  */

	
@Test(enabled=true)
public void TC_001_WellborePath_Feet_ShowAll_currentPage_Excel_SingleSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("feet");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"Show All");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	Reporter.log("WellborePathReport Generation is completed");
}
@Test(enabled=true)
public void TC_002_WellborePath_Feet_ShowAll_All_Excel_SingleSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("feet");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"Show All");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
	Reporter.log("WellborePathReport Generation is completed");
}

@Test(enabled=true)
public void TC_003_WellborePath_Feet_ShowAll_Currentpage_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("feet");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"Show All");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","Multi");
	Reporter.log("WellborePathReport Generation is completed");
}

@Test(enabled=true)
public void TC_004_WellborePath_Feet_ShowAll_All_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("feet");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"Show All");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	Reporter.log("WellborePathReport Generation is completed");
}
@Test(enabled=true)
public void TC_005_WellborePath_Feet_ShowAll_All_Excel_MultiSheet_WithoutCheck() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("feet");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"Show All");
	fetchingReports.fetchHoldUpDepthReportResult(false, "All", "excel","Multi");
	Reporter.log("WellborePathReport Generation is completed");
}

/// meter --Show All

@Test(enabled=true)
public void TC_006_WellborePath_Meter_ShowAll_currentPage_Excel_SingleSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("meters");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"Show All");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	Reporter.log("WellborePathReport Generation is completed");
}
@Test(enabled=true)
public void TC_007_WellborePath_Meter_ShowAll_All_Excel_SingleSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("meters");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"Show All");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
	Reporter.log("WellborePathReport Generation is completed");
}

@Test(enabled=true)
public void TC_008_WellborePath_Meter_ShowAll_Currentpage_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("meters");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"Show All");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","Multi");
	Reporter.log("WellborePathReport Generation is completed");
}

@Test(enabled=true)
public void TC_009_WellborePath_Meter_ShowAll_All_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("meters");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"Show All");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	Reporter.log("WellborePathReport Generation is completed");
}
//Feet - False(Data Preference)

@Test(enabled=true)
public void TC_010_WellborePath_Feet_False_currentPage_Excel_SingleSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("feet");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"FALSE");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	Reporter.log("WellborePathReport Generation is completed");
}
@Test(enabled=true)
public void TC_011_WellborePath_Feet_False_All_Excel_SingleSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("feet");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"FALSE");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
	Reporter.log("WellborePathReport Generation is completed");
}

@Test(enabled=true)
public void TC_012_WellborePath_Feet_False_Currentpage_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("feet");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"FALSE");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","Multi");
	Reporter.log("WellborePathReport Generation is completed");
}

@Test(enabled=true)
public void TC_013_WellborePath_Feet_False_All_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("feet");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"FALSE");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	Reporter.log("WellborePathReport Generation is completed");
}

//// meter-->false
@Test(enabled=true)
public void TC_014_WellborePath_Meter_False_All_Excel_MultiSheet_WithoutCheck() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("feet");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"FALSE");
	fetchingReports.fetchHoldUpDepthReportResult(false, "All", "excel","Multi");
	Reporter.log("WellborePathReport Generation is completed");
}
@Test(enabled=true)
public void TC_015_WellborePath_Meter_ShowAll_currentPage_Excel_SingleSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("meters");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"FALSE");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	Reporter.log("WellborePathReport Generation is completed");
}
@Test(enabled=true)
public void TC_016_WellborePath_Meter_ShowAll_All_Excel_SingleSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("meters");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"FALSE");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
	Reporter.log("WellborePathReport Generation is completed");
}

@Test(enabled=true)
public void TC_017_WellborePath_Meter_ShowAll_Currentpage_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("meters");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"FALSE");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","Multi");
	Reporter.log("WellborePathReport Generation is completed");
}

@Test(enabled=true)
public void TC_018_WellborePath_Meter_ShowAll_All_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	 Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("meters");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"FALSE");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	Reporter.log("WellborePathReport Generation is completed");
}
//Feet - TRUE(Data Preference)

@Test(enabled=true)
public void TC_019_WellborePath_Meter_False_currentPage_Excel_SingleSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("feet");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"TRUE");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	Reporter.log("WellborePathReport Generation is completed");
}
@Test(enabled=true)
public void TC_020_WellborePath_Meter_False_All_Excel_SingleSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("feet");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"TRUE");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
	Reporter.log("WellborePathReport Generation is completed");
}

@Test(enabled=true)
public void TC_021_WellborePath_Meter_False_Currentpage_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("feet");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"TRUE");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","Multi");
	Reporter.log("WellborePathReport Generation is completed");
}

@Test(enabled=true)
public void TC_022_WellborePath_Meter_False_All_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("feet");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"TRUE");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	Reporter.log("WellborePathReport Generation is completed");
}

////meter-->True
@Test(enabled=true)
public void TC_023_WellborePath_Meter_False_All_Excel_MultiSheet_WithoutCheck() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("feet");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"TRUE");
	fetchingReports.fetchHoldUpDepthReportResult(false, "All", "excel","Multi");
	Reporter.log("WellborePathReport Generation is completed");
}
@Test(enabled=true)
public void TC_024_WellborePath_Meter_ShowAll_currentPage_Excel_SingleSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	 Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("meters");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"TRUE");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	Reporter.log("WellborePathReport Generation is completed");
}
@Test(enabled=true)
public void TC_025_WellborePath_Meter_ShowAll_All_Excel_SingleSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	 Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("meters");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"TRUE");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
	Reporter.log("WellborePathReport Generation is completed");
}

@Test(enabled=true)
public void TC_026_WellborePath_Meter_ShowAll_Currentpage_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("meters");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"TRUE");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","Multi");
	Reporter.log("WellborePathReport Generation is completed");
}

@Test(enabled=true)
public void TC_027_WellborePath_Meter_ShowAll_All_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("meters");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"TRUE");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	Reporter.log("WellborePathReport Generation is completed");
}
@Test(enabled=true)
public void TC_028_WellborePath_Meter_ShowAll_All_ClickChart() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("meters");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"Show All");
	fetchingReports.getChart();
	//fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	Reporter.log("WellborePathReport Generation is completed");
}
/*@Test(enabled=true)
public void TC_029_WellborePath_ClickChart() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("meters");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"Show All");
	fetchingReports.getChart();
	//fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	Reporter.log("WellborePathReport Generation is completed");
}*/
			
 }