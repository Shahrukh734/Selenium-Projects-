package com.pack.common.tests_eBooks;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects_eBooks.AddMasterPage;
import com.pack.common.pageobjects_eBooks.MaintainBooks;
import com.pack.common.pageobjects_eBooks.MaintainGenericComponents;
import com.pack.common.pageobjects_eBooks.ebooks_BookViewer;
import com.pack.common.pageobjects_eBooks.homePage;

public class DataLimitation extends TestBaseSetup{
	
	public homePage homepage ;
	
	
	@BeforeClass
	public void createMasterPage() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Adding Component to Master Page ", true);	
		AddMasterPage newMasterPage = homepage.clickOnMasterPage().click_NewMasterPage();
		newMasterPage.enter_Name("DataLimitationNew2");
		newMasterPage.Enter_PageTitle("Plot_Wellbore");
		newMasterPage.select_BookType("Well Book");
		newMasterPage.select_AssetType("Wellbore");
		newMasterPage.select_Discipline("Reservoir Engineering (RE)");
		newMasterPage.enter_ToolTip("Plot_Wellbore");
		Thread.sleep(3000);
		newMasterPage.select_ComponentToAdd("plot",null);
		Thread.sleep(3000);
		newMasterPage.saveMasterPage();
		Thread.sleep(4000);
		Reporter.log("Master Page created", true);
		Reporter.log("Adding Chapters to Master Page", true);
		
		// Adding Page to chapters
		
		Reporter.log("To select BookName from MaintainBooks");
		MaintainBooks selectBookName = homepage.clickOnMaintainBooks().selectBookName("Malampaya Wellbook 2017");
		
		Reporter.log("To AddMasterPageToChapters");
	    homePage addMasterPageToChapters = selectBookName.UniqueAddMasterPageToChapters("Wellbore","Malampaya-6");
	    
	}
	
	
	public void EditMasterPage(String masterPage,String componentName) throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Edit Master Page", true);
		AddMasterPage newMasterPage = homepage.clickOnMasterPage().select_MasterPage(masterPage+"_"+java.time.LocalDate.now());
		
		Reporter.log("Added component to MasterPage", true);
		newMasterPage.Edit_ComponetToAdd(componentName);

		newMasterPage.saveMasterPage();
		Reporter.log(" Master Page is saved", true);
	}
	
	@Test(enabled=true)
	public void TC_001_DataLimitation_ShowValueOnPlot_SelectDateRange() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Plot Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Plot");
		createComponents.clickOnCreate();
		createComponents.enter_PlotName("DataLimitation_Plot1");
		createComponents.selectAssetType("Wellbore");
		createComponents.selectDataSource("GRSM");
		createComponents.select_PlotViews("IV_EB_PERFORMANCE_PLOT_DAY");
		createComponents.selectColumnToAdd_Plot().clickAddButton_Plot();
		createComponents.check_eBooks().select_GroupHeader();
		createComponents.click_EnableDatePeriod();
		createComponents.select_EnableDateRange("PRODUCTION_DATE");
		
		Reporter.log("Adding X-coordinates", true);
		createComponents.select_XaxisCoordinates("PRODUCTION_DATE","Primary Bottom",null);
		
		Thread.sleep(4000);
		
		Reporter.log("Adding Y-coordinates", true);
		createComponents.select_YaxisCoordinates("ACC_NET_GAS_RATE", "Primary Left", "Line",null).select_toolTip(0).click_showValueOnPlot();
		createComponents.getclick_YaxisUpdate();
		Thread.sleep(4000);
		
		Reporter.log("Adding Y-coordinates", true);
		createComponents.click_AddNewButton_Y();
		Thread.sleep(4000);
		createComponents.select_YaxisCoordinates("ACC_NET_OIL_RATE","Secondary Left", "Arealine",null).select_toolTip(1).click_showValueOnPlot();
		createComponents.click_InsertButton();

		Thread.sleep(4000);
		//createComponents.click_InsertButton();
		createComponents.button_Save();
		Thread.sleep(4000);
		Reporter.log("Plot Report for view ......... is created", true);
		
		
		// Edit  MasterPage for adding new component
		
		EditMasterPage("DataLimitationNew2","DataLimitation_Plot1");
		
	//selecting book 
		
		 Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Malampaya Wellbook 2017");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("DataLimitationNew2");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("DataLimitationNew2");
		
		
	}
	
	
	@Test(enabled=false)
	public void TC_002_DataLimitation_EnableZoom() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Plot Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Plot");
		createComponents.clickOnCreate();
		createComponents.enter_PlotName("DataLimitation_Plot");
		createComponents.selectAssetType("Wellbore");
		createComponents.selectDataSource("GRSM");
		createComponents.select_PlotViews("IV_EB_PERFORMANCE_PLOT_DAY");
		createComponents.selectColumnToAdd_Plot().clickAddButton_Plot();
		createComponents.check_eBooks().select_GroupHeader();
		createComponents.clickEnableZoom();
		
		Reporter.log("Adding X-coordinates", true);
		createComponents.select_XaxisCoordinates("PRODUCTION_DATE","Primary Bottom",null);
		
		Thread.sleep(4000);
		
		Reporter.log("Adding Y-coordinates", true);
		createComponents.select_YaxisCoordinates("ACC_NET_GAS_RATE", "Primary Left", "Line",null).select_toolTip(0).click_showValueOnPlot();
		createComponents.getclick_YaxisUpdate();
		Thread.sleep(4000);
		
		Reporter.log("Adding Y-coordinates", true);
		createComponents.click_AddNewButton_Y();
		Thread.sleep(4000);
		createComponents.select_YaxisCoordinates("ACC_NET_OIL_RATE","Secondary Left", "Arealine",null).select_toolTip(1).click_showValueOnPlot();
		createComponents.click_InsertButton();

		Thread.sleep(4000);
		//createComponents.click_InsertButton();
		createComponents.button_Save();
		Thread.sleep(4000);
		Reporter.log("Plot Report for view ......... is created", true);
		
		
		// Edit  MasterPage for adding new component
		
		EditMasterPage("Plots","DataLimitation_Plot");
		
	//selecting book 
		
		 Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Malampaya Wellbook 2017");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	     ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("Plots");
		
		
	 
	}
	@Test(enabled=false)
	public void TC_003_DataLimitation_ShowValueOnPlot() throws Throwable{
			
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Plot Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Plot");
		createComponents.clickOnCreate();
		createComponents.enter_PlotName("DataLimitation_Plot");
		createComponents.selectAssetType("Wellbore");
		createComponents.selectDataSource("GRSM");
		createComponents.select_PlotViews("IV_EB_PERFORMANCE_PLOT_DAY");
		createComponents.selectColumnToAdd_Plot().clickAddButton_Plot();
		createComponents.check_eBooks().select_GroupHeader();
		
		Reporter.log("Adding X-coordinates", true);
		createComponents.select_XaxisCoordinates("PRODUCTION_DATE","Primary Bottom",null);
		
		Thread.sleep(4000);
		
		Reporter.log("Adding Y-coordinates", true);
		createComponents.select_YaxisCoordinates("ACC_NET_GAS_RATE", "Primary Left", "Line",null).select_toolTip(0).click_showValueOnPlot();
		createComponents.getclick_YaxisUpdate();
		Thread.sleep(4000);
		
		Reporter.log("Adding Y-coordinates", true);
		createComponents.click_AddNewButton_Y();
		Thread.sleep(4000);
		createComponents.select_YaxisCoordinates("ACC_NET_OIL_RATE","Secondary Left", "Arealine",null).select_toolTip(1).click_showValueOnPlot();
		createComponents.click_InsertButton();

		Thread.sleep(4000);
		//createComponents.click_InsertButton();
		createComponents.button_Save();
		Thread.sleep(4000);
		Reporter.log("Plot Report for view ......... is created", true);
		
		
		
		
		
	//Creating MasterPage
		
		Reporter.log("Adding Component to Master Page ", true);	
		AddMasterPage newMasterPage = homepage.clickOnMasterPage().click_NewMasterPage();
		newMasterPage.enter_Name("DataLimitation_Plot");
		newMasterPage.Enter_PageTitle("Plot_Wellbore_Data");
		newMasterPage.select_BookType("Well Book");
		newMasterPage.select_AssetType("Wellbore");
		newMasterPage.select_Discipline("Reservoir Engineering (RE)");
		newMasterPage.enter_ToolTip("Plot_Wellbore");
		Thread.sleep(3000);
		newMasterPage.select_ComponentToAdd("DataLimitation_Plot",null);
		Thread.sleep(3000);
		newMasterPage.saveMasterPage();
		Thread.sleep(4000);
		Reporter.log("Master Page created", true);
		Reporter.log("Adding Chapters to Master Page", true);
		
		
		
		
		// Adding chapters to MasterPage
		
		Reporter.log("To select BookName from MaintainBooks");
		MaintainBooks selectBookName = homepage.clickOnMaintainBooks().selectBookName("Malampaya Wellbook 2017");
		
		Reporter.log("To AddMasterPageToChapters");
	    homePage addMasterPageToChapters = selectBookName.AddMasterPageToChapters("Wellbore","DataLimitation_Plot");
	     
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = addMasterPageToChapters.clickon_eBooks().selectBooks("Malampaya Wellbook 2017");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("DataLimitation_Plot");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    ebookViewDetails.select_Page("DataLimitation_Plot");
		
	 
	}
	
	

}
