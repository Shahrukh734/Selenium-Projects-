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

public class RemovingDotNetChartingTest extends TestBaseSetup{
	
	public homePage homepage ;
	public AddMasterPageTest masterPage;
	
	// checking IsXaxisvertical scenario 
	
	public void EditMasterPage(String masterPage,String componentName) throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Edit Master Page", true);
		AddMasterPage newMasterPage = homepage.clickOnMasterPage().select_MasterPage(masterPage+"_"+java.time.LocalDate.now());
		
		Reporter.log("Added component to MasterPage", true);
		newMasterPage.Edit_ComponetToAdd(componentName);

		newMasterPage.saveMasterPage();
		Reporter.log(" Master Page is saved", true);
	}
	
	public void EditMasterPage_multiplecomponent(String masterPage,String text) throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Edit Master Page", true);
		AddMasterPage newMasterPage = homepage.clickOnMasterPage().select_MasterPage(masterPage+"_"+java.time.LocalDate.now());
		
		Reporter.log("Added component to MasterPage", true);
		newMasterPage.Edit_MultipleComponetToAdd(text);

		newMasterPage.saveMasterPage();
		Reporter.log(" Master Page is saved", true);
	}
	
	public void EditMasterPage_AddSelectedComponent(String c1,String c2,String c3) throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Edit Master Page", true);
		AddMasterPage newMasterPage = homepage.clickOnMasterPage().select_MasterPage(masterPage+"_"+java.time.LocalDate.now());
		
		Reporter.log("Added component to MasterPage", true);
		newMasterPage.EditMasterPage_AddSelectedComponent(c1,c2,c3);

		newMasterPage.saveMasterPage();
		Reporter.log(" Master Page is saved", true);
	}


	//@BeforeClass
	public void createMasterPage() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Adding Component to Master Page ", true);	
		AddMasterPage newMasterPage = homepage.clickOnMasterPage().click_NewMasterPage();
		newMasterPage.enter_Name("Plots");
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
		MaintainBooks selectBookName = homepage.clickOnMaintainBooks().selectBookName("Koula Wellbook 2015");
		
		Reporter.log("To AddMasterPageToChapters");
	    homePage addMasterPageToChapters = selectBookName.AddMasterPageToChapters("Wellbore","Plots");
	    
	}
	
	@Test(enabled=true)
	public void TC_001_VerifytheXaxisVerticalForPlots() throws Throwable{
		
		homepage = new homePage(driver);
		/*Reporter.log("Connection Type :Plot Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Plot");
		createComponents.clickOnCreate();
		createComponents.enter_PlotName("Plot_15May_XaxisVertical");
		createComponents.selectAssetType("Wellbore");
		createComponents.selectDataSource("GRSM");
		createComponents.select_PlotViews("IV_EB_PERFORMANCE_PLOT");
		createComponents.selectColumnToAdd_Plot().clickAddButton_Plot();
		createComponents.check_eBooks();
		createComponents.click_IsXaxisVertical();
		Reporter.log("IsXaxisVertical is selected", true);
				
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
		
		createComponents.button_Save();
		Reporter.log("Plot Report for view ......... is created", true);
		
		
		// Edit Master Page
		
		EditMasterPage("Plots","Plot_15May_XaxisVertical");*/

		
		// selecting books
		
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("Plots");
		
	}
	
	// Height and width of plots
	
	@Test(enabled=false)
	public void TC_002_VerifyHeightWidthOfPlots() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Plot Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Plot");
		createComponents.clickOnCreate();
		createComponents.enter_PlotName("Plots_HeightWidthOfPlots");
		createComponents.selectAssetType("Wellbore");
		createComponents.selectDataSource("GRSM");
		createComponents.select_PlotViews("IV_EB_PERFORMANCE_PLOT");
		createComponents.selectColumnToAdd_Plot().clickAddButton_Plot();
		createComponents.check_eBooks();
		createComponents.enter_HeightWidth("400","800");
		Reporter.log("HeightWidht details entered", true);
		
		
		
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
		
	
		createComponents.button_Save();
		Reporter.log("Plot Report for view ......... is created", true);
		
		
		// Edit  MasterPage for adding new component
		
		EditMasterPage("Plots","Plots_HeightWidthOfPlots");
		
	     // Open Book
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("Plots");
		
	}
	
	// Marker size value less then , equal to and greater then 14
	@Test(enabled=false)
	public void TC_003_VerifyMarkerSize_lessequalto14() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Plot Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Plot");
		createComponents.clickOnCreate();
		createComponents.enter_PlotName("Plots_MarkerSize_lessequalto14");
		createComponents.selectAssetType("Wellbore");
		createComponents.selectDataSource("GRSM");
		createComponents.select_PlotViews("IV_EB_PERFORMANCE_PLOT");
		createComponents.selectColumnToAdd_Plot().clickAddButton_Plot();
		createComponents.check_eBooks();
		createComponents.enter_txtMarkerSize("14");
		Reporter.log("Marker size entered", true);
		
		
		
		Reporter.log("Adding X-coordinates", true);
		createComponents.select_XaxisCoordinates("PRODUCTION_DATE", "Primary Bottom",null);
		
		Thread.sleep(4000);
		
		Reporter.log("Adding Y-coordinates", true);
		createComponents.select_YaxisCoordinates("ACC_NET_GAS_RATE", "Primary Left", "Arealine-Circle",null).select_toolTip(2);
		createComponents.click_updateButton();

		
		Reporter.log("Adding Y-coordinates", true);
		createComponents.click_AddNewButton_Y();
		createComponents.select_YaxisCoordinates("CD_LIQUID_RATE", "Primary Left", "Marker-Triangle",null).select_toolTip(3);
		createComponents.click_InsertButton();
		Thread.sleep(4000);
		createComponents.button_Save();
		Reporter.log("Plot Report for view ......... is created", true);
		
		

	// Edit  MasterPage for adding new component
		
		EditMasterPage("Plots","Plots_MarkerSize_lessequalto14");
		
	     // Open Book
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("Plots");
		
	}

	
	@Test(enabled=false)
	public void TC_004_VerifyMarkerSize_greaterthen14() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Plot Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Plot");
		createComponents.clickOnCreate();
		createComponents.enter_PlotName("Plots_MarkerSize_greaterthen14");
		createComponents.selectAssetType("Wellbore");
		createComponents.selectDataSource("GRSM");
		createComponents.select_PlotViews("IV_EB_PERFORMANCE_PLOT");
		createComponents.selectColumnToAdd_Plot().clickAddButton_Plot();
		createComponents.check_eBooks();
		createComponents.enter_txtMarkerSize("16");
		Reporter.log("Marker size entered", true);
		
		
		
		Reporter.log("Adding X-coordinates", true);
		createComponents.select_XaxisCoordinates("PRODUCTION_DATE", "Primary Bottom",null);
		
		Thread.sleep(4000);
		
		Reporter.log("Adding Y-coordinates", true);
		createComponents.select_YaxisCoordinates("ACC_NET_GAS_RATE", "Primary Left", "Arealine",null).select_toolTip(2);
		createComponents.click_updateButton();

		Thread.sleep(4000);
	
		createComponents.button_Save();
		Reporter.log("Plot Report for view ......... is created", true);
		
		

		// Edit  MasterPage for adding new component
			
			EditMasterPage("Plots","Plots_MarkerSize_greaterthen14");
			
		     // Open Book
		    Reporter.log("Select BookName for which component is added from homePage");
		     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
			
		     Reporter.log("Select the required details in ebookViewer Page");
		    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
		    
		    Reporter.log("Save the Page");
		    ebookViewDetails.applyViewerPage();
			
		    Reporter.log("View page created",true);
		    
		    ebookViewDetails.select_Page("Plots");
		
	}
	
	// Show GridLines

	@Test(enabled=false)
	public void TC_005_VerifyShowGridLines() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Plot Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Plot");
		createComponents.clickOnCreate();
		createComponents.enter_PlotName("Plots_ShowGridLines");
		createComponents.selectAssetType("Wellbore");
		createComponents.selectDataSource("GRSM");
		createComponents.select_PlotViews("IV_EB_PERFORMANCE_PLOT");
		createComponents.selectColumnToAdd_Plot().clickAddButton_Plot();
		createComponents.check_eBooks();
		createComponents.click_ShowGridLines();
		Reporter.log("SHow Gridlines is checked", true);
		
		
		
		Reporter.log("Adding X-coordinates", true);
		createComponents.select_XaxisCoordinates("PRODUCTION_DATE", "Primary Bottom",null);
		
		Thread.sleep(4000);
		
		Reporter.log("Adding Y-coordinates", true);
		
		createComponents.select_YaxisCoordinates("ACC_NET_OIL_RATE", "Primary Left", "Line-Circle",null).select_toolTip(1);
		createComponents.click_updateButton();
		Thread.sleep(4000);
		
	
		createComponents.button_Save();
		Reporter.log("Plot Report for view ......... is created", true);
		
		
		// Edit  MasterPage for adding new component
		
		EditMasterPage("Plots","Plots_ShowGridLines");
		
	     // Open Book
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("Plots");
		
	}
	
	
	
	// Legend Box POsition
	
	@Test(enabled=false)
	public void TC_006_VerifyLegendBoxPosition_Right() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Plot Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Plot");
		createComponents.clickOnCreate();
		createComponents.enter_PlotName("Plot_LegendBoxPosition_Right");
		createComponents.selectAssetType("Wellbore");
		createComponents.selectDataSource("GRSM");
		createComponents.select_PlotViews("IV_EB_PERFORMANCE_PLOT");
		createComponents.selectColumnToAdd_Plot().clickAddButton_Plot();
		createComponents.check_eBooks();
		createComponents.select_LegendBoxPosition("Right");
		Reporter.log("LegendBoxPosition is checked", true);
		
		
		
		Reporter.log("Adding X-coordinates", true);
		createComponents.select_XaxisCoordinates("PRODUCTION_DATE", "Primary Bottom",null);
		
		Thread.sleep(4000);
		
		Reporter.log("Adding Y-coordinates", true);
		createComponents.select_YaxisCoordinates("ACC_NET_GAS_RATE", "Primary Left", "Arealine",null).select_toolTip(2);
		createComponents.click_updateButton();

		Thread.sleep(4000);
		Reporter.log("Adding Y-coordinates", true);
		createComponents.click_AddNewButton_Y();
		createComponents.select_YaxisCoordinates("ACC_NET_OIL_RATE", "Secondary Left", "Line-Circle",null).select_toolTip(1);
		createComponents.click_InsertButton();
		Thread.sleep(4000);
		
	
		createComponents.button_Save();
		Reporter.log("Plot Report for view ......... is created", true);
		
		// Edit  MasterPage for adding new component
		
				EditMasterPage("Plots","Plot_LegendBoxPosition_Right");
				
			     // Open Book
			    Reporter.log("Select BookName for which component is added from homePage");
			     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
				
			     Reporter.log("Select the required details in ebookViewer Page");
			    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
			    
			    Reporter.log("Save the Page");
			    ebookViewDetails.applyViewerPage();
				
			    Reporter.log("View page created",true);
			    
			    ebookViewDetails.select_Page("Plots");
	}
	
	@Test(enabled=false)
	public void TC_007_VerifyLegendBoxPosition_Bottom() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Plot Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Plot");
		createComponents.clickOnCreate();
		createComponents.enter_PlotName("Plot_LegendBoxPosition_Bottom");
		createComponents.selectAssetType("Wellbore");
		createComponents.selectDataSource("GRSM");
		createComponents.select_PlotViews("IV_EB_PERFORMANCE_PLOT");
		createComponents.selectColumnToAdd_Plot().clickAddButton_Plot();
		createComponents.check_eBooks();
		createComponents.select_LegendBoxPosition("Bottom");
		Reporter.log("LegendBoxPosition is checked", true);
		
		
		
		Reporter.log("Adding X-coordinates", true);
		createComponents.select_XaxisCoordinates("PRODUCTION_DATE", "Primary Bottom",null);
		
		Thread.sleep(4000);
		
		Reporter.log("Adding Y-coordinates", true);
		createComponents.select_YaxisCoordinates("ACC_NET_GAS_RATE", "Primary Left", "Arealine",null).select_toolTip(2);
		createComponents.click_updateButton();
		Thread.sleep(4000);
		
		
		Reporter.log("Adding Y-coordinates", true);
		createComponents.click_AddNewButton_Y();
		createComponents.select_YaxisCoordinates("CD_LIQUID_RATE", "Primary Left", "Marker-Triangle",null).select_toolTip(3);
		createComponents.click_InsertButton();
		Thread.sleep(4000);
		createComponents.button_Save();
		Reporter.log("Plot Report for view ......... is created", true);
		
		
		// Edit  MasterPage for adding new component
		
		EditMasterPage("Plots","Plot_LegendBoxPosition_Bottom");
		
	     // Open Book
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("Plots");
}
	
	
	@Test(enabled=false)
	public void TC_006_VerifyLegendBoxPosition_Top() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Plot Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Plot");
		createComponents.clickOnCreate();
		createComponents.enter_PlotName("Plot_LegendBoxPosition_Top");
		createComponents.selectAssetType("Wellbore");
		createComponents.selectDataSource("GRSM");
		createComponents.select_PlotViews("IV_EB_PERFORMANCE_PLOT");
		createComponents.selectColumnToAdd_Plot().clickAddButton_Plot();
		createComponents.check_eBooks();
		createComponents.select_LegendBoxPosition("Bottom");
		Reporter.log("LegendBoxPosition is checked", true);
		
		
		
		Reporter.log("Adding X-coordinates", true);
		createComponents.select_XaxisCoordinates("PRODUCTION_DATE", "Primary Bottom",null);
		

		Thread.sleep(4000);
		Reporter.log("Adding Y-coordinates", true);
		
		createComponents.select_YaxisCoordinates("ACC_NET_OIL_RATE", "Primary Left", "Line",null).select_toolTip(1);
		createComponents.click_updateButton();
		Thread.sleep(4000);
		
		Reporter.log("Adding Y-coordinates", true);
		createComponents.click_AddNewButton_Y();
		createComponents.select_YaxisCoordinates("CD_LIQUID_RATE", "Primary Right", "Marker-Triangle",null).select_toolTip(3);
		createComponents.click_InsertButton();
		Thread.sleep(4000);
		createComponents.button_Save();
		Reporter.log("Plot Report for view ......... is created", true);
		
		
		// Edit  MasterPage for adding new component
		
				EditMasterPage("Plots","Plot_LegendBoxPosition_Top");
				
			     // Open Book
			    Reporter.log("Select BookName for which component is added from homePage");
			     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
				
			     Reporter.log("Select the required details in ebookViewer Page");
			    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
			    
			    Reporter.log("Save the Page");
			    ebookViewDetails.applyViewerPage();
				
			    Reporter.log("View page created",true);
			    
			    ebookViewDetails.select_Page("Plots");
		
	}
	
	// select Date Range 
	
	@Test(enabled=false)
	public void TC_007_VerifyDateRangeDropDown() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Plot Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Plot");
		createComponents.clickOnCreate();
		createComponents.enter_PlotName("Plot_DateRange");
		createComponents.selectAssetType("Wellbore");
		createComponents.selectDataSource("GRSM");
		createComponents.select_PlotViews("IV_EB_PERFORMANCE_PLOT");
		createComponents.selectColumnToAdd_Plot().clickAddButton_Plot();
		createComponents.check_eBooks();
		createComponents.select_EnableDateRange("PRODUCTION_DATE");
		Reporter.log("Date Range selected", true);
		
		
		
		Reporter.log("Adding X-coordinates", true);
		createComponents.select_XaxisCoordinates("PRODUCTION_DATE", "Primary Bottom",null);
		
		Thread.sleep(4000);
		
		Reporter.log("Adding Y-coordinates", true);
		createComponents.select_YaxisCoordinates("ACC_NET_GAS_RATE", "Primary Left", "Bar",null).select_toolTip(2);
		createComponents.click_updateButton();

	
		Thread.sleep(4000);
		createComponents.button_Save();
		Reporter.log("Plot Report for view ......... is created", true);
		
		

		// Edit  MasterPage for adding new component
		
				EditMasterPage("Plots","Plot_LegendBoxPosition_Top");
				
			     // Open Book
			    Reporter.log("Select BookName for which component is added from homePage");
			     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
				
			     Reporter.log("Select the required details in ebookViewer Page");
			    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
			    
			    Reporter.log("Save the Page");
			    ebookViewDetails.applyViewerPage();
				
			    Reporter.log("View page created",true);
			    
			    ebookViewDetails.select_Page("Plots");
			    
			    // format dd/mm/yyyy
			    
			    
			    Reporter.log("Select From Date and To Date ",true);
			    ebookViewDetails.check_EnableDateRange("16/5/2012", "16/5/2013").click_Apply();
		
	}
	
	
	
	@Test(enabled=false)
	public void TC_008_VerifyEnableDatePeriod() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Plot Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Plot");
		createComponents.clickOnCreate();
		createComponents.enter_PlotName("Plot_EnableDatePeriod");
		createComponents.selectAssetType("Wellbore");
		createComponents.selectDataSource("GRSM");
		createComponents.select_PlotViews("IV_EB_PERFORMANCE_PLOT");
		createComponents.selectColumnToAdd_Plot().clickAddButton_Plot();
		createComponents.check_eBooks();
		createComponents.select_EnableDateRange("PRODUCTION_DATE").click_EnableDatePeriod();
		Reporter.log("Date Range selected", true);
		
		
		
		Reporter.log("Adding X-coordinates", true);
		createComponents.select_XaxisCoordinates("PRODUCTION_DATE", "Primary Bottom",null);
		
		Thread.sleep(4000);
		
		Reporter.log("Adding Y-coordinates", true);
		createComponents.select_YaxisCoordinates("ACC_NET_GAS_RATE", "Primary Left", "Line",null).select_toolTip(2);
		createComponents.click_updateButton();

	
		Thread.sleep(4000);
		createComponents.button_Save();
		Reporter.log("Plot Report for view ......... is created", true);
		
		

				// Edit  MasterPage for adding new component
		
				EditMasterPage("Plots","Plot_EnableDatePeriod");
				
			     // Open Book
			    Reporter.log("Select BookName for which component is added from homePage");
			     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
				
			     Reporter.log("Select the required details in ebookViewer Page");
			    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
			    
			    Reporter.log("Save the Page");
			    ebookViewDetails.applyViewerPage();
				
			    Reporter.log("View page created",true);
			    
			    ebookViewDetails.select_Page("Plots");
			    // format dd/mm/yyyy
			    
			    
			    Reporter.log("Select From Date and To Date ",true);
			    ebookViewDetails.select_EnableDate(0).click_Apply();
			    Reporter.log("Apply icon working as expected and plots are comin within the range",true);
	}
	
	
	
	@Test(enabled=false)
	public void TC_009_VerifyEnableDatePeriod_Reset() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Plot Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Plot");
		createComponents.clickOnCreate();
		createComponents.enter_PlotName("Plot_EnableDatePeriod");
		createComponents.selectAssetType("Wellbore");
		createComponents.selectDataSource("GRSM");
		createComponents.select_PlotViews("IV_EB_PERFORMANCE_PLOT");
		createComponents.selectColumnToAdd_Plot().clickAddButton_Plot();
		createComponents.check_eBooks();
		createComponents.select_EnableDateRange("PRODUCTION_DATE").click_EnableDatePeriod();
		Reporter.log("Date Range selected", true);
		
		
		
		Reporter.log("Adding X-coordinates", true);
		createComponents.select_XaxisCoordinates("PRODUCTION_DATE", "Primary Bottom",null);
		
		Thread.sleep(4000);
		
		Reporter.log("Adding Y-coordinates", true);
		createComponents.select_YaxisCoordinates("ACC_NET_GAS_RATE", "Primary Left", "Line",null).select_toolTip(2);
		createComponents.click_updateButton();

	
		Thread.sleep(4000);
		createComponents.button_Save();
		Reporter.log("Plot Report for view ......... is created", true);
		
		

				// Edit  MasterPage for adding new component
		
				EditMasterPage("Plots","Plot_EnableDatePeriod");
				
			     // Open Book
			    Reporter.log("Select BookName for which component is added from homePage");
			     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
				
			     Reporter.log("Select the required details in ebookViewer Page");
			    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
			    
			    Reporter.log("Save the Page");
			    ebookViewDetails.applyViewerPage();
				
			    Reporter.log("View page created",true);
			    
			    ebookViewDetails.select_Page("Plots");
			    // format dd/mm/yyyy
			    
			    
			    Reporter.log("Select From Date and To Date ",true);
			    ebookViewDetails.select_EnableDate(0).click_Reset();
			    
			    Reporter.log("Reset icon working as expected",true);
	}
	
	
	//zoom in and zoom out
	
	
	@Test(enabled=false)
	public void TC_010_VerifyEnableZoom() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Plot Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Plot");
		createComponents.clickOnCreate();
		createComponents.enter_PlotName("Plot_EnableZoom");
		createComponents.selectAssetType("Wellbore");
		createComponents.selectDataSource("GRSM");
		createComponents.select_PlotViews("IV_EB_PERFORMANCE_PLOT");
		createComponents.selectColumnToAdd_Plot().clickAddButton_Plot();
		createComponents.check_eBooks();
		createComponents.select_EnableDateRange("PRODUCTION_DATE").click_EnableDatePeriod();
		Reporter.log("Date Range selected", true);
		
		
		
		Reporter.log("Adding X-coordinates", true);
		createComponents.select_XaxisCoordinates("PRODUCTION_DATE", "Primary Bottom",null);
		
		Thread.sleep(4000);
		
		Reporter.log("Adding Y-coordinates", true);
		createComponents.select_YaxisCoordinates("ACC_NET_GAS_RATE", "Primary Left", "Line",null).select_toolTip(2);
		createComponents.click_updateButton();

	
		Thread.sleep(4000);
		createComponents.button_Save();
		Reporter.log("Plot Report for view ......... is created", true);
		


		// Edit  MasterPage for adding new component
		
		EditMasterPage("Plots","Plot_EnableZoom");
		
	     // Open Book
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("Plots");
	    
	    Reporter.log("Zoom in clicked ",true);
	    ebookViewDetails.click_zoomIn();
		   
	}
	

	
	//Option for user to change from linear to logarithmic axis

	
		@Test(enabled=false)
		public void TC_011_VerifyEnableLogScale() throws Throwable{
			
			homepage = new homePage(driver);
			Reporter.log("Connection Type :Plot Report ", true);
			
			MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
			
			Reporter.log("Creating component for View ......", true);
			createComponents.select_ComponentType("Plot");
			createComponents.clickOnCreate();
			createComponents.enter_PlotName("EnableLogScale");
			createComponents.selectAssetType("Wellbore");
			createComponents.selectDataSource("GRSM");
			createComponents.select_PlotViews("IV_EB_PERFORMANCE_PLOT");
			createComponents.selectColumnToAdd_Plot().clickAddButton_Plot();
			createComponents.check_eBooks();
			createComponents.click_EnableLogScale();
			Reporter.log("Date Range selected", true);
			
			
			
			Reporter.log("Adding X-coordinates", true);
			createComponents.select_XaxisCoordinates("PRODUCTION_DATE", "Primary Bottom",null);
			
			Thread.sleep(4000);
			
			Reporter.log("Adding Y-coordinates", true);
			createComponents.select_YaxisCoordinates("ACC_NET_GAS_RATE", "Primary Left", "Arealine",null).select_toolTip(2);
			createComponents.click_updateButton();

		
			Thread.sleep(4000);
			createComponents.button_Save();
			Reporter.log("Plot Report for view ......... is created", true);
			


			// Edit  MasterPage for adding new component
			
			EditMasterPage("Plots","EnableLogScale");
			
		     // Open Book
		    Reporter.log("Select BookName for which component is added from homePage");
		     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
			
		     Reporter.log("Select the required details in ebookViewer Page");
		    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
		    
		    Reporter.log("Save the Page");
		    ebookViewDetails.applyViewerPage();
			
		    Reporter.log("View page created",true);
		    
		    ebookViewDetails.select_Page("Plots");
		    
		
			   
		}
		
		//Plot Axis and title labels intuitive


		
		@Test(enabled=false)
		public void TC_012_VerifyTitleLabel() throws Throwable{
			
			homepage = new homePage(driver);
		
	
			// Edit  MasterPage for adding new component
			
			EditMasterPage_AddSelectedComponent("EnableLogScale","Plot_EnableZoom","Plots_ShowGridLines");
			
		     // Open Book
		    Reporter.log("Select BookName for which component is added from homePage");
		     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
			
		     Reporter.log("Select the required details in ebookViewer Page");
		    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
		    
		    Reporter.log("Save the Page");
		    ebookViewDetails.applyViewerPage();
			
		    Reporter.log("View page created",true);
		    
		    ebookViewDetails.select_Page("Plots");
		    
		    // Check the title label 
		    
		    ebookViewDetails.componentName_PageDisplayName();
		
			   
		}
	
	// checking title label with selected date range 
		@Test(enabled=false)
		public void TC_013_VerifyTitleLabel_selecteddate() throws Throwable{
			
			homepage = new homePage(driver);
		
	
			// Edit  MasterPage for adding new component
			
			EditMasterPage_AddSelectedComponent("EnableLogScale","Plot_DateRange","Plots_ShowGridLines");
			
		     // Open Book
		    Reporter.log("Select BookName for which component is added from homePage");
		     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
			
		     Reporter.log("Select the required details in ebookViewer Page");
		    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
		    
		    Reporter.log("Save the Page");
		    ebookViewDetails.applyViewerPage();
			
		    Reporter.log("View page created",true);
		    
		    ebookViewDetails.select_Page("Plots");
		    
		    // Check the title label with selected date range
		    ebookViewDetails.check_EnableDateRange("16/5/2012", "16/5/2013");
		    
		    ebookViewDetails.componentName_PageDisplayName();
		
			   
		}
	
		@Test(enabled=false)
		public void TC_014_VerifyThePlotaxiswhendisplaynamechanged() throws Throwable{
			
			homepage = new homePage(driver);
			Reporter.log("Connection Type :Plot Report ", true);
			
			MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
			
			Reporter.log("Creating component for View ......", true);
			createComponents.select_ComponentType("Plot");
			createComponents.clickOnCreate();
			createComponents.enter_PlotName("EnableLogScale");
			createComponents.selectAssetType("Wellbore");
			createComponents.selectDataSource("GRSM");
			createComponents.select_PlotViews("IV_EB_PERFORMANCE_PLOT");
			createComponents.selectColumnToAdd_Plot().clickAddButton_Plot();
			createComponents.check_eBooks();
			createComponents.click_EnableLogScale();
			Reporter.log("Date Range selected", true);
			
			
			
			Reporter.log("Adding X-coordinates", true);
			createComponents.select_XaxisCoordinates("PRODUCTION_DATE", "Primary Bottom","pdate");
			
			Thread.sleep(4000);
			
			Reporter.log("Adding Y-coordinates", true);
			createComponents.select_YaxisCoordinates("ACC_NET_GAS_RATE", "Primary Left", "Arealine","gasRate").select_toolTip(2);
			createComponents.click_updateButton();

		
			Thread.sleep(4000);
			createComponents.button_Save();
			Reporter.log("Plot Report for view ......... is created", true);
			


			// Edit  MasterPage for adding new component
			
			EditMasterPage("Plots","EnableLogScale");
			
		     // Open Book
		    Reporter.log("Select BookName for which component is added from homePage");
		     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
			
		     Reporter.log("Select the required details in ebookViewer Page");
		    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
		    
		    Reporter.log("Save the Page");
		    ebookViewDetails.applyViewerPage();
			
		    Reporter.log("View page created",true);
		    
		    ebookViewDetails.select_Page("Plots");
		    
		    Reporter.log("Plot is displayed",true);
		    
		    
		
			   
		}

}
