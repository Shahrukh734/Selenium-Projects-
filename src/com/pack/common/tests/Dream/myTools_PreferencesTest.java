package com.pack.common.tests.Dream;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.myTools_Preferences;

public class myTools_PreferencesTest extends TestBaseSetup{
	
	public myTools_Preferences preferences;
	public fetchingReports fetchingreports;
	
	@Test(enabled=true)
	public void TC_MyTools_Preferences() throws Throwable{
		
		
		Reporter.log("Move The Cursor On My Tools");
		fetchingreports=new fetchingReports(driver);
		preferences= new myTools_Preferences(driver);
		Reporter.log("Click on Preferences From My Tools");
		preferences.myToolsPreferences(preferences.getlinkMyToolsMyPreferences());
		fetchingreports.switchWindows();
		preferences.getbtnReset().click();
		preferences.drpdownList(preferences.getdrpdownDefaultResultDisplay(),"Datasheet");
		preferences.drpdownList(preferences.getdrpdownUnitGroup(),"angular velocity");
		preferences.getbttnUnit().click();
		preferences.drpdownList(preferences.getdrpdowncboCountry(),"FRANCE");
		preferences.drpdownList(preferences.getdrpdownDefaultAssetOwner(),"CENTRAL");
		preferences.drpdownList(preferences.getdrpdownDefaultDreamAsset(),"Field");
		preferences.drpdownList(preferences.getdrpdownDefaultSEDAsset(),"Field");
		preferences.drpdownList(preferences.getdrpdownDefaultColumn(),"Field Identifier");
		preferences.drpdownList(preferences.getdrpdownRecordsPerPage(),"500");
		preferences.drpdownList(preferences.getdrpdownBasin(),"Park Basin");
		preferences.drpdownList(preferences.getdrpdownSearchCollection(),"Expanded");
		preferences.drpdownList(preferences.getdrpdownDefaulteBookDisplay(),"All");
		preferences.drpdownList(preferences.getdrpdownDefaultFIlterView(),"Expanded");
		preferences.gettxtTitle().sendKeys("wrfm");
		preferences.gettxtURL().sendKeys("https://wrfm-ssw-uie-st.sharing.shell.com/App/Dream/Home.aspx#");
		preferences.getbtnSubmit().click();
		preferences.getText(preferences.gettxtMessage());
		preferences.getbtnClose().click();
		fetchingreports.switchWindows();
		driver.navigate().refresh();
		preferences.subMenuLink(preferences.getlinkMyToolsMyLinksSubmenu());
						
	}
	
	
}
