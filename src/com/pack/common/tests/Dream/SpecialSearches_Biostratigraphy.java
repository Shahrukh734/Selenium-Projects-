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


public class SpecialSearches_Biostratigraphy extends TestBaseSetup
{
	public homePage homepage;
	public contextsearch context;
	public SpecialSearches special;
	public SearchCollections search;
	public fetchingReports reports;
	public managePortal_ManageCountry managecountry;
	
	@Test(enabled=true)
	public void TC_001_SpecialSearches_BiostratigraphySearch_CurrentPage_Excel() throws Throwable
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
		Thread.sleep(5000);
		special.getSpecialSearches();
		special.selectingItems("Biostratigraphy");
		managecountry.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		Thread.sleep(2000);
		homepage.adminViaDropDown(search.getDdlSavedSearch(),"Auto_spl_Bio");
		Thread.sleep(2000);
		//reports.isAlertPresent();
		search.selectSearchButton();
		reports.selectUnitConversionOptionsStatus("feet");
		reports.selectExportoptionsSearch(true,"Current Page Only","excel");
		Reporter.log("BiostratigraphySearch exported Successfully",true);
		
	}
	@Test(enabled=true)
	public void TC_002_SpecialSearches_BiostratigraphySearch_All_Excel() throws Throwable
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
		Thread.sleep(5000);
		special.getSpecialSearches();
		special.selectingItems("Biostratigraphy");
		Thread.sleep(2000);
		managecountry.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		homepage.adminViaDropDown(search.getDdlSavedSearch(),"Auto_spl_Bio");
		Thread.sleep(2000);
		search.selectSearchButton();
		reports.selectUnitConversionOptionsStatus("feet");
		reports.selectExportoptionsSearch(true,"All","excel");
		Reporter.log("BiostratigraphySearch exported Successfully",true);
		driver.switchTo().defaultContent();
		
	}
	@Test(enabled=true)
	public void TC_003_SpecialSearches_BiostratigraphyReset() throws Throwable
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
		Thread.sleep(5000);
		special.getSpecialSearches();
		special.selectingItems("Biostratigraphy");
		Thread.sleep(2000);
		managecountry.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		homepage.adminViaDropDown(search.getDdlSavedSearch(),"Auto_spl_Bio");
		Thread.sleep(2000);
		search.getBtnReset();
		Reporter.log("BiostratigraphySearch reset Successfully",true);
		
	}
	@Test(enabled=true)
	public void TC_004_SpecialSearches_BiostratigraphySaveSearch() throws Throwable
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
		Thread.sleep(5000);
		special.getSpecialSearches();
		special.selectingItems("Biostratigraphy");
		Thread.sleep(2000);
		managecountry.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		special.getBiotxtWellboreName().sendKeys("anjum*");
		special.getBiotxtStratigraphicUnit().sendKeys("e*");
		special.gettxtStratigraphicColumn().sendKeys("E*");
		special.gettxtSaveSearch().sendKeys("Auto_Bio_Searcherr23");
		special.getBiochbShared();
		special.getBiocmdSaveSearch();
		Reporter.log("BiostratigraphySearch created Successfully",true);
		
	}
	@Test(enabled=true)
	public void TC_005_SpecialSearches_BiostratigraphySaveSearchSelectionCreation() throws Throwable
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
		Thread.sleep(5000);
		special.getSpecialSearches();
		special.selectingItems("Biostratigraphy");
		Thread.sleep(2000);
		managecountry.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		homepage.adminViaDropDown(search.getDdlSavedSearch(),"Auto_spl_Bio");
		Thread.sleep(2000);
		special.gettxtSaveSearch().sendKeys("Auto_Bio_Searchess8");
		special.getBiocmdSaveSearch();
		Reporter.log("BiostratigraphySearch created Successfully",true);
		
	}


}
