package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

public class FetchingReport_Test_GeologicalData extends TestBaseSetup {
	public homePage homepage ;
	
	
	
	@Test(enabled=true)
	public void TC_001_contextSearch_Geopressure_currentpage_Excel_single() throws Throwable{
		Reporter.log("Perform Quick Search");
		homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectFewcheck();
		contextpage.selectGeologicalData();
		fetchingReports fetchingReports = contextpage.selectreporting("Geopressure");
		fetchingReports.switchWindows();
		fetchingReports.selectUnitConversionOptions_FromList("length","feet");
		fetchingReports.FetchExportReportResult(true, "currentpage", "excel", "single");
	}
	
	@Test(enabled=true)
	public void TC_002_contextSearch_Geopressure_All_Excel_single() throws Throwable{
		Reporter.log("Perform Quick Search");
		homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectFewcheck();
		contextpage.selectGeologicalData();
		fetchingReports fetchingReports = contextpage.selectreporting("Geopressure");
		fetchingReports.switchWindows();
		fetchingReports.selectUnitConversionOptions_FromList("length","meters");
		fetchingReports.FetchExportReportResult(true, "All", "excel", "single");
	}

	
	

	@Test(enabled=true)
	public void TC_003_contextSearch_Geopressure_currntpage_Excel_multiple() throws Throwable{
		Reporter.log("Perform Quick Search");
		homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectFewcheck();
		contextpage.selectGeologicalData();
		fetchingReports fetchingReports = contextpage.selectreporting("Geopressure");
		fetchingReports.switchWindows();
		fetchingReports.selectUnitConversionOptions_FromList("length","feet");
		fetchingReports.FetchExportReportResult(true, "currentpage", "excel", "single");
	}
	
	@Test(enabled=true)
	public void TC_004_contextSearch_Geopressure_All_Excel_Multiple() throws Throwable{
		Reporter.log("Perform Quick Search");
		homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectFewcheck();
		contextpage.selectGeologicalData();
		fetchingReports fetchingReports = contextpage.selectreporting("Geopressure");
		fetchingReports.switchWindows();
		fetchingReports.selectUnitConversionOptions_FromList("pressure","bara");
		fetchingReports.FetchExportReportResult(true, "All", "excel", "Multiple");
	
	}
	
	@Test(enabled=true)
	public void TC_005_contextSearch_Geopressure_All_Excel_Multiple_barg() throws Throwable{
		Reporter.log("Perform Quick Search");
		homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectFewcheck();
		contextpage.selectGeologicalData();
		fetchingReports fetchingReports = contextpage.selectreporting("Geopressure");
		fetchingReports.switchWindows();
		fetchingReports.selectUnitConversionOptions_FromList("pressure","barg");
		fetchingReports.FetchExportReportResult(true, "All", "excel", "Multiple");
	  }
	
	//////////-----------------------------
	@Test(enabled=true)
	public void TC_006_contextSearch_Geopressure_All_Excel_Multiple_temperature_K() throws Throwable{
		Reporter.log("Perform Quick Search");
		homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectFewcheck();
		contextpage.selectGeologicalData();
		fetchingReports fetchingReports = contextpage.selectreporting("Geopressure");
		fetchingReports.switchWindows();
		fetchingReports.selectUnitConversionOptions_FromList("temperature","K");
		fetchingReports.FetchExportReportResult(true, "All", "excel", "Multiple");
	
	}
	
	@Test(enabled=true)
	public void TC_007_contextSearch_Geopressure_currentpage_Excel_Multiple_temperature_degC() throws Throwable{
		Reporter.log("Perform Quick Search");
		homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectFewcheck();
		contextpage.selectGeologicalData();
		fetchingReports fetchingReports = contextpage.selectreporting("Geopressure");
		fetchingReports.switchWindows();
		fetchingReports.selectUnitConversionOptions_FromList("temperature","degC");
		fetchingReports.FetchExportReportResult(true, "currentpage", "excel", "Multiple");
	  }
	@Test(enabled=true)
	public void TC_008_contextSearch_Geopressure_All_Excel_Multiple_MassperVolume() throws Throwable{
		Reporter.log("Perform Quick Search");
		homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectFewcheck();
		contextpage.selectGeologicalData();
		fetchingReports fetchingReports = contextpage.selectreporting("Geopressure");
		fetchingReports.switchWindows();
		fetchingReports.selectUnitConversionOptions_FromList("mass per volume","kg/dm3");
		fetchingReports.FetchExportReportResult(true, "All", "excel", "Multiple");
	
	}
	
	@Test(enabled=true)
	public void TC_009_contextSearch_Geopressure_currentpage_Excel_Multiple_MassperVolume() throws Throwable{
		Reporter.log("Perform Quick Search");
		homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectFewcheck();
		contextpage.selectGeologicalData();
		fetchingReports fetchingReports = contextpage.selectreporting("Geopressure");
		fetchingReports.switchWindows();
		fetchingReports.selectUnitConversionOptions_FromList("mass per volume","lbm/kgalUK");
		fetchingReports.FetchExportReportResult(true, "currentpage", "excel", "Multiple");
	  }
	@Test(enabled=true)
	public void TC_010_contextSearch_Geopressure_All_Excel_Multiple_ratio_m3_m3() throws Throwable{
		Reporter.log("Perform Quick Search");
		homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectFewcheck();
		contextpage.selectGeologicalData();
		fetchingReports fetchingReports = contextpage.selectreporting("Geopressure");
		fetchingReports.switchWindows();
		fetchingReports.selectUnitConversionOptions_FromList("mass per volume","m3/m3");
		fetchingReports.FetchExportReportResult(true, "All", "excel", "Multiple");
	
	}
	
	@Test(enabled=true)
	public void TC_011_contextSearch_Geopressure_currentpage_Excel_Multiple_ratio_ppm() throws Throwable{
		Reporter.log("Perform Quick Search");
		homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectFewcheck();
		contextpage.selectGeologicalData();
		fetchingReports fetchingReports = contextpage.selectreporting("Geopressure");
		fetchingReports.switchWindows();
		fetchingReports.selectUnitConversionOptions_FromList("ratio","ppm");
		fetchingReports.FetchExportReportResult(true, "currentpage", "excel", "Multiple");
	  }
	

	@Test(enabled=true)
	public void TC_012_contextSearch_Geopressure_All_Excel_Multiple_pressuregradient_psi() throws Throwable{
		Reporter.log("Perform Quick Search");
		homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectFewcheck();
		contextpage.selectGeologicalData();
		fetchingReports fetchingReports = contextpage.selectreporting("Geopressure");
		fetchingReports.switchWindows();
		fetchingReports.selectUnitConversionOptions_FromList("pressure gradient","psi/ft");
		fetchingReports.FetchExportReportResult(true, "All", "excel", "Multiple");
	
	}
	
	@Test(enabled=true)
	public void TC_013_contextSearch_Geopressure_currentpage_Excel_Multiple_pressuregradiet_bar() throws Throwable{
		Reporter.log("Perform Quick Search");
		homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectFewcheck();
		contextpage.selectGeologicalData();
		fetchingReports fetchingReports = contextpage.selectreporting("Geopressure");
		fetchingReports.switchWindows();
		fetchingReports.selectUnitConversionOptions_FromList("pressure gradient","bar/10m");
		fetchingReports.FetchExportReportResult(true, "currentpage", "excel", "Multiple");
	  }
}
	
	
	
	
	
	
	
	
	
	
	


