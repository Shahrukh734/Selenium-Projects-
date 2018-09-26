package com.pack.common.tests.Dream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.manageSED_EditGroups;
import com.pack.common.pageobjects.Dream.manageSED_EditOwners;

public class ManageSED_EditGroupsTest2 extends TestBaseSetup{
	
public manageSED_EditGroups manageedgroups ; 
	
	public fetchingReports fetchingreports;
	 
	// Do not Run there is a Bug 
	@Test(enabled=true)
	public void TC_076_ManageSED_EditGroups () throws Throwable {
		
		Reporter.log("Move The Cursor On Manage SED");
		fetchingreports=new fetchingReports(driver);
		manageedgroups= new manageSED_EditGroups(driver);
		Reporter.log("Click on Edit Groups under Manage SED");
		manageedgroups.manageSED(manageedgroups.getlnkEditGroups());
		manageedgroups.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		manageedgroups.getbtnInsert().click();
		Thread.sleep(3000);
		manageedgroups.gettxtGroupName().sendKeys("AAAA");
		manageedgroups.drpdownList(manageedgroups.getlstGroupId(), "OTHR");
		Thread.sleep(2000);
		manageedgroups.getbtnUpdate().click();
		fetchingreports.getAlert();
		Thread.sleep(3000);
		
		
	}

}
