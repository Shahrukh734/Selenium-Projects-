package com.pack.common.tests.Dream;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.manageSED_EditEventTypes;
import com.pack.common.pageobjects.Dream.manageSED_EditOwners;

public class ManageSED_EditOwnersTest extends TestBaseSetup {
	
	
public manageSED_EditOwners manageeditowners ; 
	
	public fetchingReports fetchingreports;
	
	@Test(enabled=true)
	public void TC_073_ManageSED_EditOwners () throws Throwable {
		
		Reporter.log("Move The Cursor On Manage SED");
		fetchingreports=new fetchingReports(driver);
		manageeditowners= new manageSED_EditOwners(driver);
		Reporter.log("Click on Edit Owners under Manage SED");
		manageeditowners.manageSED(manageeditowners.getlnkEditOwners());
		manageeditowners.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		manageeditowners.getbtnInsert().click();
		Thread.sleep(2000);
		manageeditowners.gettxtID().sendKeys("99");
		manageeditowners.gettxtName().sendKeys("AAAA");
		manageeditowners.gettxtDiscipline().sendKeys("PT");
		manageeditowners.drpdownList(manageeditowners.getlstActive(), "N");
		manageeditowners.getbtnUpdate().click();
		fetchingreports.getAlert();
		Thread.sleep(3000);
		manageeditowners.getlnkName().click();
		Thread.sleep(3000);
		manageeditowners.getlnkName().click();
		Thread.sleep(3000);
		manageeditowners.getbtnEdit().click();
		Thread.sleep(3000);
		manageeditowners.drpdownList(manageeditowners.getlstActive(), "Y");
		manageeditowners.getbtnUpdate().click();
		fetchingreports.getAlert();
		Thread.sleep(3000);
		manageeditowners.getbtnDelete().click();
		fetchingreports.getAlert();
		Thread.sleep(3000);
	}
	

}
