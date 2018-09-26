package com.pack.common.tests_eBooks;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects_eBooks.AddMasterPage;
import com.pack.common.pageobjects_eBooks.MaintainBooks;
import com.pack.common.pageobjects_eBooks.MaintainGenericComponents;
import com.pack.common.pageobjects_eBooks.ebooks_BookViewer;
import com.pack.common.pageobjects_eBooks.homePage;

public class LogicalCombinationofPlots extends TestBaseSetup{
	
	public homePage homepage ;
	
	
	@Test(enabled=true)
	public void TC_001_LogicalPlots_ShowValueOnPLots() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Plot Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Plot");
		createComponents.clickOnCreate();
		createComponents.enter_PlotName("LogicalPlots_ShowValueOnPLots");
		createComponents.selectAssetType("Wellbore");
		createComponents.selectDataSource("GRSM");
		createComponents.select_PlotViews("IV_EB_PERFORMANCE_PLOT");
		createComponents.selectColumnToAdd_Plot().clickAddButton_Plot();
		createComponents.check_eBooks().select_GroupHeader();
		
		Reporter.log("Adding X-coordinates", true);
		createComponents.select_XaxisCoordinates("PRODUCTION_DATE", "Primary Bottom",null);
		
		Thread.sleep(4000);
		
		Reporter.log("Adding Y-coordinates", true);
		createComponents.select_YaxisCoordinates("ACC_NET_GAS_RATE", "Primary Left", "Line",null).select_toolTip(0).click_showValueOnPlot();
		createComponents.click_updateButton();

		Thread.sleep(4000);
		Reporter.log("Adding Y-coordinates", true);
		createComponents.click_AddNewButton_Y();
		createComponents.select_YaxisCoordinates("ACC_NET_OIL_RATE", "Secondary Left", "Line",null).select_toolTip(1).click_showValueOnPlot();
		createComponents.click_InsertButton();
		Thread.sleep(4000);
		
		Reporter.log("Adding Y-coordinates", true);
		createComponents.click_AddNewButton_Y();
		createComponents.select_YaxisCoordinates("CD_LIQUID_RATE", "Primary Right", "Spline",null).select_toolTip(1).click_showValueOnPlot();
		createComponents.click_InsertButton();
		Thread.sleep(4000);
		createComponents.button_Save();
		Reporter.log("Plot Report for view ......... is created", true);
		
		
		
		
		//Creating MasterPage
		
		Reporter.log("Adding Component to Master Page ", true);	
		AddMasterPage newMasterPage = homepage.clickOnMasterPage().click_NewMasterPage();
		newMasterPage.enter_Name("Plots_ShowValueOnPLots");
		newMasterPage.Enter_PageTitle("Plot_Wellbore");
		newMasterPage.select_BookType("Well Book");
		newMasterPage.select_AssetType("Wellbore");
		newMasterPage.select_Discipline("Reservoir Engineering (RE)");
		newMasterPage.enter_ToolTip("Plot_Wellbore");
		Thread.sleep(3000);
		newMasterPage.select_ComponentToAdd("Plots_ShowValueOnPLots",null);
		Thread.sleep(3000);
		newMasterPage.saveMasterPage();
		Thread.sleep(4000);
		Reporter.log("Master Page created", true);
		Reporter.log("Adding Chapters to Master Page", true);
		
		
		
		
		// Adding chapters to MasterPage
		
		Reporter.log("To select BookName from MaintainBooks");
		MaintainBooks selectBookName = homepage.clickOnMaintainBooks().selectBookName("Koula Wellbook 2015");
		
		Reporter.log("To AddMasterPageToChapters");
	    homePage addMasterPageToChapters = selectBookName.AddMasterPageToChapters("Wellbore","Plots_ShowValueOnPLots");
	     
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots_ShowValueOnPLots");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    ebookViewDetails.select_Page("Plots_ShowValueOnPLots");
		
	    
	}
	
	
	@Test(enabled=true)
	public void TC_002_LogicalPlots_ShowValueOnPLots_Uncheck() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Plot Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Plot");
		createComponents.clickOnCreate();
		createComponents.enter_PlotName("Plots_ShowValueOnPLots_uncheck");
		createComponents.selectAssetType("Wellbore");
		createComponents.selectDataSource("GRSM");
		createComponents.select_PlotViews("IV_EB_PERFORMANCE_PLOT");
		createComponents.selectColumnToAdd_Plot().clickAddButton_Plot();
		createComponents.check_eBooks().select_GroupHeader();
		
		Reporter.log("Adding X-coordinates", true);
		createComponents.select_XaxisCoordinates("PRODUCTION_DATE", "Primary Bottom",null);
		
		Thread.sleep(4000);
		
		Reporter.log("Adding Y-coordinates", true);
		createComponents.select_YaxisCoordinates("ACC_NET_GAS_RATE", "Primary Left", "Arealine",null).select_toolTip(2);
		createComponents.click_updateButton();

		Thread.sleep(4000);
		Reporter.log("Adding Y-coordinates", true);
		createComponents.click_AddNewButton_Y();
		createComponents.select_YaxisCoordinates("ACC_NET_OIL_RATE", "Secondary Left", "Line",null).select_toolTip(1);
		createComponents.click_InsertButton();
		Thread.sleep(4000);
		
		Reporter.log("Adding Y-coordinates", true);
		createComponents.click_AddNewButton_Y();
		createComponents.select_YaxisCoordinates("CD_LIQUID_RATE", "Primary Left", "Marker-Triangle",null).select_toolTip(3);
		createComponents.click_InsertButton();
		Thread.sleep(4000);
		createComponents.button_Save();
		Reporter.log("Plot Report for view ......... is created", true);
		
		
		// Creating MasterPage
		Reporter.log("Adding Component to Master Page ", true);	
		AddMasterPage newMasterPage = homepage.clickOnMasterPage().click_NewMasterPage();
		newMasterPage.enter_Name("Plots_ShowValueOnPLots_uncheck");
		newMasterPage.Enter_PageTitle("Plot_Wellbore");
		newMasterPage.select_BookType("Well Book");
		newMasterPage.select_AssetType("Wellbore");
		newMasterPage.select_Discipline("Reservoir Engineering (RE)");
		newMasterPage.enter_ToolTip("Plot_Wellbore");
		Thread.sleep(3000);
		newMasterPage.select_ComponentToAdd("Plots_ShowValueOnPLots_uncheck",null);
		Thread.sleep(3000);
		newMasterPage.saveMasterPage();
		Thread.sleep(4000);
		Reporter.log("Master Page created", true);
		Reporter.log("Adding Chapters to Master Page", true);
		
		
		// Adding chapters to MasterPage
		
		Reporter.log("To select BookName from MaintainBooks");
		MaintainBooks selectBookName = homepage.clickOnMaintainBooks().selectBookName("Koula Wellbook 2015");
		
		Reporter.log("To AddMasterPageToChapters");
	    homePage addMasterPageToChapters = selectBookName.AddMasterPageToChapters("Wellbore","Plots_ShowValueOnPLots_uncheck");
	     
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = addMasterPageToChapters.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots_ShowValueOnPLots_uncheck");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("Plots_ShowValueOnPLots_uncheck");
		
	}



	
	

}
