package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

/*TestScript Designed On 27/04/2018
 TestScript Designed By  Mudassir */

public class FetchingReportsTest_GeologicalData_Picks extends TestBaseSetup {

	public homePage homepage;

	// ContextSearch->GeologicalData --> Picks

	// unit conversion --> false --> currentpage --> excel --> contact QC Check
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

}
