package com.pack.common.tests.Dream;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

public class FetchingReportsTest_WellORWellboreHeader extends TestBaseSetup{

	
	public homePage homepage ;
	
	//	ContextSearch->General WellBore Info->Well bore path
	
	// Feet - Depth Reference BF
	
@Test(enabled=true)
public void TC_001_WellboreHeader_Feet_BF_currentPage_Excel_SingleSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("feet");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}
@Test(enabled=true)
public void TC_002_WellboreHeader_Feet_BF_All_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("feet");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}


@Test(enabled=true)
public void TC_003_WellboreHeader_Feet_DF_All_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("feet");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}

@Test(enabled=true)
public void TC_004_WellboreHeader_Feet_DF_CurrentPage_Excel_Single() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("feet");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}
@Test(enabled=true)
public void TC_005_WellboreHeader_Feet_GL_currentPage_Excel_SingleSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	 contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");	
	fetchingReports. selectUnitConversionOptions_Logs("feet");	
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}
@Test(enabled=true)
public void TC_006_WellboreHeader_Feet_GL_All_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("feet");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}
@Test(enabled=true)
public void TC_007_WellboreHeader_Feet_KB_All_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("feet");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}

@Test(enabled=true)
public void TC_008_WellboreHeader_Feet_KB_CurrentPage_Excel_Single() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	 Reporter.log("Swtich to report window and perfrom operations");	
	fetchingReports. selectUnitConversionOptions_Logs("feet");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}


@Test(enabled=true)
public void TC_009_WellboreHeader_Feet_PDL_All_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");	
	fetchingReports. selectUnitConversionOptions_Logs("feet");	
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");	
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}

@Test(enabled=true)
public void TC_010_WellboreHeader_Feet_PDL_CurrentPage_Excel_Single() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	 contextpage.selectGeneralWellboreInfo();	
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");	
	fetchingReports.switchWindows();	
	 Reporter.log("Swtich to report window and perfrom operations");	
	fetchingReports. selectUnitConversionOptions_Logs("feet");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}
@Test(enabled=true)
public void TC_011_WellboreHeader_Feet_RT_All_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	 contextpage.selectGeneralWellboreInfo();	
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");	
	fetchingReports.switchWindows();
	 Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("feet");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"RT");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}

@Test(enabled=true)
public void TC_012_WellboreHeader_Feet_RT_CurrentPage_Excel_Single() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	 contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	 Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("feet");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"RT");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}



/// meter 
@Test(enabled=true)
public void TC_013_WellboreHeader_Meter_BF_currentPage_Excel_SingleSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("meters");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}
@Test(enabled=true)
public void TC_014_WellboreHeader_Meter_BF_All_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("meters");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}


@Test(enabled=true)
public void TC_015_WellboreHeader_Meter_DF_All_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("meters");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}

@Test(enabled=true)
public void TC_016_WellboreHeader_Meter_DF_CurrentPage_Excel_Single() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("meters");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}
@Test(enabled=true)
public void TC_017_WellboreHeader_Meter_GL_currentPage_Excel_SingleSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("meters");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}
@Test(enabled=true)
public void TC_018_WellboreHeader_Meter_GL_All_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("meters");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}


@Test(enabled=true)
public void TC_019_WellboreHeader_Meter_KB_All_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("meters");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}

@Test(enabled=true)
public void TC_020_WellboreHeader_Meter_KB_CurrentPage_Excel_Single() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("meters");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}


@Test(enabled=true)
public void TC_021_WellboreHeader_Meter_PDL_All_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("meters");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}

@Test(enabled=true)
public void TC_022_WellboreHeader_Meter_PDL_CurrentPage_Excel_Single() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("meters");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}
@Test(enabled=true)
public void TC_023_WellboreHeader_Meter_RT_All_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("meters");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"RT");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}

@Test(enabled=true)
public void TC_024_WellboreHeader_Meter_RT_CurrentPage_Excel_Single() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("meters");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"RT");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}

@Test(enabled=true)
public void TC_025_WellboreHeader_feet_BF_currentPage_Excel_SingleSheet_WithoutCheck() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("feet");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.fetchHoldUpDepthReportResult(false, "currentpage", "excel","single");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}
@Test(enabled=true)
public void TC_026_WellboreHeader_Meter_BF_currentPage_Excel_SingleSheet_WithoutCheck() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("meters");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.fetchHoldUpDepthReportResult(false, "currentpage", "excel","single");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}
			
 }