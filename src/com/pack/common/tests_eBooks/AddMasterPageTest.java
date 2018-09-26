package com.pack.common.tests_eBooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects_eBooks.AddMasterPage;
import com.pack.common.pageobjects_eBooks.homePage;

public class AddMasterPageTest extends TestBaseSetup{
	
	//public  WebDriver driver;
	public homePage homepage ;


	
	@Test(enabled=true)
	public void TC_001_createMasterPage_Plot() throws Throwable{
		
		homepage = new homePage(driver);

		AddMasterPage newMasterPage = homepage.clickOnMasterPage().click_NewMasterPage();
		newMasterPage.enter_Name("Plot");
		newMasterPage.Enter_PageTitle("NusratMasterPage");
		newMasterPage.select_BookType("Well Book");
		newMasterPage.select_AssetType("Wellbore");
		newMasterPage.select_Discipline("Reservoir");
		newMasterPage.enter_ToolTip("Nusrat");
		Thread.sleep(3000);
		newMasterPage.select_ComponentToAdd("AWR – Well Summary","Wellbore Integrity");
		Thread.sleep(3000);
		newMasterPage.saveMasterPage();

	}
	
	
	@Test(enabled=true)
	public void TC_002_createMasterPage_Tabular() throws Throwable{
		
		homepage = new homePage(driver);

		AddMasterPage newMasterPage = homepage.clickOnMasterPage().click_NewMasterPage();
		newMasterPage.enter_Name("Tabular");
		newMasterPage.Enter_PageTitle("NusratMasterPage");
		newMasterPage.select_BookType("Well Book");
		newMasterPage.select_AssetType("Well");
		newMasterPage.select_Discipline("Reservoir");
		newMasterPage.enter_ToolTip("Nusrat");
		Thread.sleep(3000);
		newMasterPage.select_ComponentToAdd("AWR – Well Summary","Wellbore Integrity");
		Thread.sleep(3000);
		newMasterPage.saveMasterPage();

	}
	
	//@Test(enabled=true)
	public void EditMasterPage(String masterPage,String componentName) throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Edit Master Page", true);
		AddMasterPage newMasterPage = homepage.clickOnMasterPage().select_MasterPage(masterPage+"_"+java.time.LocalDate.now());
		
		Reporter.log("Added component to MasterPage", true);
		newMasterPage.Edit_ComponetToAdd(componentName);

		newMasterPage.saveMasterPage();
		Reporter.log(" Master Page is saved", true);
	}

	
}
