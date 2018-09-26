package com.pack.common.tests.Dream;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.SearchCollections;
import com.pack.common.pageobjects.Dream.SpecialSearches;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;
import com.pack.common.pageobjects.Dream.managePortal_ManageCountry;


public class SpecialSearches_LogsbyFieldDepth extends TestBaseSetup
{
	public homePage homepage;
	public contextsearch context;
	public SpecialSearches special;
	public SearchCollections search;
	public fetchingReports reports;
	public managePortal_ManageCountry managecountry;
	
	@Test(enabled=true)
	public void TC_001_SpecialSearches_LogsbyFieldDepth_CurrentPage_Excel() throws Throwable
	{
		homepage=new homePage(driver);
		special =new SpecialSearches(driver);
		context=new contextsearch(driver);
		search=new SearchCollections(driver);
		reports=new fetchingReports(driver);
		managecountry=new managePortal_ManageCountry(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context= homepage.selectText("Anjum*");
		Thread.sleep(1000);
		special.getSpecialSearches();
		special.selectingItems("Logs by Field/Depth");
		managecountry.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		Thread.sleep(1000);
		homepage.adminViaDropDown(search.getDdlSavedSearch(),"Curve Logs B");
		Thread.sleep(2000);
		//reports.isAlertPresent();
		search.selectSearchButton();
		reports.selectUnitConversionOptionsStatus("feet");
		reports.selectExportoptionsSearch(true,"Current Page Only","excel");
		Reporter.log("LogsbyFieldDepth exported Successfully",true);
		
	}
	@Test(enabled=true)
	public void TC_002_SpecialSearches_LogsbyFieldDepth_All_Excel() throws Throwable
	{
		homepage=new homePage(driver);
		special =new SpecialSearches(driver);
		context=new contextsearch(driver);
		search=new SearchCollections(driver);
		reports=new fetchingReports(driver);
		managecountry=new managePortal_ManageCountry(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context= homepage.selectText("Anjum*");
		Thread.sleep(1000);
		special.getSpecialSearches();
		special.selectingItems("Logs by Field/Depth");
		managecountry.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		Thread.sleep(1000);
		homepage.adminViaDropDown(search.getDdlSavedSearch(),"Curve Logs B");
		Thread.sleep(2000);
		//reports.isAlertPresent();
		search.selectSearchButton();
		reports.selectUnitConversionOptionsStatus("feet");
		reports.selectExportoptionsSearch(true,"Current Page Only","excel");
		Reporter.log("LogsbyFieldDepth exported Successfully",true);
		
	}
	@Test(enabled=true)
	public void TC_003_SpecialSearches_LogsbyFieldDepthReset() throws Throwable
	{
		homepage=new homePage(driver);
		special =new SpecialSearches(driver);
		context=new contextsearch(driver);
		search=new SearchCollections(driver);
		reports=new fetchingReports(driver);
		managecountry=new managePortal_ManageCountry(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context= homepage.selectText("Anjum*");
		Thread.sleep(1000);
		special.getSpecialSearches();
		special.selectingItems("Logs by Field/Depth");
		Thread.sleep(1000);
		managecountry.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		homepage.adminViaDropDown(search.getDdlSavedSearch(),"Curve Logs B");
		Thread.sleep(2000);
		search.getBtnReset();
		Reporter.log("LogsbyFieldDepth reset Successfully",true);
		
	}
	@Test(enabled=true)
	public void TC_004_SpecialSearches_LogsbyFieldDepthSaveSearch() throws Throwable
	{
		homepage=new homePage(driver);
		special =new SpecialSearches(driver);
		context=new contextsearch(driver);
		search=new SearchCollections(driver);
		reports=new fetchingReports(driver);
		managecountry=new managePortal_ManageCountry(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context= homepage.selectText("Anjum*");
		Thread.sleep(1000);
		special.getSpecialSearches();
		special.selectingItems("Logs by Field/Depth");
		Thread.sleep(1000);
		managecountry.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		//special.getlogtxtFieldName().sendKeys("NAMBO_SPECIALIST_WELLS1*");
		//special.getlogtxtCurveTopDepth().sendKeys("3000");
		//special.getlogtxtCurveBottomDepth().sendKeys("4000");
		special.gettxtSaveSearch().sendKeys("Curve Logs X");
		special.getBiocmdSaveSearch();
		Reporter.log("LogsbyFieldDepth created Successfully",true);
		
	}
	@Test(enabled=true)
	public void TC_005_SpecialSearches_LogsbyFieldDepthSaveSearchBySaveSearchSelection() throws Throwable
	{
		homepage=new homePage(driver);
		special =new SpecialSearches(driver);
		context=new contextsearch(driver);
		search=new SearchCollections(driver);
		reports=new fetchingReports(driver);
		managecountry=new managePortal_ManageCountry(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context= homepage.selectText("Anjum*");
		Thread.sleep(1000);
		special.getSpecialSearches();
		special.selectingItems("Logs by Field/Depth");
		Thread.sleep(1000);
		managecountry.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		homepage.adminViaDropDown(search.getDdlSavedSearch(),"Curve Logs B");
		Thread.sleep(2000);
		special.gettxtSaveSearch().sendKeys("Auto_Bio_Search100");
		special.getBiocmdSaveSearch();
		Reporter.log("BiostratigraphySearch created Successfully",true);
		
	}


}
