package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.ManagePortal_ManageBasins;
import com.pack.common.pageobjects.Dream.fetchingReports;


public class ManagePortal_ManageBasinTest extends TestBaseSetup {
	
	
public ManagePortal_ManageBasins managebasins ; 
	
	public fetchingReports fetchingreports;
	
	@Test(enabled=true)
	public void TC_064_ManagePortals_ManageBasins() throws Throwable {
		
		Reporter.log("Move The Cursor On Manage Portal");
		fetchingreports=new fetchingReports(driver);
		managebasins= new ManagePortal_ManageBasins(driver);
		Reporter.log("Click on Manage Basins under Manage Portal");
		managebasins.manageTools(managebasins.getlnkManageBasin());
		managebasins.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		Reporter.log("Click on Insert Button to add new Basin Name");
		managebasins.getbtnInsert().click();
		Thread.sleep(4000);
		managebasins.gettxtBasinName().sendKeys("Atlantic Basin123");
		managebasins.getchkbxActive().click();
		Reporter.log("Click on Update Button to add new Basin Name");
		managebasins.getbtnUpdate().click();
		Thread.sleep(2000);
		fetchingreports.getAlert();
		Thread.sleep(2000);
		Reporter.log("Click on Edit Button to make changes");
		managebasins.getbtnEdit().click();
		Thread.sleep(4000);
		managebasins.gettextBasinName().clear();
		Thread.sleep(2000);
		managebasins.gettextBasinName().sendKeys("Atlantic Basin321");
		managebasins.getbttnUpdate().click();
		Thread.sleep(2000);
		fetchingreports.getAlert();
		Thread.sleep(3000);
		Reporter.log("Click on Delete Button to delete Basin Name");
		managebasins.getbtnDelete().click();
		fetchingreports.getAlert();
		Thread.sleep(3000);
	}
	

}
