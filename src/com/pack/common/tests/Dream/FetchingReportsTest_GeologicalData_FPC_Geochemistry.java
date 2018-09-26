package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

/*TestScript Designed On 26/04/2018
 TestScript Designed By  Mudassir */

public class FetchingReportsTest_GeologicalData_FPC_Geochemistry extends TestBaseSetup {

	public homePage homepage;

	// ContextSearch->GeologicalData --> FPC_Geochemistry

	// unit conversion --> false --> currentpage --> excel --> contact QC Check
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

	// unit conversion --> false --> All --> excel
	@Test(enabled=true)
	public void TC_002_contextSearch_GeologicalData_FPC_Geochemistry_WithoutCheckAll_All_Excel() throws Throwable {

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
		fetchingReports.FPCExportSelect(false, "All", "excel");
		Reporter.log(" FPCExport Selected", true);

		Reporter.log("without check All excel selected", true);

	}

	// unit conversion --> true --> All --> excel
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

	// unit conversion --> true --> All --> excel --> Anjum- 2B
	@Test(enabled=true)
	public void TC_004_contextSearch_GeologicalData_FPC_Geochemistry_CheckAll_All_Excel() throws Throwable {

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
		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "Anjum- 2B");
		fetchingReports.selectUnitConversionOptions("feet");
		Thread.sleep(3000);
		fetchingReports.FPCExportSelect(true, "All", "excel");
		Reporter.log(" FPCExport Selected", true);

		Reporter.log(" checkAll All excel selected", true);

	}

	// OIL Tab Current excel
	@Test(enabled=true)
	public void TC_005_contextSearch_GeologicalData_FPC_Geochemistry_WithoutCheckAll_currentpage_Excel()
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
		contextpage.selectFPCOILTab();
		fetchingReports.FPCExportSelect(false, "current", "excel");
		fetchingReports.getclickReportClassificationErrors();
		Reporter.log(" FPCExport Selected", true);

		Reporter.log(" without checkAll Current excel selected", true);

	}

	// OIL Tab All excel
	@Test(enabled=true)
	public void TC_006_contextSearch_GeologicalData_FPC_Geochemistry_WithoutCheckAll_All_Excel() throws Throwable {

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
		contextpage.selectFPCOILTab();
		fetchingReports.FPCExportSelect(false, "All", "excel");
		Reporter.log(" FPCExport Selected", true);

		Reporter.log(" without checkAll All excel selected", true);

	}

	// OIL Tab True All excel
	@Test(enabled=true)
	public void TC_007_contextSearch_GeologicalData_FPC_Geochemistry_CheckAll_All_Excel() throws Throwable {

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
		contextpage.selectFPCOILTab();
		fetchingReports.FPCExportSelect(true, "All", "excel");
		Reporter.log(" FPCExport Selected", true);

		Reporter.log(" without checkAll All excel selected", true);

	}

	// GAS Tab False Currentpage excel
	@Test(enabled=true)
	public void TC_008_contextSearch_GeologicalData_FPC_Geochemistry_WithoutCheckAll_Currentpage_Excel()
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
		contextpage.selectFPCGASTab();
		fetchingReports.FPCExportSelect(false, "currentpage", "excel");
		Reporter.log(" FPCExport Selected", true);

		Reporter.log(" without checkAll All excel selected", true);

	}

	// GAS Tab False All excel
	@Test(enabled=true)
	public void TC_009_contextSearch_GeologicalData_FPC_Geochemistry_WithoutCheckAll_Currentpage_Excel()
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
		contextpage.selectFPCGASTab();
		fetchingReports.FPCExportSelect(false, "All", "excel");
		Reporter.log(" FPCExport Selected", true);

		Reporter.log(" without checkAll All excel selected", true);

	}

	// GAS Tab True All excel
	@Test(enabled = true)
	public void TC_010_contextSearch_GeologicalData_FPC_Geochemistry_CheckAll_Currentpage_Excel() throws Throwable {

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
		contextpage.selectFPCGASTab();
		fetchingReports.FPCExportSelect(true, "All", "excel");
		Reporter.log(" FPCExport Selected", true);

		Reporter.log(" without checkAll All excel selected", true);

	}

}
