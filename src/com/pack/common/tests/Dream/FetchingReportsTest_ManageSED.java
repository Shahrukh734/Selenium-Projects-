package com.pack.common.tests.Dream;



import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.ManageSED_ECDefermentCodes;
import com.pack.common.pageobjects.Dream.ManageSED_ECPackerStatusCodes;
import com.pack.common.pageobjects.Dream.ManageSED_EditResourceTypes;
import com.pack.common.pageobjects.Dream.fetchingReports;



   
   public class FetchingReportsTest_ManageSED extends TestBaseSetup{
	
	public ManageSED_ECDefermentCodes ManageSED;
	public ManageSED_ECPackerStatusCodes ManageSED_PS;
	public ManageSED_EditResourceTypes ManageSED_RT;
	public fetchingReports fetchingreports;




	@Test(enabled = true)
	public void TC_ManageSED_EcDefermentCodes_01_insertRecord() throws InterruptedException{
		
		Reporter.log("Move The Cursor On  Manage SED");
		fetchingreports=new fetchingReports(driver);
		ManageSED = new ManageSED_ECDefermentCodes(driver);
		
		ManageSED.SelectManageSED(ManageSED.getEditECDefermentCodes());
		ManageSED.Swichframe();
		ManageSED.getbtnInsert().click();
		ManageSED.WaitTime();
		ManageSED.EntertxtECCODE().sendKeys(ManageSED_ECDefermentCodes.RandomString(4));
		ManageSED.WaitTime();
		ManageSED.selectdropdown("ACID");
		ManageSED.WaitTime();
		ManageSED.gebtnUpdate().click();
		ManageSED.isAlertPresent();
		
	}
	

	@Test(enabled = true)
	public void TC_ManageSED_EcDefermentCodes_02_EditRecord_cancel_delete() throws InterruptedException{
		fetchingreports=new fetchingReports(driver);
		ManageSED = new ManageSED_ECDefermentCodes(driver);
		ManageSED.SelectManageSED(ManageSED.getEditECDefermentCodes());
		ManageSED.Swichframe();
		ManageSED.getbtnEdit().click();
		ManageSED.WaitTime();
		ManageSED.EntertxtECCODE().clear();
		ManageSED.EntertxtECCODE().sendKeys(ManageSED_ECDefermentCodes.RandomString(9));
		ManageSED.WaitTime();
		ManageSED.gebtnUpdate().click();
		ManageSED.isAlertPresent();
		ManageSED.getbtnEdit().click();;
		ManageSED.WaitTime();
		ManageSED.EntertxtECCODE().sendKeys("TEXT change");
		ManageSED.WaitTime();
		ManageSED.gebtnCancel().click();
		ManageSED.WaitTime();
		ManageSED.getbtnDelete().click();
		ManageSED.isAlertPresent();

	}
	
	
	
	//EC Packer Status Codes(Inconsistent issue records are not getting added)
	
	@Test(enabled = true)
	public void TC_ManageSED_ECPackerStatusCodes_01_insert() throws InterruptedException{
		Reporter.log("Move The Cursor On  Manage SED");
		fetchingreports=new fetchingReports(driver);
		ManageSED = new ManageSED_ECDefermentCodes(driver);
		ManageSED.SelectManageSED(ManageSED.getEdit_EC_Packer_Status());
		ManageSED_PS = new ManageSED_ECPackerStatusCodes (driver);
		ManageSED_PS.Swichframe();
		ManageSED_PS.getbtnInsert().click();
		ManageSED.WaitTime();
		ManageSED_PS.getxtECODE().sendKeys(ManageSED_ECDefermentCodes.RandomString(4));
		ManageSED_PS.WaitTime();
		ManageSED_PS.selectdropdown("ACID");
		ManageSED_PS.WaitTime();
		ManageSED_PS.gebtnUpdate().click();
		ManageSED_PS.isAlertPresent();
		driver.navigate().refresh();
}
   
   
   
   
   
   
   // Need to be Run Separately as Sometimes records are getting added some times not.
   @Test(enabled = true)
	public void TC_ManageSED_ECPackerStatusCodes_02_EditRecord_cancel_delete() throws InterruptedException{
		fetchingreports=new fetchingReports(driver);
		ManageSED = new ManageSED_ECDefermentCodes(driver);
		ManageSED.SelectManageSED(ManageSED.getEdit_EC_Packer_Status());
		ManageSED_PS = new ManageSED_ECPackerStatusCodes (driver);
		ManageSED.Swichframe();
		ManageSED_PS.getbtnEdit().click();
		//ManageSED_PS.getxtECODE().clear();
		ManageSED_PS.WaitTime();
		ManageSED_PS.gebtnUpdate().click();
		ManageSED_PS.isAlertPresent();
		ManageSED_PS.getbtnEdit().click();;
		ManageSED_PS.WaitTime();
		ManageSED_PS.gebtnCancel().click();
		ManageSED_PS.WaitTime();
		ManageSED_PS.getbtnDelete().click();
		ManageSED_PS.isAlertPresent();

	}
   
   //Manage SED-->EditRecourseType
   
   @Test(enabled=true)
	public void TC_EditRecourseType_01_insert() throws InterruptedException{
		Reporter.log("Move The Cursor On  Manage SED");
		fetchingreports=new fetchingReports(driver);
		ManageSED = new ManageSED_ECDefermentCodes(driver);
		ManageSED.SelectManageSED(ManageSED.getEdit_Resource_Types());
	    ManageSED_RT = new ManageSED_EditResourceTypes (driver);
	    ManageSED_RT.Swichframe();
	    ManageSED_RT.getbtnInsert().click();
	    ManageSED.WaitTime();
	    String ABBRV=ManageSED_RT.RandomString(5);
	    ManageSED.WaitTime();
	    ManageSED_RT.getABBREV().sendKeys(ABBRV);
	    ManageSED.WaitTime();
	    String DESC=ManageSED_RT.RandomString(5);
	    ManageSED.WaitTime();
	    ManageSED_RT.getDescription().sendKeys(DESC);
	    ManageSED_RT.gebtnUpdate().click();
	    ManageSED_RT.isAlertPresent();
		driver.navigate().refresh();
}
   
   @Test(enabled = true)
	public void TC_EditRecourseType_01_Edit_cancel_Delete() throws InterruptedException{
		Reporter.log("Move The Cursor On  Manage SED");
		fetchingreports=new fetchingReports(driver);
		ManageSED = new ManageSED_ECDefermentCodes(driver);
		ManageSED.SelectManageSED(ManageSED.getEdit_Resource_Types());
	    ManageSED_RT = new ManageSED_EditResourceTypes (driver);
	    ManageSED_RT.Swichframe();
	    ManageSED_RT.getbtnEdit().click();
	    ManageSED_RT.gebtnCancel().click();
	    ManageSED_RT.getbtnDelete().click();    
   }
   
   }
	