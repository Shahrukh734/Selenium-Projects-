package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;


  /**TestScript Designed On 04/04/2018
    TestScript Designed By Mudassir */

public class fetchingReportsTest_BHTWellTestReports extends TestBaseSetup{

	
	public homePage homepage ;
	
	//	ContextSearch->Documents->BHTWellTestreports
		
		
		

         // BHTWellTestreports 
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
public void TC_002_contextSearch_BHTWellTestreports_currentPage_CSV() throws Throwable{
	
    Reporter.log("BHTWellTestreports"); 
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	
	
    contextsearch contextpage = homepage.selectText("Anjum*");
 	
	
	contextsearch selectBHTWellTestReports = contextpage.selectAllcheck().selectDocuments().selectBHTWellTestReports();
	
	fetchingReports fetchingReports = selectBHTWellTestReports.selectreporting("BHTWellTestReports");
	

	fetchingReports.switchWindows();
	
	fetchingReports.exportClick().selectExportoptions("currentpage","CSV");
	
	
	

}

@Test(enabled=true)
public void TC_003_contextSearch_BHTWellTestreports_Print() throws Throwable{
	
    Reporter.log("BHTWellTestreports"); 
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	
	
    contextsearch contextpage = homepage.selectText("Anjum*");
 	
	
	contextsearch selectBHTWellTestReports = contextpage.selectAllcheck().selectDocuments().selectBHTWellTestReports();
	
	fetchingReports fetchingReports = selectBHTWellTestReports.selectreporting("BHTWellTestReports");
	

	fetchingReports.switchWindows();
	
	fetchingReports.getPrintIcon().click();
	 
		}
       

}
