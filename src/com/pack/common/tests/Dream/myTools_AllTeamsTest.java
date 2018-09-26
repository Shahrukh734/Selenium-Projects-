package com.pack.common.tests.Dream;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;
import com.pack.common.pageobjects.Dream.myTools_AllTeams;

public class myTools_AllTeamsTest extends TestBaseSetup {
	
	public myTools_AllTeams allteams ; 
	
	public fetchingReports fetchingreports;
	
	@Test(enabled=true)
	public void TC_MyTools_AllTeams() throws Throwable{
		
		
		Reporter.log("Move The Cursor On My Tools");
		fetchingreports=new fetchingReports(driver);
		allteams= new myTools_AllTeams(driver);
		Reporter.log("Click on All Teams From My Tools");
		allteams.myToolsAllTeams(allteams.getlinkMyToolsAllTeams());
		Reporter.log("Click On Request New Team Button");
		allteams.getbtnRequestNewTeam().click();
		fetchingreports.switchWindows();
		Reporter.log("Enter the Details in New Request Team and Close the Window");
		allteams.gettxtTeamName().sendKeys("abc");
		allteams.drpdownTeamOwner(allteams.getTeamOwnerDrpdown(),"Md Mudassir Imam");
		allteams.gettxtPurpose().sendKeys("Testing");
		allteams.getbtnSubmit().click();
		fetchingreports.getAlert();
		allteams.switchToParentWindow();
	}
	//Donot Run this testcase there is a bug.
	@Test(enabled=false)
	public void TC_MyTools_AllTeams_AddRemoveFavourites() throws Throwable {
		
		Reporter.log("Move The Cursor On My Tools");
		fetchingreports=new fetchingReports(driver);
		allteams= new myTools_AllTeams(driver);
		Reporter.log("Click on All Teams From My Tools");
		allteams.myToolsAllTeamsWithoutFrame(allteams.getlinkMyToolsAllTeams());
		allteams.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		Thread.sleep(4000);
		allteams.SelectRecords(3);
		allteams.getbtnAddToFavorites().click();
		Thread.sleep(4000);
		allteams.getradiobtnFavourites().click();
		Thread.sleep(4000);
		allteams.SelectRecords(3);
		allteams.getbtnAddToFavorites().click();
	}
	
	@Test(enabled=true)
	public void TC_myTools_AllTeams_TeamFilter() throws Throwable {
		Reporter.log("Move The Cursor On My Tools");
		fetchingreports=new fetchingReports(driver);
		allteams= new myTools_AllTeams(driver);
		Reporter.log("Click on All Teams From My Tools");
		allteams.myToolsAllTeamsWithoutFrame(allteams.getlinkMyToolsAllTeams());
		allteams.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		Thread.sleep(4000);
		allteams.getimgExpandTeamFilter().click();
		allteams.drpdownTeamOwner(allteams.getlstTeamOwner(),"Babula Parida");
		allteams.getbtnApplyFilter().click();
		Thread.sleep(4000);
		String teamname=allteams.getText(allteams.getlnkTeamName());
		Thread.sleep(2000);
		allteams.getimgExpandTeamFilter().click();
		allteams.drpdownTeamOwner(allteams.getlstTeamName(),teamname);
		allteams.getbtnApplyFilter().click();
		Thread.sleep(2000);
	}

}
