package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

public class FetchingReportS_SmokeSuite extends contextsearchTest {

	
	public fetchingReports fetchingReports;
	
	public homePage homepage ;
	
	
	@Test(enabled=true)
	public void TC_001_AllDocuments_AllWellbore_Export_All_Excel() throws Throwable
	{
		Reporter.log("AllDocuments Report All WellBore Selection Export with All in Excel",true);
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextpage.selectAllcheck();
		contextpage.selectDocuments();
		 fetchingReports fetchingReports = contextpage.selectAllDocuments();
		 Reporter.log("AllDocuments Report Generated", true);
		 fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore_AllDocuments(),"AllWelbore" );
		 fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
		 fetchingReports.selectSubmitButton();
		 fetchingReports.clickonExport();
		 fetchingReports.fetchDocumentReport(true,"All","excel");
		 Reporter.log("AllDocuments Report All WellBore Selection Export with All in Excel is done",true); 
		
		
	}
	
	@Test(enabled=true)
	public void TC_001_contextSearch_HoldUpDepthReport_TabularWithDepthReference_DF_currentPage_Excel_SingleSheet() throws Throwable{
		
		Reporter.log("Perform Quick Search");
		homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		

		Reporter.log("Select the Hold-Up Depth report from Context Search");
		Thread.sleep(5000);
		 contextpage.selectFewcheck();
		 contextpage.selectWellEngineering();
		 contextpage.selectMechanicalWellData();
		 fetchingReports fetchingReports = contextpage.selectreporting("Hold-Up Depth");
		 Thread.sleep(5000);
		 Reporter.log("Swtich to report window and perfrom operations");
		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
		
		fetchingReports.selectUnitConversionOptions("feet");
		
		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
		//fetchingReports.selectPrintReport();
		//fetchingReports.checkAllData()
		
		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
		 Reporter.log("Report Generation is completed");
	}
	@Test(enabled=true)
	public void TC_001_contextSearch_StringReport_excel() throws Throwable{
		

		homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		
		Thread.sleep(5000);
		Reporter.log("Select the String report from Context Search");
		 contextpage.selectFewcheck();
		 contextpage.selectWellEngineering();
		 contextpage.selectMechanicalWellData();
		 Thread.sleep(5000);
		 fetchingReports fetchingReports = contextpage.selectreporting("Strings");
		 Thread.sleep(5000);
		 Reporter.log("Swtich to report window and perfrom operations");
		
		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
		
		fetchingReports.selectUnitConversionOptions("feet");
		
		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
		
		fetchingReports.getSelectTabular();
		fetchingReports.selectComponentInfo();
		fetchingReports.selectWirelineRetrievables();
		
	    //fetchingReports.getSelectAllResults().click();
		
		fetchingReports.fetchStringReportResult(true, "currentpage", "excel");
		//fetchingReports.getSelectStringPrintReport();
		 Reporter.log("Report Generation is completed");
		

	}
	
	@Test(enabled=true)
	public void TC_001_contextSearch_WellHeadReport_currentpage_excel_single() throws Throwable{
		Reporter.log("Qucick Search for Wellbore");
		   homepage=new homePage(driver);
			
			homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
			homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
			contextsearch contextpage = homepage.selectText("Anjum*");
			Thread.sleep(5000);
			Reporter.log("Select the WellHead report from Context Search");
			 contextpage.selectFewcheck();
			 contextpage.selectWellEngineering();
			 contextpage.selectMechanicalWellData();
			 Thread.sleep(5000);
			
			 fetchingReports fetchingReports = contextpage.selectreporting("Well Head");
			 //wait(30);
			 Thread.sleep(5000);
			 fetchingReports.switchWindows();
			// driver.manage().window().maximize();
			 Reporter.log("Wellhead Report Exported as Export selection = Currentpageonly,Export format=Excel,ViewSelection=Single");
			 fetchingReports.FetchExportReportResult(true, "currentpage", "excel","single");
			 Reporter.log("Wellhead Report Exported Successfully");
                }
	
	public void TC_001_contextSearch_Petrophysical_Logs_WithoutCheckAll_currentPage_Excel() throws Throwable {

		Reporter.log("Logs Recall Logs", true);
		homepage = new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

		contextsearch contextpage = homepage.selectText("Anjum*");

		Reporter.log("All Fields Selected", true);
		contextsearch selectCores = contextpage.selectAllcheck().selectPetrophysical();

		fetchingReports fetchingReports = selectCores.selectreporting("Logs");
		
		fetchingReports.isAlertPresent();// for pop up added 28/05/2018
		
		fetchingReports.switchWindows();
		driver.manage().window().maximize();

		Thread.sleep(300);
		Reporter.log("Cores selected", true);
		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectLogServices(), "FPP");
		Reporter.log("FPP selected", true);

		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectLogType(), "00J");
		Reporter.log("00J selected", true);

		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
		Reporter.log("ALL selected", true);
		fetchingReports.getclickLogsSubmitButton();
		Thread.sleep(300);
		fetchingReports.selectUnitConversionOptions_Logs("feet");
		Reporter.log("Unit Conversion selected", true);
		Thread.sleep(300);
		fetchingReports.fetchHoldUpDepthReportResult(false, "currentpage", "excel", "single");
		Thread.sleep(300);

		Reporter.log("currentpage selected", true);
		Reporter.log("export options Withoutcheck", true);

	}

	@Test(enabled=true)
	public void TC_001_contextSearch_GeologicalData_FPC_Geochemistry_WithoutCheckAll_currentPage_Excel()
			throws Throwable {

		Reporter.log("FPC Geochemistry", true);
		homepage = new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

		contextsearch contextpage = homepage.selectText("Anjum*");

		Reporter.log("All Fields Selected", true);
		contextsearch selectCores = contextpage.selectFewcheck().selectGeologicalData();
		// selectAllcheck()
		fetchingReports fetchingReports = selectCores.selectreporting("FPC Geochemistry");

		fetchingReports.switchWindows();
		driver.manage().window().maximize();
		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "Anjum- 1");
		fetchingReports.selectUnitConversionOptions("feet");
		Thread.sleep(3000);
		fetchingReports.FPCExportSelect(false, "currentpage", "excel");
		Reporter.log(" FPCExport Selected", true);
		fetchingReports.getclickReportClassificationErrors();
		Reporter.log(" QC Contact  Selected", true);

		Reporter.log("without check currentpage excel selected", true);

	}

	
}
