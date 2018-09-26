package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

public class FetchingReportsTest_PositionLogData extends TestBaseSetup{
	
	/*TestScript Designed On 23/04/2018
    TestScript Designed By Sireesha  */
	
	public homePage homepage ;
	////feet 
	@Test(enabled=true)
	public void TC_001_PositionLogData_Feet_currentPage_excel_Single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");//meters
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"Show All");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}
	/*@Test(enabled=true)
	public void TC_002_PositionLogData_Feet_currentPage_Multi_excel() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"Show All");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","Multi");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	/*@Test(enabled=true)
	public void TC_003_PositionLogData_Feet_currentPage_excel_All_single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"Show All");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	@Test(enabled=true)
	public void TC_004_PositionLogData_Feet_False_currentPage_excel_All_Multi() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"FALSE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}
	@Test(enabled=true)
	public void TC_005_PositionLogData_Feet_False_currentPage_excel_Single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"FALSE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}
	/*@Test(enabled=true)
	public void TC_006_PositionLogData_Feet_False_currentPage_Multi_excel() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"FALSE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","Multi");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	@Test(enabled=true)
	public void TC_007_PositionLogData_Feet_False_currentPage_excel_All_single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"FALSE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}
	/*@Test(enabled=true)
	public void TC_008_PositionLogData_Feet_False_currentPage_excel_All_Multi() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"FALSE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	@Test(enabled=true)
	public void TC_009_PositionLogData_Feet_True_currentPage_excel_Single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"TRUE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}
	@Test(enabled=true)
	public void TC_010_PositionLogData_Feet_true_currentPage_Multi_excel() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"TRUE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","Multi");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}
	@Test(enabled=true)
	public void TC_011_PositionLogData_Feet_True_currentPage_excel_All_single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"TRUE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}
	/*@Test(enabled=true)
	public void TC_012_PositionLogData_Feet_true_currentPage_excel_All_Multi() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"TRUE");
		 fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	///////////
	@Test(enabled=true)
	public void TC_013_PositionLogData_Feet_Coordinate_currentPage_excel_Single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"Amersfoort / RD New [1672_28992]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"Show All");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}
	/*@Test(priority=1,enabled=true)
	public void TC_014_PositionLogData_Feet_Coordinate_currentPage_Multi_excel() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"Amersfoort / RD New [1672_28992]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"Show All");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","Multi");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	/*@Test(priority=1,enabled=true)
	public void TC_015_PositionLogData_Feet_Coordinate_currentPage_excel_All_single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"Amersfoort / RD New [1672_28992]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"Show All");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	@Test(enabled=true)
	public void TC_014_PositionLogData_Feet_Coordinate_False_currentPage_excel_All_Multi() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"Amersfoort / RD New [1672_28992]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"FALSE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}
	/*@Test(priority=1,enabled=true)
	public void TC_015_PositionLogData_Feet_Coordinate_False_currentPage_excel_Single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"Amersfoort / RD New [1672_28992]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"FALSE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	/*@Test(priority=1,enabled=true)
	public void TC_018_PositionLogData_Feet_False_Coordinate_currentPage_Multi_excel() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"Amersfoort / RD New [1672_28992]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"FALSE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","Multi");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	/*@Test(priority=1,enabled=true)
	public void TC_019_PositionLogData_Feet_Coordinate_False_currentPage_excel_All_single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"Amersfoort / RD New [1672_28992]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"FALSE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
		 Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	/*@Test(priority=1,enabled=true)
	public void TC_020_PositionLogData_Feet_Coordinate_False_currentPage_excel_All_Multi() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"Amersfoort / RD New [1672_28992]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"FALSE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	@Test(enabled=true)
	public void TC_015_PositionLogData_Feet_Coordinate_True_currentPage_excel_Single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"Amersfoort / RD New [1672_28992]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"TRUE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}
	@Test(enabled=true)
	public void TC_016_PositionLogData_FeetCoordinate_true_currentPage_Multi_excel() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"Amersfoort / RD New [1672_28992]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"TRUE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","Multi");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}
	/*@Test(priority=1,enabled=true)
	public void TC_023_PositionLogData_Feet_Coordinate_True_currentPage_excel_All_single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"Amersfoort / RD New [1672_28992]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"TRUE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}
	@Test(priority=1,enabled=true)
	public void TC_024_PositionLogData_Feet_true_currentPage_excel_All_Multi() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"Amersfoort / RD New [1672_28992]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"TRUE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	//// meters
	
	
	@Test(enabled=true)
	public void TC_017_PositionLogData_Feet_currentPage_excel_Single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");//meters
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"Show All");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}
	/*@Test(enabled=true)
	public void TC_018_PositionLogData_meters_currentPage_Multi_excel() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"Show All");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","Multi");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	@Test(enabled=true)
	public void TC_019_PositionLogData_meters_currentPage_excel_All_single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"Show All");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}
	/*@Test(enabled=true)
	public void TC_020_PositionLogData_meters_False_currentPage_excel_All_Multi() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"FALSE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
		 Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	@Test(enabled=true)
	public void TC_021_PositionLogData_meters_False_currentPage_excel_Single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"FALSE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}
	/*@Test(enabled=true)
	public void TC_022_PositionLogData_meters_False_currentPage_Multi_excel() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"FALSE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","Multi");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
/*	@Test(priority=1,enabled=true)
	public void TC_024_PositionLogData_meters_False_currentPage_excel_All_single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"FALSE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
/*	@Test(priority=1,enabled=true)
	public void TC_025_PositionLogData_meters_False_currentPage_excel_All_Multi() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"FALSE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	@Test(enabled=true)
	public void TC_023_PositionLogData_meters_True_currentPage_excel_Single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"TRUE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}
	/*@Test(enabled=true)
	public void TC_024_PositionLogData_meters_true_currentPage_Multi_excel() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"TRUE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","Multi");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	/*@Test(priority=1,enabled=true)
	public void TC_028_PositionLogData_meters_True_currentPage_excel_All_single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"TRUE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	/*@Test(priority=1,enabled=true)
	public void TC_029_PositionLogData_meters_true_currentPage_excel_All_Multi() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"TRUE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
		 Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	@Test(enabled=true)
	public void TC_025_PositionLogData_meters_Coordinate_currentPage_excel_Single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"ED50 / TM 0 N [1311_23090]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"Show All");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
		 Reporter.log("Position Log Data report generated successfully ",true);
		
	}
/*	@Test(priority=1,enabled=true)
	public void TC_038_PositionLogData_meters_Coordinate_currentPage_Multi_excel() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"ED50 / TM 0 N [1311_23090]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"Show All");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","Multi");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	/*@Test(priority=1,enabled=true)
	public void TC_039_PositionLogData_meters_Coordinate_currentPage_excel_All_single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"ED50 / TM 0 N [1311_23090]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"Show All");
		 fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
		 Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	@Test(enabled=true)
	public void TC_027_PositionLogData_meters_Coordinate_False_currentPage_excel_All_Multi() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"ED50 / TM 0 N [1311_23090]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"FALSE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}
	@Test(enabled=true)
	public void TC_026_PositionLogData_Meter_currentPage_excel_All_Multi_WithoutCheck() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"All" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"Show All");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(false, "All", "excel","Multi");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}
	/*@Test(priority=1,enabled=true)
	public void TC_041_PositionLogData_meters_Coordinate_False_currentPage_excel_Single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"ED50 / TM 0 N [1311_23090]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"FALSE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	/*@Test(priority=1,enabled=true)
	public void TC_042_PositionLogData_meters_False_Coordinate_currentPage_Multi_excel() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"ED50 / TM 0 N [1311_23090]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"FALSE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","Multi");
		 Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	/*@Test(priority=1,enabled=true)
	public void TC_043_PositionLogData_meters_Coordinate_False_currentPage_excel_All_single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"ED50 / TM 0 N [1311_23090]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"FALSE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}
	@Test(priority=1,enabled=true)
	public void TC_044_PositionLogData_meters_Coordinate_False_currentPage_excel_All_Multi() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"ED50 / TM 0 N [1311_23090]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"FALSE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}
	@Test(priority=1,enabled=true)
	public void TC_045_PositionLogData_meters_Coordinate_True_currentPage_excel_Single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"ED50 / TM 0 N [1311_23090]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"TRUE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
		 Reporter.log("Position Log Data report generated successfully ",true);
		
	}
	@Test(priority=1,enabled=true)
	public void TC_046_PositionLogData_meters_Coordinate_true_currentPage_Multi_excel() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"ED50 / TM 0 N [1311_23090]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"TRUE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","Multi");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}
	@Test(priority=1,enabled=true)
	public void TC_047_PositionLogData_meters_Coordinate_True_currentPage_excel_All_single() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"ED50 / TM 0 N [1311_23090]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"TRUE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	/*@Test(priority=1,enabled=true)
	public void TC_048_PositionLogData_meters_true_currentPage_excel_All_Multi() throws Throwable
	{
		Reporter.log("Position Log Data",true);
		homepage=new homePage(driver);
		Reporter.log("Browser opened",true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch cst=	homepage.selectText("Anjum*");
		Reporter.log("All Fields are Selected",true);
		cst.selectAllcheck();
		cst.selectGeneralWellboreInfo();
		fetchingReports fetchingReports=cst.selectreporting("Position Log Data");
		fetchingReports.switchWindows();
		fetchingReports.selectDataForReports(fetchingReports.getWellbore(),"ANJUM- 1");
		fetchingReports.selectDataForReports(fetchingReports.getCoardinateSystem(),"ED50 / TM 0 N [1311_23090]" );
		fetchingReports.selectDataForReports(fetchingReports. getDataPreference(),"TRUE");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		fetchingReports.selectUnitConversionOptions_Logs("meters");
		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
		Reporter.log("Position Log Data report generated successfully ",true);
		
	}*/
	
	

}
