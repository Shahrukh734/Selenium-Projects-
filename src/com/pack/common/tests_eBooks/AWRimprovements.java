package com.pack.common.tests_eBooks;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects_eBooks.AddMasterPage;
import com.pack.common.pageobjects_eBooks.MaintainBooks;
import com.pack.common.pageobjects_eBooks.ebooks_BookViewer;
import com.pack.common.pageobjects_eBooks.homePage;

public class AWRimprovements extends TestBaseSetup{
	
	public homePage homepage ;
	//public AddMasterPageTest masterPage;
	
	@Parameters({ "assetType"})
	@BeforeMethod
	public void createMasterPage(String assetType ) throws Throwable{
		
		homepage = new homePage(driver);
		Reporter.log("Adding Component to Master Page ", true);	
		AddMasterPage newMasterPage = homepage.clickOnMasterPage().click_NewMasterPage();
		newMasterPage.enter_Name("Plots");
		newMasterPage.Enter_PageTitle("Plot_"+assetType);
		newMasterPage.select_BookType("Well Book");
		newMasterPage.select_AssetType(assetType);
		newMasterPage.select_Discipline("Reservoir Engineering (RE)");
		newMasterPage.enter_ToolTip("Plot_"+assetType);
		Thread.sleep(3000);
		newMasterPage.addcomponent_MasterPage();
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
	
	public void EditMasterPage_multiplecomponent(String masterPage,String text) throws Throwable{
		
		
		Reporter.log("Edit Master Page", true);
		AddMasterPage newMasterPage = homepage.clickOnMasterPage().select_MasterPage(masterPage+"_"+java.time.LocalDate.now());
		
		Reporter.log("Added component to MasterPage", true);
		newMasterPage.Edit_MultipleComponetToAdd(text);

		newMasterPage.saveMasterPage();
		Reporter.log(" Master Page is saved", true);
	}
	
	@Test(enabled=true)
	public void TC_001_VerifyTheOrderofComponentsAdded() throws Throwable{
		
		
		
		homepage = new homePage(driver);
		Reporter.log("Adding multiple components in MasterPage :", true);
		EditMasterPage_multiplecomponent("Plots","Plot");
	
	     // Open Book
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("Plots");
		
	    Reporter.log("Order of component Added are :",true);
	    ebookViewDetails.componentName_PageDisplayName();

	}
	
	@Test(enabled=false)
	public void TC_002_VerifytheBookViewerPagewhencomponentaddedinMasterPageisArranged() throws Throwable{
		
		
		
		homepage = new homePage(driver);
		Reporter.log("Adding multiple components in MasterPage", true);
		Reporter.log("Edit Master Page", true);
		AddMasterPage newMasterPage = homepage.clickOnMasterPage().select_MasterPage("Plots"+"_"+java.time.LocalDate.now());

		newMasterPage.reArrangeTheGridView_component("Plot_14May","Plot_15May_ShowGrid");
		
		newMasterPage.saveMasterPage();
		Reporter.log(" Master Page is saved", true);
	
	     // Open Book
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("Plots");
		
	    Reporter.log("Order of component Added are :",true);
	    ebookViewDetails.componentName_PageDisplayName();

	}

		
	@Test(enabled=false)
	public void TC_003_VerifytheBookViewerPagewhencomponentaddedinMasterPageareOverridden() throws Throwable{

		homepage = new homePage(driver);
		Reporter.log("Adding multiple components in MasterPage", true);
		Reporter.log("Edit Master Page", true);
		AddMasterPage newMasterPage = homepage.clickOnMasterPage().select_MasterPage("Plots"+"_"+java.time.LocalDate.now());

		newMasterPage.overridetheExistingcomponent("AWR - Drilling History");
		
		newMasterPage.saveMasterPage();
		Reporter.log(" Master Page is saved", true);
	
	     // Open Book
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("Plots");
		
	    Reporter.log("Order of component Added are :",true);
	    ebookViewDetails.componentName_PageDisplayName();

	}
	
	@Test(enabled=false)
	public void TC_004_VerifytheBookViewerPagewhencomponentaddedtoexistinginMaster() throws Throwable{

		homepage = new homePage(driver);
		Reporter.log("Adding multiple components in MasterPage", true);
		Reporter.log("Edit Master Page", true);
		AddMasterPage newMasterPage = homepage.clickOnMasterPage().select_MasterPage("Plots"+"_"+java.time.LocalDate.now());

		newMasterPage.AddtoExisting("Casing Hole Summary");
		
		newMasterPage.saveMasterPage();
		Reporter.log(" Master Page is saved", true);
	
	     // Open Book
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("Plots");
		
	    Reporter.log("Order of component Added are :",true);
	    ebookViewDetails.componentName_PageDisplayName();

	}
	
	@Test(enabled=false)
	public void TC_005_VerifytheBookViewerPagewhencomponentaddedDeletedinMasterPage() throws Throwable{

		homepage = new homePage(driver);
		Reporter.log("Adding multiple components in MasterPage", true);
		Reporter.log("Edit Master Page", true);
		AddMasterPage newMasterPage = homepage.clickOnMasterPage().select_MasterPage("Plots"+"_"+java.time.LocalDate.now());

		newMasterPage.deleteComponent_MasterPage("Casing Hole Summary");
		
		newMasterPage.saveMasterPage();
		Reporter.log(" Master Page is saved", true);
	
	     // Open Book
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("Plots");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("Plots");
		
	    Reporter.log("Order of component Added are :",true);
	    ebookViewDetails.componentName_PageDisplayName();

	}
	
	
	
	

}
