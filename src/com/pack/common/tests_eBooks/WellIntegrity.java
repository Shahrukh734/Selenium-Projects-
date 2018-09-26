package com.pack.common.tests_eBooks;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects_eBooks.AddMasterPage;
import com.pack.common.pageobjects_eBooks.MaintainBooks;
import com.pack.common.pageobjects_eBooks.MaintainGenericComponents;
import com.pack.common.pageobjects_eBooks.ebooks_BookViewer;
import com.pack.common.pageobjects_eBooks.homePage;

public class WellIntegrity extends TestBaseSetup {
	public homePage homepage ;
	
	//Test cases for Well Integrity
	
	
	@BeforeMethod
	public void CreatingPageForWellntegity_AssetType_wellbore() throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Connection Type :Tabular Report ", true);
		
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		createComponents.select_ComponentType("Tabular");
		createComponents.clickOnCreate();
		createComponents.enterName("wellIntegrity");
		createComponents.selectAssetType("Wellbore");
		createComponents.selectDataSource("GRSM");
		createComponents.selectView("IV_WELLBORE_INTEGRITY_WC");
		createComponents.selectColumnToAdd().click_AddButton();
		createComponents.check_eBooks().select_GroupHeader().button_Preview().validate_PreviewSection();
		createComponents.button_Save();
		
		Reporter.log("Tabular Report for view ......... is created", true);
		
		Reporter.log("Creating a Master Page", true);
		
		AddMasterPage newMasterPage = homepage.clickOnMasterPage().click_NewMasterPage();
		newMasterPage.enter_Name("wellIntegrity");
		newMasterPage.Enter_PageTitle("wellIntegrity");
		newMasterPage.select_BookType("Well Book");
		newMasterPage.select_AssetType("Wellbore");
		newMasterPage.select_Discipline("Reservoir");
		newMasterPage.enter_ToolTip("Nusrat");
		Thread.sleep(3000);
		newMasterPage.select_ComponentToAdd("wellIntegrity","null");
		Thread.sleep(3000);
		newMasterPage.saveMasterPage();
		Reporter.log("Master Page Created", true);
		
		// selecting the Books, adding chapters to master page
		
		Reporter.log("To select BookName from MaintainBooks",true);
		MaintainBooks selectBookName = homepage.clickOnMaintainBooks().selectBookName("Majnoon Wellbook 2015");
		
		Reporter.log("To AddMasterPageToChapters",true);
	    homePage addMasterPageToChapters = selectBookName.AddMasterPageToChapters("Wellbore","wellIntegrity");
	    
	    Reporter.log("Page has been added to book", true);

	}
	
	@Test(enabled=true)
	public void TC_001_VerifyDisplayName() throws Throwable{
		
		homepage = new homePage(driver);
		MaintainGenericComponents createComponents = homepage.clickOn_MaintainGenericComponent();
		
		Reporter.log("Creating component for View ......", true);
		MaintainGenericComponents select_Component = createComponents.select_ComponentType("Tabular");
		
		Reporter.log("select the component from the tabular report list", true);
		select_Component.select_ComponentName("wellIntegrity");
		
		// required changes
		
		//Uncheck some columns from the Display column 
		Reporter.log("Uncheck some column from Display column", true);
		
		
		// select the eBooks
		
		 Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
	  
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("Plots"+"_"+java.time.LocalDate.now());
	    
	    Reporter.log("View page is selected",true);
		
		
		
		

	}
	


}
