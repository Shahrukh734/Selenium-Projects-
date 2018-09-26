package com.pack.common.tests.Dream;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.SearchCollections;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

public class SearchCollections_SharedSearches extends TestBaseSetup 
{
	public homePage homepage;
	SearchCollections search;
	fetchingReports reports;
	contextsearch context;
	@Test(enabled=true)
	public void TC_001_SharedSearches_WellAdvanceSearch_ViewDetails()throws Throwable
	{
		homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context = homepage.selectText("Anjum*");
		search.selectSearchCollection();
		search.selectingItems("Shared Searches");
		search.getSwitchFrame();
		search.getWellAdvanceSearchPlusImg();
		search.getSharedSearchItemsSub("Adv_Common_name");
		Reporter.log("IN SharedSearches WellAdvanceSearch generated successfully",true);
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(text(),'Vidya')]/../../td[3]/a")).click();
		
	}
	@Test(enabled=true)
	public void TC_002_SharedSearches_WellAdvanceSearh_ByNameClick_Excel()throws Throwable
	{
		homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context = homepage.selectText("Anjum*");
		search.selectSearchCollection();
		search.selectingItems("Shared Searches");
		search.getSwitchFrame();
		search.getWellAdvanceSearchPlusImg();
		search.getSharedSearchItemsMain("Adv_Common_name");
		reports.selectExportoptionsadmin("Current Page Only","excel");
		Reporter.log("IN SharedSearches WellAdvanceSearch generated successfully",true);
		
	}
	@Test(enabled=true)
	public void TC_003_SharedSearches_WellBoreAdvanceSearch_ViewDetails()throws Throwable
	{
		homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context = homepage.selectText("Anjum*");
		search.selectSearchCollection();
		search.selectingItems("Shared Searches");
		search.getSwitchFrame();
		search.getWellboreAdvanceSearchPlusImg();
		search.getSharedSearchItemsSub("spl_adda");
		Reporter.log("IN SharedSearches WellBoreAdvanceSearch generated successfully",true);
		
	}
	@Test(enabled=true)
	public void TC_004_SharedSearches_WellBoreAdvanceSearh_ByNameClick_Excel()throws Throwable
	{
		homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--"); 
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context = homepage.selectText("Anjum*");
		search.selectSearchCollection();
		search.selectingItems("Shared Searches");
		search.getSwitchFrame();
		search.getWellboreAdvanceSearchPlusImg();
		search.getSharedSearchItemsMain("spl_adda");
		reports.selectExportoptionsadmin("Current Page Only","excel");
		Reporter.log("IN SharedSearches WellBoreAdvanceSearch generated successfully",true);
		
	}
	@Test(enabled=true)
	public void TC_005_SharedSearches_FieldAdvanceSearch_ViewDetails()throws Throwable
	{
		homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context = homepage.selectText("Anjum*");
		search.selectSearchCollection();
		search.selectingItems("Shared Searches");
		search.getSwitchFrame();
		search.getFieldAdvanceSearch();
		search.getSharedSearchItemsSub("Field_Adv_Search");
		Reporter.log("IN SharedSearches FieldAdvanceSearch generated successfully",true);
		
	}
	@Test(enabled=true)
	public void TC_006_SharedSearches_FieldAdvanceSearh_ByNameClick_Excel()throws Throwable
	{
		homePage homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context= homepage.selectText("Anjum*");
		search.selectSearchCollection();
		search.selectingItems("Shared Searches");
		search.getSwitchFrame();
		search.getFieldAdvanceSearch();
		search.getSharedSearchItemsMain("Field_Adv_Search");
		reports.selectExportoptionsadmin("Current Page Only","excel");
		Reporter.log("IN SharedSearches FieldAdvanceSearch generated successfully",true);
		
	}
	@Test(enabled=true)
	public void TC_007_SharedSearches_QuarySearch_ViewDetails()throws Throwable
	{
		homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context= homepage.selectText("Anjum*");
		search.selectSearchCollection();
		search.selectingItems("Shared Searches");
		search.getSwitchFrame();
		search.getQuaryAdvanceSearch();
		search.getGeneralQuaryAdvanceSearch();
		search.getSharedSearchItemsSub("test123");
		Reporter.log("IN SharedSearches QuarySearch generated successfully",true);
		
	}
	@Test(enabled=true)
	public void TC_008_SharedSearches_QuarySearh_ByNameClick_Excel()throws Throwable
	{
		homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context= homepage.selectText("Anjum*");
		search.selectSearchCollection();
		search.selectingItems("Shared Searches");
		search.getSwitchFrame();
		search.getQuaryAdvanceSearch();
		search.getGeneralQuaryAdvanceSearch();
		search.getSharedSearchItemsMain("test123");
		reports.selectExportoptionsSearch(true,"Current Page Only","excel");
		Reporter.log("IN SharedSearches QuarySearch generated successfully",true);
		
	}
	@Test(enabled=true)
	public void TC_009_SharedSearches_FluidSampleSplSearch_ViewDetails()throws Throwable
	{
		homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context = homepage.selectText("Anjum*");
		search.selectSearchCollection();
		search.selectingItems("Shared Searches");
		search.getSwitchFrame();
		search.getFluidSampleSplSearch();
		search.getSharedSearchItemsSub("nn");
		Reporter.log("IN SharedSearches FluidSampleSplSearch generated successfully",true);
		
	}
	@Test(enabled=true)
	public void TC_010_SharedSearches_FluidSampleSplSearch_ByNameClick_Excel()throws Throwable
	{
		homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context= homepage.selectText("Anjum*");
		search.selectSearchCollection();
		search.selectingItems("Shared Searches");
		search.getSwitchFrame();
		search.getFluidSampleSplSearch();
		search.getSharedSearchItemsMain("nn");
		reports.selectExportoptionsSearch(true,"Current Page Only","excel");
		Reporter.log("IN SharedSearches FluidSampleSplSearch generated successfully",true);
		
	}
	@Test(enabled=true)
	public void TC_011_SharedSearches_BiostratigraphySplSearch_ViewDetails()throws Throwable
	{
		homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context= homepage.selectText("Anjum*");
		search.selectSearchCollection();
		search.selectingItems("Shared Searches");
		search.getSwitchFrame();
		search.getBiostratigraphySplSearch();
		search.getSharedSearchItemsSub("Testing123");
		Reporter.log("BiostratigraphySplSearch generated successfully",true);
		
	}
	@Test(enabled=true)
	public void TC_012_SharedSearches_BiostratigraphySplSearch_ByNameClick_Excel()throws Throwable
	{
		homepage=new homePage(driver);
		search= new SearchCollections(driver);
		reports=new fetchingReports(driver);
		context=new contextsearch(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context= homepage.selectText("Anjum*");
		search.selectSearchCollection();
		search.selectingItems("Shared Searches");
		search.getSwitchFrame();
		search.getBiostratigraphySplSearch();
		search.getSharedSearchItemsMain("Testing123");
		reports.selectExportoptionsSearch(true,"Current Page Only","excel");
		Reporter.log("BiostratigraphySplSearch generated successfully",true);
		
	}
}
