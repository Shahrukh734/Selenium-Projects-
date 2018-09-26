package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.managePortal_ManagePicksInterpreter;

public class ManagePortal_ManagePicksInterpreterTest extends TestBaseSetup {
	
	
public managePortal_ManagePicksInterpreter managepinterpreter ; 
	
	public fetchingReports fetchingreports;
	
	@Test(enabled=true)
	public void TC_065_ManagePortals_ManagePicksInterpreter() throws Throwable {
		
		Reporter.log("Move The Cursor On Manage Portal");
		fetchingreports=new fetchingReports(driver);
		managepinterpreter= new managePortal_ManagePicksInterpreter(driver);
		Reporter.log("Click on ManagePicksInterpreter under Manage Portal");
		managepinterpreter.manageTools(managepinterpreter.getlnkManagePicksInterpreter());
		managepinterpreter.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		Thread.sleep(3000);
		managepinterpreter.getbtnEdit().click();
		Thread.sleep(3000);
		managepinterpreter.gettxtTitle().clear();
		managepinterpreter.gettxtTitle().sendKeys("BCA");
		managepinterpreter.getchkbxActive().click();
		managepinterpreter.getbtnUpdate().click();
		fetchingreports.getAlert();
		Thread.sleep(2000);
	}
	

}
