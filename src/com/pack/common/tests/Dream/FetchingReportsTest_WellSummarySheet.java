package com.pack.common.tests.Dream;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

public class FetchingReportsTest_WellSummarySheet extends TestBaseSetup{

	
	public homePage homepage ;
	
	//	ContextSearch->General WellBore Info->WellSmmarySheet
	
	// Feet - Depth Reference BF--length,feet
	
@Test(enabled=true)
public void TC_001_WellSummarySheet_BF_currentPage_Excel_length_feet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(), "length", "feet");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_002_WellSummarySheet_DF_currentpage_Excel_length_feet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(), "length", "feet");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}


@Test(enabled=true)
public void TC_003_WellSummarySheet_GL_Currentpage_Excel_length_feet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(), "length", "feet");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
	
}

@Test(enabled=true)
public void TC_004_WellSummarySheet_KB_CurrentPage_Excel_length_feet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(), "length", "feet");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
	
}
@Test(enabled=true)
public void TC_005_WellSummarySheet_PDL_currentPage_Excel_length_Feet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(), "length", "feet");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_006_WellSummarySheet_RT_currentpage_Excel_length_feet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(), "length","feet");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"RT");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
//Feet - Depth Reference BF--length,Meter
@Test(enabled=true)
public void TC_007_WellSummarySheet_BF_currentPage_Excel_length_Meter() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(), "length", "meters");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_008_WellSummarySheet_DF_currentpage_Excel_length_Meter() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(), "length", "meters");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}


@Test(enabled=true)
public void TC_009_WellSummarySheet_GL_Currentpage_Excel_length_Meter() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(), "length", "meters");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
	
}

@Test(enabled=true)
public void TC_010_WellSummarySheet_KB_CurrentPage_Excel_length_Meter() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(), "length", "meters");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
	
}
@Test(enabled=true)
public void TC_011_WellSummarySheet_PDL_currentPage_Excel_length_Meter() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(), "length", "meters");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_012_WellSummarySheet_RT_currentpage_Excel_length_Meter() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(), "length","meters");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"RT");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}

///ratio->m3/m3
@Test(enabled=true)
public void TC_013_WellSummarySheet_BF_All_Excel_ratio_m3Orm3() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","m3/m3");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}

@Test(enabled=true)
public void TC_014_WellSummarySheet_DF_All_Excel_ratio_m3Orm3() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","m3/m3");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}


@Test(enabled=true)
public void TC_015_WellSummarySheet_GL_All_Excel_ratio_m3Orm3() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","m3/m3");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
	
}

@Test(enabled=true)
public void TC_016_WellSummarySheet_KB_All_Excel_ratio_m3Orm3() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","m3/m3");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_017_WellSummarySheet_PDL_All_Excel_ratio_m3Orm3() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","m3/m3");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}

@Test(enabled=true)
public void TC_018_WellSummarySheet_RT_All_Excel_ratio_m3Orm3() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","m3/m3");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"RT");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}

/*///ratio->ppm


@Test(enabled=true)
public void TC_019_WellSummarySheet_BF_All_Excel_ratio_ppm() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","ppm");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}

@Test(enabled=true)
public void TC_020_WellSummarySheet_DF_All_Excel_ratio_ppm() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","ppm");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}


@Test(enabled=true)
public void TC_021_WellSummarySheet_GL_All_Excel_ratio_ppm() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","ppm");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
	
}*/

/*@Test(enabled=true)
public void TC_022_WellSummarySheet_KB_All_Excel_ratio_ppm() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","ppm");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_023_WellSummarySheet_PDL_All_Excel_ratio_ppm() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","ppm");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}

@Test(enabled=true)
public void TC_024_WellSummarySheet_RT_All_Excel_ratio_ppm() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","ppm");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"RT");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}*/
/*
/////////////  scm(15C)/scm

@Test(enabled=true)
public void TC_025_WellSummarySheet_BF_All_Excel_ratio_scm15Corscm() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","scm(15C)/scm");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}

@Test(enabled=true)
public void TC_026_WellSummarySheet_DF_All_Excel_ratio_scm15COrscm() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","scm(15C)/scm");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}


@Test(enabled=true)
public void TC_027_WellSummarySheet_GL_All_Excel_ratio_scm15COrscm() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","scm(15C)/scm");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
	
}

@Test(enabled=true)
public void TC_028_WellSummarySheet_KB_All_Excel_ratio_scm15COrscm() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","scm(15C)/scm");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_029_WellSummarySheet_PDL_All_Excel_ratio_scm15COrscm() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","scm(15C)/scm");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}

@Test(enabled=true)
public void TC_030_WellSummarySheet_RT_All_Excel_ratio_scm15COrscm() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","scm(15C)/scm");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"RT");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}

/////////////////////////////ratio-->scm/MMNm3

@Test(enabled=true)
public void TC_031_WellSummarySheet_BF_All_Excel_ratio_scmorMMNm3() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","scm/MMNm3");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}

@Test(enabled=true)
public void TC_032_WellSummarySheet_DF_All_Excel_ratio_scmorMMNm3() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","scm/MMNm3");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}


@Test(enabled=true)
public void TC_033_WellSummarySheet_GL_All_Excel_ratio_scmorMMNm3() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","scm/MMNm3");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
	
}

@Test(enabled=true)
public void TC_034_WellSummarySheet_KB_All_Excel_ratio_scmorMMNm3() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","scm/MMNm3");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_035_WellSummarySheet_PDL_All_Excel_ratio_scmorMMNm3() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","scm/MMNm3");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}

@Test(enabled=true)
public void TC_036_WellSummarySheet_RT_All_Excel_ratio_scmorMMNm3() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","scm/MMNm3");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"RT");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
/////////////////////////////stb60/MMscf

@Test(enabled=true)
public void TC_037_WellSummarySheet_BF_All_Excel_ratio_stb60orMMscf() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","stb60/MMscf");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}

@Test(enabled=true)
public void TC_038_WellSummarySheet_DF_All_Excel_ratio_stb60orMMscf() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","stb60/MMscf");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}


@Test(enabled=true)
public void TC_039_WellSummarySheet_GL_All_Excel_ratio_stb60OrMMscf() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","stb60/MMscf");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
	
}

@Test(enabled=true)
public void TC_040_WellSummarySheet_KB_All_Excel_ratio_stb60orMMscf() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","stb60/MMscf");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_041_WellSummarySheet_PDL_All_Excel_ratio_stb60OrMMscf() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","stb60/MMscf");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}

@Test(enabled=true)
public void TC_042_WellSummarySheet_RT_All_Excel_ratio_stb60OrMMscf() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","stb60/MMscf");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"RT");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}




///////////////////////////////////////

/////////ratio----> stb60/Mscf60


@Test(enabled=true)
public void TC_043_WellSummarySheet_BF_All_Excel_ratio_stb60orMscf60() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","stb60/Mscf60");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}

@Test(enabled=true)
public void TC_044_WellSummarySheet_DF_All_Excel_ratio_stb60orMscf60() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","stb60/Mscf60");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}


@Test(enabled=true)
public void TC_045_WellSummarySheet_GL_All_Excel_ratio_stb60OrMscf60() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","stb60/Mscf60");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
	
}

@Test(enabled=true)
public void TC_046_WellSummarySheet_KB_All_Excel_ratio_stb60OrMscf60() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","stb60/Mscf60");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_047_WellSummarySheet_PDL_All_Excel_ratio_stb60OrMscf60() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","stb60/Mscf60");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}

@Test(enabled=true)
public void TC_048_WellSummarySheet_RT_All_Excel_ratio_stb60OrMscf60() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"ratio","stb60/Mscf60");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"RT");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
*/
///////////
////"pressure","bara"
@Test(enabled=true)
public void TC_019_WellSummarySheet_BF_currentPage_Excel_pressure_bara() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","bara");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_020_WellSummarySheet_DF_currentpage_Excel_pressure_bara() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","bara");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}


@Test(enabled=true)
public void TC_021_WellSummarySheet_GL_currentpage_Excel_pressure_bara() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","bara");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}

/*@Test(enabled=true)
public void TC_022_WellsummarySheet_KB_CurrentPage_Excel_pressure_bara() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","bara");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_023_WellSunmmarySheet_PDL_currentPage_Excel_pressure_bara() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","bara");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_024_WellsummarySheet_RT_currentpage_Excel_pressure_bara() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","bara");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"RT");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}*/

////////////////////////////////
/*@Test(enabled=true)
public void TC_055_WellSummarySheet_BF_currentPage_Excel_pressure_barg() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","barg");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_056_WellSummarySheet_DF_currentpage_Excel_pressure_barg() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","barg");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}


@Test(enabled=true)
public void TC_057_WellSummarySheet_GL_currentpage_Excel_pressure_barg() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","barg");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}

@Test(enabled=true)
public void TC_058_WellsummarySheet_KB_CurrentPage_Excel_pressure_barg() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","barg");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_059_WellSunmmarySheet_PDL_currentPage_Excel_pressure_barg() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","barg");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_060_WellsummarySheet_RT_currentpage_Excel_pressure_barg() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","barg");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"RT");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
//////////////////////////////////
//Pressure-->kPa
@Test(enabled=true)
public void TC_061_WellSummarySheet_BF_currentPage_Excel_kPa() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","kPa");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_062_WellSummarySheet_DF_currentpage_Excel_kPa() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","kPa");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}


@Test(enabled=true)
public void TC_063_WellSummarySheet_GL_currentpage_Excel_kPa() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","kPa");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}

@Test(enabled=true)
public void TC_064_WellsummarySheet_KB_CurrentPage_Excel_kPa() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","kPa");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_065_WellSunmmarySheet_PDL_currentPage_Excel_pressure_kPa() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","kPa");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_066_WellsummarySheet_RT_currentpage_Excel_pressure_kPa() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","kPa");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"RT");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
//////////////////////////////////

//Pressure-->psia
@Test(enabled=true)
public void TC_067_WellSummarySheet_BF_currentPage_Excel_pressure_psia() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","psia");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_068_WellSummarySheet_DF_currentpage_Excel_pressure_psia() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","psia");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}


@Test(enabled=true)
public void TC_069_WellSummarySheet_GL_currentpage_Excel_pressure_psia() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","psia");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}

@Test(enabled=true)
public void TC_070_WellsummarySheet_KB_CurrentPage_Excel_pressure_psia() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","psia");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_071_WellSunmmarySheet_PDL_currentPage_Excel_pressure_psia() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","psia");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_072_WellsummarySheet_RT_currentpage_Excel_pressure_psia() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","psia");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"RT");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
/////////////////////////////////
//Pressure--> psig
@Test(enabled=true)
public void TC_073_WellSummarySheet_BF_currentPage_Excel_pressure_psig() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","psig");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_074_WellSummarySheet_DF_currentpage_Excel_pressure_psig() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","psig");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}


@Test(enabled=true)
public void TC_075_WellSummarySheet_GL_currentpage_Excel_pressure_psig() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","psig");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}

@Test(enabled=true)
public void TC_076_WellsummarySheet_KB_CurrentPage_Excel_pressure_psig() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","psig");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_077_WellSunmmarySheet_PDL_currentPage_Excel_pressure_psig() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","psig");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_078_WellsummarySheet_RT_currentpage_Excel_pressure_psig() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"pressure","psig");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"RT");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}*/
//////////////////////////////
////press sqd per std gas rate sqd","(ba.d/MNm3)2--------------------(ps.d/MMcf)2
//////////////////////////
@Test(enabled=true)
public void TC_025_WellSummarySheet_DF_All_Excel() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"press sqd per std gas rate sqd","(ba.d/MNm3)2");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}

@Test(enabled=true)
public void TC_026_WellSummarySheet_BF_All_Excel() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"press sqd per std gas rate sqd","(ba.d/MNm3)2");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}


@Test(enabled=true)
public void TC_027_WellSummarySheet_GL_All_Excel() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"press sqd per std gas rate sqd","(ba.d/MNm3)2");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}

/*@Test(enabled=true)
public void TC_082_WellsummarySheet_KB_All_Excel() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"press sqd per std gas rate sqd","(ba.d/MNm3)2");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_083_WellSummarySheet_PDL_All_Excel() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"press sqd per std gas rate sqd","(ba.d/MNm3)2");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}

@Test(enabled=true)
public void TC_084_WellSummarySheet_RT_Excel_All() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"press sqd per std gas rate sqd","(ba.d/MNm3)2");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"RT");
	fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}*/
////////////////
/*////press sqd per std gas rate sqd",(ps.d/MMcf)2

@Test(enabled=true)
public void TC_085_WellSummarySheet_DF_All_Excel_psdOrMMcf2() throws Throwable{

Reporter.log("Perform Quick Search");
homepage=new homePage(driver);
homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
contextsearch contextpage = homepage.selectText("Anjum*");
Reporter.log("All Fields Selected", true);
contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
contextpage.selectGeneralWellboreInfo();
fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
fetchingReports.switchWindows();
Reporter.log("Swtich to report window and perfrom operations");
fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"press sqd per std gas rate sqd","(ps.d/MMcf)2");
fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
Reporter.log("Well Summary Sheet Report Generation is completed");
}

@Test(enabled=true)
public void TC_086_WellSummarySheet_BF_All_Excel_psdOrMMcf2() throws Throwable{

Reporter.log("Perform Quick Search");
homepage=new homePage(driver);
homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
contextsearch contextpage = homepage.selectText("Anjum*");
Reporter.log("All Fields Selected", true);
contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
contextpage.selectGeneralWellboreInfo();
fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
fetchingReports.switchWindows();
Reporter.log("Swtich to report window and perfrom operations");
fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"press sqd per std gas rate sqd","(ps.d/MMcf)2");
fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
Reporter.log("Well Summary Sheet Report Generation is completed");
}


@Test(enabled=true)
public void TC_087_WellSummarySheet_GL_All_Excel_psdOrMMcf2() throws Throwable{

Reporter.log("Perform Quick Search");
homepage=new homePage(driver);
homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
contextsearch contextpage = homepage.selectText("Anjum*");
Reporter.log("All Fields Selected", true);
contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
contextpage.selectGeneralWellboreInfo();
fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
fetchingReports.switchWindows();
Reporter.log("Swtich to report window and perfrom operations");
fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"press sqd per std gas rate sqd","(ps.d/MMcf)2");
fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
Reporter.log("Well Summary Sheet Report Generation is completed");
}

@Test(enabled=true)
public void TC_088_WellsummarySheet_KB_All_Excel_psdOrMMcf2() throws Throwable{

Reporter.log("Perform Quick Search");
homepage=new homePage(driver);
homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
contextsearch contextpage = homepage.selectText("Anjum*");
Reporter.log("All Fields Selected", true);
contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
contextpage.selectGeneralWellboreInfo();
fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
fetchingReports.switchWindows();
Reporter.log("Swtich to report window and perfrom operations");
fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"press sqd per std gas rate sqd","(ps.d/MMcf)2");
fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_089_WellSummarySheet_PDL_All_Excel_psdOrMMcf2() throws Throwable{

Reporter.log("Perform Quick Search");
homepage=new homePage(driver);
homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
contextsearch contextpage = homepage.selectText("Anjum*");
Reporter.log("All Fields Selected", true);
contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
contextpage.selectGeneralWellboreInfo();
fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
fetchingReports.switchWindows();
Reporter.log("Swtich to report window and perfrom operations");
fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"press sqd per std gas rate sqd","(ps.d/MMcf)2");
fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
Reporter.log("Well Summary Sheet Report Generation is completed");
}

@Test(enabled=true)
public void TC_090_WellSummarySheet_RT_Excel_All_psdOrMMcf2() throws Throwable{

Reporter.log("Perform Quick Search");
homepage=new homePage(driver);
homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
contextsearch contextpage = homepage.selectText("Anjum*");
Reporter.log("All Fields Selected", true);
contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
contextpage.selectGeneralWellboreInfo();
fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
fetchingReports.switchWindows();
Reporter.log("Swtich to report window and perfrom operations");
fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"press sqd per std gas rate sqd","(ps.d/MMcf)2");
fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"RT");
fetchingReports.selectExportoptionsStatiousSummary(true,"All","excel");
Reporter.log("Well Summary Sheet Report Generation is completed");
}
*/
///////////////////////////////////////////
////////"temperature","K"

@Test(enabled=true)
public void TC_028_WellSummarySheet_BF_currentPage_Excel_temperature_K() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"temperature","K");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_029_WellSummarySheet_DF_currentpage_excel_temperature_K() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"temperature","K");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_030_WellSummarySheet_GL_currentpage_excel_temperature_K() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"temperature","K");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
/*@Test(enabled=true)
public void TC_094_WellSummarySheet_KB_currentpage_excel_temperature_K() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"temperature","K");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_095_WellSummarySheet_PDL_currentpage_excel_temperature_K() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"temperature","K");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_096_WellSummarySheet_RT_currentpage_excel_temperature_K() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"temperature","K");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"RT");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}*/
/////////////
/*/////Temperature--->degC
@Test(enabled=true)
public void TC_097_WellSummarySheet_BF_currentPage_Excel_temperature_degC() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"temperature","degC");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_098_WellSummarySheet_DF_currentpage_excel_temperature_degC() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"temperature","degC");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_099_WellSummarySheet_GL_currentpage_excel_temperature_degC() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"temperature","degC");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_100_WellSummarySheet_KB_currentpage_excel_temperature_degC() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"temperature","degC");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_101_WellSummarySheet_PDL_currentpage_excel_temperature_degC() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"temperature","degC");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_102_WellSummarySheet_RT_currentpage_excel_degC() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"temperature","degC");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"RT");
	fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
/////Temperature--->degC
@Test(enabled=true)
public void TC_103_WellSummarySheet_BF_currentPage_Excel_degF() throws Throwable{

Reporter.log("Perform Quick Search");
homepage=new homePage(driver);
homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
contextsearch contextpage = homepage.selectText("Anjum*");
Reporter.log("All Fields Selected", true);
contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
contextpage.selectGeneralWellboreInfo();
fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
fetchingReports.switchWindows();
Reporter.log("Swtich to report window and perfrom operations");
fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"temperature","degF");
fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_104_WellSummarySheet_DF_currentpage_excel_degF() throws Throwable{

Reporter.log("Perform Quick Search");
homepage=new homePage(driver);
homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
contextsearch contextpage = homepage.selectText("Anjum*");
Reporter.log("All Fields Selected", true);
contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
contextpage.selectGeneralWellboreInfo();
fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
fetchingReports.switchWindows();
Reporter.log("Swtich to report window and perfrom operations");
fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"temperature","degF");
fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_105_WellSummarySheet_GL_currentpage_excel_degF() throws Throwable{

Reporter.log("Perform Quick Search");
homepage=new homePage(driver);
homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
contextsearch contextpage = homepage.selectText("Anjum*");
Reporter.log("All Fields Selected", true);
contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
contextpage.selectGeneralWellboreInfo();
fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
fetchingReports.switchWindows();
Reporter.log("Swtich to report window and perfrom operations");
fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"temperature","degF");
fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_106_WellSummarySheet_KB_currentpage_excel_degF() throws Throwable{

Reporter.log("Perform Quick Search");
homepage=new homePage(driver);
homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
contextsearch contextpage = homepage.selectText("Anjum*");
Reporter.log("All Fields Selected", true);
contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
contextpage.selectGeneralWellboreInfo();
fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
fetchingReports.switchWindows();
Reporter.log("Swtich to report window and perfrom operations");
fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"temperature","degC");
fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_107_WellSummarySheet_PDL_currentpage_excel_degF() throws Throwable{

Reporter.log("Perform Quick Search");
homepage=new homePage(driver);
homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
contextsearch contextpage = homepage.selectText("Anjum*");
Reporter.log("All Fields Selected", true);
contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
contextpage.selectGeneralWellboreInfo();
fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
fetchingReports.switchWindows();
Reporter.log("Swtich to report window and perfrom operations");
fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"temperature","degC");
fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
Reporter.log("Well Summary Sheet Report Generation is completed");
}
@Test(enabled=true)
public void TC_108_WellSummarySheet_RT_currentpage_excel_temperature_degF() throws Throwable{

Reporter.log("Perform Quick Search");
homepage=new homePage(driver);
homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
contextsearch contextpage = homepage.selectText("Anjum*");
Reporter.log("All Fields Selected", true);
contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
contextpage.selectGeneralWellboreInfo();
fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
fetchingReports.switchWindows();
Reporter.log("Swtich to report window and perfrom operations");
fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(),"temperature","degF");
fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"RT");
fetchingReports.selectExportoptionsStatiousSummary(true,"currentpage","excel");
Reporter.log("Well Summary Sheet Report Generation is completed");
}*/

@Test(enabled=true)
public void TC_031_WellSummarySheet_BF_currentPage_Excel_WithoutCheck() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well Summary Sheet");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptions_FromList_WSS(fetchingReports.getUnitGroup(), fetchingReports. getUnitType(), "length", "feet");
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.selectExportoptionsStatiousSummary(false,"currentpage","excel");
	Reporter.log("Well Summary Sheet Report Generation is completed");
}
		
 }