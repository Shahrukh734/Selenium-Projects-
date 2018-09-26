package com.pack.common.pageobjects_eBooks;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.pack.base.BaseMethods;



public class homePage extends BaseMethods{

	//BaseMethods basepage;
	
	private  WebDriver driver;

	

	public WebDriver getDriver() {
		return driver;
	}
	 
	
	
	  @FindBy(xpath="//*[@class='WebHeader_tMenu_MenuInternal_1 WebHeader_tMenu_MenuInternal_3' and contains(.,'Manage eBooks')]")
	  private  WebElement select_ManageeBooks;
	  
	  
	  @FindBy(xpath="//*[@class='WebHeader_tMenu_MenuInternal_1 WebHeader_tMenu_MenuInternal_3' and contains(.,'Manage Portal')]")
	  private  WebElement select_ManagePortal;
	  
	
	  
	  @FindBy(xpath="//*[text()='Maintain Master Pages']")
	  private  WebElement select_MaintainMasterPages;
	 
	  @FindBy(xpath="//*[text()='Maintain Books']")
	  private  WebElement select_MaintainBooks;
	  
	  
	  @FindBy(xpath="//*[text()='Maintain Templates']")
	  private  WebElement select_MaintainTemplates;
	  
	  @FindBy(xpath="//*[text()='Batch Import Configuration']")
	  private  WebElement select_BatchImportConfiguration;
	  
	  
	  @FindBy(xpath="//*[@id='WebHeader_MenuInternaln1']/table//a[text()='eBooks']")
	  private  WebElement click_ebooks;
	  
	  @FindBy(xpath="//*[text()='Maintain Generic Components']")
	  private  WebElement select_MaintainGenericComponent;
	  
	  
	 @FindBy(name="ctl00_ctl00_BodyContent_radPaneRight")
	  private  WebElement frameName;
	  
		public WebElement getFrameName() 
		{
			return frameName;
		}
	  
		@FindBy(id="iframeDWB")
		  private  WebElement frameId_eBooks;
		
//

	public homePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
	}
	

	
	
	
	public MaintainMasterPage clickOnMasterPage() throws Throwable{
		Reporter.log("Select Master Page from Manage Books");
		
		mouseHoverJScript(select_ManageeBooks, select_MaintainMasterPages);
		
		//hoverandselectElement(select_ManageeBooks, select_MaintainMasterPages);
	
		Reporter.log("Master Page is selected");
		
		Thread.sleep(3000);
		
		return new MaintainMasterPage(driver);
	}
	

	public MaintainBooks clickOnMaintainBooks() throws Throwable{
		Reporter.log("Select MaintainBooks page");
		mouseHoverJScript(select_ManageeBooks, select_MaintainBooks);
		
		Reporter.log("MaintainBooks page is selected");
		switchtoFrame(frameName);
		Thread.sleep(5000);
		
		
		return new MaintainBooks(driver);
	}
	
	
	

	
	public eBooksPage clickon_eBooks() throws Throwable{
		currentWindowHandle();
		click_ebooks.click();
		switchWindows();
		Thread.sleep(5000);
		
		
		//Thread.sleep(10000);
	
		 return new eBooksPage(driver);
		
	}
 
		
		 
	public MaintainGenericComponents clickOn_MaintainGenericComponent() throws Throwable{
		Reporter.log("Select MaintainGenericComponent Page from Manage Portal");
		
		mouseHoverJScript(select_ManagePortal, select_MaintainGenericComponent);
	
		Reporter.log("MaintainGenericComponent Page is selected");
		Thread.sleep(4000);
		
				return new MaintainGenericComponents(driver);
	}






	
	
	
	

}
