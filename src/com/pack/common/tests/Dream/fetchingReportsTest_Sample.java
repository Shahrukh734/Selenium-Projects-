package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

public class fetchingReportsTest_Sample extends TestBaseSetup{

	
	/*public homePage homepage ;
	
	//	ContextSearch->Well Engineering/PT->Mechanical Well Data->Strings
		
	@Test(enabled=true)
	public void TC_001_contextSearch_AllDocuments_AllWellbore_Export_All_Excel() throws Throwable
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
	
	@Test(enabled= true)
	public void TC_001_contextSearch_WellHeadReport_nextpage() throws Throwable{
		
	

		   homepage=new homePage(driver);
			
			homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
			homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
			contextsearch contextpage = homepage.selectText("Anjum*");
			
			Reporter.log("Click on Nextpage icon to navigate Next page in the Report");
			 contextpage.selectAllcheck();
			 contextpage.selectWellEngineering();
			 contextpage.selectMechanicalWellData();
			 fetchingReports fetchingReports = contextpage.selectreporting("Well Head");
			 fetchingReports.switchWindows().check_Allrecords();
			 
			 //fetchingReports.Pagination("NextPage");wait(10);
			// fetchingReports.Pagination(true,"LastPage");wait(10);	 
			// fetchingReports.Pagination(true,"FirstPage");wait(10);	  
			// fetchingReports.Pagination(true,"PriviousPage");wait(10);
			 //fetchingReports.FetchWellHeadReportResult(true, "currentpage", "excel","single");
			//	 Reporter.log("Page navigation Checked Successfully"); 
				 
	}
	
	
	
	
	

		@Test(enabled= true)
			public void TC_009_contextSearch_StringReport_DatasheetWithDepthReference_PDL() throws Throwable{
				
			
			 

				   homepage=new homePage(driver);
					
					homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
					homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
					homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
					contextsearch contextpage = homepage.selectText("Anjum*");
					
					
					Reporter.log("Select the String report from Context Search");
					 contextpage.selectAllcheck();
					 contextpage.selectWellEngineering();
					 contextpage.selectMechanicalWellData();
					 fetchingReports fetchingReports = contextpage.selectreporting("Strings");
					
					 Reporter.log("Swtich to report window and perfrom operations");
					fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
					
					fetchingReports.selectUnitConversionOptions("feet");
					
					fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
					
					fetchingReports.getSelectTabular();
					fetchingReports.selectComponentInfo();
					fetchingReports.selectWirelineRetrievables();
					
				    //fetchingReports.getSelectAllResults().click();
					
					fetchingReports.selectStringPrintReport();
					//fetchingReports.getSelectStringPrintReport();
					 Reporter.log("Report Generation is completed");


			} 
		 

		


@Test(priority=1,enabled= true,groups = {"Regression","Smoke"})
public void TC_001_contextSearch_HoldUpDepthReport_TabularWithDepthReference_DF_currentPage_Excel_SingleSheet() throws Throwable{
	
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	

	Reporter.log("Select the Hold-Up Depth report from Context Search");
	 contextpage.selectAllcheck();
	 contextpage.selectWellEngineering();
	 contextpage.selectMechanicalWellData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Hold-Up Depth");
	
	 Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	
	fetchingReports.selectUnitConversionOptions("feet");
	
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	//fetchingReports.selectPrintReport();
	//fetchingReports.checkAllData()
	
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
	 Reporter.log("Report Generation is completed");
}


@Test(priority=1,enabled= true,groups = {"Regression","Smoke"})
public void TC_001_contextSearch_DailySummary() throws Throwable{
	

	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "--Any Country--");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	
	
 contextsearch contextpage = homepage.selectText("Anjum*");
	
	
	
	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectDailyWellsReporting();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Daily Summary");
	
	Reporter.log("Selection of wellbore");
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	
	fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");
	
	fetchingReports.submitEventReport("Yes", "Tabular");
	 
	fetchingReports.fetchDailyWellReport(true,"All","excel");

}

@Test(priority=2,enabled= true,groups = {"Smoke"})
public void TC_002_contextSearch_DailySummary() throws Throwable{
	

	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "--Any Country--");
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




@Test(priority=1,enabled= true,groups = {"Regression"})
public void TC_003_contextSearch_StringReport_TabularWithDepthReference_DF_currentPage_Excel() throws Throwable{
	

	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "--Any Country--");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	
	
	contextsearch contextpage = homepage.selectText("Anjum*");
	
	
	
	contextsearch selectDailyWellsReporting = contextpage.selectAllcheck().selectWellEngineering().selectMechanicalWellData();
	fetchingReports fetchingReports = selectDailyWellsReporting.selectreporting("Hold-Up Depth");
	
	
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	
	fetchingReports.selectUnitConversionOptions("feet");
	
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DF");
	
	fetchingReports.getSelectAllResults().click();
	
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");

}
*/

}
