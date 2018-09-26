package com.pack.common.tests.Dream;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.managePortal_TeamManagement;
import com.pack.common.pageobjects.Dream.manageSED_EditEventTypes;


public class ManageSED_EditEventTypesTest extends TestBaseSetup{
	
	
public manageSED_EditEventTypes manageeditevent ; 
	
	public fetchingReports fetchingreports;
	
	@Test(enabled=true)
	public void TC_075_ManageSED_EditEventTypes() throws Throwable {
		
		Reporter.log("Move The Cursor On Manage SED");
		fetchingreports=new fetchingReports(driver);
		manageeditevent= new manageSED_EditEventTypes(driver);
		Reporter.log("Click on EditEventTypes under Manage SED");
		manageeditevent.manageSED(manageeditevent.getlnkEditEventTypes());
		manageeditevent.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		manageeditevent.getbtnInsert().click();
		Thread.sleep(2000);
		manageeditevent.gettxtEventTypeCode().sendKeys("AAAA");
		manageeditevent.gettxtEventTypeName().sendKeys("AA123");
		manageeditevent.drpdownList(manageeditevent.getlstGroupCode(), "SURV");
		Thread.sleep(2000);
		manageeditevent.gettxtEDMEventCode().sendKeys("12AAA");
		manageeditevent.getbtnUpdate().click();
		fetchingreports.getAlert();
		Thread.sleep(3000);
		manageeditevent.getclkTableEventType().click();
		Thread.sleep(2000);
		manageeditevent.getclkTableEventType().click();
		Thread.sleep(2000);
		//manageeditevent.typeCode("AAAA");
		manageeditevent.getbtnEdit().click();
		Thread.sleep(2000);
		manageeditevent.drpdownList(manageeditevent.getlistGroupCode(), "LIPT");
		manageeditevent.getbttnupdate().click();
		fetchingreports.getAlert();
		Thread.sleep(2000);
		manageeditevent.getbtnDelete().click();
		fetchingreports.getAlert();
		Thread.sleep(2000);
	}
	

}
