package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.ManagePortal_AdminEventExportType;
import com.pack.common.pageobjects.Dream.fetchingReports;


public class ManagePortal_AdminEventExportTypeTest extends TestBaseSetup {
	
	public ManagePortal_AdminEventExportType adminevent ; 
		
	@Test(enabled=true)
	public void TC_066_ManagePortals_AdminEventExportType() throws Throwable {
		
		Reporter.log("Move The Cursor On Manage Portal");
		adminevent= new ManagePortal_AdminEventExportType(driver);
		Reporter.log("Click on Admin Event Export Type under Manage Portal");
		adminevent.manageTools(adminevent.getlnkAdminExportEventTypes());
	}

}
