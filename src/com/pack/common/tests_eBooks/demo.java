package com.pack.common.tests_eBooks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects_eBooks.AddMasterPage;
import com.pack.common.pageobjects_eBooks.MaintainBooks;
import com.pack.common.pageobjects_eBooks.MaintainGenericComponents;
import com.pack.common.pageobjects_eBooks.ebooks_BookViewer;
import com.pack.common.pageobjects_eBooks.homePage;

public class demo extends TestBaseSetup{

	public homePage homepage ;
	//public AddMasterPageTest masterPage;
	
	
	//@BeforeMethod
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
		
		
		// selecting the Books, adding chapters to master page
		
		Reporter.log("To select BookName from MaintainBooks");
		MaintainBooks selectBookName = homepage.clickOnMaintainBooks().selectBookName("Koula Wellbook 2015");
		
		Reporter.log("To AddMasterPageToChapters");
	    homePage addMasterPageToChapters = selectBookName.AddMasterPageToChapters("Wellbore","Plots");
	    
	    
	   
	}

	//@Test(enabled=true)
	public void TC_008_VerifyEnableZoom() throws Throwable{
		
		homepage = new homePage(driver);

		//EditMasterPage("Plots","Plot_EnableZoom");
		
		 Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
	  
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("Plots"+"_"+java.time.LocalDate.now());
	    
	    Reporter.log("View page is selected",true);
	    
	    ebookViewDetails.click_zoomIn();
		
	}
	
	//@Test(enabled=true)
	public void EditMasterPage(String masterPage,String componentName) throws Throwable{
		
		//homepage = new homePage(driver);
		Reporter.log("Edit Master Page", true);
		AddMasterPage newMasterPage = homepage.clickOnMasterPage().select_MasterPage(masterPage+"_"+java.time.LocalDate.now());
		
		Reporter.log("Added component to MasterPage", true);
		newMasterPage.Edit_ComponetToAdd(componentName);

		newMasterPage.saveMasterPage();
		Reporter.log(" Master Page is saved", true);
	}

	
	public void EditMasterPage_multiplecomponent(String masterPage,String text) throws Throwable{
		
		
		Reporter.log("Edit Master Page", true);
		AddMasterPage newMasterPage = homepage.clickOnMasterPage().select_MasterPage(masterPage+"_"+java.time.LocalDate.now());
		
		Reporter.log("Added component to MasterPage", true);
		newMasterPage.Edit_MultipleComponetToAdd(text);

		newMasterPage.saveMasterPage();
		Reporter.log(" Master Page is saved", true);
	}
	
//	@Test(enabled=false)
	public void TC_001_VerifyAWR() throws Throwable{
		
		
		
		homepage = new homePage(driver);
		
		EditMasterPage_multiplecomponent("Plots","Plots");
	
	     // Open Book
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("Plots");
		
	    ebookViewDetails.componentName_PageDisplayName();

	}
	
	
	
	@Test(enabled=false)
	public void demo() throws Throwable{
		homepage = new homePage(driver);
	
		
		//
		 Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Majnoon Wellbook 2015");
		
	    Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("welboreIntegrity_11july");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true); 
	    ebookViewDetails.select_Page("welboreIntegrity_11july");
	    
	    ebookViewDetails.getbackgroundcolor();
	    
	  
	    }
	
	
	@Test(enabled=false)
	public void AdminPage() throws Throwable{
		
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
		
	}
		
	

	

}
