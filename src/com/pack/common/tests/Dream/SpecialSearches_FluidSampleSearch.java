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


public class SpecialSearches_FluidSampleSearch extends TestBaseSetup
{
	public homePage homepage;
	public contextsearch context;
	public SpecialSearches special;
	public SearchCollections search;
	public fetchingReports reports;
	public managePortal_ManageCountry managecountry;
	
	@Test(enabled=true)
	public void TC_001_SpecialSearches_FluidSampleSearch_currentPageOnly() throws Throwable
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
		special.getSpecialSearches();
		special.selectingItems("Fluid Sample Search");
		Thread.sleep(2000);
		managecountry.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		homepage.adminViaDropDown(search.getDdlSavedSearch(),"fss_PERNIS");
		Thread.sleep(2000);
		search.selectSearchButton();
		reports.selectUnitConversionOptionsStatus("feet");
		reports.selectExportoptionsSearch(true,"Current Page Only","excel");
		Reporter.log("FluidSampleSearch exported Successfully",true);
		
	}
	@Test(enabled=true)
	public void TC_002_SpecialSearches_FluidSampleSearch_All_Excel() throws Throwable
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
		special.getSpecialSearches();
		special.selectingItems("Fluid Sample Search");
		Thread.sleep(2000);
		managecountry.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		homepage.adminViaDropDown(search.getDdlSavedSearch(),"fss_PERNIS");
		Thread.sleep(2000);
		search.selectSearchButton();
		reports.selectUnitConversionOptionsStatus("feet");
		reports.selectExportoptionsSearch(true,"Current Page Only","excel");
		Reporter.log("FluidSampleSearch exported Successfully",true);
		//driver.switchTo().defaultContent();
		
	}
	@Test(enabled=true)
	public void TC_003_SpecialSearches_FluidSampleSearchReset() throws Throwable
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
		special.getSpecialSearches();
		special.selectingItems("Fluid Sample Search");
		Thread.sleep(2000);
		managecountry.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		homepage.adminViaDropDown(search.getDdlSavedSearch(),"fss_PERNIS");
		Thread.sleep(2000);
		search.getBtnReset();
		Reporter.log("FluidSampleSearch reset Successfully",true);
		
	}
	@Test(enabled=true)
	public void TC_004_SpecialSearches_FluidSampleSearchSaveSearch() throws Throwable
	{
		homepage=new homePage(driver);
		special =new SpecialSearches(driver);
		context=new contextsearch(driver);
		managecountry=new managePortal_ManageCountry(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"--Any Country--");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		context= homepage.selectText("Anjum*");
		special.getSpecialSearches();
		special.selectingItems("Fluid Sample Search");
		Thread.sleep(2000);
		managecountry.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		special.getFluidtxtWell().sendKeys("aaaaa*");
		special.getFluidtxtField().sendKeys("bbbbb*");
		special.getFluidtxtReservior().sendKeys("cccccc*");
		special.getFluidtxtSiteFacility().sendKeys("bore");
		special.getFluidtxtHoleNumber().sendKeys("1000");
		special.getFluidtxtFiscalPoint().sendKeys("777");
		special.getFluidtxtFromDate().sendKeys("13/8/2004");
		special.getFluidtxtToDate().sendKeys("16/5/2018");
		homepage.adminViaDropDown(special.getFluidddlFluidType(),"Gas");
		special.gettxtSaveSearch().sendKeys("Auto_Fluid_search166");
		special.getBiochbShared();
		special.getBiocmdSaveSearch();
		Reporter.log("FluidSampleSearch created Successfully",true);
		
	}
	@Test(enabled=true)
	public void TC_005_SpecialSearches_FluidSampleSearchSaveSearchBySavedSearch() throws Throwable
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
		special.getSpecialSearches();
		special.selectingItems("Fluid Sample Search");
		Thread.sleep(2000);
		managecountry.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		homepage.adminViaDropDown(search.getDdlSavedSearch(),"Auto_Fluid_search28");
		Thread.sleep(2000);
		special.gettxtSaveSearch().sendKeys("Auto_Bio_Searcheres33");
		special.getBiocmdSaveSearch();
		Reporter.log("FluidSampleSearch created Successfully",true);
		
	}



}
