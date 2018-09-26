package com.pack.common.tests.Dream;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

public class fetchingReportsTest extends contextsearchTest {

	/*public fetchingReports fetchingReports;
	// public WebDriver driver;

	// @AfterMethod(enabled=true)
	public void browserClose() {

		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().defaultContent();
		driver.navigate().refresh();

	}

	// ContextSearch->Documents
	// Testcases for Well Status Diagrams

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_006_contextSearch_Allselectreport_Documents_WellStatusDiagrams" }, priority = 1, enabled = false)
	public void TC_001_contextSearch_WellStatusDiagram_Export_All_Excel() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();
		fetchingReports.exportClick();
		fetchingReports.switchWindows();
		fetchingReports.selectExportoptions("All", "excel");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_006_contextSearch_Allselectreport_Documents_WellStatusDiagrams" }, priority = 1, enabled = false)
	public void TC_002_contextSearch_WellStatusDiagram_Export_CurrentPage_Excel() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();
		fetchingReports.exportClick().switchWindows().selectExportoptions("currentpage", "excel");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_006_contextSearch_Allselectreport_Documents_WellStatusDiagrams" }, priority = 1, enabled = false)
	public void TC_003_contextSearch_WellStatusDiagram_Export_CurrentPage_CSV() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();
		fetchingReports.exportClick().switchWindows().selectExportoptions("currentpage", "CSV");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_006_contextSearch_Allselectreport_Documents_WellStatusDiagrams" }, priority = 1, enabled = false)
	public void TC_004_contextSearch_WellStatusDiagram_Export_CurrentPage_CSV() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();
		fetchingReports.exportClick().switchWindows().selectExportoptions("currentpage", "excel");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_006_contextSearch_Allselectreport_Documents_WellStatusDiagrams" }, priority = 1, enabled = false)
	public void TC_005_contextSearch_WellStatusDiagram_Print() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();
		fetchingReports.getPrintIcon().click();

	}

	// ContextSearch->Documents
	// Testcases for BHP/BHT Well Test Reports

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_007_contextSearch_Allselectreport_Documents_BHTWellTestReports" }, priority = 1, enabled = false)
	public void TC_001_contextSearch_BHTWellTestReports_Export_All_Excel() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();
		fetchingReports.exportClick();
		fetchingReports.switchWindows();
		fetchingReports.exportClick().selectExportoptions("All", "excel");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_007_contextSearch_Allselectreport_Documents_BHTWellTestReports" }, priority = 1, enabled = false)
	public void TC_002_contextSearch_BHTWellTestReports_Export_CurrentPage_Excel() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();
		fetchingReports.exportClick().switchWindows().selectExportoptions("currentpage", "excel");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_007_contextSearch_Allselectreport_Documents_BHTWellTestReports" }, priority = 1, enabled = false)
	public void TC_003_contextSearch_BHTWellTestReports_Export_CurrentPage_CSV() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();
		fetchingReports.exportClick().switchWindows().selectExportoptions("currentpage", "CSV");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_007_contextSearch_Allselectreport_Documents_BHTWellTestReports" }, priority = 1, enabled = false)
	public void TC_004_contextSearch_BHTWellTestReports_Export_CurrentPage_CSV() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();
		fetchingReports.exportClick().switchWindows().selectExportoptions("currentpage", "excel");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_007_contextSearch_Allselectreport_Documents_BHTWellTestReports" }, priority = 1, enabled = false)
	public void TC_005_contextSearch_BHTWellTestReports_Print() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();
		fetchingReports.getPrintIcon().click();

	}

	// ContextSearch->Well Engineering/PT->DailyWellReporting
	// The below testcases work for EventsReport, Report Activities and
	// DailySummaryReport under DailyWellReporting
	// Change the dependsOnMethods testcase parameter as per requirements
	// EX: For
	// 1.EventsReports to
	// "com.pack.common.tests.contextsearchTest.TC_003_contextSearch_Allselectreport_EventsReport"
	// 2.Report Activities to
	// "com.pack.common.tests.contextsearchTest.TC_004_contextSearch_Allselectreport_ReportedActivitiesReport"
	// 3.DailyWellReporting to
	// "TC_00com.pack.common.tests.contextsearchTest.1_contextSearch_Allselectreport_DailySummaryReport"

	// NOte: Change the parameter value as per requirement wherever neccessary

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_003_contextSearch_Allselectreport_EventsReport" }, priority = 1, enabled = false)
	public void TC_001_contextSearch_SelectedTimePeriod_EventsYes_Tabular_Export_currentpage_Check() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");

		fetchingReports.submitEventReport("Yes", "Tabular");

		fetchingReports.fetchDailyWellReport(true, "currentpage", "excel");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_003_contextSearch_Allselectreport_EventsReport" }, priority = 1, enabled = false)
	public void TC_002_contextSearch_WithAllSelectedTimePeriod_EventsYes_Tabular_Export_currentpage_Nocheck()
			throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");

		fetchingReports.submitEventReport("Yes", "Tabular");

		fetchingReports.fetchDailyWellReport(false, "currentpage", "excel");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_003_contextSearch_Allselectreport_EventsReport" }, priority = 1, enabled = false)
	public void TC_003_contextSearch_WithAllSelectedTimePeriod_EventsNO_Tabular_Export_CurrentPage() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");

		fetchingReports.submitEventReport("No", "Tabular");

		fetchingReports.fetchDailyWellReport(true, "currentpage", "excel");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_003_contextSearch_Allselectreport_EventsReport" }, priority = 1, enabled = false)
	public void TC_004_contextSearch_WithAllSelectedTimePeriod_EventsNO_Hierarchical() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "TEN BOER- 1");

		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");

		fetchingReports.submitEventReport("No", "Hierarchical");

		fetchingReports.fetchDailyWellReport(true, "currentpage", "excel");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_003_contextSearch_Allselectreport_EventsReport" }, priority = 1, enabled = false)
	public void TC_005_contextSearch_WithAllSelectedTimePeriod_EventsYes_Tabular_Export_All() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");

		fetchingReports.submitEventReport("Yes", "Tabular");

		fetchingReports.fetchDailyWellReport(true, "All", "excel");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_003_contextSearch_Allselectreport_EventsReport" }, priority = 1, enabled = false)
	public void TC_006_contextSearch_WithAllSelectedTimePeriod_EventsYes_Hierarchical_Export_All() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");

		fetchingReports.submitEventReport("Yes", "Hierarchical");

		fetchingReports.fetchDailyWellReport(true, "All", "excel");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_003_contextSearch_Allselectreport_EventsReport" }, priority = 1, enabled = false)
	public void TC_007_contextSearch_WithSelectDate_Export_All() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "--Select--");

		fetchingReports.selectDate("01/Feb/2018", "22/Feb/2018");

		fetchingReports.submitEventReport("Yes", "Hierarchical");

		fetchingReports.fetchDailyWellReport(true, "All", "excel");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_003_contextSearch_Allselectreport_EventsReport" }, priority = 1, enabled = false)
	public void TC_008_contextSearch_WithSelectDate_Export_currentPage() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "--Select--");

		fetchingReports.selectDate("01/Feb/2018", "22/Feb/2018");

		fetchingReports.submitEventReport("Yes", "Hierarchical");

		fetchingReports.fetchDailyWellReport(true, "currentpage", "excel");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_003_contextSearch_Allselectreport_EventsReport" }, priority = 1, enabled = false)
	public void TC_009_contextSearch_WithSelectDate_Hierarchical_Print() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "--Select--");

		fetchingReports.selectDate("01/Feb/2018", "22/Feb/2018");

		fetchingReports.submitEventReport("Yes", "Hierarchical");

		fetchingReports.getSelectAllResults().click();

		fetchingReports.getPrintIcon().click();

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_003_contextSearch_Allselectreport_EventsReport" }, priority = 1, enabled = false)
	public void TC_010_contextSearch_WithSelectDate_Tabular_Print() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "--Select--");

		fetchingReports.selectDate("01/Feb/2018", "22/Feb/2018");

		fetchingReports.submitEventReport("Yes", "Tabular");

		fetchingReports.getSelectAllResults().click();

		fetchingReports.getPrintIcon().click();

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_003_contextSearch_Allselectreport_EventsReport" }, priority = 1, enabled = false)
	public void TC_011_contextSearch_WithAllSelectedTimePeriod_EventsYes_Tabular_Export_All_CSV() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");

		fetchingReports.submitEventReport("Yes", "Tabular");

		fetchingReports.fetchDailyWellReport(true, "All", "CSV");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_003_contextSearch_Allselectreport_EventsReport" }, priority = 1, enabled = false)
	public void TC_012_contextSearch_WithAllSelectedTimePeriod_EventsYes_Hierarchical_Export_CurrentPage_CSV()
			throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectDataForReports(fetchingReports.getSelectTimePeriod(), "All");

		fetchingReports.submitEventReport("Yes", "Hierarchical");

		fetchingReports.fetchDailyWellReport(true, "CurrentPage", "CSV");

	}

	// ContextSearch->Well Engineering/PT->Mechanical Well Data->Strings

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_009_contextSearch_MechanicalWellData_Strings" }, priority = 1, enabled = true)
	public void TC_001_contextSearch_StringReport_TabularWithDepthReference_DF_currentPage_Excel() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("meters");

		fetchingReports.selectTabular();

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "DF").selectComponentInfo()
				.selectWirelineRetrievables();

		fetchingReports.fetchStringReportResult(true, "currentpage", "CSV");

		// System.out.println("current url is : " +driver.getCurrentUrl());

		// fetchingReports.switchtoParentWindow();

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_009_contextSearch_MechanicalWellData_Strings" }, priority = 2, enabled = true)
	public void TC_002_contextSearch_StringReport_TabularWithDepthReference_DF_AllPage_Excel() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("feet");

		fetchingReports.selectTabular();

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "DF").selectComponentInfo()
				.selectWirelineRetrievables();

		fetchingReports.fetchStringReportResult(true, "All", "excel");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_009_contextSearch_MechanicalWellData_Strings" }, priority = 3, enabled = true)
	public void TC_003_contextSearch_StringReport_TabularWithDepthReference_DF_AllSubReportsPage_Excel()
			throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "All");

		fetchingReports.selectUnitConversionOptions("feet");

		fetchingReports.selectTabular();

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "DF").selectComponentInfo()
				.selectWirelineRetrievables();

		fetchingReports.fetchStringReportResult(true, "AllSubReports", "excel");

		// System.out.println("current url is : " +driver.getCurrentUrl());//

		// fetchingReports.switchtoParentWindow();

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_009_contextSearch_MechanicalWellData_Strings" }, priority = 4, enabled = false)
	public void TC_004_contextSearch_StringReport_TabularWithDepthReference_DF_currentPage_CSV() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("feet");

		fetchingReports.selectTabular();

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "DF").selectComponentInfo()
				.selectWirelineRetrievables();

		fetchingReports.fetchStringReportResult(true, "currentpage", "CSV");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_009_contextSearch_MechanicalWellData_Strings" }, priority = 5, enabled = false)
	public void TC_005_contextSearch_StringReport_TabularWithDepthReference_DF_AllPage_CSV() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("feet");

		fetchingReports.selectTabular();

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "DF").selectComponentInfo()
				.selectWirelineRetrievables();

		fetchingReports.fetchStringReportResult(true, "All", "excel");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_009_contextSearch_MechanicalWellData_Strings" }, priority = 6, enabled = false)
	public void TC_006_contextSearch_StringReport_TabularWithDepthReference_DF_AllSubReportsPage_CSV()
			throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("feet");

		fetchingReports.selectTabular();

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "DF").selectComponentInfo()
				.selectWirelineRetrievables();

		fetchingReports.fetchStringReportResult(true, "AllSubReports", "CSV");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_009_contextSearch_MechanicalWellData_Strings" }, priority = 7, enabled = false)
	public void TC_007_contextSearch_StringReport_DatasheetWithDepthReference_DF() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("feet");

		fetchingReports.selectDataSheet();

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "DF");

		fetchingReports.selectStringPrintReport();

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_009_contextSearch_MechanicalWellData_Strings" }, priority = 8, enabled = false)
	public void TC_008_contextSearch_StringReport_DatasheetWithDepthReference_BF() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("feet");

		fetchingReports.selectDataSheet();

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "BF");

		fetchingReports.selectStringPrintReport();

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_009_contextSearch_MechanicalWellData_Strings" }, priority = 9, enabled = false)
	public void TC_009_contextSearch_StringReport_TabularWithDepthReference_BF() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("feet");

		fetchingReports.selectTabular();

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "BF").selectComponentInfo()
				.selectWirelineRetrievables();

		fetchingReports.fetchStringReportResult(true, "currentpage", "excel");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_009_contextSearch_MechanicalWellData_Strings" }, priority = 10, enabled = false)
	public void TC_010_contextSearch_StringReport_TabularWithDepthReference_GL() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("feet");

		fetchingReports.selectTabular();

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "GL").selectComponentInfo()
				.selectWirelineRetrievables();

		fetchingReports.fetchStringReportResult(true, "currentpage", "excel");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_009_contextSearch_MechanicalWellData_Strings" }, priority = 11, enabled = false)
	public void TC_011_contextSearch_StringReport_TabularWithDepthReference_PDL() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("feet");

		fetchingReports.selectTabular();

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "PDL").selectComponentInfo()
				.selectWirelineRetrievables();

		fetchingReports.fetchStringReportResult(true, "currentpage", "excel");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_009_contextSearch_MechanicalWellData_Strings" }, priority = 12, enabled = false)
	public void TC_012_contextSearch_StringReport_DatasheetWithDepthReference_GL() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("feet");

		fetchingReports.selectDataSheet();

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "GL");

		fetchingReports.selectStringPrintReport();

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_009_contextSearch_MechanicalWellData_Strings" }, priority = 13, enabled = false)
	public void TC_013_contextSearch_StringReport_DatasheetWithDepthReference_PDL() throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("feet");

		fetchingReports.selectDataSheet();

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "PDL");

		fetchingReports.selectStringPrintReport();

	}

	// ContextSearch->Well Engineering/PT->Mechanical Well Data->Hold-Up Depth

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_010_contextSearch_MechanicalWellData_HoldUpDepth" }, priority = 2, enabled = false)
	public void TC_001_contextSearch_HoldUpDepthReport_TabularWithDepthReference_DF_currentPage_Excel_SingleSheet()
			throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("meters");

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "DF");

		fetchingReports.getSelectAllResults().click();

		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel", "single");

		// driver.navigate().refresh();

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_010_contextSearch_MechanicalWellData_HoldUpDepth" }, priority = 1, enabled = false)
	public void TC_002_contextSearch_HoldUpDepthReport_TabularWithDepthReference_DF_currentPage_Excel_MultiSheet()
			throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("meters");

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "DF");

		fetchingReports.getSelectAllResults().click();

		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel", "multi");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_010_contextSearch_MechanicalWellData_HoldUpDepth" }, priority = 1, enabled = false)
	public void TC_003_contextSearch_HoldUpDepthReport_TabularWithDepthReference_DF_All_Excel_SingleSheet()
			throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("meters");

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "DF");

		fetchingReports.getSelectAllResults().click();

		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel", "single");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_010_contextSearch_MechanicalWellData_HoldUpDepth" }, priority = 1, enabled = false)
	public void TC_004_contextSearch_HoldUpDepthReport_TabularWithDepthReference_DF_All_Excel_MultiSheet()
			throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("meters");

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "DF");

		fetchingReports.getSelectAllResults().click();

		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel", "multi");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_010_contextSearch_MechanicalWellData_HoldUpDepth" }, priority = 1, enabled = false)
	public void TC_005_contextSearch_HoldUpDepthReport_TabularWithDepthReference_DF_AllSubReports_Excel()
			throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("meters");

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "DF");

		fetchingReports.getSelectAllResults().click();

		fetchingReports.fetchHoldUpDepthReportResult(true, "AllSubReports", "excel", "multi");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_010_contextSearch_MechanicalWellData_HoldUpDepth" }, priority = 1, enabled = false)
	public void TC_006_contextSearch_HoldUpDepthReport_TabularWithDepthReference_BF_currentpage_Excel_SingleSheet()
			throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("meters");

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "BF");

		fetchingReports.getSelectAllResults().click();

		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel", "single");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_010_contextSearch_MechanicalWellData_HoldUpDepth" }, priority = 1, enabled = false)
	public void TC_007_contextSearch_HoldUpDepthReport_TabularWithDepthReference_BF_All_Excel_singleSheet()
			throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("meters");

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "BF");

		fetchingReports.getSelectAllResults().click();

		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel", "single");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_010_contextSearch_MechanicalWellData_HoldUpDepth" }, priority = 1, enabled = false)
	public void TC_008_contextSearch_HoldUpDepthReport_TabularWithDepthReference_BF_AllSubReports_Excel()
			throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("meters");

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "BF");

		fetchingReports.getSelectAllResults().click();

		fetchingReports.fetchHoldUpDepthReportResult(true, "AllSubReports", "excel", "single");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_010_contextSearch_MechanicalWellData_HoldUpDepth" }, priority = 1, enabled = false)
	public void TC_009_contextSearch_HoldUpDepthReport_TabularWithDepthReference_DL_currentpage_Excel_SingleSheet()
			throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("meters");

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "DL");

		fetchingReports.getSelectAllResults().click();

		fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel", "single");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_010_contextSearch_MechanicalWellData_HoldUpDepth" }, priority = 1, enabled = false)
	public void TC_010_contextSearch_HoldUpDepthReport_TabularWithDepthReference_DL_All_Excel_singleSheet()
			throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("meters");

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "DL");

		fetchingReports.getSelectAllResults().click();

		fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel", "single");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_010_contextSearch_MechanicalWellData_HoldUpDepth" }, priority = 1, enabled = false)
	public void TC_011_contextSearch_HoldUpDepthReport_TabularWithDepthReference_DL_AllSubReports_Excel()
			throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("meters");

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "DL");

		fetchingReports.getSelectAllResults().click();

		fetchingReports.fetchHoldUpDepthReportResult(true, "AllSubReports", "excel", "single");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_010_contextSearch_MechanicalWellData_HoldUpDepth" }, priority = 1, enabled = false)
	public void TC_012_contextSearch_HoldUpDepthReport_TabularWithDepthReference_DF_AllSubReports_PrintReport()
			throws Throwable {

		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectUnitConversionOptions("meters");

		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(), "DF");

		fetchingReports.getSelectAllResults().click();

		fetchingReports.selectPrintReport();

	}

	// ContextSearch->Well Engineering/PT->Mechanical Well Data->Well Status
	// Diagram

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_011_contextSearch_MechanicalWellData_WellStatusDiagramCached" }, priority = 1, enabled = false)
	public void TC_001_contextSearch_WellSTatusDiagram_GenerateWSDReportwithoutcached() throws Throwable {

		Reporter.log("Test Case started");
		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectDataForReports(fetchingReports.getSelectDatum(), "DFE");

		fetchingReports.selectDataForReports(fetchingReports.getselectTemplate(), "EP As Built");

		fetchingReports.selectDataForReports(fetchingReports.getselectUnits(), "API");

		fetchingReports.getgenerateWSD().click();

		Reporter.log("Reported generated successfully");

	}

	@Test(dependsOnMethods = {
			"com.pack.common.tests.contextsearchTest.TC_011_contextSearch_MechanicalWellData_WellStatusDiagramCached" }, priority = 2, enabled = false)
	public void TC_002_contextSearch_WellSTatusDiagram_GenerateWSDReportwithcached() throws Throwable {

		Reporter.log("Test Case started");
		fetchingReports fetchingReports = new fetchingReports(driver);

		fetchingReports.switchWindows();

		fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(), "DE TIBBEN-1");

		fetchingReports.selectDataForReports(fetchingReports.getSelectDatum(), "DFE");

		fetchingReports.selectDataForReports(fetchingReports.getselectTemplate(), "EP As Built");

		fetchingReports.selectDataForReports(fetchingReports.getselectUnits(), "API");

		fetchingReports.getcheckchbCache().click();

		fetchingReports.getgenerateWSD().click();

		Reporter.log("Reported generated successfully");

	}

*/}
