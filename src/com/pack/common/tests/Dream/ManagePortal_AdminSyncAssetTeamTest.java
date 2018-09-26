package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.managePortal_AdminSyncAssetTeam;
import com.pack.common.pageobjects.Dream.managePortal_ManageCountry;

public class ManagePortal_AdminSyncAssetTeamTest extends TestBaseSetup{
	
	
public managePortal_AdminSyncAssetTeam adminsyncasset ; 
	
		
	@Test(enabled=true)
	public void TC_067_ManagePortals_AdminSyncAssetTeam() throws Throwable {
		
		Reporter.log("Move The Cursor On Manage Portal");
		adminsyncasset= new managePortal_AdminSyncAssetTeam(driver);
		Reporter.log("Click on Admin Sync Asset Team under Manage Portal");
		adminsyncasset.manageTools(adminsyncasset.getlnkAdminSyncAssetTeam());
		adminsyncasset.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		Reporter.log("Click on link Click Here");
		Thread.sleep(3000);
		adminsyncasset.getlinkClickeHere().click();
		Thread.sleep(10000);
		adminsyncasset.getbtnEdit().click();
		Thread.sleep(2000);
		adminsyncasset.drpdownList(adminsyncasset.getlistStatus(),"Private");
		Thread.sleep(2000);
		adminsyncasset.getbtnUpdate().click();
		Thread.sleep(2000);
		adminsyncasset.getbtnEdit().click();
		Thread.sleep(2000);
		adminsyncasset.drpdownList(adminsyncasset.getlistStatus(),"Public");
		Thread.sleep(2000);
		adminsyncasset.getbtnUpdate().click();
		Thread.sleep(2000);
	}
	

}
