package com.pack.common.tests.Dream;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.managePortal_ManageCountry;
import com.pack.common.pageobjects.Dream.managePortal_TeamManagement;

public class managePortal_manageCountrryTest extends TestBaseSetup{
	
public managePortal_ManageCountry managecountry ; 
	
	public fetchingReports fetchingreports;
	
	@Test(enabled=true)
	public void TC_063_ManagePortals_Country() throws Throwable {
		
		Reporter.log("Move The Cursor On Manage Portal");
		fetchingreports=new fetchingReports(driver);
		managecountry= new managePortal_ManageCountry(driver);
		Reporter.log("Click on Manage Country under Manage Portal");
		managecountry.manageTools(managecountry.getlnkManagecountry());
		managecountry.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		Reporter.log("Click on Insert Button to add new Country");
		Thread.sleep(6000);
		managecountry.getbtnInsert().click();
		Thread.sleep(6000);
		Reporter.log("Enter Countryname and Countrycode");
		managecountry.gettxtCountryName().sendKeys("ARGENTINA123");
		managecountry.gettxtCountryCode().sendKeys("ARGENTINA123");
		Reporter.log("Click on Active Choice checkbox");
		managecountry.getchkbxActive_Choice().click();
		Thread.sleep(3000);
		Reporter.log("Click on Add Button to add new Countryname and Countrycode");
		managecountry.getbtnadd().click();
		Thread.sleep(3000);
		fetchingreports.getAlert();
		Thread.sleep(2000);
		Reporter.log("Click on Edit Button to edit");
		managecountry.getbtnEdit().click();
		managecountry.gettxtUpdateCountryCode().clear();
		Thread.sleep(2000);
		managecountry.gettxtUpdateCountryCode().sendKeys("ARGENTINA321");
		Thread.sleep(3000);
		Reporter.log("Click on Update Button to save the changes");
		managecountry.getbtnUpdate().click();
		Thread.sleep(2000);
		fetchingreports.getAlert();
		Thread.sleep(2000);
		Reporter.log("Click on Edit Button ");
		managecountry.getbtnEdit().click();
		managecountry.gettxtUpdateCountryCode().clear();
		Thread.sleep(2000);
		managecountry.gettxtUpdateCountryCode().sendKeys("ARGENTINA312");
		Reporter.log("Click on Cancel Button");
		Thread.sleep(3000);
		managecountry.getbtnCancel().click();
		Thread.sleep(3000);
		Reporter.log("Click on Delete Button to Delete the Countryname");
		managecountry.getbtnDelete().click();
		Thread.sleep(2000);
		fetchingreports.getAlert();
		Thread.sleep(2000);
	
	}

}
