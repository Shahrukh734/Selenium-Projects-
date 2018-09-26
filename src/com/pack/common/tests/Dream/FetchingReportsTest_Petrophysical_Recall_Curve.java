package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

/*TestScript Designed On 24/04/2018
 TestScript Designed By  Mudassir */

public class FetchingReportsTest_Petrophysical_Recall_Curve extends TestBaseSetup {

	public homePage homepage;

	// ContextSearch->Petrophysical-> Recall Curve

	// Single Members of family selected
	@Test(enabled = true)
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
		// selectAllcheck()
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

		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectCurveBusinessValue(), "BLANK");
		Reporter.log("BLANK selected", true);

		fetchingReports.getclickFilterOption_btnSubmit();
		Thread.sleep(300);

		Reporter.log("Single Members of family selected", true);

	}

	// All Members of TechLog Main family selected
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
		fetchingReports.isAlertPresent();
		fetchingReports.switchWindows();
		driver.manage().window().maximize();

		Thread.sleep(300);
		Reporter.log("Recall Curve selected", true);
		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectTechLogMainfamily(),
				"AllWelbore"); // AllWelbore for selecting All Records
		Reporter.log("Porosity selected", true);

		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectTechLogfamilyName(),
				"Total Porosity");
		Reporter.log("Total Porosity selected", true);

		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectCurveBusinessValue(), "BLANK");
		Reporter.log("BLANK selected", true);

		fetchingReports.getclickFilterOption_btnSubmit();
		Thread.sleep(500);

		Reporter.log("All Members of TechLog Main family selected", true);

	}

	// All Members of TechLog family Name selected
	@Test(enabled=true)
	public void TC_003_contextSearch_Petrophysical_Recall_Curve_WithoutCheckAll_currentPage_Excel() throws Throwable {

		Reporter.log("Recall Curve", true);
		homepage = new homePage(driver);
		Reporter.log("Browser Opened", true);
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");

		contextsearch contextpage = homepage.selectText("Anjum*");

		Reporter.log("All Fields Selected", true);
		contextsearch selectCores = contextpage.selectFewcheck().selectPetrophysical();
		// . selectFewcheck() selectAllcheck()
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
				"AllWelbore");
		Reporter.log("Total Porosity selected", true);

		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getselectCurveBusinessValue(), "BLANK");
		Reporter.log("BLANK selected", true);

		fetchingReports.getclickFilterOption_btnSubmit();
		Thread.sleep(500);

		Reporter.log("All Members of TechLog family Name selected", true);

	}

	// All Members of Curve Business Value selected
	@Test(enabled=true)
	public void TC_004_contextSearch_Petrophysical_Recall_Curve_WithoutCheckAll_currentPage_Excel() throws Throwable {

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

	@Test(enabled=true)
	public void TC_005_contextSearch_Petrophysical_Recall_Curve_WithoutCheckAll_currentPage_Excel() throws Throwable {

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
		fetchingReports.getShowparentWellbore();
		// fetchingReports.FetchExportReportResult_Utilities(true, "All",
		// "excel",
		// "single");
		Thread.sleep(300);
		Reporter.log("ShowParentWellbore selected", true);

	}

	// All Members of Entire Family selected
	@Test(enabled=true)
	public void TC_006_contextSearch_Petrophysical_Recall_Curve_WithoutCheckAll_currentPage_Excel() throws Throwable {

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

}
