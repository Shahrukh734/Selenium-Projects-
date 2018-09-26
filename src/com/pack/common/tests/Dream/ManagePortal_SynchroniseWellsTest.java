package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.managePortal_AdminSyncAssetTeam;
import com.pack.common.pageobjects.Dream.managePortal_SynchroniseWells;

public class ManagePortal_SynchroniseWellsTest extends TestBaseSetup {
	
	
public managePortal_SynchroniseWells synchronisewell ; 
	
		
	@Test(enabled=true)
	public void TC_068_ManagePortals_SynchronisationwithCDS() throws Throwable {
		
		Reporter.log("Move The Cursor On Manage Portal");
		synchronisewell= new managePortal_SynchroniseWells(driver);
		Reporter.log("Click on Synchronise Well under Manage Portal");
		synchronisewell.manageTools(synchronisewell.getlnkSynchroniseWellse());
		synchronisewell.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		synchronisewell.getText(synchronisewell.getmsgSynchronisationCDS());
	}

}
