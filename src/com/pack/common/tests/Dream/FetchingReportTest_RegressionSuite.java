package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

public class FetchingReportTest_RegressionSuite extends TestBaseSetup {
	
	public homePage homepage;
	public fetchingReports fetchingReports;
	public contextsearch contextpage;
	public fetchingReports Reports;
	
	// Documents --> All Documents
	
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
	public void TC_002_AllDocuments_AllWellbore_Export_Currentpage_Excel()throws Throwable
	{
		Reporter.log("AllDocuments Report All WellBore Selection Export with currentpage option in Excel",true);
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(),"NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
		contextsearch contextpage=homepage.selectText("Anjum*");
		contextpage.selectAllcheck();
		contextpage.selectDocuments();
		fetchingReports fetchingReports =contextpage.selectAllDocuments();
		Reporter.log("AllDocuments Report Generated", true);
		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore_AllDocuments(),"AllWelbore");
		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
		fetchingReports.selectSubmitButton();
		Thread.sleep(2000);
		 fetchingReports.fetchDocumentReport(true, "currentpage", "excel");
		 Reporter.log("AllDocuments Report All WellBore Selection Export with currentpage option in Excel done",true);
				
		
	}
	//Documents--> WellHeadDiagram
	
	@Test(enabled=true)
	public void TC_001_WellHeadDiagrams_Export_CurrentPage_Excel() throws Throwable
	{
		Reporter.log("Well Head Diagrams Report Export with Currentpage in Excel");
		homepage=new homePage(driver);
		contextpage=new contextsearch(driver);
		Reports=new fetchingReports(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextpage = homepage.selectText("Anjum*");
		contextpage.selectFewcheck();
		Reports.selectDocuments();
		Reports.selectreporting("Well Head Diagrams");
		Reports.switchWindows();
		Reports.exportClick();
		Reports.selectExportoptions("currentpage","excel");
		Reporter.log("Well Head Diagrams Report Export with Currentpage in Excel is successfully done");
	}
	@Test(enabled=true)
	public void TC_001_WellHeadDiagrams_Export_All_Excel() throws Throwable
	{
		Reporter.log("Well Head Diagrams Report Export with All in Excel");
		homepage=new homePage(driver);
		contextpage=new contextsearch(driver);
		Reports=new fetchingReports(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextpage = homepage.selectText("Anjum*");
		contextpage.selectFewcheck();
		Reports.selectDocuments();
		Reports.selectreporting("Well Head Diagrams");
		Reports.switchWindows();
		Reports.exportClick();
		Reports.selectExportoptions("All","excel");
		Reporter.log("Well Head Diagrams Report Export with All in Excel is successfully done");
	}
	
	// Documents--> BHP/BHT Well Test Report
	
	
	
	@Test(enabled=true)
	public void TC_001_contextSearch_BHTWellTestreports_currentPage_Excel() throws Throwable{
		
	    Reporter.log("BHTWellTestreports",true); 
		homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		
		
	    contextsearch contextpage = homepage.selectText("Anjum*");
	 	
		
		contextsearch selectBHTWellTestReports = contextpage.selectAllcheck().selectDocuments().selectBHTWellTestReports();
		
		fetchingReports fetchingReports = selectBHTWellTestReports.selectreporting("BHTWellTestReports");
		

		fetchingReports.switchWindows();
		
		fetchingReports.exportClick().selectExportoptions("currentpage","excel");
		

	}
	
	@Test(enabled=true)
	public void TC_002_contextSearch_BHTWellTestreports_currentPage_Excel() throws Throwable{
		
	    Reporter.log("BHTWellTestreports",true); 
		homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		
		
	    contextsearch contextpage = homepage.selectText("Anjum*");
	 	
		
		contextsearch selectBHTWellTestReports = contextpage.selectAllcheck().selectDocuments().selectBHTWellTestReports();
		
		fetchingReports fetchingReports = selectBHTWellTestReports.selectreporting("BHTWellTestReports");
		

		fetchingReports.switchWindows();
		
		fetchingReports.exportClick().selectExportoptions("All","excel");
		

	}
	
//	Documents --> DocumentsWithFilter
	
	// Single Selection 
	@Test(enabled=true)
	public void TC_001_DocumentsWithfilterRepor_rightClick_current_Excel() throws Throwable{
		
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextsearch selectDaouments = contextpage.selectAllcheck();
	    contextpage.selectDocuments();
		fetchingReports fetchingReports = selectDaouments.selectDocumentsWithfilter();
		fetchingReports.switchWindows();
		//fetchingReports.selectDate("04/Apr/2017", "13/Apr/2018");
		fetchingReports.selectingDataUsingActions_FromList(fetchingReports.getselect_epcatalog(),"Geochemical Data");
		fetchingReports.getEPCatlogRightClick();
		fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_RegionalProductTypes(),"Geological Data");
		fetchingReports.getselectRegionalGroupRightClick();
		fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_AdditionalProductTypes(),"2D seismic processing files");
		fetchingReports.getAdditionalProductTypesRightClick();
		fetchingReports.selectSubmitButton();
		fetchingReports.switchWindows();
		fetchingReports.exportClick();
		fetchingReports.selectExportoptions("currentpage","excel");
		Reporter.log("Documents with filter report is generated successfully");
	}
	@Test(enabled=true)
	public void TC_002_DocumentsWithfilterRepor_rightClick_All_Excel() throws Throwable{
		
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextsearch selectDaouments = contextpage.selectAllcheck();
	    contextpage.selectDocuments();
		fetchingReports fetchingReports = selectDaouments.selectDocumentsWithfilter();
		fetchingReports.switchWindows();
		//fetchingReports.selectDate("04/Apr/2017", "13/Apr/2018");
		fetchingReports.selectingDataUsingActions_FromList(fetchingReports.getselect_epcatalog(),"Geochemical Data");
		fetchingReports.getEPCatlogRightClick();
		fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_RegionalProductTypes(),"Geological Data");
		fetchingReports.getselectRegionalGroupRightClick();
		fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_AdditionalProductTypes(),"2D seismic processing files");
		fetchingReports.getAdditionalProductTypesRightClick();
		fetchingReports.selectSubmitButton();
		fetchingReports.switchWindows();
		fetchingReports.exportClick();
		fetchingReports.selectExportoptions("All","excel");
		Reporter.log("Documents with filter report is generated successfully");
	}

	///// Multiple Selection
	@Test(enabled=true)
	public void TC_003_DocumentsWithfilterRepor_multiSeletion_rightClick_currentpage_Excel() throws Throwable{
		
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextsearch selectDaouments = contextpage.selectAllcheck();
	    contextpage.selectDocuments();
		fetchingReports fetchingReports = selectDaouments.selectDocumentsWithfilter();
		fetchingReports.switchWindows();
		//fetchingReports.selectDate("04/Apr/2017", "13/Apr/2018");
	    fetchingReports.selectingDataUsingActions_FromList(fetchingReports.getselect_epcatalog(),"Geochemical Data");
	    fetchingReports.getEPCatlogRightClick();
		fetchingReports.selectingDataUsingActions_FromList(fetchingReports.getselect_epcatalog(),"Geological Data");
		fetchingReports.getEPCatlogRightClick();
		fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_RegionalProductTypes(),"Geological Data");
		fetchingReports.getselectRegionalGroupRightClick();
		fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_RegionalProductTypes(),"HSE");
		fetchingReports.getselectRegionalGroupRightClick();
		fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_AdditionalProductTypes(),"2D seismic processing files");
		fetchingReports.getAdditionalProductTypesRightClick();
		fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_AdditionalProductTypes(),"3CAL - 3-Arm Caliper");
		fetchingReports.getAdditionalProductTypesRightClick();
		fetchingReports.selectSubmitButton();
		fetchingReports.switchWindows();
		fetchingReports.exportClick();
		fetchingReports.selectExportoptions("currentpage","excel");
		Reporter.log("Documents with filter report is generated successfully");
		
	}
		//Documents--> PVT Reports
		
		
		
		@Test(enabled=true)
		public void TC_001_PVTReport_Export_CurrentPage_Excel() throws Throwable
		{
			Reporter.log("PVT Report Export with Currentpage in Excel");
			homepage=new homePage(driver);
			contextpage=new contextsearch(driver);
			Reports=new fetchingReports(driver);
			homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
			homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
			homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
			contextpage = homepage.selectText("Anjum*");
			contextpage.selectFewcheck();
			Reports.selectDocuments();
			Reports.selectreporting("PVT Reports");
			Reports.switchWindows();
			Reports.exportClick();
			Reports.selectExportoptions("currentpage","excel");
			Reporter.log("PVT Report Export with Currentpage in Excel is successfully done");
		}
		@Test(enabled=true)
		public void TC_001_PVTReport_Export_All_Excel() throws Throwable
		{
			Reporter.log("PVT Report Export with All in Excel");
			homepage=new homePage(driver);
			contextpage=new contextsearch(driver);
			Reports=new fetchingReports(driver);
			homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
			homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
			homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
			contextpage = homepage.selectText("Anjum*");
			contextpage.selectFewcheck();
			Reports.selectDocuments();
			Reports.selectreporting("PVT Reports");
			Reports.switchWindows();
			Reports.exportClick();
			Reports.selectExportoptions("All","excel");
			Reporter.log("PVT Report Export with All in Excel is successfully done");
		}
	
 //Documnets-->CBL VDL
		
		@Test(enabled=true)
		public void TC_001_CBL_VDL_Export_CurrentPage_Excel() throws Throwable
		{
			Reporter.log("CBL_VDL Report Export with Currentpage in Excel");
			homepage=new homePage(driver);
			contextpage=new contextsearch(driver);
			Reports=new fetchingReports(driver);
			homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
			homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
			homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
			contextpage = homepage.selectText("Anjum*");
			contextpage.selectFewcheck();
			Reports.selectDocuments();
			Reports.selectreporting("CBL VDL");
			Reports.switchWindows();
			Reports.exportClick();
			Reports.selectExportoptions("currentpage","excel");
			Reporter.log("CBL_VDL Report Export with Currentpage in Excel is done successfully");
		}
		@Test(enabled=true)
		public void TC_001_CBL_VDL_Export_All_Excel() throws Throwable
		{
			Reporter.log("CBL_VDL Report Export with All in Excel");
			homepage=new homePage(driver);
			contextpage=new contextsearch(driver);
			Reports=new fetchingReports(driver);
			homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
			homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
			homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
			contextpage = homepage.selectText("Anjum*");
			contextpage.selectFewcheck();
			Reports.selectDocuments();
			Reports.selectreporting("CBL VDL");
			Reports.switchWindows();
			Reports.exportClick();
			Reports.selectExportoptions("All","excel");
			Reporter.log("CBL_VDL Report Export with all in Excel is done successfully");
		}
		
		//Documents --> Miniplots
// check with Sireesha and babula
		
		
		//Documents -->Composite logs
		
		
		
		@Test(enabled=true)
		public void TC_001_CompositeWellLogs_Export_CurrentPage_Excel() throws Throwable
		{
			Reporter.log("Composite Well Logs Report Export with Currentpage in Excel");
			homepage=new homePage(driver);
			contextpage=new contextsearch(driver);
			Reports=new fetchingReports(driver);
			homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
			homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
			homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
			contextpage = homepage.selectText("Anjum*");
			contextpage.selectFewcheck();
			Reports.selectDocuments();
			Reports.selectreporting("Composite Well Logs");
			Reports.isAlertPresent();
			Thread.sleep(1000);
			Reports.switchWindows();
			// driver.manage().window().maximize();
			//Reports.exportClick();
			Reports.selectExportoptionsadmin("Current Page Only","excel");
			Reporter.log("Composite Well Logs Report Export with Currentpage in Excel is done successfully");
		}
		@Test(enabled=true)
		public void TC_002_CompositeWellLogs_Export_All_Excel() throws Throwable
		{
			Reporter.log("Composite Well Logs Report Export with All in Excel");
			homepage=new homePage(driver);
			contextpage=new contextsearch(driver);
			Reports=new fetchingReports(driver);
			homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
			homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
			homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
			contextpage = homepage.selectText("Anjum*");
			contextpage.selectFewcheck();
			Reports.selectDocuments();
			Reports.selectreporting("Composite Well Logs");
			Reports.isAlertPresent();
			Reports.switchWindows();
			//Reports.exportClick();
			Reports.selectExportoptionsadmin("All","excel");;
			Reporter.log("Composite Well Logs Report Export with All in Excel is done successfully");
		}
		
		

		//	ContextSearch->Documents_WellStatusDiagrams
			


	@Test(enabled=true)
	public void TC_001_WellStatusDiagram_Export_CurrentPage_Excel() throws Throwable
	{
		Reporter.log("Well Status Diagrams Report Export with Currentpage in Excel");
		homepage=new homePage(driver);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		contextsearch WellStatiousDiagrams = contextpage.selectAllcheck();
		WellStatiousDiagrams.selectDocuments();
		fetchingReports fetchingReports = WellStatiousDiagrams.selectWellStatusDiagrams();
		 fetchingReports.switchWindows();
		 fetchingReports.exportClick();
		 fetchingReports.selectExportoptions("currentpage","excel");
		
	}
		
	//WellEngineeringPT	-->Daily Wells Reporting
	@Test(enabled=true)
	public void TC_001_contextSearch_DailySummary_Tabular_currentPage_AllCheckRecords() throws Throwable{
		
	    Reporter.log("Daily Summary"); 
		homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		
		
	    contextsearch contextpage = homepage.selectText("Anjum*");
	 	
		
		
		contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
		fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Daily Summary");
		
		
	 	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
		
		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
		
		fetchingReports.submitEventReport("Yes", "Tabular");
		 
		fetchingReports.fetchDailyWellReport(true,"currentpage","excel");

	}

@Test(enabled=true)
public void TC_002_contextSearch_DailySummary_Tabular_AllPage() throws Throwable{
	
    Reporter.log("Daily Summary"); 
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	
	
    contextsearch contextpage = homepage.selectText("Anjum*");
 	
	
	
	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Daily Summary");
	
	
 	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	
	fetchingReports.submitEventReport("Yes", "Tabular");
	 
	fetchingReports.fetchDailyWellReport(true,"All","excel");

}
		
//DailyWellsreporting -> Events
@Test(enabled=true)
public void TC_001_contextSearch_Events_Tabular_currentPage_AllCheckRecords() throws Throwable{
	
    Reporter.log("Daily Summary"); 
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	
	
    contextsearch contextpage = homepage.selectText("Anjum*");
 	
	
	
	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Daily Summary");
	
	
 	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	
	fetchingReports.submitEventReport("Yes", "Tabular");
	 
	fetchingReports.fetchDailyWellReport(true,"currentpage","excel");

}

		


@Test(enabled=true)
public void TC_002_contextSearch_Events_Tabular_AllPage() throws Throwable{
	
    Reporter.log("Events"); 
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	
	
    contextsearch contextpage = homepage.selectText("Anjum*");
 	
	
	
	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Events");
	
	
 	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	
	fetchingReports.submitEventReport("Yes", "Tabular");
	 
	fetchingReports.fetchDailyWellReport(true,"All","excel");

}

		

//DailywellsReporting-->Report activities

@Test(enabled=true)
public void TC_001_contextSearch_ReportedActivities_Tabular_currentPage_AllCheckRecords() throws Throwable{
	
 Reporter.log("Reported Activities"); 
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	
	
 contextsearch contextpage = homepage.selectText("Anjum*");
	
	
	
	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Reported Activities");
	
	
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	
	fetchingReports.submitEventReport("Yes", "Tabular");
	 
	fetchingReports.fetchDailyWellReport(true,"currentpage","excel");

}


@Test(enabled=true)
public void TC_002_contextSearch_ReportedActivities_Tabular_AllPage() throws Throwable{
	
    Reporter.log("Reported Activities"); 
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	
	
    contextsearch contextpage = homepage.selectText("Anjum*");
 	
	
	
	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Reported Activities");
	
	
 	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	
	fetchingReports.submitEventReport("Yes", "Tabular");
	 
	fetchingReports.fetchDailyWellReport(true,"All","excel");

}


//	ContextSearch->Well Engineering/PT->Mechanical Well Data->Hold up Depth
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
public void TC_002_contextSearch_HoldUpDepthReport_TabularWithDepthReference_DF_All_Excel_SingleSheet() throws Throwable{
	
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
	
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
	 Reporter.log("Report Generation is completed");
}

@Test(enabled=true)
public void TC_003_contextSearch_HoldUpDepthReport_TabularWithDepthReference_DF_All_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	
	Thread.sleep(5000);
	Reporter.log("Select the Hold-Up Depth report from Context Search");
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
	
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	 Reporter.log("Report Generation is completed");
}

@Test(enabled=true)
public void TC_004_contextSearch_HoldUpDepthReport_TabularWithDepthReference_DF_currentPage_Excel_MultiSheet() throws Throwable{
	
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
	
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","Multi");
	 Reporter.log("Report Generation is completed");
}



@Test(enabled=true)
public void TC_005_contextSearch_HoldUpDepthReport_TabularWithDepthReference_DF_AllSubReports_Excel() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	
	Thread.sleep(5000);
	Reporter.log("Select the Hold-Up Depth report from Context Search");
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
	
	fetchingReports.fetchHoldUpDepthReportResult(true, "AllSubReports", "excel","Multi");
	 Reporter.log("Report Generation is completed");
}


//ContextSearch->Well Engineering/PT->Mechanical Well Data->Strings


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
public void TC_002_contextSearch_StringReport_TabularWithDepthReference_DF_AllPage_Excel() throws Throwable{
	

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
	
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	
	fetchingReports.getSelectTabular();
	fetchingReports.selectComponentInfo();
	fetchingReports.selectWirelineRetrievables();
	
    //fetchingReports.getSelectAllResults().click();
	
	fetchingReports.fetchStringReportResult(true, "AllPages", "excel");
	//fetchingReports.getSelectStringPrintReport();
	 Reporter.log("Report Generation is completed");

}


@Test(enabled=true)
public void TC_003_contextSearch_StringReport_TabularWithDepthReference_DF_AllSubReportsPage_Excel() throws Throwable{
	

 
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
	
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	
	fetchingReports.getSelectTabular();
	fetchingReports.selectComponentInfo();
	fetchingReports.selectWirelineRetrievables();
	
    //fetchingReports.getSelectAllResults().click();
	
	fetchingReports.fetchStringReportResult(true, "AllSubReports", "excel");
	//fetchingReports.getSelectStringPrintReport();
	 Reporter.log("Report Generation is completed");
}

//ContextSearch->Well Engineering/PT->Mechanical Well Data->Well Head(4)

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


@Test(enabled=true)
public void TC_002_contextSearch_WellHeadReport_all_excel_single() throws Throwable{
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
		 Thread.sleep(5000);
		 //wait(30);
		 fetchingReports.switchWindows();
		// driver.manage().window().maximize();
		 Reporter.log("Wellhead Report Exported as Export selection = All,Export format=Excel,ViewSelection=Single");
		 fetchingReports.FetchExportReportResult(true, "All", "excel","single");
		 Reporter.log("Well head Report Exported Successfully");

}

@Test(enabled=true)
public void TC_003_contextSearch_WellHeadReport_all_excel_multi() throws Throwable{
	Reporter.log("Qucick Search for Wellbore");
	   homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		contextsearch contextpage = homepage.selectText("Anjum*");
		Thread.sleep(5000);
		Reporter.log("Click on Nextpage icon to navigate Next page in the Report");
		 contextpage.selectFewcheck();
		 contextpage.selectWellEngineering();
		 contextpage.selectMechanicalWellData();
		 Thread.sleep(5000);
		 fetchingReports fetchingReports = contextpage.selectreporting("Well Head");
		 Thread.sleep(5000);
		 //wait(30);
		 fetchingReports.switchWindows();
		// driver.manage().window().maximize();
		 Reporter.log("Wellhead Report Exported as Export selection = All,Export format=Excel,ViewSelection=multi");
		 fetchingReports.FetchExportReportResult(true, "All", "excel","Multi");
		 Reporter.log("Wellhead Report Exported Successfully");
		 
}
@Test(enabled=true)
public void TC_004_contextSearch_WellHeadReport_currentpage_excel_multi() throws Throwable{
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
		 Thread.sleep(5000);
		 //wait(30);
		 fetchingReports.switchWindows();
		// driver.manage().window().maximize();
		 Reporter.log("Wellhead Report Exported as Export selection = Currentpageonly,Export format=Excel,ViewSelection=Multiple sheet");
		 fetchingReports.FetchExportReportResult(true, "currentpage", "excel","Multi");
		 Reporter.log("Wellhead Report Exported Successfully");
}

//ContextSearch->Well Engineering/PT->Mechanical Well Data->Hole Section
@Test(enabled=true)
public void TC_001_contextSearch_HoleSections_Report_currentpage_excel_multi_BF() throws Throwable{
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
		 fetchingReports fetchingReports = contextpage.selectreporting("Hole Sections");
		 Thread.sleep(5000);
		 fetchingReports.switchWindows();
		 fetchingReports.selectUnitConversionOptions_FromList("length","feet");
		 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"BF"); 
		 fetchingReports.FetchExportReportResult(true, "currentpage", "excel","Multi");
                 }	


@Test(enabled=true)
public void TC_002_contextSearch_HoleSections_Report_All_excel_single_DF() throws Throwable{
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
		 fetchingReports fetchingReports = contextpage.selectreporting("Hole Sections");
		 Thread.sleep(5000);
		 fetchingReports.switchWindows();
		 fetchingReports.selectUnitConversionOptions_FromList("length","feet");
		 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"DF"); 
		 fetchingReports.FetchExportReportResult(true, "All", "excel","single");
                 }
//ContextSearch->Well Engineering/PT->Mechanical Well Data->MechanicalContent


@Test(enabled=true)
public void TC_001_contextSearch_MechanicalContent_Report_currentpage_excel_multi_BF() throws Throwable{
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
		 fetchingReports fetchingReports = contextpage.selectreporting("Mechanical Content");
		 Thread.sleep(5000);
		 fetchingReports.switchWindows();
		fetchingReports.selectUnitConversionOptions_FromList("length","meters");
		 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"BF"); 
		 fetchingReports.FetchExportReportResult(true, "currentpage", "excel","Multi");
                 }	





@Test(enabled=true)
public void TC_002_contextSearch_MechanicalContent_Report_All_excel_single_DF() throws Throwable{
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
		 fetchingReports fetchingReports = contextpage.selectreporting("Mechanical Content");
		 Thread.sleep(5000);
		 fetchingReports.switchWindows();
		fetchingReports.selectUnitConversionOptions_FromList("length","feet");
		 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"DF"); 
		 fetchingReports.FetchExportReportResult(true, "All", "excel","single");
                 }



//ContextSearch->Well Engineering/PT->Mechanical Well Data->Perforations
@Test(enabled=true)
public void TC_001_contextSearch_Perforation_Report_currentpage_excel_single_DF() throws Throwable{
	Reporter.log("Qucick Search for Wellbore");
	   homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		 contextsearch contextpage = homepage.selectText("Anjum*");
		 Thread.sleep(5000);
		 contextpage.selectFewcheck();
		 contextpage.selectWellEngineering();
		 contextpage.selectMechanicalWellData();
		 fetchingReports fetchingReports = contextpage.selectreporting("Perforations");
		 Thread.sleep(5000);
		 fetchingReports.switchWindows().selectDataForReports(fetchingReports. getselectWellbore_perforation(), "ANJUM-1");
		 Thread.sleep(2000);
		 fetchingReports.selectUnitConversionOptions("feet");
		 fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
		 fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
		
}

@Test(enabled=true)
public void TC_002_contextSearch_Perforation_Report_ALL_excel_All_DF() throws Throwable{
	Reporter.log("Qucick Search for Wellbore");
	   homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		 contextsearch contextpage = homepage.selectText("Anjum*");
		 Thread.sleep(5000);
		 contextpage.selectFewcheck();
		 contextpage.selectWellEngineering();
		 contextpage.selectMechanicalWellData();
		 fetchingReports fetchingReports = contextpage.selectreporting("Perforations");
		 Thread.sleep(5000);
		 fetchingReports.switchWindows().selectDataForReports(fetchingReports. getselectWellbore_perforation(), "ANJUM-1");
		 Thread.sleep(2000);
		 fetchingReports.selectUnitConversionOptions("feet");
		 fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
		 fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
		
}


//ContextSearch->Well Engineering/PT->Mechanical Well Data->Wellbore Annuli

@Test(enabled=true)
public void TC_001_contextSearch_WellboreAnnuli_Report_currentpage_excel_single_DF() throws Throwable{
	Reporter.log("Qucick Search for Wellbore");
	   homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		 contextsearch contextpage = homepage.selectText("Anjum*");
		 Thread.sleep(5000);
		 contextpage.selectFewcheck();
		 contextpage.selectWellEngineering();
		 contextpage.selectMechanicalWellData();
		 fetchingReports fetchingReports = contextpage.selectreporting("Wellbore Annuli");
		 Thread.sleep(5000);
		 fetchingReports.switchWindows();
		 fetchingReports.selectUnitConversionOptions_FromList("mass per volume","kg/dm3");
		 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"DF");
		 //fetchingReports.getShowparentWellbore();
		 fetchingReports.getWellboreAnullichkAll();
		 fetchingReports.getExportIcon().click();
		 fetchingReports.GenericexportReport("currentpage", "excel","single");
		
	                         }

@Test(enabled=true)
public void TC_002_contextSearch_WellboreAnnuli_Report_currentpage_excel_multi_GL() throws Throwable{
	Reporter.log("Qucick Search for Wellbore");
	   homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		 contextsearch contextpage = homepage.selectText("Anjum*");
		 Thread.sleep(5000);
		 contextpage.selectFewcheck();
		 contextpage.selectWellEngineering();
		 contextpage.selectMechanicalWellData();
		 fetchingReports fetchingReports = contextpage.selectreporting("Wellbore Annuli");
		 Thread.sleep(5000);
		 
		 fetchingReports.switchWindows();
		 fetchingReports.selectUnitConversionOptions_FromList("mass per volume","ppg");
		 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"GL");
		 //fetchingReports.getShowparentWellbore();
		 fetchingReports.getWellboreAnullichkAll();
		 fetchingReports.getExportIcon().click();
		 fetchingReports.GenericexportReport("currentpage", "excel","Multi");
}


//ContextSearch->Well Engineering/PT->Mechanical Well Data->Fish


@Test(enabled=true)
public void TC_001_contextSearch_FISH_Report_currentpage_excel_multi_BF() throws Throwable{
	Reporter.log("Qucick Search for Wellbore");
	   homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		contextsearch contextpage = homepage.selectText("Anjum*");
		
		Reporter.log("Select the WellHead report from Context Search");	
		Thread.sleep(5000);
		 contextpage.selectFewcheck();
		 contextpage.selectWellEngineering();
		 contextpage.selectMechanicalWellData();
		 fetchingReports fetchingReports = contextpage.selectreporting("Fish");
		 Thread.sleep(10000);
		 fetchingReports.switchWindows();
		 fetchingReports.selectUnitConversionOptions_FromList("length","feet");
		 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"BF"); 
		 fetchingReports.FetchExportReportResult(true, "currentpage", "excel","Multi");
               }

@Test(enabled=true)
public void TC_002_contextSearch_FISH_Report_All_excel_multi_BF() throws Throwable{
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
		 fetchingReports fetchingReports = contextpage.selectreporting("Fish");
		 Thread.sleep(10000);
		 fetchingReports.switchWindows();
		 fetchingReports.selectUnitConversionOptions_FromList("length","feet");
		 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"BF"); 
		 fetchingReports.FetchExportReportResult(true, "All", "excel","Multi");
               }



//General Wellbore Info-->P7/2000 servey report no data
// Wellbore History not Required
// Well Summary Sheet

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
public void TC_002_WellSummarySheet_BF_All_Excel_ratio_m3Orm3() throws Throwable{
	
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

//Well/Wellbore Header


@Test(enabled=true)
public void TC_001_WellboreHeader_Feet_BF_currentPage_Excel_SingleSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("feet");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}

@Test(enabled=true)
public void TC_002_WellboreHeader_Feet_BF_All_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports. selectUnitConversionOptions_Logs("feet");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}
@Test(enabled=true)
public void TC_003_WellboreHeader_Feet_KB_CurrentPage_Excel_Single() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Well/Wellbore Header");
	fetchingReports.switchWindows();
	 Reporter.log("Swtich to report window and perfrom operations");	
	fetchingReports. selectUnitConversionOptions_Logs("feet");
	fetchingReports.selectTabularRadioButton();
	Thread.sleep(2000);
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"KB");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	Reporter.log("Well/WellboreHeader Report Generation is completed");
}


//Well status Data
@Test(enabled=true)
public void TC_002_WellboreStatusData_Feet_currentPage_Excel() throws Throwable{
	
    Reporter.log("WellboreStatusData", true); 
	homepage=new homePage(driver);
	Reporter.log("Browser Opened", true);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
 	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Status Data(WSD)");
	fetchingReports.switchWindows();
	fetchingReports.selectUnitConversionOptionsStatus("feet");
	Thread.sleep(300);
	Reporter.log("feet selected", true);
	fetchingReports.selectExportoptionsStatious("currentpage","excel");
	Reporter.log("export WellboreStatusData done", true);

}


//Wellbore path
@Test(enabled=true)
public void TC_001_WellborePath_Feet_ShowAll_currentPage_Excel_SingleSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("feet");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"Show All");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	Reporter.log("WellborePathReport Generation is completed");
}
@Test(enabled=true)
public void TC_002_WellborePath_Feet_ShowAll_All_Excel_SingleSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("feet");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"Show All");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
	Reporter.log("WellborePathReport Generation is completed");
}

@Test(enabled=true)
public void TC_003_WellborePath_Feet_ShowAll_Currentpage_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("feet");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"Show All");
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","Multi");
	Reporter.log("WellborePathReport Generation is completed");
}

@Test(enabled=true)
public void TC_004_WellborePath_Feet_ShowAll_All_Excel_MultiSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	Reporter.log("All Fields Selected", true);
	contextsearch selectWellboreStatusData = contextpage.selectAllcheck();
	contextpage.selectGeneralWellboreInfo();
	fetchingReports fetchingReports = selectWellboreStatusData.selectreporting("Wellbore Path");
	fetchingReports.switchWindows();
	Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.selectUnitConversionOptionsStatus("feet");
	fetchingReports.selectDataForReports(fetchingReports.getDataPreference(),"Show All");
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	Reporter.log("WellborePathReport Generation is completed");
}

//position log data
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
@Test(enabled=true)
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
	
}
@Test(enabled=true)
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
	
}
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


//Geological data --FPC Geochemistry


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

//unit conversion --> true --> All --> excel
	@Test(enabled=true)
	public void TC_003_contextSearch_GeologicalData_FPC_Geochemistry_CheckAll_All_Excel() throws Throwable {

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
		fetchingReports.FPCExportSelect(true, "All", "excel");
		Reporter.log(" FPCExport Selected", true);

		Reporter.log("checkAll All excel selected", true);

	}
// Paleo marker no data
	
	//picks
	
	@Test(enabled = true)
	public void TC_001_contextSearch_GeologicalData_Picks_WithoutCheckAll_currentPage_Excel() throws Throwable {

		Reporter.log("Picks", true);
		homepage = new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

		contextsearch contextpage = homepage.selectText("Anjum*");

		Reporter.log("All Fields Selected", true);
		contextsearch selectCores = contextpage.selectFewcheck().selectGeologicalData();
		// selectAllcheck()
		fetchingReports fetchingReports = selectCores.selectreporting("Picks");

		fetchingReports.switchWindows();
		driver.manage().window().maximize();

		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectGeologicFeature(), "BASE");
		fetchingReports.selectANDOR("and");
		Reporter.log("AND Selected", true);
		// fetchingReports.switchWindows();
		// fetchingReports.DropDown(fetchingReports.getselectPickNames(), "CC__B");
		// fetchingReports.selectColumnToAddAdditional();
		fetchingReports.SelectRecords_picks(1);
		Reporter.log(" First Record from Pick Name Selected", true);
		fetchingReports.SelectRecords_picks(2);
		Reporter.log(" Second Record from Pick Name Selected", true);
		fetchingReports.SelectRecords_picks(3);
		Reporter.log(" Third Record from Pick Name Selected", true);
		//Thread.sleep(3000);
		fetchingReports.selectANDOR2("and");
		Reporter.log("AND2 Selected", true);
		
		fetchingReports.SelectRecords_Interpreter(7);
		
		fetchingReports.getbntSearch();
		fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits() ,"length","meters");
	     Thread.sleep(6000);
		
		/*
		 * fetchingReports.selectUnitConversionOptions("feet"); Thread.sleep(3000);
		 * fetchingReports.FPCExportSelect(false, "currentpage", "excel");
		 * Reporter.log(" FPCExport Selected", true);
		 * fetchingReports.getclickReportClassificationErrors();
		 * Reporter.log(" QC Contact  Selected", true);
		 * 
		 * Reporter.log("without check currentpage excel selected", true);
		 */

	}

// Geopressure

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
	public void TC_003_contextSearch_Geopressure_All_Excel_Multiple() throws Throwable{
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
	
	//Pectrophysical-->CLDB/OLDB
	
	@Test(enabled = true)
	public void TC_001_contextSearch_Petrophysical_CLDB_OFDB_Links_WithoutCheckAll_currentPage_Excel()
			throws Throwable {

		Reporter.log("CLDB/OFDB Links", true);
		homepage = new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

		contextsearch contextpage = homepage.selectText("Anjum*");

		Reporter.log("All Fields Selected", true);
		contextsearch selectCLDB_OFDB_Links = contextpage.selectAllcheck().selectPetrophysical();

		fetchingReports fetchingReports = selectCLDB_OFDB_Links.selectreporting("CLDB/OFDB Links");

		fetchingReports.switchWindows();
		driver.manage().window().maximize();

		Thread.sleep(300);
		Reporter.log("CLDB/OFDB Links selected", true);

		fetchingReports.fetchDailyWellReport(false, "currentpage", "excel");
		Reporter.log("export options Withoutcheck", true);

	}
	// CheckAll -->All --> excel
		@Test(enabled = true)
		public void TC_004_contextSearch_Petrophysical_CLDB_OFDB_Links_CheckAll_All_Excel() throws Throwable {
			Reporter.log("CLDB/OFDB Links", true);
			homepage = new homePage(driver);
			Reporter.log("Browser Opened", true);
			homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
			homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
			homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

			contextsearch contextpage = homepage.selectText("Anjum*");

			Reporter.log("All Fields Selected", true);
			contextsearch selectCLDB_OFDB_Links = contextpage.selectAllcheck().selectPetrophysical();

			fetchingReports fetchingReports = selectCLDB_OFDB_Links.selectreporting("CLDB/OFDB Links");

			fetchingReports.switchWindows();
			driver.manage().window().maximize();

			Thread.sleep(200);
			Reporter.log("CLDB/OFDB Links selected", true);

			fetchingReports.fetchDailyWellReport(true, "All", "excel");
			Thread.sleep(300);
			Reporter.log("export options Withoutcheck", true);

		}
//CORES
		@Test(enabled = true)
		public void TC_001_contextSearch_Petrophysical_Cores_CheckAll_CurrentPage_Excel() throws Throwable {

			Reporter.log("Cores", true);
			homepage = new homePage(driver);
			Reporter.log("Browser Opened", true);
			homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
			homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
			homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

			contextsearch contextpage = homepage.selectText("Anjum*");

			Reporter.log("All Fields Selected", true);
			contextsearch selectCores = contextpage.selectAllcheck().selectPetrophysical();

			fetchingReports fetchingReports = selectCores.selectreporting("Cores");

			fetchingReports.switchWindows();
			driver.manage().window().maximize();

			Thread.sleep(300);
			Reporter.log("Cores selected", true);
			fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM- 1");
			Reporter.log("Anjum1 selected", true);
			fetchingReports.selectUnitConversionOptions("feet");

			Reporter.log("feet selected", true);
			fetchingReports.fetchCoresReport(true, "currentpage", "excel");

			// fetchingReports.getAlert();

			Reporter.log("export options checkAll ", true);

		}

		// CheckAll -->All --> excel
		@Test(enabled = true)
		public void TC_002_contextSearch_Petrophysical_Cores_CheckAll_All_Excel() throws Throwable {
			Reporter.log("Cores", true);
			homepage = new homePage(driver);
			Reporter.log("Browser Opened", true);
			homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
			homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
			homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

			contextsearch contextpage = homepage.selectText("Anjum*");

			Reporter.log("All Fields Selected", true);
			contextsearch selectCores = contextpage.selectAllcheck().selectPetrophysical();

			fetchingReports fetchingReports = selectCores.selectreporting("Cores");

			fetchingReports.switchWindows();
			driver.manage().window().maximize();

			Thread.sleep(300);
			Reporter.log("Cores selected", true);
			fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM- 1");
			Reporter.log("Anjum1 selected", true);
			fetchingReports.selectUnitConversionOptions("meters");

			Reporter.log("feet selected", true);
			fetchingReports.fetchCoresReport(true, "All", "excel");

			// fetchingReports.getAlert();

			Reporter.log("export options checkAll ", true);

		}	
		
		//logfilms
		
		
		// unit conversion --> true --> All --> excel
		@Test(enabled = true)
		public void TC_003_contextSearch_Petrophysical_Log_Films_WithoutCheckAll_currentPage_Excel() throws Throwable {

			Reporter.log("Log Films", true);
			homepage = new homePage(driver);
			Reporter.log("Browser Opened", true);
			homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
			homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
			homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

			contextsearch contextpage = homepage.selectText("Anjum*");

			Reporter.log("All Fields Selected", true);
			contextsearch selectCores = contextpage.selectFewcheck().selectPetrophysical();
			// selectAllcheck()
			fetchingReports fetchingReports = selectCores.selectreporting("Log Films");

			fetchingReports.switchWindows();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			fetchingReports.selectUnitConversionOptions_Logs("feet");
			Reporter.log("Unit Conversion Options selected", true);
			fetchingReports.fetchDailyWellReport(true, "All", "excel");
			
			Reporter.log("check All excel selected", true);
			
		}

		// unit conversion --> meters--> true --> All --> excel
		@Test(enabled = true)
		public void TC_004_contextSearch_Petrophysical_Log_Films_WithoutCheckAll_currentPage_Excel() throws Throwable {

			Reporter.log("Log Films", true);
			homepage = new homePage(driver);
			Reporter.log("Browser Opened", true);
			homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
			homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
			homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

			contextsearch contextpage = homepage.selectText("Anjum*");

			Reporter.log("All Fields Selected", true);
			contextsearch selectCores = contextpage.selectFewcheck().selectPetrophysical();
			// selectAllcheck()
			fetchingReports fetchingReports = selectCores.selectreporting("Log Films");

			fetchingReports.switchWindows();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			fetchingReports.selectUnitConversionOptions_Logs("meters");
			Reporter.log("Unit Conversion Options selected", true);
			fetchingReports.fetchDailyWellReport(true, "All", "excel");
			Reporter.log("check All excel selected", true);
			
		}

	//logs
		@Test(enabled=true)
		public void TC_003_contextSearch_Petrophysical_Logs_CheckAll_All_Excel() throws Throwable {

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
			fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel", "single");
			Thread.sleep(300);

			Reporter.log("All selected", true);
			Reporter.log("export options With check All", true);

		}

		// CheckAll -->All --> excel --> multiple
		@Test(enabled=true)
		public void TC_004_contextSearch_Petrophysical_Logs_CheckAll_All_Excel() throws Throwable {

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
			fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel", "Multi");
			Thread.sleep(300);

			Reporter.log("All selected", true);
			Reporter.log("export options With check All", true);

		}

		// CheckAll -->All --> excel --> multiple --> EDITED
		@Test(enabled=true)
		public void TC_005_contextSearch_Petrophysical_Logs_CheckAll_All_Excel() throws Throwable {

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

			fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectLogType(), "EDITED");
			Reporter.log("00J selected", true);

			fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
			Reporter.log("ALL selected", true);
			fetchingReports.getclickLogsSubmitButton();
			Thread.sleep(300);
			fetchingReports.selectUnitConversionOptions_Logs("feet");
			Reporter.log("Unit Conversion selected", true);
			Thread.sleep(300);
			fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel", "Multi");
			Thread.sleep(300);

			Reporter.log("All selected", true);
			Reporter.log("export options With check All", true);

		}

		// ContextSearch->Petrophysical-> Recall Curve

		@Test(enabled=true)
		public void TC_001_contextSearch_Petrophysical_Recall_Curve_WithoutCheckAll_currentPage_Excel() throws Throwable {

			Reporter.log("Recall Curve", true);
			homepage = new homePage(driver);
			Reporter.log("Browser Opened", true);
			homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
			homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
			homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

			contextsearch contextpage = homepage.selectText("Anjum*");

			Reporter.log("All Fields Selected", true);
			contextsearch selectCores = contextpage.selectFewcheck().selectPetrophysical();
			// . selectAllcheck()
			fetchingReports fetchingReports = selectCores.selectreporting("Recall Curve");
			fetchingReports.isAlertPresent();
			fetchingReports.switchWindows();
			driver.manage().window().maximize();

			Thread.sleep(300);
			Reporter.log("Recall Curve selected", true);
			fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectTechLogMainfamily(), "Porosity"); // AllWelbore
																															// for
																															// selecting
																															// All
																															// Records
			Reporter.log("Porosity selected", true);

			fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectTechLogfamilyName(),
					"Total Porosity");
			Reporter.log("Total Porosity selected", true);

			fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectCurveBusinessValue(),
					"AllWelbore");
			Reporter.log("BLANK selected", true);

			fetchingReports.getclickFilterOption_btnSubmit();
			Thread.sleep(500);
			fetchingReports.selectUnitConversionOptions_FromList("length", "feet");
			Thread.sleep(300);

			fetchingReports.FetchExportReportResult_Utilities(false, "currentpage", "excel", "single");
			Thread.sleep(300);
			Reporter.log("All Members of Curve Business Value selected", true);

		}


		// All Members of Entire Family selected
		@Test(enabled=true)
		public void TC_002_contextSearch_Petrophysical_Recall_Curve_WithoutCheckAll_currentPage_Excel() throws Throwable {

			Reporter.log("Recall Curve", true);
			homepage = new homePage(driver);
			Reporter.log("Browser Opened", true);
			homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
			homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
			homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

			contextsearch contextpage = homepage.selectText("Anjum*");

			Reporter.log("All Fields Selected", true);
			contextsearch selectCores = contextpage.selectFewcheck().selectPetrophysical();
			// . selectAllcheck()
			fetchingReports fetchingReports = selectCores.selectreporting("Recall Curve");

			fetchingReports.switchWindows();
			driver.manage().window().maximize();

			Thread.sleep(300);
			Reporter.log("Recall Curve selected", true);
			fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectTechLogMainfamily(),
					"AllWelbore"); // AllWelbore for selecting All Records
			Reporter.log("Porosity selected", true);

			fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectTechLogfamilyName(),
					"AllWelbore");
			Reporter.log("Total Porosity selected", true);

			fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectCurveBusinessValue(),
					"AllWelbore");
			Reporter.log("BLANK selected", true);

			fetchingReports.getclickFilterOption_btnSubmit();
			Thread.sleep(300);

			fetchingReports.selectUnitConversionOptions_FromList("length", "feet");
			Thread.sleep(300);

			fetchingReports.FetchExportReportResult_Utilities(true, "All", "excel", "Multi");
			Thread.sleep(300);

			Reporter.log("All Members of Curve Business Value selected", true);

		}

		// Production and Injuction
		
		// Prod history
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
		// Pipeline monthly
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
		
		// Reservior Engineering--> Pressure Servey data
		
		@Test(enabled=true)
		public void TC_001_contextSearch_PressureSurveyData_All_Excel_AllWelbore_BU_length_Feet() throws Throwable{
			Reporter.log("Perform Quick Search");
			homepage=new homePage(driver);
			
			homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
			homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
			homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
			contextsearch contextpage = homepage.selectText("Anjum*");
			 contextpage.selectFewcheck();
			 contextpage.SelectReservoirEngineering();
			 contextpage.SelectPressureSurveyData();
			 fetchingReports fetchingReports = contextpage.selectreporting("Pressure Survey Data");
			 Reporter.log("Pressure Survey Data Data report opened successfully");
			 fetchingReports.switchWindows();
			// driver.close();
			 
			 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"AllWelbore");
			 
			 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"BU");
			 Reporter.log("Wellbore Selected as:ANJUM- 1, Servey Class as :BU");
			
			 //fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
			 fetchingReports.selectDate("", "");
		     fetchingReports.Submit_Click();
		     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits(),"length","feet");
		     Thread.sleep(3000);
		     fetchingReports.fetchPSDReport(true,"All", "Excel");
		     Reporter.log("Excecel got exported in the format,(true,All,Excel)"); 


		}
			
		@Test(enabled=true)
		public void TC_002_contextSearch_PressureSurveyData_currentPage_Excel() throws Throwable{
			Reporter.log("Perform Quick Search");
			homepage=new homePage(driver);
			
			homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
			homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
			homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
			contextsearch contextpage = homepage.selectText("Anjum*");
			 contextpage.selectFewcheck();
			 contextpage.SelectReservoirEngineering();
			 contextpage.SelectPressureSurveyData();
			 fetchingReports fetchingReports = contextpage.selectreporting("Pressure Survey Data");
			 Reporter.log("Pressure Survey Data Data report opened successfully");
			 fetchingReports.switchWindows();
			 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"AllWelbore");
			 
			 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"FLOWING");
			   Reporter.log("Wellbore Selected as:AllWellbore, Servey Class as :FLOWING");
			 //fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
			 fetchingReports.selectDate("", "");
		     fetchingReports.Submit_Click();
		     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits() ,"pressure gradient","kPa/m");
		     Thread.sleep(6000);
		     fetchingReports.fetchDailyWellReport(true,"currentpage", "Excel");
		  
		     Reporter.log("Excecel got exported in the format,(true,currentpage,Excel)");
		}
		
		
		

	////Reservoir Engineering-->pressure Survey Data --> Reservoirdata--> (Manual error Operation Timeout)


	@Test(enabled=true)
	public void TC_001_contextSearch_Reservoirdata_All_Excel_AllWelbore_BU_length_Feet() throws Throwable{
		Reporter.log("Perform Quick Search");
		homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		 contextpage.selectFewcheck();
		 contextpage.SelectReservoirEngineering();
		 contextpage.SelectPressureSurveyData();
		 fetchingReports fetchingReports = contextpage.selectreporting("Reservoir Data");
		 
		 Reporter.log("Reservoir Data report opened successfully");
		 fetchingReports.switchWindows();
		 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"AllWelbore");
		 
		 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"BU");
		 Reporter.log("Wellbore Selected as:ANJUM- 1, Servey Class as :BU");
		 
		
		 fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
		 fetchingReports.selectDate("", "");
	     fetchingReports.Submit_Click();
	     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits(),"length","feet");
	     Thread.sleep(3000);
	     fetchingReports.fetchPSDReport(true,"All", "Excel");
	     Reporter.log("Excecel got exported in the format,(true,All,Excel)");
	}
		



	@Test(enabled=true)
	public void TC_002_contextSearch_Reservoirdata_currentPage_Excel() throws Throwable{
		Reporter.log("Perform Quick Search");
		homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		 contextpage.selectFewcheck();
		 contextpage.SelectReservoirEngineering();
		 contextpage.SelectPressureSurveyData();
		 fetchingReports fetchingReports = contextpage.selectreporting("Reservoir Data");
		 Reporter.log("Reservoir Data report opened successfully");
		 fetchingReports.switchWindows();
		 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"AllWelbore");
		 
		 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"BU");
		 Reporter.log("Wellbore Selected as:ANJUM- 1, Servey Class as :FLOWING");
		 fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
		 fetchingReports.selectDate("", "");
	     fetchingReports.Submit_Click();
	     Thread.sleep(15000);
	     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits() ,"pressure gradient","kPa/m");
	     Thread.sleep(6000);
	     fetchingReports.fetchDailyWellReport(true,"currentpage", "Excel");
	     Reporter.log("Excecel got exported in the format,(true,currentpage,Excel)");
	}

	// Support Documents
	
	
	
	

@Test(enabled=true)
public void TC_001_contextSearch_SuportDocuments_AllSubreports_Excel() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 Reporter.log("All records Selected");
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Support Documents");
	 Reporter.log("Support Document Report opened Successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.fetchDailyWellReport(true,"AllSubReports", "Excel"); 
	 Reporter.log("Excecel got exported in the format,(true,AllSubreports,Excel)");
	
}





@Test(enabled=true)
public void TC_002_contextSearch_SuportDocuments_All_Excel() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 Reporter.log("All records Selected");
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Support Documents");
	 Reporter.log("Support Document Report opened Successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.fetchDailyWellReport(true,"All", "Excel"); 
	 Reporter.log("Excecel got exported in the format,(true,All,Excel)");
	
}
@Test(enabled=true)
public void TC_003_contextSearch_SuportDocuments_Currentpage_Excel() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");

	 contextpage.selectFewcheck();
	 Reporter.log("All records Selected");
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	
	 fetchingReports fetchingReports = contextpage.selectreporting("Support Documents");
	 Reporter.log("Support Document Report opened Successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.fetchDailyWellReport(true,"currentpage", "Excel"); 
	 Reporter.log("Excecel got exported in the format,(true,currentpage,Excel)");
	
}
	
	
	
	
	//Reservoir Engineering--> PVT Sample Report




	@Test(enabled=true)
	public void TC_001_contextSearch_PVTSampleReport_Currentpage_Excel() throws Throwable{
		Reporter.log("Perform Quick Search");
		homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");

		 contextpage.selectFewcheck();
		 Reporter.log("All records Selected");
		 contextpage.SelectReservoirEngineering();
		 fetchingReports fetchingReports = contextpage.selectreporting("PVT Sample Report");
		 fetchingReports.switchWindows();
		 //fetchingReports.selectDataForReports(fetchingReports.Wellbore_PVT,"AllWellbore");
		 fetchingReports.fetchDailyWellReport(true,"currentpage","excel");
	 
	}

	@Test(enabled=true)
	public void TC_002_contextSearch_PVTSampleReport_All_Excel() throws Throwable{
		Reporter.log("Perform Quick Search");
		homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");

		 contextpage.selectFewcheck();
		 Reporter.log("All records Selected");
		 contextpage.SelectReservoirEngineering();
		 fetchingReports fetchingReports = contextpage.selectreporting("PVT Sample Report");
		 fetchingReports.switchWindows();

		 fetchingReports.fetchDailyWellReport(true, "All", "excel");
	 
	}

// utilites
	
    //feet --->  CheckALL
@Test(enabled=true)
public void TC_001_contextSearch_Utilities_Directional_Survey_Data_CheckAll_currentPage_Excel_Single() throws Throwable{

Reporter.log("Directional Survey Data", true); 
homepage=new homePage(driver);
Reporter.log("Browser Opened", true);
homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");


contextsearch contextpage = homepage.selectText("Anjum*");

Reporter.log("All Fields Selected", true);
contextsearch selectDirectional_Survey_Data = contextpage.selectAllcheck().selectUtilites();

fetchingReports fetchingReports = selectDirectional_Survey_Data.selectreporting("Directional Survey Data");


fetchingReports.switchWindows();


fetchingReports.selectUnitConversionOptions_FromList("length","feet");
Thread.sleep(300);
Reporter.log("feet selected", true);

fetchingReports.FetchExportReportResult_Utilities(true, "currentpage", "excel", "single");
Reporter.log("export options checked", true);


}

       //meters --->  CheckALL
@Test(enabled=true)
public void TC_002_contextSearch_Utilities_Directional_Survey_Data_CheckAll_currentPage_Excel_Single() throws Throwable{

Reporter.log("Directional Survey Data", true); 
homepage=new homePage(driver);
Reporter.log("Browser Opened", true);
homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");


contextsearch contextpage = homepage.selectText("Anjum*");

Reporter.log("All Fields Selected", true);
contextsearch selectDirectional_Survey_Data = contextpage.selectAllcheck().selectUtilites();

fetchingReports fetchingReports = selectDirectional_Survey_Data.selectreporting("Directional Survey Data");


fetchingReports.switchWindows();


fetchingReports.selectUnitConversionOptions_FromList("length","meters");
Thread.sleep(300);
Reporter.log("feet selected", true);

fetchingReports.FetchExportReportResult_Utilities(true, "currentpage", "excel", "single");
Reporter.log("export options checked", true);


}

//feet --->  CheckALL --> multiple selection
@Test(enabled=true)
public void TC_011_contextSearch_Utilities_Directional_Survey_Data_CheckAll_currentPage_Excel_Multi() throws Throwable{

Reporter.log("Directional Survey Data", true); 
homepage=new homePage(driver);
Reporter.log("Browser Opened", true);
homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");


contextsearch contextpage = homepage.selectText("Anjum*");

Reporter.log("All Fields Selected", true);
contextsearch selectDirectional_Survey_Data = contextpage.selectAllcheck().selectUtilites();

fetchingReports fetchingReports = selectDirectional_Survey_Data.selectreporting("Directional Survey Data");


fetchingReports.switchWindows();


fetchingReports.selectUnitConversionOptions_FromList("length","feet");
Thread.sleep(300);
Reporter.log("feet selected", true);

fetchingReports.FetchExportReportResult_Utilities(true, "currentpage", "excel", "multi");
Reporter.log("export options checked multiple selected", true);


}

		}








		
		
		
 

