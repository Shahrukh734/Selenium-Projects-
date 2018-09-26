package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.CustomiseView;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

// anj-2 --> true--> c.p --> Excel

public class Customise_View extends TestBaseSetup {

	public homePage homepage;
	public CustomiseView customiseView;
	public fetchingReports fetchingreports;
   
	
		 // Custom View Apply 
		 
				@Test(enabled = true)
				public void TC_001_Customise_View_Apply() throws Throwable {

					Reporter.log("Custom View", true);
					homepage = new homePage(driver);
					customiseView = new CustomiseView(driver);
					fetchingreports = new fetchingReports(driver);

					Reporter.log("Browser Opened", true);
					homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
					homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
					homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
					contextsearch contextpage = homepage.selectText("Anjum*");
					
					customiseView.selectFrame();
					customiseView.btnShowDivClick();
					Reporter.log("Custom View Clicked", true);
					customiseView.btnShow();
					Reporter.log("Apply Clicked", true);
					
				} 
				 	
				// Custom View Apply and Save 
				 
				@Test(enabled = true)
				public void TC_002_Customise_View_Apply_Save() throws Throwable {

					Reporter.log("Custom View", true);
					homepage = new homePage(driver);
					customiseView = new CustomiseView(driver);
					fetchingreports = new fetchingReports(driver);

					Reporter.log("Browser Opened", true);
					homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
					homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
					homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
					contextsearch contextpage = homepage.selectText("Anjum*");
					customiseView.selectFrame();
					customiseView.btnShowDivClick();
					Reporter.log("Custom View Clicked", true);
					customiseView.btnSavenShow();
					Reporter.log("Apply and Save Clicked", true);
					
				} 
							
}