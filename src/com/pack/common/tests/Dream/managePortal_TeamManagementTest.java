package com.pack.common.tests.Dream;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.managePortal_TeamManagement;

public class managePortal_TeamManagementTest extends TestBaseSetup{
	
	
	public managePortal_TeamManagement manageportal ; 
	
	public fetchingReports fetchingreports;
	
	@Test(enabled=true)
	public void TC_062_ManagePortals_TeamManagement() throws Throwable {
		
		Reporter.log("Move The Cursor On Manage Portal");
		fetchingreports=new fetchingReports(driver);
		manageportal= new managePortal_TeamManagement(driver);
		Reporter.log("Click on Team Management under Manage Portal");
		manageportal.manageTools(manageportal.getlnkTeamManagement());
		manageportal.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		manageportal.getbtnNewTeam().click();
		Thread.sleep(2000);
		manageportal.gettxtTEAMNAME().sendKeys("Automation");
		manageportal.drpdownSelection(manageportal.getlstTeamOwner(),"Md Mudassir Imam");
		manageportal.drpdownSelection(manageportal.getdrpdownMapBookmark(),"AnjumData");
		manageportal.drpdownSelection(manageportal.getdrpdownAssetOwner(),"CENTRAL");
		manageportal.getbtnSave().click();
		Thread.sleep(5000);
		manageportal.teamName("Automation",4);
		Thread.sleep(5000);
		manageportal.drpdownSelection(manageportal.getdrpdownAssetOwner(),"LAND");
		manageportal.getbtnSave().click();
		Thread.sleep(5000);
		manageportal.addRemoveStaff("Automation");
		Thread.sleep(5000);
		manageportal.drpdownSelection(manageportal.getlistUsers(),"Sidheswar Kanungo");
		Thread.sleep(2000);
		manageportal.getbtndualManageStaff_MoveRight().click();
		manageportal.getbtncmdSave().click();
//		Thread.sleep(5000);
//		fetchingreports.selectExportoptionsAdmin("Current Page Only","excel");
		Thread.sleep(5000);
		manageportal.addRemoveStaff("Automation");
		Thread.sleep(5000);
		manageportal.drpdownSelection(manageportal.getlistStaffinTeam(),"Sidheswar.Kanungo");
		Thread.sleep(2000);
		manageportal.getbtndualManageStaff_MoveLeft().click();
		manageportal.getbtncmdSave().click();
//		Thread.sleep(5000);
//		fetchingreports.selectExportoptionsAdmin("Current Page Only","excel");
		Thread.sleep(5000);
		manageportal.deleteTeam("Automation");
		fetchingreports.getAlert();
	}
	

}
