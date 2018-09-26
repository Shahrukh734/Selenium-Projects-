package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.SearchCollections;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

public class SearchCollections_QuarySearch extends TestBaseSetup 
{
	public homePage homepage;
	SearchCollections search;
	fetchingReports reports;
	contextsearch context;
	@Test(enabled=true)
	public void TC_001_QuarySearch_SavedSearch_All_Excel()throws Throwable
	{
		homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context= homepage.selectText("Anjum*");
		Reporter.log("All Fields Selected",true);
		search.selectSearchCollection();
		search.selectingItems("Query Search");
		search.getSwitchFrame();
		search.selectDropdown(search.getDdlSavedSearch(),"CustomizeView");
		search.selectSearchButton();
		Reporter.log("Saved Search Records displayed",true);
		reports.selectExportoptionsSearch(true,"All","excel");
		Reporter.log("QuarySearch Saved Search exported successfully",true);
	}
	@Test(enabled=true)
	public void TC_002_QuarySearch_SavedSearch_Currentpage_Excel()throws Throwable
	{
		homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context = homepage.selectText("Anjum*");
		Reporter.log("All Fields Selected",true);
		search.selectSearchCollection();
		search.selectingItems("Query Search");
		search.getSwitchFrame();
		search.selectDropdown(search.getDdlSavedSearch(),"CustomizeView");
		search.selectSearchButton();
		Reporter.log("Saved Search Records displayed",true);
		reports.selectExportoptionsSearch(true,"Current Page Only","excel");
		Reporter.log("QuarySearch Saved Search exported successfully",true);
	}
	/*@Test(enabled=true)
	public void TC_003_QuarySearch_SavedSearch_WithoutCheck()throws Throwable
	{
		homePage homepage=new homePage(driver);
		SearchCollections search= new SearchCollections(driver);
		fetchingReports reports=new fetchingReports(driver);
		contextsearch context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		Reporter.log("All Fields Selected",true);
		search.selectSearchCollection();
		search.selectingItems("Query Search");
		search.getSwitchFrame();
		search.selectDropdown(search.getDdlSavedSearch(),"CustomizeView");
		search.selectSearchButton();
		Reporter.log("Saved Search Records displayed",true);
		reports.selectExportoptionsSearch(false,"All","excel");
		Reporter.log("QuarySearch Saved Search exported successfully",true);
	}*/
	@Test(enabled=true)
	public void TC_003_QuarySearch_Search_Currentpage_Excel()throws Throwable
	{
		homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context= homepage.selectText("Anjum*");
		Reporter.log("All Fields Selected",true);
		search.selectSearchCollection();
		search.selectingItems("Query Search");
		search.getSwitchFrame();
		search.selectDropdown(search.getDdlSavedSearch(),"auto_test");
		search.selectSearchButton();
		Reporter.log("Search Records displayed",true);
		reports.selectExportoptionsSearch(true,"Current Page Only","excel");
		Reporter.log("QuarySearch Saved Search exported successfully",true);
	}
	@Test(enabled=true)
	public void TC_004_QuarySearch_Search_All_Excel()throws Throwable
	{
		homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context= homepage.selectText("Anjum*");
		Reporter.log("All Fields Selected",true);
		search.selectSearchCollection();
		search.selectingItems("Query Search");
		search.getSwitchFrame();
		search.selectDropdown(search.getDdlSavedSearch(),"auto_test");
		search.selectSearchButton();
		Reporter.log("Search Records displayed",true);
		reports.selectExportoptionsSearch(true,"Current Page Only","excel");
		Reporter.log("QuarySearch Saved Search exported successfully",true);
	}
	@Test(enabled=true)///finish
	public void TC_005_QuarySearch_CreationOfSavedSearch()throws Throwable
	{
		homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context= homepage.selectText("Anjum*");
		Reporter.log("All Fields Selected",true);
		search.selectSearchCollection();
		search.selectingItems("Query Search");
		search.getSwitchFrame();
		search.selectDropdown(search.getDdlSavedSearch(),"auto_test");
		search.gettxtSavedSearch().sendKeys("WellboreTest3");
		search.selectBtnSavedSearch();
		Reporter.log("QuarySearch Creation Of Saved Search is done successfully ",true);
	}
	@Test(enabled=true)
	public void TC_006_QuarySearch_ResetSearch()throws Throwable
	{
		homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context = homepage.selectText("Anjum*");
		Reporter.log("All Fields Selected",true);
		search.selectSearchCollection();
		search.selectingItems("Query Search");
		search.getSwitchFrame();
		search.selectDropdown(search.getDdlSavedSearch(),"auto_test");
		search.gettxtSavedSearch().sendKeys("WellboreTest");
		search.getBtnReset();
		Reporter.log("QuarySearch Reset Of Quary Search is done successfully ",true);
	}
	@Test(enabled=true)
	public void TC_007_QuarySearch_EditCriteriaButton()throws Throwable
	{
		homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context= homepage.selectText("Anjum*");
		Reporter.log("All Fields Selected",true);
		search.selectSearchCollection();
		search.selectingItems("Query Search");
		search.getSwitchFrame();
		search.selectDropdown(search.getDdlSavedSearch(),"auto_test");
		search.geteditButton();
		Reporter.log("QuarySearch Edit Criteria Of Quary Search is done successfully ",true);
	}
	@Test(enabled=true)
	public void TC_008_QuarySearch_viewSqlButton()throws Throwable
	{
		homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context= homepage.selectText("Anjum*");
		Reporter.log("All Fields Selected",true);
		search.selectSearchCollection();
		search.selectingItems("Query Search");
		search.getSwitchFrame();
		search.selectDropdown(search.getDdlSavedSearch(),"auto_test");
		search.getViewSqlButton();
		Reporter.log("QuarySearch View Sql Of Quary Search is done successfully ",true);
	}
	@Test(enabled=true)
	public void TC_009_QuarySearch_SavedSearchCreationByIcon()throws Throwable
	{
		homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context= homepage.selectText("Anjum*");
		Reporter.log("All Fields Selected",true);
		search.selectSearchCollection();
		search.selectingItems("Query Search");
		search.getSwitchFrame();
		search.selectDropdown(search.getDdlSavedSearch(),"auto_test");
		search.gettxtSavedSearch().sendKeys("WellboreTest43");
		search.getsaveButtonIcon();
		Reporter.log("QuarySearch Creation Of Saved Search by Icon performed operation successfully ",true);
	}
	@Test(enabled=true)
	public void TC_010_QuarySearch_ResetIcon()throws Throwable
	{
		homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context= homepage.selectText("Anjum*");
		Reporter.log("All Fields Selected",true);
		search.selectSearchCollection();
		search.selectingItems("Query Search");
		search.getSwitchFrame();
		search.selectDropdown(search.getDdlSavedSearch(),"auto_test");
		search.gettxtSavedSearch().sendKeys("WellboreTest43");
		search.getBtnReset();
		Reporter.log("QuarySearch Reset Icon performed operation successfully ",true);
	}
	@Test(enabled=true)
	public void TC_011_QuarySearch_GoIcon_currentpage_excel()throws Throwable
	{
		homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context= homepage.selectText("Anjum*");
		Reporter.log("All Fields Selected",true);
		search.selectSearchCollection();
		search.selectingItems("Query Search");
		search.getSwitchFrame();
		search.selectDropdown(search.getDdlSavedSearch(),"auto_test");
		search.getrunButton();
		Reporter.log("QuarySearch Go Icon performed operation successfully ",true);
		reports.selectExportoptionsSearch(true,"current page only","excel");
	}
	@Test(enabled=true)
	public void TC_012_QuarySearch_GoIcon_All_excel()throws Throwable
	{
		homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context= homepage.selectText("Anjum*");
		Reporter.log("All Fields Selected",true);
		search.selectSearchCollection();
		search.selectingItems("Query Search");
		search.getSwitchFrame();
		search.selectDropdown(search.getDdlSavedSearch(),"auto_test");
		search.getrunButton();
		Reporter.log("QuarySearch Go Icon performed operation successfully ",true);
		reports.selectExportoptionsSearch(true,"All","excel");
	}
}
