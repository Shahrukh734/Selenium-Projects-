package com.pack.common.tests_eBooks;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects_eBooks.AddMasterPage;
import com.pack.common.pageobjects_eBooks.MaintainBooks;
import com.pack.common.pageobjects_eBooks.MaintainGenericComponents;
import com.pack.common.pageobjects_eBooks.ebooks_BookViewer;
import com.pack.common.pageobjects_eBooks.homePage;

public class WellSummary extends TestBaseSetup {
	public homePage homepage ;
	
	//Test cases for Well Integrity
	
	
	//@BeforeClass
	public void CreatingComponentForWellSummary_AssetType_wellbore() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Tabular Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Tabular");
		createComponents.clickOnCreate();
		createComponents.enterName("Tabular_WellSummary");
		createComponents.selectAssetType("Wellbore");
		createComponents.selectDataSource("GRSM");
		createComponents.selectView("IV_WELL_SUMMARY_WC");
		createComponents.selectColumnToAdd().click_AddButton();
		createComponents.check_eBooks().select_GroupHeader().button_Preview();
		createComponents.button_Save();
		
		Reporter.log("Tabular Report for view ......... is created", true);
		
		
		
		// Creating Master Page
		
		Reporter.log("Creating a Master Page", true);
		
		AddMasterPage newMasterPage = homepage.clickOnMasterPage().click_NewMasterPage();
		newMasterPage.enter_Name("wellSummary");
		newMasterPage.Enter_PageTitle("Tabular_WellSummary");
		newMasterPage.select_BookType("Well Book");
		newMasterPage.select_AssetType("Wellbore");
		Thread.sleep(3000);
		newMasterPage.select_Discipline("Reservoir Engineering (RE)");
		newMasterPage.enter_ToolTip("Nusrat");
		Thread.sleep(3000);
		newMasterPage.select_ComponentToAdd("Tabular_WellSummary",null);
		Thread.sleep(3000);
		newMasterPage.saveMasterPage();
		Reporter.log("Master Page Created", true);
		
		
		
		// selecting the Books, adding chapters to master page
		
		Reporter.log("To select BookName from MaintainBooks",true);
		MaintainBooks selectBookName = homepage.clickOnMaintainBooks().selectBookName("Koula Wellbook 2015");
		
		Reporter.log("To AddMasterPageToChapters",true);
	    homePage addMasterPageToChapters = selectBookName.AddMasterPageToChapters("Wellbore","wellSummary");
	    
	    Reporter.log("Page has been added to book", true);

	}
	
	
	@Test(enabled=true)
	public void TC_001_VerifytheBookviewerPagewhenDIsplayNameischanged() throws Throwable{
		
		homepage = new homePage(driver);
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		MaintainGenericComponents select_Component = createComponents.select_ComponentType("Tabular");
		
		Reporter.log("select the component from the tabular report list", true);
		select_Component.select_ComponentName();
		
		Reporter.log("Component is selected and Edit icon is clicked ", true);
		
		select_Component.Rename_DisplayName_Previewsection("ACTIONDUETOTR", "wellsummary_ACTIONDUETOTR");
		select_Component.Rename_DisplayName_Previewsection("REVIEWED ON", "wellsummary_REVIEWED ON");
		
		MaintainGenericComponents PreviewSection_columnName= select_Component.validate_PreviewSection();
		
		
		
		// select the eBooks
		
		 Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
	  
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("wellSummary");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("wellSummary"+"_"+java.time.LocalDate.now());
	    
	    Reporter.log("View page is selected",true);
	    
	    ebooks_BookViewer pageLevel_columnName = ebookViewDetails.display_columnName();
	    
	    Assert.assertSame(PreviewSection_columnName, pageLevel_columnName, "Column Name verified");
	    

	}
	
	@Test(enabled=true)
	public void TC_002_VerifytheBookviewerPagewhenIscolorApplicableCheckboxisSelected() throws Throwable{
		
		homepage = new homePage(driver);
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		MaintainGenericComponents select_Component = createComponents.select_ComponentType("Tabular");
		
		Reporter.log("select the component from the tabular report list", true);
		select_Component.select_ComponentName();
		
		Reporter.log("Component is selected and Edit icon is clicked ", true);
		
		select_Component.check_IsColorApplicableColumn_Previewsection();
		
		
		
		// select the eBooks
		

		 Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
	  
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("wellSummary");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("wellSummary"+"_"+java.time.LocalDate.now());
	    
	    Reporter.log("View page is selected",true);
	    
	    
	    ebookViewDetails.getbackgroundcolor();
	    
	    Reporter.log("Selected color  is Displayed",true);
		

	}
	
	
	@Test(enabled=true)
	public void TC_003_VerifytheBookviewerPage_click_IsUnitApplicableCheckboxisSelected() throws Throwable{
		
		homepage = new homePage(driver);
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		MaintainGenericComponents select_Component = createComponents.select_ComponentType("Tabular");
		
		Reporter.log("select the component from the tabular report list", true);
		select_Component.select_ComponentName();
		
		Reporter.log("Component is selected and Edit icon is clicked ", true);
		
		select_Component.click_IsUnitApplicable();
		
	
		// select the eBooks
		

		 Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
	  
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("wellSummary");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("wellSummary"+"_"+java.time.LocalDate.now());
	    
	    Reporter.log("View page is selected",true);
	    
	    ebookViewDetails.display_columnName_IsUnitApplicable();
		
	    Reporter.log("IsUnitApplicable column Name is displayed",true);

	}
	
	

	@Test(enabled=true)
	public void TC_004_VerifytheBookviewerPage_columnUncheckedinAdminPage() throws Throwable{
		
		homepage = new homePage(driver);
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		MaintainGenericComponents select_Component = createComponents.select_ComponentType("Tabular");
		
		Reporter.log("select the component from the tabular report list", true);
		select_Component.select_ComponentName();
		
		Reporter.log("Component is selected and Edit icon is clicked ", true);
		
		select_Component.Uncheck_DisplayColumn_Previewsection("CD_COMMON_NAME");
		select_Component.Uncheck_DisplayColumn_Previewsection("COMMON_NAME");
		
		MaintainGenericComponents PreviewSection_columnName= select_Component.validate_PreviewSection();
		
		
		
		// select the eBooks
		
		 Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
	  
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("wellSummary");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("wellSummary"+"_"+java.time.LocalDate.now());
	    
	    Reporter.log("View page is selected",true);
	    
	    ebooks_BookViewer pageLevel_columnName = ebookViewDetails.display_columnName();
	    
	    Assert.assertSame(PreviewSection_columnName, pageLevel_columnName, "Column Name verified");
	    

	}
	
	
	
	


}
