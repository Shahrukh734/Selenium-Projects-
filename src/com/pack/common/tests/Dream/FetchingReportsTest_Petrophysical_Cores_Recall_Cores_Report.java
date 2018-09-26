package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

/*TestScript Designed On 16/04/2018
 TestScript Designed By  Mudassir  */

public class FetchingReportsTest_Petrophysical_Cores_Recall_Cores_Report extends TestBaseSetup {

	public homePage homepage;

	// ContextSearch->Petrophysical-> Cores

	// withoutCheck --> --> false -->c.p--> excel
	@Test(enabled = true)
	public void TC_001_contextSearch_Petrophysical_Cores_WithoutCheckAll_currentPage_Excel() throws Throwable {

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
		fetchingReports.getCoreReportsfromEPCatalogClick();
		fetchingReports.getPublish_DateClick();
		fetchingReports.getListOfREcords();
		Reporter.log("feet selected", true);
		fetchingReports.fetchCoresReport(false, "currentpage", "excel");

		Reporter.log("export options Withoutcheck", true);

	}

	// withoutCheck --> false --> All --> excel
	@Test(enabled = false)
	public void TC_002_contextSearch_Petrophysical_Cores_WithoutCheckAll_All_Excel() throws Throwable {

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

		Reporter.log("meters selected", true);
		fetchingReports.fetchCoresReport(false, "All", "excel");
		Reporter.log("export options Withoutcheck", true);

	}

	// CheckAll -->c.p --> excel
	@Test(enabled = false)
	public void TC_003_contextSearch_Petrophysical_Cores_CheckAll_CurrentPage_Excel() throws Throwable {

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
	@Test(enabled = false)
	public void TC_004_contextSearch_Petrophysical_Cores_CheckAll_All_Excel() throws Throwable {
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

	// anjum1 --> feet --> submit--> clik Core Report from EP
	@Test(enabled = false)
	public void TC_005_contextSearch_Petrophysical_Cores_ReportFromEP_WithoutCheckAll_currentPage_Excel()
			throws Throwable {

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

		contextpage.selectlblCoreReports();
		Reporter.log("Core Report from EP Clicked", true);
		Thread.sleep(300);

		fetchingReports.fetchCoresReport(true, "currentpage", "excel");

		Reporter.log("export options Withoutcheck", true);

	}

	// anjum1 --> feet --> submit--> clik Core Report from EP --> All--> Excel
	@Test(enabled = false)
	public void TC_006_contextSearch_Petrophysical_Cores_ReportFromEP_WithoutCheckAll_All_Excel() throws Throwable {

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

		contextpage.selectlblCoreReports();
		Reporter.log("Core Report from EP Clicked", true);
		Thread.sleep(300);

		fetchingReports.fetchCoresReport(true, "All", "excel");

		Reporter.log("export options Withoutcheck", true);

	}

	// anjum1 --> feet --> submit--> clik Core Report from EP --> All--> Excel
	@Test(enabled = false)
	public void TC_007_contextSearch_Petrophysical_Cores_ReportFromEP_CheckAll_All_Excel() throws Throwable {

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

		contextpage.selectlblCoreReports();
		Reporter.log("Core Report from EP Clicked", true);
		Thread.sleep(300);
		// fetchingReports.switchWindows();

		fetchingReports.fetchCoresReport(true, "All", "excel");

		Reporter.log("export options Withoutcheck", true);

	}

	// feet --> submit--> clik Core Report from EP --> All--> Excel -- > Anjum 2
	@Test(enabled = false)
	public void TC_008_contextSearch_Petrophysical_Cores_ReportFromEP_CheckAll_All_Excel() throws Throwable {

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
		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM- 2");
		Reporter.log("Anjum2 selected", true);
		Reporter.log("No Records for Anjum- 2", true);
		
		/*fetchingReports.selectUnitConversionOptions("feet");
		
		Reporter.log("feet selected", true);

		contextpage.selectlblCoreReports();
		Reporter.log("Core Report from EP Clicked", true);*/
		Thread.sleep(300);
		// fetchingReports.switchWindows();

		fetchingReports.fetchCoresReport(false, "All", "excel");

		Reporter.log("export options Withoutcheck", true);

	}

	// anjum1 --> feet --> submit--> clik Core Report from EP --> All--> Excel -- >
	// Anjum 6
	@Test(enabled = false)
	public void TC_009_contextSearch_Petrophysical_Cores_ReportFromEP_CheckAll_All_Excel() throws Throwable {

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
		fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM- 6");
		Reporter.log("Anjum6 selected", true);
		Reporter.log("No Records for Anjum- 6", true);
		/*fetchingReports.selectUnitConversionOptions("feet");
		Reporter.log("feet selected", true);

		contextpage.selectlblCoreReports();
		Reporter.log("Core Report from EP Clicked", true);
		Thread.sleep(300);
		// fetchingReports.switchWindows();
*/
		fetchingReports.fetchCoresReport(false, "All", "excel");

		Reporter.log("export options Withoutcheck", true);

	}

}
