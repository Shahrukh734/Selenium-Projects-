package com.pack.common.tests.Dream;


import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

public class FetchingReportsTest_ProdInjec extends TestBaseSetup {
	public homePage homepage ;
	
	
	
	@Test(enabled=true)
	public void TC_001_contextSearch_ProductionHisstory_Monthly_well() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Well",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}
	
	
	@Test(enabled=true)
	public void TC_002_contextSearch_ProductionHisstory_Monthly_Wellbore() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	@Test(enabled=true)
	public void TC_003_contextSearch_ProductionHisstory_Monthly_Field() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Field",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	
	@Test(enabled=true)
	public void TC_004_contextSearch_ProductionHisstory_Monthly_ZoneCycle() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Zone/Cycle",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	@Test(enabled=true)
	public void TC_005_contextSearch_ProductionHisstory_Monthly_WellboreReservoirInterval() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore Reservoir Interval",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}
	
	
	
	@Test(enabled=true)
	public void TC_006_contextSearch_ProductionHisstory_Monthly_Reservoir() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Reservoir",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	
	
	
	@Test(enabled=true)
	public void TC_007_contextSearch_ProductionHisstory_Monthly_BlockConcession() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Block /Concession",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	                              // Yearly
	////////////////////--------------------------------------------------------------
	
	
	@Test(enabled=true)
	public void TC_008_contextSearch_ProductionHisstory_Yearly_well() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Well",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}
	
	
	@Test(enabled=true)
	public void TC_009_contextSearch_ProductionHisstory_Yearly_Wellbore() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	@Test(enabled=true)
	public void TC_010_contextSearch_ProductionHisstory_Yearly_Field() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Field",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	
	@Test(enabled=true)
	public void TC_011_contextSearch_ProductionHisstory_Yearly_ZoneCycle() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Zone/Cycle",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	@Test(enabled=true)
	public void TC_012_contextSearch_ProductionHisstory_Yearly_WellboreReservoirInterval() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore Reservoir Interval",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}
	
	
	
	@Test(enabled=true)
	public void TC_013_contextSearch_ProductionHisstory_Yearly_Reservoir() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Reservoir",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	
	
	//Connectivity to this database is currently not available. Please try again later and/or report the issue to your local administrator via the link found on the "Help" main page.Bug
	@Test(enabled=true)
	public void TC_014_contextSearch_ProductionHisstory_Yearly_BlockConcession() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Block /Concession",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click(); 	
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	
	//Total
	@Test(enabled=true)
	public void TC_015_contextSearch_ProductionHisstory_Total_well() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Well",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}
	
	
	@Test(enabled=true)
	public void TC_016_contextSearch_ProductionHisstory_Total_Wellbore() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	@Test(enabled=true)
	public void TC_017_contextSearch_ProductionHisstory_Total_Field() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Field",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	
	@Test(enabled=true)
	public void TC_018_contextSearch_ProductionHisstory_Total_ZoneCycle() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Zone/Cycle",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	@Test(enabled=true)
	public void TC_019_contextSearch_ProductionHisstory_Total_WellboreReservoirInterval() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore Reservoir Interval",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}
	
	
	// working fine need to click on save
	@Test(enabled=true)
	public void TC_020_contextSearch_ProductionHisstory_Total_Reservoir() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Reservoir",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
    
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
     // SendKeys.SendWait(@"{Enter}");
     

	}	
	
	
	
	
	
	@Test(enabled=true)
	public void TC_021_contextSearch_ProductionHisstory_Total_BlockConcession() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Block /Concession",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	//daily
	
	
	@Test(enabled=true)
	public void TC_022_contextSearch_ProductionHisstory_Daily_BlockConcession() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Block /Concession",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	
	//Total
	@Test(enabled=true)
	public void TC_023_contextSearch_ProductionHisstory_Daily_well() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Well",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}
	
	
	@Test(enabled=true)
	public void TC_024_contextSearch_ProductionHisstory_Daily_Wellbore() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	@Test(enabled=true)
	public void TC_025_contextSearch_ProductionHisstory_Dailyl_Field() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Field",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	
	@Test(enabled=true)
	public void TC_026_contextSearch_ProductionHisstory_Daily_ZoneCycle() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Zone/Cycle",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	@Test(enabled=true)
	public void TC_027_contextSearch_ProductionHisstory_Daily_WellboreReservoirInterval() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore Reservoir Interval",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}
	
	
	
	@Test(enabled=true)
	public void TC_028_contextSearch_ProductionHisstory_Daily_Reservoir() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Reservoir",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	
	
	
	@Test(enabled=true)
	public void TC_029_contextSearch_ProductionHisstory_Daily_BlockConcession() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Block /Concession",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	
	
	@Test(enabled=true)
	public void TC_030_contextSearch_ProductionHisstory_Monthly_well_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Well",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}
	
	
	@Test(enabled=true)
	public void TC_031_contextSearch_ProductionHisstory_Monthly_Wellbore_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	@Test(enabled=true)
	public void TC_032_contextSearch_ProductionHisstory_Monthly_Field_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Field",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	
	@Test(enabled=true)
	public void TC_033_contextSearch_ProductionHisstory_Monthly_ZoneCycle_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Zone/Cycle",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	@Test(enabled=true)
	public void TC_034_contextSearch_ProductionHisstory_Monthly_WellboreReservoirInterval_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore Reservoir Interval",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}
	
	
	
	@Test(enabled=true)
	public void TC_035_contextSearch_ProductionHisstory_Monthly_Reservoir_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Reservoir",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	
	
	
	@Test(enabled=true)
	public void TC_036_contextSearch_ProductionHisstory_Monthly_BlockConcession_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Block /Concession",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	                              // Yearly
	////////////////////--------------------------------------------------------------
	
	
	@Test(enabled=true)
	public void TC_037_contextSearch_ProductionHisstory_Yearly_well_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Well",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}
	
	
	@Test(enabled=true)
	public void TC_038_contextSearch_ProductionHisstory_Yearly_Wellbore_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	@Test(enabled=true)
	public void TC_039_contextSearch_ProductionHisstory_Yearly_Field_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Field",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	
	@Test(enabled=true)
	public void TC_040_contextSearch_ProductionHisstory_Yearly_ZoneCycle_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Zone/Cycle",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	@Test(enabled=true)
	public void TC_041_contextSearch_ProductionHisstory_Yearly_WellboreReservoirInterval_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore Reservoir Interval",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}
	
	
	
	@Test(enabled=true)
	public void TC_042_contextSearch_ProductionHisstory_Yearly_Reservoir_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Reservoir",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	
	
	
	@Test(enabled=true)
	public void TC_043_contextSearch_ProductionHisstory_Yearly_BlockConcession_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Block /Concession",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	
	//Total
	@Test(enabled=true)
	public void TC_044_contextSearch_ProductionHisstory_Total_well_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Well",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}
	
	
	@Test(enabled=true)
	public void TC_045_contextSearch_ProductionHisstory_Total_Wellbore_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	@Test(enabled=true)
	public void TC_046_contextSearch_ProductionHisstory_Total_Field_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Field",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	
	@Test(enabled=true)
	public void TC_047_contextSearch_ProductionHisstory_Total_ZoneCycle_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Zone/Cycle",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	@Test(enabled=true)
	public void TC_048_contextSearch_ProductionHisstory_Total_WellboreReservoirInterval_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore Reservoir Interval",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}
	
	
	
	@Test(enabled=true)
	public void TC_049_contextSearch_ProductionHisstory_Total_Reservoir_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Reservoir",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	
	
	
	@Test(enabled=true)
	public void TC_050_contextSearch_ProductionHisstory_Total_BlockConcession_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Block /Concession",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	//daily
	
	
	@Test(enabled=true)
	public void TC_051_contextSearch_ProductionHisstory_Daily_BlockConcession_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Block /Concession",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	
	//Total
	@Test(enabled=true)
	public void TC_052_contextSearch_ProductionHisstory_Daily_well_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Well",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}
	
	
	@Test(enabled=true)
	public void TC_053_contextSearch_ProductionHisstory_Daily_Wellbore_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	@Test(enabled=true)
	public void TC_054_contextSearch_ProductionHisstory_Dailyl_Field_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Field",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	
	@Test(enabled=true)
	public void TC_055_contextSearch_ProductionHisstory_Daily_ZoneCycle_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Zone/Cycle",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	@Test(enabled=true)
	public void TC_056_contextSearch_ProductionHisstory_Daily_WellboreReservoirInterval_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore Reservoir Interval",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}
	
	
	
	@Test(enabled=true)
	public void TC_057_contextSearch_ProductionHisstory_Daily_Reservoir_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Reservoir",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	
	
	
	@Test(enabled=true)
	public void TC_058_contextSearch_ProductionHisstory_Daily_BlockConcession_Pipeline() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Block /Concession",fetchingReports.SelectGroup_By());    
      fetchingReports.selectreporting("Producing Day",fetchingReports.Averaging); 
      fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
      fetchingReports.selectDataForReports(fetchingReports.Period,"All");
      fetchingReports.Submit_Click();
      fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
      fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	
	
	
	
	@Test(enabled=true)
	public void TC_059_contextSearch_ProductionHisstory_Monthly_well_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Well",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}


	@Test(enabled=true)
	public void TC_060_contextSearch_ProductionHisstory_Monthly_Wellbore_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	

	@Test(enabled=true)
	public void TC_061_contextSearch_ProductionHisstory_Monthly_Field_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Field",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	



	@Test(enabled=true)
	public void TC_062_contextSearch_ProductionHisstory_Monthly_ZoneCycle_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Zone/Cycle",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	


	@Test(enabled=true)
	public void TC_063_contextSearch_ProductionHisstory_Monthly_WellboreReservoirInterval_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore Reservoir Interval",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}



	@Test(enabled=true)
	public void TC_064_contextSearch_ProductionHisstory_Monthly_Reservoir_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Reservoir",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	





	@Test(enabled=true)
	public void TC_065_contextSearch_ProductionHisstory_Monthly_BlockConcession_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Block /Concession",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	

	                              // Yearly
	////////////////////--------------------------------------------------------------


	@Test(enabled=true)
	public void TC_066_contextSearch_ProductionHisstory_Yearly_well_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Well",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}


	@Test(enabled=true)
	public void TC_067_contextSearch_ProductionHisstory_Yearly_Wellbore_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	

	@Test(enabled=true)
	public void TC_068_contextSearch_ProductionHisstory_Yearly_Field_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Field",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	



	@Test(enabled=true)
	public void TC_069_contextSearch_ProductionHisstory_Yearly_ZoneCycle_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Zone/Cycle",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	


	@Test(enabled=true)
	public void TC_070_contextSearch_ProductionHisstory_Yearly_WellboreReservoirInterval_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore Reservoir Interval",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}



	@Test(enabled=true)
	public void TC_071_contextSearch_ProductionHisstory_Yearly_Reservoir_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Reservoir",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	





	@Test(enabled=true)
	public void TC_072_contextSearch_ProductionHisstory_Yearly_BlockConcession_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Block /Concession",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	



	//Total
	@Test(enabled=true)
	public void TC_073_contextSearch_ProductionHisstory_Total_well_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Well",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}


	@Test(enabled=true)
	public void TC_074_contextSearch_ProductionHisstory_Total_Wellbore_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	

	@Test(enabled=true)
	public void TC_075_contextSearch_ProductionHisstory_Total_Field_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Field",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	



	@Test(enabled=true)
	public void TC_076_contextSearch_ProductionHisstory_Total_ZoneCycle_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Zone/Cycle",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	


	@Test(enabled=true)
	public void TC_077_contextSearch_ProductionHisstory_Total_WellboreReservoirInterval_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore Reservoir Interval",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}



	@Test(enabled=true)
	public void TC_078_contextSearch_ProductionHisstory_Total_Reservoir_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Reservoir",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	





	@Test(enabled=true)
	public void TC_079_contextSearch_ProductionHisstory_Total_BlockConcession_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Block /Concession",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	

	//daily


	@Test(enabled=true)
	public void TC_080_contextSearch_ProductionHisstory_Daily_BlockConcession_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Block /Concession",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	



	//Total
	@Test(enabled=true)
	public void TC_081_contextSearch_ProductionHisstory_Daily_well_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Well",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}


	@Test(enabled=true)
	public void TC_082_contextSearch_ProductionHisstory_Daily_Wellbore_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	

	@Test(enabled=true)
	public void TC_083_contextSearch_ProductionHisstory_Dailyl_Field_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Field",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	



	@Test(enabled=true)
	public void TC_084_contextSearch_ProductionHisstory_Daily_ZoneCycle_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Zone/Cycle",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	


	@Test(enabled=true)
	public void TC_085_contextSearch_ProductionHisstory_Daily_WellboreReservoirInterval_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore Reservoir Interval",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}



	@Test(enabled=true)
	public void TC_086_contextSearch_ProductionHisstory_Daily_Reservoir_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Reservoir",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	





	@Test(enabled=true)
	public void TC_087_contextSearch_ProductionHisstory_Daily_BlockConcession_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Block /Concession",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Stocktank (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	




	@Test(enabled=true)
	public void TC_088_contextSearch_ProductionHisstory_Monthly_well_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Well",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}


	@Test(enabled=true)
	public void TC_089_contextSearch_ProductionHisstory_Monthly_Wellbore_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	

	@Test(enabled=true)
	public void TC_090_contextSearch_ProductionHisstory_Monthly_Field_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Field",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	



	@Test(enabled=true)
	public void TC_091_contextSearch_ProductionHisstory_Monthly_ZoneCycle_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Zone/Cycle",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	


	@Test(enabled=true)
	public void TC_092_contextSearch_ProductionHisstory_Monthly_WellboreReservoirInterval_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore Reservoir Interval",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}



	@Test(enabled=true)
	public void TC_093_contextSearch_ProductionHisstory_Monthly_Reservoir_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Reservoir",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	





	@Test(enabled=true)
	public void TC_094_contextSearch_ProductionHisstory_Monthly_BlockConcession_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Monthly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Block /Concession",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	

	                              // Yearly
	////////////////////--------------------------------------------------------------


	@Test(enabled=true)
	public void TC_095_contextSearch_ProductionHisstory_Yearly_well_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Well",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}


	@Test(enabled=true)
	public void TC_096_contextSearch_ProductionHisstory_Yearly_Wellbore_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	

	@Test(enabled=true)
	public void TC_097_contextSearch_ProductionHisstory_Yearly_Field_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Field",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	



	@Test(enabled=true)
	public void TC_098_contextSearch_ProductionHisstory_Yearly_ZoneCycle_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Zone/Cycle",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	


	@Test(enabled=true)
	public void TC_099_contextSearch_ProductionHisstory_Yearly_WellboreReservoirInterval_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore Reservoir Interval",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}



	@Test(enabled=true)
	public void TC_100_contextSearch_ProductionHisstory_Yearly_Reservoir_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Reservoir",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	





	@Test(enabled=true)
	public void TC_101_contextSearch_ProductionHisstory_Yearly_BlockConcession_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Yearly",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Block /Concession",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	



	//Total
	@Test(enabled=true)
	public void TC_102_contextSearch_ProductionHisstory_Total_well_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Well",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}


	@Test(enabled=true)
	public void TC_103_contextSearch_ProductionHisstory_Total_Wellbore_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	

	@Test(enabled=true)
	public void TC_104_contextSearch_ProductionHisstory_Total_Field_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Field",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	



	@Test(enabled=true)
	public void TC_105_contextSearch_ProductionHisstory_Total_ZoneCycle_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Zone/Cycle",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	


	@Test(enabled=true)
	public void TC_106_contextSearch_ProductionHisstory_Total_WellboreReservoirInterval_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore Reservoir Interval",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}



	@Test(enabled=true)
	public void TC_107_contextSearch_ProductionHisstory_Total_Reservoir_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Reservoir",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	





	@Test(enabled=true)
	public void TC_108_contextSearch_ProductionHisstory_Total_BlockConcession_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Total",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Block /Concession",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	

	//daily


	@Test(enabled=true)
	public void TC_109_contextSearch_ProductionHisstory_Daily_BlockConcession_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Block /Concession",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	



	//Total
	@Test(enabled=true)
	public void TC_110_contextSearch_ProductionHisstory_Daily_well_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Well",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}


	@Test(enabled=true)
	public void TC_111_contextSearch_ProductionHisstory_Daily_Wellbore_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	

	@Test(enabled=true)
	public void TC_112_contextSearch_ProductionHisstory_Dailyl_Field_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Field",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	



	@Test(enabled=true)
	public void TC_113_contextSearch_ProductionHisstory_Daily_ZoneCycle_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Zone/Cycle",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	


	@Test(enabled=true)
	public void TC_114_contextSearch_ProductionHisstory_Daily_WellboreReservoirInterval_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Wellbore Reservoir Interval",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}



	@Test(enabled=true)
	public void TC_115_contextSearch_ProductionHisstory_Daily_Reservoir_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Reservoir",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}	





	@Test(enabled=true)
	public void TC_116_contextSearch_ProductionHisstory_Daily_BlockConcession_Pipeline_CalenderDay() throws Throwable{
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
	     contextpage.selectAllcheck();
	     contextpage.SelectProductionAndInjection();
	  fetchingReports fetchingReports = contextpage.selectreporting("Production History");
	  fetchingReports.switchWindows();
	  fetchingReports.selectDataForReports(fetchingReports.Well,"ANJ-1");
	  fetchingReports.selectDataForReports(fetchingReports.Wellbore,"AllWelbore");
	  fetchingReports.selectDataForReports(fetchingReports.Field,"ANJUM");
	  fetchingReports.selectDataForReports(fetchingReports.Reservior,"ANJ-RO-002");	
	  fetchingReports.selectDataForReports(fetchingReports.Block_Concession,"NOORD-FRIESLAND");	
	  fetchingReports.selectreporting("Daily",fetchingReports.Report_Formarts); 
	  fetchingReports.selectreporting("Block /Concession",fetchingReports.SelectGroup_By());    
	  fetchingReports.selectreporting("Calendar Day",fetchingReports.Averaging); 
	  fetchingReports.selectreporting("Pipeline (NL=Wellhead)",fetchingReports.Measure); 
	  fetchingReports.selectDataForReports(fetchingReports.Period,"All");
	  fetchingReports.Submit_Click();
	  fetchingReports.selectUnitConversionOptions_FromList_PH(fetchingReports.getUnitGroups(),fetchingReports.Unit,"standard volume","scf(60F)");
	  fetchingReports.fetchDailyWellReport(true,"All", "Excel");
	}

	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//Pipeline monthly
	@Test(enabled= true)
	public void TC_001_ContextSearch_Pipeline_Monthly_All_Excel_Single() throws Throwable{
		Reporter.log("Perform Quick Search");
		
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectFewcheck();
		contextpage.SelectProductionAndInjection();
   	    fetchingReports fetchingReports = contextpage.selectreporting("Pipeline-Monthly");
   	    fetchingReports.switchWindows();
   	  fetchingReports.selectDataForReports(fetchingReports.getWELLBORE_NAME(),"ANJ-  1");
      fetchingReports.selectDataForReports(fetchingReports.getRESERVOIR_NAME(),"ANJ-RO-002");
      fetchingReports.selectDataForReports(fetchingReports.getI_GAS_UOM(),"m3");
   	  fetchingReports.selectDataForReports(fetchingReports.getP_CUM_OIL_UOM(),"scm(15C)");
   	  fetchingReports.selectDataForReports(fetchingReports.getP_CUM_WGR_UOM(),"m3/Nm3(0C)");
      fetchingReports.Clicksubmit();
      fetchingReports.FetchExportReportResult(true,"All","excel","single");
	}
	@Test(enabled= true)
	public void TC_002_ContextSearch_Pipeline_Monthly_All_Excel_multiple() throws Throwable{
		Reporter.log("Perform Quick Search");
		
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectFewcheck();
		contextpage.SelectProductionAndInjection();
   	    fetchingReports fetchingReports = contextpage.selectreporting("Pipeline-Monthly");
   	    fetchingReports.switchWindows();
   	  fetchingReports.selectDataForReports(fetchingReports.getWELLBORE_NAME(),"ANJ-  1");
      fetchingReports.selectDataForReports(fetchingReports.getRESERVOIR_NAME(),"ANJ-RO-002");
      fetchingReports.selectDataForReports(fetchingReports.getI_GAS_UOM(),"m3");
   	  fetchingReports.selectDataForReports(fetchingReports.getP_CUM_OIL_UOM(),"scm(15C)");
   	  fetchingReports.selectDataForReports(fetchingReports.getP_CUM_WGR_UOM(),"m3/Nm3(0C)");
      fetchingReports.Clicksubmit();
      fetchingReports.FetchExportReportResult(true,"All","excel","multiple");
	}
	@Test(enabled= true)
	public void TC_003_ContextSearch_Pipeline_Monthly_currentpage_Excel_Single() throws Throwable{
		Reporter.log("Perform Quick Search");
		
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectFewcheck();
		contextpage.SelectProductionAndInjection();
   	    fetchingReports fetchingReports = contextpage.selectreporting("Pipeline-Monthly");
   	    fetchingReports.switchWindows();
   	  fetchingReports.selectDataForReports(fetchingReports.getWELLBORE_NAME(),"ANJ-  1");
      fetchingReports.selectDataForReports(fetchingReports.getRESERVOIR_NAME(),"ANJ-RO-002");
      fetchingReports.selectDataForReports(fetchingReports.getI_GAS_UOM(),"m3");
   	  fetchingReports.selectDataForReports(fetchingReports.getP_CUM_OIL_UOM(),"scm(15C)");
   	  fetchingReports.selectDataForReports(fetchingReports.getP_CUM_WGR_UOM(),"m3/Nm3(0C)");
      fetchingReports.Clicksubmit();
      fetchingReports.FetchExportReportResult(true,"currentpage","excel","single");
	}
	@Test(enabled= true)
	public void TC_004_ContextSearch_Pipeline_Monthly_currentpage_Excel_Multiple() throws Throwable{
		Reporter.log("Perform Quick Search");
		
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectFewcheck();
		contextpage.SelectProductionAndInjection();
   	    fetchingReports fetchingReports = contextpage.selectreporting("Pipeline-Monthly");
   	    fetchingReports.switchWindows();
   	  fetchingReports.selectDataForReports(fetchingReports.getWELLBORE_NAME(),"ANJ-  1");
      fetchingReports.selectDataForReports(fetchingReports.getRESERVOIR_NAME(),"ANJ-RO-002");
      fetchingReports.selectDataForReports(fetchingReports.getI_GAS_UOM(),"m3");
   	  fetchingReports.selectDataForReports(fetchingReports.getP_CUM_OIL_UOM(),"scm(15C)");
   	  fetchingReports.selectDataForReports(fetchingReports.getP_CUM_WGR_UOM(),"m3/Nm3(0C)");
      fetchingReports.Clicksubmit();
      fetchingReports.FetchExportReportResult(true,"currentpage","excel","multiple");
	}
	
}
