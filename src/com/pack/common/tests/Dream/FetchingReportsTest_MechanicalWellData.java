package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

public class FetchingReportsTest_MechanicalWellData extends TestBaseSetup{

	
	public homePage homepage ;
	
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


/*@Test(enabled=true)
public void TC_003_contextSearch_HoldUpDepthReport_TabularWithDepthReference_DF_All_Excel_SingleSheet() throws Throwable{
	
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

*/
@Test(enabled=true)
public void TC_004_contextSearch_HoldUpDepthReport_TabularWithDepthReference_DF_All_Excel_MultiSheet() throws Throwable{
	
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

/*@Test(enabled=true)
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
}*/

@Test(enabled=true)
public void TC_006_contextSearch_HoldUpDepthReport_TabularWithDepthReference_BF_currentpage_Excel_SingleSheet() throws Throwable{
	
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
	
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	//fetchingReports.selectPrintReport();
	//fetchingReports.checkAllData()
	
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	 Reporter.log("Report Generation is completed");
}


/*@Test(enabled=true)
public void TC_007_contextSearch_HoldUpDepthReport_TabularWithDepthReference_BF_All_Excel_singleSheet() throws Throwable{
	
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
	
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	//fetchingReports.selectPrintReport();
	//fetchingReports.checkAllData()
	
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
	 Reporter.log("Report Generation is completed");
}
*/



@Test(enabled=true)
public void TC_008_contextSearch_HoldUpDepthReport_TabularWithDepthReference_BF_AllSubReports_Excel()  throws Throwable{
	
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
	
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	//fetchingReports.selectPrintReport();
	//fetchingReports.checkAllData()
	
	fetchingReports.fetchHoldUpDepthReportResult(true, "AllSubReports", "excel","Multi");
	 Reporter.log("Report Generation is completed");
}




@Test(enabled=true)
public void TC_009_contextSearch_HoldUpDepthReport_TabularWithDepthReference_DL_currentpage_Excel_SingleSheet() throws Throwable{
	
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
	
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DL");
	//fetchingReports.selectPrintReport();
	//fetchingReports.checkAllData()
	
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	 Reporter.log("Report Generation is completed");
}


/*@Test(enabled=true)
public void TC_010_contextSearch_HoldUpDepthReport_TabularWithDepthReference_DL_All_Excel_singleSheet() throws Throwable{
	
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
	
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DL");
	//fetchingReports.selectPrintReport();
	//fetchingReports.checkAllData()
	
	fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
	 Reporter.log("Report Generation is completed");

}
*/
@Test(enabled=true)
public void TC_011_contextSearch_HoldUpDepthReport_TabularWithDepthReference_DL_AllSubReports_Excel() throws Throwable{
	
 
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
	
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DL");
	//fetchingReports.selectPrintReport();
	//fetchingReports.checkAllData()
	fetchingReports.fetchHoldUpDepthReportResult(true, "AllSubReports", "excel","single");
	 Reporter.log("Report Generation is completed");

			


}

/*@Test(enabled=true)
public void TC_012_contextSearch_HoldUpDepthReport_TabularWithDepthReference_DF_AllSubReports_PrintReport() throws Throwable{
	
	 
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
		
		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"DL");
		fetchingReports.selectPrintReport();
		//fetchingReports.checkAllData()
		//fetchingReports.fetchHoldUpDepthReportResult(false, "AllSubReports", "excel","single");
		 Reporter.log("Report Generation is completed");
		
}

//@Test(enabled=false)
public void TC_013_contextSearch_HoldUpDepth_csv() throws Throwable{
	
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
	
	 Reporter.log("Swtich to report window and perfrom operations");
	fetchingReports.switchWindows().selectDataForReports(fetchingReports.getSelectWellbore(), "ANJUM-1");
	
	fetchingReports.selectUnitConversionOptions("feet");
	
	fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
	//fetchingReports.selectPrintReport();
	//fetchingReports.checkAllData()
	Thread.sleep(5000);
	fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "CSV","Multi");
	 Reporter.log("Report Generation is completed");
}
*/


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



//ContextSearch->Well Engineering/PT->Mechanical Well Data->Strings

	@Test(enabled=true)
	public void TC_001_contextSearch_StringReport_TabularWithDepthReference_DF_currentPage_Excel() throws Throwable{
		
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
		
		fetchingReports.fetchStringReportResult(true, "currentpage", "excel");
		//fetchingReports.getSelectStringPrintReport();
		 Reporter.log("Report Generation is completed");
		
	
	}
	
	
	/*@Test(enabled=true)
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

	}*/
	
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
	




	
	@Test(enabled=true)
	public void TC_004_contextSearch_StringReport_DatasheetWithDepthReference_DF() throws Throwable{
		
	
	 
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
			//fetchingReports.selectStringPrintReport();
			fetchingReports.fetchStringReportResult(true, "AllSubReports", "excel");
			//fetchingReports.getSelectStringPrintReport();
			 Reporter.log("Report Generation is completed");
		
		
		
	

	}
	
	@Test(enabled=true)
	public void TC_005_contextSearch_StringReport_TabularWithDepthReference_BF() throws Throwable{
		
	

	    homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		
		
		Reporter.log("Select the String report from Context Search");
		Thread.sleep(5000);
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
	public void TC_006_contextSearch_StringReport_TabularWithDepthReference_GL() throws Throwable{
	

	    homepage=new homePage(driver);
		
		homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
		homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
		homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
		contextsearch contextpage = homepage.selectText("Anjum*");
		
		
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
		
		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
		
		fetchingReports.getSelectTabular();
		fetchingReports.selectComponentInfo();
		fetchingReports.selectWirelineRetrievables();
		
	    //fetchingReports.getSelectAllResults().click();
		
		fetchingReports.fetchStringReportResult(true, "currentpage", "excel");
		//fetchingReports.getSelectStringPrintReport();
		 Reporter.log("Report Generation is completed");
	

	}
	
	
	@Test(enabled=true)
	public void TC_007_contextSearch_StringReport_TabularWithDepthReference_PDL() throws Throwable{
		
	
	 
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
		
		fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
		
		fetchingReports.getSelectTabular();
		fetchingReports.selectComponentInfo();
		fetchingReports.selectWirelineRetrievables();
		
	    //fetchingReports.getSelectAllResults().click();
		
		fetchingReports.fetchStringReportResult(true, "AllPages", "excel");
		//fetchingReports.getSelectStringPrintReport();
		 Reporter.log("Report Generation is completed");

	}
	
	
	@Test(enabled=true)
	public void TC_008_contextSearch_StringReport_DatasheetWithDepthReference_GL() throws Throwable{
		
	
	 
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
			
			fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
			
			fetchingReports.getSelectTabular();
			fetchingReports.selectComponentInfo();
			fetchingReports.selectWirelineRetrievables();
			
		    //fetchingReports.getSelectAllResults().click();
			
			fetchingReports.fetchStringReportResult(true, "AllPages", "excel");
			//fetchingReports.getSelectStringPrintReport();
			 Reporter.log("Report Generation is completed");

	}
	
	/*@Test(enabled=true)
	public void TC_009_contextSearch_StringReport_DatasheetWithDepthReference_PDL() throws Throwable{
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
			
			fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
			
			fetchingReports.getSelectTabular();
			fetchingReports.selectComponentInfo();
			fetchingReports.selectWirelineRetrievables();
			
		    //fetchingReports.getSelectAllResults().click();
			
			fetchingReports.selectStringPrintReport();
			//fetchingReports.getSelectStringPrintReport();
			 Reporter.log("Report Generation is completed");


	}
	
	*/
	
	
	
	
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
	
	
	/*@Test(enabled=true)
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
	*/
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
	/*@Test(enabled=true)
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
	}*/
	
	@Test(enabled=true)
	public void TC_005_contextSearch_WellHeadReport_All_CSV() throws Throwable{
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
			 fetchingReports fetchingReports = contextpage.selectreporting("Well Head");
			 //wait(30);
			 Thread.sleep(5000);
			 fetchingReports.switchWindows();
			// driver.manage().window().maximize();
			 Reporter.log("Wellhead Report Exported as Export selection = All,Export format=CSV");
			 fetchingReports.fetchWellheadReport(true, "All", "csv");
			 Reporter.log("Wellhead Report Exported Successfully");
	}
	
	
	/*@Test(enabled=true)
	public void TC_006_contextSearch_WellHeadReport_currentpage_CSV() throws Throwable{
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
			 fetchingReports fetchingReports = contextpage.selectreporting("Well Head");
			 //wait(30);
			 Thread.sleep(5000);
			 fetchingReports.switchWindows();
			// driver.manage().window().maximize();
			 Reporter.log("Wellhead Report Exported as Export selection = Currentpageonly,Export format=CSV");
			 fetchingReports.fetchWellheadReport(true, "currentpage", "csv");
			 Reporter.log("Wellhead Report Exported Successfully");
	}*/
	
	
	@Test(enabled=true)
	public void TC_007_contextSearch_WellHeadReport_fetchWithoutSelectallrecord() throws Throwable{
		   homepage=new homePage(driver);
			
			homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
			homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
			contextsearch contextpage = homepage.selectText("Anjum*");
			Thread.sleep(5000);
			Reporter.log("Export without select all");
			 contextpage.selectFewcheck();
			 contextpage.selectWellEngineering();
			 contextpage.selectMechanicalWellData();
			 fetchingReports fetchingReports = contextpage.selectreporting("Well Head");
			 //wait(30);
			 Thread.sleep(5000);
			 fetchingReports.switchWindows();
			// driver.manage().window().maximize();
			 fetchingReports.getShowparentWellbore();
			 fetchingReports.fetchWellheadReport(false, "currentpage", "excel");
			 wait(20);
			 Reporter.log("Pop of handled Successfully");		 
			 
}
	
	
	
	
	////ContextSearch->Well Engineering/PT->Mechanical Well Data->Hole Section(7)
	
	
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
	public void TC_002_contextSearch_HoleSections_Report_currentpage_excel_multi_DF() throws Throwable{
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
			 fetchingReports fetchingReports = contextpage.selectreporting("Hole Sections");
			 fetchingReports.switchWindows();
			fetchingReports.selectUnitConversionOptions_FromList("length","meters");
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"DF"); 
			 fetchingReports.FetchExportReportResult(true, "currentpage", "excel","Multi");
                     }	
	
	
	
	@Test(enabled=true)
	public void TC_003_contextSearch_HoleSections_Report_currentpage_excel_multi_GL() throws Throwable{
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
			 fetchingReports.selectUnitConversionOptions_FromList("length","meters");
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"GL "); 
			 fetchingReports.FetchExportReportResult(true, "currentpage", "excel","Multi");
                     }
	
	/*@Test(enabled=true)
	public void TC_004_contextSearch_HoleSections_Report_All_excel_single_DF() throws Throwable{
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
                     }*/
	
	@Test(enabled=true)
	public void TC_005_contextSearch_HoleSections_Report_All_excel_single_BF() throws Throwable{
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
			 fetchingReports.selectUnitConversionOptions_FromList("length","meters");
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"BF"); 
			 fetchingReports.FetchExportReportResult(true, "All", "excel","single");
                     }
	
	@Test(enabled=true)
	public void TC_006_contextSearch_HoleSections_Report_All_excel_single_GL() throws Throwable{
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
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"GL"); 
			 fetchingReports.FetchExportReportResult(true, "All", "excel","single");
                     }
	

	/*@Test(enabled=true)
	public void TC_007_contextSearch_HoleSections_Report_currentpage_excel_single_GL() throws Throwable{
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
			 fetchingReports.selectUnitConversionOptions_FromList("length","meters");
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"GL"); 
			 fetchingReports.FetchExportReportResult(false, "All", "excel","single");
                     }
	
	*/
	
	
	
	
	
	//ContextSearch->Well Engineering/PT->Mechanical Well Data->MechanicalContent(7)
	
	
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
	public void TC_002_contextSearch_MechanicalContent_Report_currentpage_excel_multi_DF() throws Throwable{
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
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"DF"); 
			 fetchingReports.FetchExportReportResult(true, "currentpage", "excel","Multi");
                     }	
	
	
	
	@Test(enabled=true)
	public void TC_003_contextSearch_MechanicalContent_Report_currentpage_excel_multi_GL() throws Throwable{
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
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"GL "); 
			 fetchingReports.FetchExportReportResult(true, "currentpage", "excel","Multi");
                     }
	
	@Test(enabled=true)
	public void TC_004_contextSearch_MechanicalContent_Report_All_excel_single_DF() throws Throwable{
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
	
	/*@Test(enabled=true)
	public void TC_005_contextSearch_MechanicalContent_Report_All_excel_single_BF() throws Throwable{
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
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"BF"); 
			 fetchingReports.FetchExportReportResult(true, "All", "excel","single");
                     }*/
	
	@Test(enabled=true)
	public void TC_006_contextSearch_MechanicalContent_Report_All_excel_single_GL() throws Throwable{
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
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"GL"); 
			 fetchingReports.FetchExportReportResult(true, "All", "excel","single");
                     }
	

	/*@Test(enabled=true)
	public void TC_007_contextSearch_MechanicalContent_Report_All_withoutselectall_excel_single_GL() throws Throwable{
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
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"GL"); 
			 fetchingReports.FetchExportReportResult(false, "All", "excel","single");
                     }
	*/
	
	
	
	
	
	
	
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
	
	
	//BF,DF,GF,PDL
	@Test(enabled=true)
	public void TC_002_contextSearch_Perforation_Report_currentpage_excel_single_BF() throws Throwable{
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
			 fetchingReports.switchWindows().selectDataForReports(fetchingReports. getselectWellbore_perforation(), "AllWelbore");
			 Thread.sleep(2000);
			 fetchingReports.selectUnitConversionOptions("feet");
			 fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
			 fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	
	}
	
	
	@Test(enabled=true)
	public void TC_003_contextSearch_Perforation_Report_currentpage_excel_single_PDL() throws Throwable{
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
			 fetchingReports.selectUnitConversionOptions("meters");
			 fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
			 fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	
	}
	@Test(enabled=true)
	public void TC_004_contextSearch_Perforation_Report_currentpage_excel_single_GL() throws Throwable{
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
			 fetchingReports.selectUnitConversionOptions("meters");
			 fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
			 fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","single");
	
	}

	
	
	
	@Test(enabled=true)
	public void TC_005_contextSearch_Perforation_Report_currentpage_excel_multi_DF() throws Throwable{
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
			 fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","Multi");
			
	}
	
	
	//BF,DF,GF,PDL
	@Test(enabled=true)
	public void TC_006_contextSearch_Perforation_Report_currentpage_excel_Multi_BF() throws Throwable{
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
			 fetchingReports.switchWindows().selectDataForReports(fetchingReports. getselectWellbore_perforation(), "AllWelbore");
			 Thread.sleep(2000);
			 fetchingReports.selectUnitConversionOptions("feet");
			 
			 fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
			 fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","Multi");
	
	}
	
/*	
	@Test(enabled=true)
	public void TC_007_contextSearch_Perforation_Report_currentpage_excel_multi_GL() throws Throwable{
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
			 fetchingReports.selectUnitConversionOptions("meters");
			 fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
			 fetchingReports.fetchHoldUpDepthReportResult(true, "currentpage", "excel","Multi");
	
	}
	
	
	
	
	
	@Test(enabled=true)
	public void TC_008_contextSearch_Perforation_Report_ALL_excel_All_DF() throws Throwable{
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
	*/
	
	//BF,DF,GF,PDL
	@Test(enabled=true)
	public void TC_009_contextSearch_Perforation_Report_ALL_excel_Single_BF() throws Throwable{
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
			 fetchingReports.switchWindows().selectDataForReports(fetchingReports. getselectWellbore_perforation(), "AllWelbore");
			 Thread.sleep(5000);
			 fetchingReports.selectUnitConversionOptions("feet");
			 fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"BF");
			 fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
	
	}
	
	
	@Test(enabled=true)
	public void TC_010_contextSearch_Perforation_Report__excel_All_single_PDL() throws Throwable{
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
			 fetchingReports.selectUnitConversionOptions("meters");
			 fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
			 fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
	
	}
	@Test(enabled=true)
	public void TC_011_contextSearch_Perforation_Report__excel_All_GL() throws Throwable{
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
			 fetchingReports.selectUnitConversionOptions("meters");
			 fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
			 fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","single");
	
	}

	
	
	
	@Test(enabled=true)
	public void TC_012_contextSearch_Perforation_Report_ALL_excel_multi_DF() throws Throwable{
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
			 fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
			
	}
	

	@Test(enabled=true)
	public void TC_013_contextSearch_Perforation_Report_ALL_excel_Multi_BF() throws Throwable{
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
			 fetchingReports.switchWindows().selectDataForReports(fetchingReports. getselectWellbore_perforation(), "AllWelbore");
			 Thread.sleep(2000);
			 fetchingReports.selectUnitConversionOptions("feet");
			 fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"PDL");
			 fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	
	}
	
	
	@Test(enabled=true)
	public void TC_014_contextSearch_Perforation_Report_ALL_excel_multi_GL() throws Throwable{
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
			 fetchingReports.selectUnitConversionOptions("meters");
			 fetchingReports.selectDataForReports(fetchingReports.getSelectDepthReference(),"GL");
			 fetchingReports.fetchHoldUpDepthReportResult(true, "All", "excel","Multi");
	
	}
	
	
	
	//ContextSearch->Well Engineering/PT->Mechanical Well Data->Wellbore Annuli(14)
	
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
	public void TC_002_contextSearch_WellboreAnnuli_Report_currentpage_excel_single_BF() throws Throwable{
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
			 fetchingReports.selectUnitConversionOptions_FromList("mass per volume","kg/m3");
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"BF");
			 //fetchingReports.getShowparentWellbore();
			 fetchingReports.getWellboreAnullichkAll();
			 fetchingReports.getExportIcon().click();
			 fetchingReports.GenericexportReport("currentpage", "excel","single");
			
  	                         }
	/*@Test(enabled=true)
	public void TC_003_contextSearch_WellboreAnnuli_Report_currentpage_excel_single_GL() throws Throwable{
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
			 fetchingReports.selectUnitConversionOptions_FromList("mass per volume","lbm/kgalUK");
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"GL");
			// fetchingReports.getShowparentWellbore();
			 fetchingReports.getWellboreAnullichkAll();
			 fetchingReports.getExportIcon().click();
			 fetchingReports.GenericexportReport("currentpage", "excel","single");
			
  	                         }*/
	
	@Test(enabled=true)
	public void TC_004_contextSearch_WellboreAnnuli_Report_currentpage_excel_multi_GL() throws Throwable{
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
	@Test(enabled=true)
	public void TC_005_contextSearch_WellboreAnnuli_Report_currentpage_excel_multi_DF() throws Throwable{
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
			 fetchingReports.selectUnitConversionOptions_FromList("mass per volume","kg/m3");
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"DF");
			// fetchingReports.getShowparentWellbore();
			 fetchingReports.getWellboreAnullichkAll();
			 fetchingReports.getExportIcon().click();
			 fetchingReports.GenericexportReport("currentpage", "excel","Multi");
			
  	                         }
	@Test(enabled=true)
	public void TC_006_contextSearch_WellboreAnnuli_Report_currentpage_excel_multi_BF() throws Throwable{
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
			 fetchingReports.selectUnitConversionOptions_FromList("length","feet");
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"BF");
			// fetchingReports.getShowparentWellbore();
			 fetchingReports.getWellboreAnullichkAll();
			 fetchingReports.getExportIcon().click();
			 fetchingReports.GenericexportReport("currentpage", "excel","Multi");
			
  	                         }
	
	/*@Test(enabled=true)
	public void TC_007_contextSearch_WellboreAnnuli_Report_currentpage_excel_multi_BF() throws Throwable{
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
			 fetchingReports.selectUnitConversionOptions_FromList("length","meters");
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"BF");
			 //fetchingReports.getShowparentWellbore();
			 fetchingReports.getWellboreAnullichkAll();
			 fetchingReports.getExportIcon().click();
			 fetchingReports.GenericexportReport("All", "excel","Multi");
			
  	                         }
	*/
	@Test(enabled=true)
	public void TC_008_contextSearch_WellboreAnnuli_Report_All_excel_single_DF() throws Throwable{
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
			 fetchingReports.GenericexportReport("All", "excel","single");
			
  	                         }
	
	@Test(enabled=true)
	public void TC_009_contextSearch_WellboreAnnuli_Report_All_excel_single_BF() throws Throwable{
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
			 fetchingReports.selectUnitConversionOptions_FromList("mass per volume","kg/m3");
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"BF");
			 //fetchingReports.getShowparentWellbore();
			 fetchingReports.getWellboreAnullichkAll();
			 fetchingReports.getExportIcon().click();
			 fetchingReports.GenericexportReport("All", "excel","single");
			
  	                         }
	@Test(enabled=true)
	public void TC_010_contextSearch_WellboreAnnuli_Report_All_excel_single_GL() throws Throwable{
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
			 fetchingReports.selectUnitConversionOptions_FromList("mass per volume","lbm/kgalUK");
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"GL");
			 //fetchingReports.getShowparentWellbore();
			 fetchingReports.getWellboreAnullichkAll();
			 fetchingReports.getExportIcon().click();
			 fetchingReports.GenericexportReport("All", "excel","single");
			
  	                         }
	
	/*@Test(enabled=true)
	public void TC_011_contextSearch_WellboreAnnuli_Report_All_excel_multi_GL() throws Throwable{
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
			// fetchingReports.getShowparentWellbore();
			 fetchingReports.getWellboreAnullichkAll();
			 fetchingReports.getExportIcon().click();
			 fetchingReports.GenericexportReport("All", "excel","Multi");
			
  	                         }*/
	@Test(enabled=true)
	public void TC_012_contextSearch_WellboreAnnuli_Report_All_excel_multi_DF() throws Throwable{
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
			 fetchingReports.selectUnitConversionOptions_FromList("mass per volume","kg/m3");
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"DF");
			// fetchingReports.getShowparentWellbore();
			 fetchingReports.getWellboreAnullichkAll();
			 fetchingReports.getExportIcon().click();
			 fetchingReports.GenericexportReport("All", "excel","Multi");
			
  	                         }
	@Test(enabled=true)
	public void TC_013_contextSearch_WellboreAnnuli_Report_All_excel_multi_BF() throws Throwable{
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
			 fetchingReports.selectUnitConversionOptions_FromList("length","feet");
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"BF");
			// fetchingReports.getShowparentWellbore();
			 fetchingReports.getWellboreAnullichkAll();
			 fetchingReports.getExportIcon().click();
			 fetchingReports.GenericexportReport("All", "excel","Multi");
			
  	                         }
	
	/*@Test(enabled=true)
	public void TC_014_contextSearch_WellboreAnnuli_Report_false_currentpage_excel_multi_BF() throws Throwable{
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
			 fetchingReports.selectUnitConversionOptions_FromList("length","meters");
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"BF");
			 fetchingReports.getShowparentWellbore();
			 Thread.sleep(10000); 
			 fetchingReports.getWellboreAnullichkAll();
			 fetchingReports.getExportIcon().click();
			 fetchingReports.GenericexportReport("All", "excel","single");
			
  	                         }
	
	*/


	
	//ContextSearch->Well Engineering/PT->Mechanical Well Data->fish(13)
	
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
	public void TC_002_contextSearch_FISH_Report_currentpage_excel_multi_DF() throws Throwable{
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
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"DF"); 
			 fetchingReports.FetchExportReportResult(true, "currentpage", "excel","Multi");
                     }
	@Test(enabled=true)
	public void TC_003_contextSearch_FISH_Report_currentpage_excel_multi_GL() throws Throwable{
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
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"GL"); 
			 fetchingReports.FetchExportReportResult(true, "currentpage", "excel","Multi");
                     }
	
	
	@Test(enabled=true)
	public void TC_004_contextSearch_FISH_Report_currentpage_excel_Single_DF() throws Throwable{
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
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"DF"); 
			 fetchingReports.FetchExportReportResult(true, "currentpage", "excel","single");
                     }
	
	
	
	
	@Test(enabled=true)
	public void TC_005_contextSearch_FISH_Report_currentpage_excel_Single_BF() throws Throwable{
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
			 fetchingReports.FetchExportReportResult(true, "currentpage", "excel","single");
                     }
	
	
	/**/@Test(enabled=true)
	public void TC_006_contextSearch_FISH_Report_currentpage_excel_Single_GL() throws Throwable{
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
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"GL"); 
			 fetchingReports.FetchExportReportResult(true, "currentpage", "excel","single");
                     }
	@Test(enabled=true)
	public void TC_007_contextSearch_FISH_Report_All_excel_multi_BF() throws Throwable{
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
	
	
	@Test(enabled=true)
	public void TC_008_contextSearch_FISH_Report_All_excel_multi_DF() throws Throwable{
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
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"DF"); 
			 fetchingReports.FetchExportReportResult(true, "All", "excel","Multi");
                     }
	@Test(enabled=true)
	public void TC_010_contextSearch_FISH_Report_All_excel_multi_GL() throws Throwable{
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
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"GL"); 
			 fetchingReports.FetchExportReportResult(true, "All", "excel","Multi");
                     }

	@Test(enabled=true)
	public void TC_012_contextSearch_FISH_Report_All_excel_Single_BF() throws Throwable{
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
			 fetchingReports.FetchExportReportResult(true, "All", "excel","single");
                     }
	
	
	@Test(enabled=true)
	public void TC_013_contextSearch_FISH_Report_All_excel_Single_GL() throws Throwable{
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
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"GL"); 
			 fetchingReports.FetchExportReportResult(true, "All", "excel","single");
                     }
	
	
	/*
	@Test(enabled=true)
	public void TC_011_contextSearch_FISH_Report_all_excel_Single_DF() throws Throwable{
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
			 fetchingReports.selectSubMenutFromList(fetchingReports.getDepthReference(), fetchingReports.getDepthReference_selection(),"DF"); 
			 fetchingReports.FetchExportReportResult(true, "All", "excel","single");
                     }
	*/
	
	
	
	/*@Test(enabled=true)
	public void TC_002_contextSearch_HoldUpDepthReport_TabularWithDepthReference_DF_currentPage_Excel_MultiSheet() throws Throwable{
		
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
	*/

 
 }