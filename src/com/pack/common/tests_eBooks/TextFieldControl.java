package com.pack.common.tests_eBooks;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects_eBooks.AddMasterPage;
import com.pack.common.pageobjects_eBooks.MaintainBooks;
import com.pack.common.pageobjects_eBooks.MaintainGenericComponents;
import com.pack.common.pageobjects_eBooks.ebooks_BookViewer;
import com.pack.common.pageobjects_eBooks.homePage;

public class TextFieldControl extends TestBaseSetup {
	public homePage homepage ;
	
	@Test(enabled=true)
	public void TC_001_TextFieldControlMaxLimit_Wellbore() throws Throwable{
		
		homepage = new homePage(driver);

		/*AddMasterPage newMasterPage = homepage.clickOnMasterPage().click_NewMasterPage();
		newMasterPage.enter_Name("TFC_Wellbore_1");
		newMasterPage.Enter_PageTitle("NusratMasterPage_11_06_18");
		newMasterPage.select_BookType("Well Book");
		newMasterPage.select_AssetType("Wellbore");
		newMasterPage.select_Discipline("Reservoir Engineering (RE)");
		newMasterPage.enter_ToolTip("TextFieldControl");
		Thread.sleep(3000);
		newMasterPage.select_ComponentToAdd("TextField Control",null);
		newMasterPage.getExpand_Icon();
		newMasterPage.select_ComponentName("TextFieldControl").select_Height("400").select_Width("700").select_MaxChar("3000");
		Thread.sleep(3000);
		newMasterPage.saveMasterPage();
		Thread.sleep(2000);
		Reporter.log("To select BookName from MaintainBooks");
		MaintainBooks selectBookName = homepage.clickOnMaintainBooks().selectBookName("Koula Wellbook 2015");
		
		Reporter.log("To AddMasterPageToChapters");
	    homePage addMasterPageToChapters = selectBookName.AddMasterPageToChapters("Wellbore","TFC_Wellbore_1");*/
	     
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = homepage.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	    Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("TFC_Wellbore_1");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true); 
	    ebookViewDetails.select_Page("TFC_Wellbore_1").TypeInField("demo",3000,0);
	    
	    
	    Reporter.log("Max character  limit is checked ",true);
	}
	
	@Test(enabled=false)
	public void TC_002_TextFieldBoldStyle_Wellbore() throws Throwable{
		
		homepage = new homePage(driver);

		AddMasterPage newMasterPage = homepage.clickOnMasterPage().click_NewMasterPage();
		newMasterPage.enter_Name("TextFieldControl_Wellbore");
		newMasterPage.Enter_PageTitle("NusratMasterPage");
		newMasterPage.select_BookType("Well Book");
		newMasterPage.select_AssetType("Wellbore");
		newMasterPage.select_Discipline("Reservoir");
		newMasterPage.enter_ToolTip("TextFieldControl");
		Thread.sleep(3000);
		newMasterPage.select_ComponentToAdd("TextField Control",null);
		newMasterPage.select_ComponentName("TextFieldControl").select_Height("400").select_Width("700").select_MaxChar("3000");
		Thread.sleep(3000);
		newMasterPage.saveMasterPage();
		
		Reporter.log("To select BookName from MaintainBooks");
		MaintainBooks selectBookName = homepage.clickOnMaintainBooks().selectBookName("Koula Wellbook 2015");
		
		Reporter.log("To AddMasterPageToChapters");
	    homePage addMasterPageToChapters = selectBookName.AddMasterPageToChapters("Wellbore","TextFieldControl_Wellbore");
	     
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = addMasterPageToChapters.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("TextFieldControl_Wellbore");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("TextFieldControl_Wellbore").TypeInField("demo",3000,0).select_Fontstyle("Bold");
	    
	    Reporter.log("Selected text is modified to BoldStyle ",true);

	}
	
	@Test(enabled=false)
	public void TC_003_TextFieldItalicStyle_Wellbore() throws Throwable{
		
		homepage = new homePage(driver);

		AddMasterPage newMasterPage = homepage.clickOnMasterPage().click_NewMasterPage();
		newMasterPage.enter_Name("TextFieldControl_Wellbore");
		newMasterPage.Enter_PageTitle("NusratMasterPage");
		newMasterPage.select_BookType("Well Book");
		newMasterPage.select_AssetType("Wellbore");
		newMasterPage.select_Discipline("Reservoir");
		newMasterPage.enter_ToolTip("TextFieldControl");
		Thread.sleep(3000);
		newMasterPage.select_ComponentToAdd("TextField Control",null);
		newMasterPage.select_ComponentName("TextFieldControl").select_Height("400").select_Width("700").select_MaxChar("3000");
		Thread.sleep(3000);
		newMasterPage.saveMasterPage();
		
		Reporter.log("To select BookName from MaintainBooks");
		MaintainBooks selectBookName = homepage.clickOnMaintainBooks().selectBookName("Koula Wellbook 2015");
		
		Reporter.log("To AddMasterPageToChapters");
	    homePage addMasterPageToChapters = selectBookName.AddMasterPageToChapters("Wellbore","TextFieldControl_Wellbore");
	     
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = addMasterPageToChapters.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("TextFieldControl_Wellbore");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("TextFieldControl_Wellbore").TypeInField("demo",3000,0).select_Fontstyle("Italic");
	    
	    Reporter.log("Selected text is modified to BoldStyle ",true);

	}
	
	@Test(enabled=false)
	public void TC_004_TextFieldUnderlineStyle_Wellbore() throws Throwable{
		
		homepage = new homePage(driver);

		AddMasterPage newMasterPage = homepage.clickOnMasterPage().click_NewMasterPage();
		newMasterPage.enter_Name("TextFieldControl_Wellbore");
		newMasterPage.Enter_PageTitle("NusratMasterPage");
		newMasterPage.select_BookType("Well Book");
		newMasterPage.select_AssetType("Wellbore");
		newMasterPage.select_Discipline("Reservoir");
		newMasterPage.enter_ToolTip("TextFieldControl");
		Thread.sleep(3000);
		newMasterPage.select_ComponentToAdd("TextField Control",null);
		newMasterPage.select_ComponentName("TextFieldControl").select_Height("400").select_Width("700").select_MaxChar("3000");
		Thread.sleep(3000);
		newMasterPage.saveMasterPage();
		
		Reporter.log("To select BookName from MaintainBooks");
		MaintainBooks selectBookName = homepage.clickOnMaintainBooks().selectBookName("Koula Wellbook 2015");
		
		Reporter.log("To AddMasterPageToChapters");
	    homePage addMasterPageToChapters = selectBookName.AddMasterPageToChapters("Wellbore","TextFieldControl_Wellbore");
	     
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = addMasterPageToChapters.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("TextFieldControl_Wellbore");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("TextFieldControl_Wellbore").TypeInField("demo",3000,0).select_Fontstyle("Underline");
	    
	    Reporter.log("Selected text is modified to BoldStyle ",true);

	}
	
	@Test(enabled=false)
	public void TC_005_TextFieldJustifyCenterStyle_Wellbore() throws Throwable{
		
		homepage = new homePage(driver);

		AddMasterPage newMasterPage = homepage.clickOnMasterPage().click_NewMasterPage();
		newMasterPage.enter_Name("TextFieldControl_Wellbore");
		newMasterPage.Enter_PageTitle("NusratMasterPage");
		newMasterPage.select_BookType("Well Book");
		newMasterPage.select_AssetType("Wellbore");
		newMasterPage.select_Discipline("Reservoir");
		newMasterPage.enter_ToolTip("TextFieldControl");
		Thread.sleep(3000);
		newMasterPage.select_ComponentToAdd("TextField Control",null);
		newMasterPage.select_ComponentName("TextFieldControl").select_Height("400").select_Width("700").select_MaxChar("3000");
		Thread.sleep(3000);
		newMasterPage.saveMasterPage();
		
		Reporter.log("To select BookName from MaintainBooks");
		MaintainBooks selectBookName = homepage.clickOnMaintainBooks().selectBookName("Koula Wellbook 2015");
		
		Reporter.log("To AddMasterPageToChapters");
	    homePage addMasterPageToChapters = selectBookName.AddMasterPageToChapters("Wellbore","TextFieldControl_Wellbore");
	     
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = addMasterPageToChapters.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("TextFieldControl_Wellbore");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("TextFieldControl_Wellbore").TypeInField("demo",3000,0).select_Fontstyle("JustifyCenter");
	    
	    Reporter.log("Selected text is modified to BoldStyle ",true);

	}
	
	@Test(enabled=false)
	public void TC_006_TextField_Fontsize_Wellbore() throws Throwable{
		
		homepage = new homePage(driver);

		AddMasterPage newMasterPage = homepage.clickOnMasterPage().click_NewMasterPage();
		newMasterPage.enter_Name("TextFieldControl_Wellbore");
		newMasterPage.Enter_PageTitle("NusratMasterPage");
		newMasterPage.select_BookType("Well Book");
		newMasterPage.select_AssetType("Wellbore");
		newMasterPage.select_Discipline("Reservoir");
		newMasterPage.enter_ToolTip("TextFieldControl");
		Thread.sleep(3000);
		newMasterPage.select_ComponentToAdd("TextField Control",null);
		newMasterPage.select_ComponentName("TextFieldControl").select_Height("400").select_Width("700").select_MaxChar("3000");
		Thread.sleep(3000);
		newMasterPage.saveMasterPage();
		
		Reporter.log("To select BookName from MaintainBooks");
		MaintainBooks selectBookName = homepage.clickOnMaintainBooks().selectBookName("Koula Wellbook 2015");
		
		Reporter.log("To AddMasterPageToChapters");
	    homePage addMasterPageToChapters = selectBookName.AddMasterPageToChapters("Wellbore","TextFieldControl_Wellbore");
	     
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = addMasterPageToChapters.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("TextFieldControl_Wellbore");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("TextFieldControl_Wellbore").TypeInField("demo",3000,0).select_fontsize(16);
	    
	    Reporter.log(" Text is modified to selected fontsize ",true);

	}
	
	@Test(enabled=false)
	public void TC_007_TextField_ExceedCharacterLimit_Wellbore() throws Throwable{
		
		homepage = new homePage(driver);

		AddMasterPage newMasterPage = homepage.clickOnMasterPage().click_NewMasterPage();
		newMasterPage.enter_Name("TextFieldControl_Wellbore");
		newMasterPage.Enter_PageTitle("NusratMasterPage");
		newMasterPage.select_BookType("Well Book");
		newMasterPage.select_AssetType("Wellbore");
		newMasterPage.select_Discipline("Reservoir");
		newMasterPage.enter_ToolTip("TextFieldControl");
		Thread.sleep(3000);
		newMasterPage.select_ComponentToAdd("TextField Control",null);
		newMasterPage.select_ComponentName("TextFieldControl").select_Height("400").select_Width("700").select_MaxChar("3000");
		Thread.sleep(3000);
		newMasterPage.saveMasterPage();
		
		Reporter.log("To select BookName from MaintainBooks");
		MaintainBooks selectBookName = homepage.clickOnMaintainBooks().selectBookName("Koula Wellbook 2015");
		
		Reporter.log("To AddMasterPageToChapters");
	    homePage addMasterPageToChapters = selectBookName.AddMasterPageToChapters("Wellbore","TextFieldControl_Wellbore");
	     
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = addMasterPageToChapters.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("TextFieldControl_Wellbore");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("TextFieldControl_Wellbore").TypeInField("demo",3000,1);
	    
	    ebookViewDetails.getAlert();
	    
	    Reporter.log(" Exceeded character count ",true);

	}
	
	@Test(enabled=false)
	public void TC_008_TextField_SaveTextFieldContent_Wellbore() throws Throwable{
		
		homepage = new homePage(driver);

		AddMasterPage newMasterPage = homepage.clickOnMasterPage().click_NewMasterPage();
		newMasterPage.enter_Name("TextFieldControl_Wellbore");
		newMasterPage.Enter_PageTitle("NusratMasterPage");
		newMasterPage.select_BookType("Well Book");
		newMasterPage.select_AssetType("Wellbore");
		newMasterPage.select_Discipline("Reservoir");
		newMasterPage.enter_ToolTip("TextFieldControl");
		Thread.sleep(3000);
		newMasterPage.select_ComponentToAdd("TextField Control",null);
		newMasterPage.select_ComponentName("TextFieldControl").select_Height("400").select_Width("700").select_MaxChar("3000");
		Thread.sleep(3000);
		newMasterPage.saveMasterPage();
		
		Reporter.log("To select BookName from MaintainBooks");
		MaintainBooks selectBookName = homepage.clickOnMaintainBooks().selectBookName("Koula Wellbook 2015");
		
		Reporter.log("To AddMasterPageToChapters");
	    homePage addMasterPageToChapters = selectBookName.AddMasterPageToChapters("Wellbore","TextFieldControl_Wellbore");
	     
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = addMasterPageToChapters.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("TextFieldControl_Wellbore");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);
	    
	    ebookViewDetails.select_Page("TextFieldControl_Wellbore").TypeInField("demo",3000,0);
	    
	    
	    Reporter.log(" Max character entered ",true);
	    
	    ebookViewDetails.save_TextFieldContent();
	    
	    Reporter.log(" Content Saved ",true);
	    
	    

	}
	
	
	
	
	@Test(enabled=false)
	public void TC_009_TextFieldControlMaxLimit_well() throws Throwable{
		
		homepage = new homePage(driver);

		AddMasterPage newMasterPage = homepage.clickOnMasterPage().click_NewMasterPage();
		newMasterPage.enter_Name("TextFieldControl_Well");
		newMasterPage.Enter_PageTitle("NusratMasterPage");
		newMasterPage.select_BookType("Well Book");
		newMasterPage.select_AssetType("Well");
		newMasterPage.select_Discipline("Reservoir");
		newMasterPage.enter_ToolTip("TextFieldControl");
		Thread.sleep(3000);
		newMasterPage.select_ComponentToAdd("TextField Control",null);
		newMasterPage.select_ComponentName("TextFieldControl").select_Height("400").select_Width("700").select_MaxChar("4000");
		Thread.sleep(3000);
		newMasterPage.saveMasterPage();
		
		
		// Adding chapters to Master Page
		Reporter.log("To select BookName from MaintainBooks");
		MaintainBooks selectBookName = homepage.clickOnMaintainBooks().selectBookName("Koula Wellbook 2015");
		
		Reporter.log("To AddMasterPageToChapters");
	    homePage addMasterPageToChapters = selectBookName.AddMasterPageToChapters("Wellbore","TextFieldControl_Well");
	     
	    Reporter.log("Select BookName for which component is added from homePage");
	     ebooks_BookViewer selectBooks = addMasterPageToChapters.clickon_eBooks().selectBooks("Koula Wellbook 2015");
		
	     Reporter.log("Select the required details in ebookViewer Page");
	    ebooks_BookViewer ebookViewDetails = selectBooks.select_PageName("TextFieldControl_Well");
	    
	    Reporter.log("Save the Page");
	    ebookViewDetails.applyViewerPage();
		
	    Reporter.log("View page created",true);

	    ebookViewDetails.select_Page("TextFieldControl_Wellbore").TypeInField("demo",4000,0);
	    
	    Reporter.log("Maximum character limit is checked",true);

	}



	
	

	
}
