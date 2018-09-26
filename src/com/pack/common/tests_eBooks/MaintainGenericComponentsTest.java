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
import com.pack.common.pageobjects_eBooks.MaintainGenericComponents;
import com.pack.common.pageobjects_eBooks.homePage;

public class MaintainGenericComponentsTest extends TestBaseSetup{
	
	//public  WebDriver driver;
	public homePage homepage ;


	
	@Test(enabled=true,priority=1)
	public void TC_001_createGenericComponent_wellSummary_wellbore() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Tabular Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Tabular");
		createComponents.clickOnCreate();
		createComponents.enterName("wellSummary");
		createComponents.selectAssetType("Wellbore");
		createComponents.selectDataSource("GRSM");
		createComponents.selectView("IV_WELL_SUMMARY_WC");
		createComponents.selectColumnToAdd().click_AddButton();
		createComponents.check_eBooks().select_GroupHeader().button_Preview();
		createComponents.validate_PreviewSection();
		createComponents.button_Save();
		
		Reporter.log("Tabular Report for view ......... is created", true);

	}
	
	@Test(enabled=false,priority=2)
	public void TC_002_createGenericComponent_wellIntegrity_wellbore() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Tabular Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Tabular");
		createComponents.clickOnCreate();
		createComponents.enterName("wellInterity");
		createComponents.selectAssetType("Wellbore");
		createComponents.selectDataSource("GRSM");
		createComponents.selectView("IV_WELL_INTEGRITY_WC");
		createComponents.selectColumnToAdd().click_AddButton();
		createComponents.check_eBooks().select_GroupHeader().button_Preview().validate_PreviewSection();
		createComponents.button_Save();
		
		Reporter.log("Tabular Report for view ......... is created", true);

	}
	
	
	
	@Test(enabled=false,priority=3)
	public void TC_003_createGenericComponent_wellSummary_well() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Tabular Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Tabular");
		createComponents.clickOnCreate();
		createComponents.enterName("wellSummary");
		createComponents.selectAssetType("Well");
		createComponents.selectDataSource("GRSM");
		createComponents.selectView("IV_WELL_SUMMARY_WC");
		createComponents.selectColumnToAdd().click_AddButton();
		createComponents.check_eBooks().select_GroupHeader().button_Preview();
		createComponents.validate_PreviewSection();
		createComponents.button_Save();
		
		Reporter.log("Tabular Report for view ......... is created", true);

	}
	
	@Test(enabled=false,priority=4)
	public void TC_004_createGenericComponent_wellIntegrity_well() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Tabular Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Tabular");
		createComponents.clickOnCreate();
		createComponents.enterName("wellInterity");
		createComponents.selectAssetType("Well");
		createComponents.selectDataSource("GRSM");
		createComponents.selectView("IV_WELL_INTEGRITY_WC");
		createComponents.selectColumnToAdd().click_AddButton();
		createComponents.check_eBooks().select_GroupHeader().button_Preview().validate_PreviewSection();
		createComponents.button_Save();
		
		Reporter.log("Tabular Report for view ......... is created", true);

	}
	
	@Test(enabled=false,priority=5)
	public void TC_005_createGenericComponent_wellIntegrity_well_Reset() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Tabular Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Tabular");
		createComponents.clickOnCreate();
		createComponents.enterName("wellInterity");
		createComponents.selectAssetType("Well");
		createComponents.selectDataSource("GRSM");
		createComponents.selectView("IV_WELL_INTEGRITY_WC");
		createComponents.selectColumnToAdd().click_AddButton();
		createComponents.check_eBooks().select_GroupHeader();
		createComponents.button_Reset();
		
		Reporter.log("Tabular Report for view ......... is Reset", true);

	}
	
	
	@Test(enabled=false,priority=6)
	public void TC_006_createGenericComponent_wellIntegrity_wellbore_Reset() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Tabular Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Tabular");
		createComponents.clickOnCreate();
		createComponents.enterName("wellInterity");
		createComponents.selectAssetType("Wellbore");
		createComponents.selectDataSource("GRSM");
		createComponents.selectView("IV_WELL_INTEGRITY_WC");
		createComponents.selectColumnToAdd().click_AddButton();
		createComponents.check_eBooks().select_GroupHeader().button_Reset();
		createComponents.button_Save();
		
		Reporter.log("Tabular Report for view ......... is Reset", true);

	}
	
	
	
	
	
	

	
	@Test(enabled=false)
	public void TC_002_createGenericComponent_PlotrReport() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Plot Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Plot");
		createComponents.clickOnCreate();
		createComponents.enterName("Injection Plot");
		createComponents.selectAssetType("Wellbore");
		createComponents.selectDataSource("GRSM");
		createComponents.selectView("IV_EB_PERFORMANCE_PLOT");
		createComponents.selectColumnToAdd().click_AddButton();
		createComponents.check_eBooks().select_GroupHeader().button_Preview();
		createComponents.button_Save();
		
		Reporter.log("Tabular Report for view ......... is created", true);

	}

	
	
	
	
	

	
}
