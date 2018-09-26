package com.pack.common.pageobjects_eBooks;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.pack.base.BaseMethods;



public class ebooks_BookViewer extends BaseMethods{

	//BaseMethods basepage;
	
	private  WebDriver driver;

	

	public WebDriver getDriver() {
		return driver;
	}
	
	
	  @FindBy(id="usrctrlViewBookFilter_ddlSavedView")
	  private  WebElement select_ebookView;
	  
	  @FindBy(id="usrctrlViewBookFilter_lstChapterTitle")
	  private  WebElement select_chapterTitle;
	  
	  @FindBy(id="usrctrlViewBookFilter_lstPageName")
	  private  WebElement select_pageName;
	  
	  @FindBy(id="usrctrlViewBookFilter_lstDiscipline")
	  private  WebElement select_Discipline;
	  
	  @FindBy(id="usrctrlViewBookFilter_txtViewName")
	  private  WebElement enter_ebookViewName;
	  
	  @FindBy(id="usrctrlViewBookFilter_btnSave")
	  private  WebElement button_SaveBookViewerPage;
	  
	  @FindBy(id="usrctrlViewBookFilter_btnApply")
	  private  WebElement button_ApplyBookViewerPage;
	  
	  @FindBy(xpath="//*[@id='headerSecondRow1']/td")
	  private  WebElement dynamic_ColumnName;
	
	  @FindBy(xpath="//*[contains(@class,'rtTop rtSelected')]//span[2]")
	  private  WebElement click_book;
	  
	  @FindBy(xpath="//*[contains(@class,'rtTop rtSelected')]//span[2]")
	  private  WebElement click_Book;
	 
	  @FindBy(xpath="//span[contains(@id,'usrctrlType5Reports_CharacterLength')]")
	  private  WebElement remainingCharacter;
	  
	  @FindBy(xpath="//input[contains(@name,'usrctrlType5Reports') and @value='Save']")
	  private  WebElement save_TextFieldContent;
	  
	  
	  @FindBy(xpath="//*[contains(@id,'component')]")
	  private  List<WebElement> componentName_Page; 

	  @FindBy(xpath="//*[@id='ddlPeriodInstance']")
	  private  WebElement select_EnableDate;
	
	  @FindBy(xpath="//*[@id='usrctrlType5Reports_frmGTCDatePickerInstance_dateInput']")
	  private  WebElement Enter_FromDate;
	  
	  @FindBy(xpath="//*[@id='usrctrlType5Reports_toGTCDatePickerInstance_dateInput']")
	  private  WebElement Enter_ToDate;
	  
	  @FindBy(xpath="//*[contains(@id,'btnPageFilterApply')]")
	  private  WebElement click_Apply;
	  
	  @FindBy(xpath="//*[contains(@id,'btnPageFilterReset')]")
	  private  WebElement click_Reset;
	  
	  @FindBy(xpath="//*[contains(@id,'btnShow')]")
	  private  WebElement click_zoomIn;
	  
	  @FindBy(xpath="//*[contains(@class,'close')]")
	  private  WebElement click_zoomOut;
	  
	  @FindBy(xpath="//table[contains(@id,'tblSearchResults')]//tr[2]/td")
	  private  List<WebElement> display_columnName; 
	  
	  @FindBy(xpath="//table[contains(@id,'tblSearchResults')]//tr[2]/td[contains(text(),'(')]")
	  private  List<WebElement> display_columnName_IsUnitApplicable; 
	
	
	public ebooks_BookViewer(WebDriver driver) {
		super(driver);
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
	}
	

	

	public ebooks_BookViewer select_ebookView(){
		try{
		selectFromDropDownByText(select_ebookView,"Select");
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
			System.out.println("ebookView not selected");
		}

		return this;

		
	}
	
	public ebooks_BookViewer select_chapterTitle(String text){
		
		try{
			selectFromDropDownByText(select_chapterTitle,"All");
			Thread.sleep(3000);
			}
			catch(Exception e)
			{
				
				System.out.println("ebookView not selected");
			}

			return this;

	}
	
	public ebooks_BookViewer select_PageName(String text){
		//contextClick();
		
		String pageName=AddMasterPage.getMasterPageName();
		try{
			selectFromDropDownByText(select_pageName,pageName);
			Thread.sleep(3000);
			}
			catch(Exception e)
			{
				
				System.out.println("ebookView not selected");
			}

			return this;

	}
	
	public ebooks_BookViewer select_Discipline(String text){
		
		try{
			selectFromDropDownByText(select_Discipline,"All");
			Thread.sleep(3000);
			}
			catch(Exception e)
			{
				
				System.out.println("ebookView not selected");
			}

			return this;

	}
	
	public ebooks_BookViewer enter_ebookViewName(String text){
		
		enterTextValue(enter_ebookViewName,text);
		
		return this;
	}
	
	public ebooks_BookViewer applyViewerPage() throws Throwable{
		clickOnElement(button_ApplyBookViewerPage);
		
		Thread.sleep(10000);
		
		return this;
	}
	public ebooks_BookViewer saveViewerPage() throws Throwable{
		clickOnElement(button_SaveBookViewerPage);
	
		Thread.sleep(5000);
		return this;
	}
	
	public ebooks_BookViewer TypeInField(String value,int maxcount,int exceedlimit){
		
		
	    String val = value; 
	    
	    WebElement frameId = driver.findElement(By.xpath("//*[@id='usrctrlType5Reports_rdRadEditor0_contentIframe']"));
	    switchtoFrame(frameId);
	
	 //  int n= (maxcount/val.length())+exceedlimit;
	 //  System.out.println(n);
	    for (int i = 0; i <(maxcount/val.length())+exceedlimit; i++)
	    {
	       
	         driver.findElement(By.cssSelector("body")).sendKeys(value);
	    }  
	    
	    
	    	
	    	System.out.println("Remaining characters" +remainingCharacter.getText());
	
	   
	    
	    return this;
	}
	
	public ebooks_BookViewer select_Fontstyle(String fontstyle){
		
		
		
		doubleClickElement();
		
		driver.findElement(By.xpath("//span[@class='" + fontstyle + "']")).click();
		
		return this;
		
		
	}

	public ebooks_BookViewer select_Page(String pageName1) throws Throwable{
		
		String pageName=AddMasterPage.getMasterPageName();
		
		
		//clickOnElement(click_Book);
		
		driver.findElement(By.xpath("//li[contains(@class,'rtLI')][1]//span[@class='rtPlus']")).click();
		
		Thread.sleep(3000);
				
		WebElement pName = driver.findElement(By.xpath("//ul[@class='rtUL']//span[@class='rtIn' and contains(text(),'" + pageName + "')]"));
		
		if(pName.getText().contains(pageName)){
		clickOnElement(pName);
		}
		Thread.sleep(5000);
		return this;
		
		
	}
	
	
	public ebooks_BookViewer select_fontsize(int fontsize) throws Throwable{
		
		doubleClickElement();
		
		driver.findElement(By.xpath("//span[@class='RealFontSize']")).click();
		
		
		driver.findElement(By.xpath("//div[@class='Default reDropDownBody '][2]//td[contains(text(),'" + fontsize + "')]")).click();
		
		return this;
		
	}
	
	public ebooks_BookViewer save_TextFieldContent(){
		clickOnElement(save_TextFieldContent);
	
		
		return this;
	}
	
	public ebooks_BookViewer componentName_PageDisplayName(){
		
		for (WebElement element  : componentName_Page) {
			
			
			
			Reporter.log("Added component Name in Page are :"+element.getText(), true);

			
			   }

		return this;
		
	}
	
	
	public ebooks_BookViewer click_zoomIn() throws Throwable{
		
		clickOnElement(click_zoomIn);
		
		takeSnapShot(System.getProperty("user.dir")+"\\Screenshots\\zoomin.png");
		
		Reporter.log("Zoom out screenshot captured",true);
		
		clickOnElement(click_zoomOut);
		
		Reporter.log("zoom out is clicked ",true);
		
		return this;
	}
	
	
	public ebooks_BookViewer check_EnableDateRange(String FromDate, String ToDate){
		enterTextValue(Enter_FromDate,FromDate);
		enterTextValue(Enter_ToDate,ToDate);
		
		
		return this;
	}
	
	public ebooks_BookViewer select_EnableDate(int index){
		
		try{
			selectFromDropDownByIndex(select_EnableDate,1);
			Thread.sleep(3000);
			Reporter.log("From date"+Enter_FromDate.getText(),true);
			Reporter.log("From date"+Enter_ToDate.getText(),true);
			}
			catch(Exception e)
			{
				
				System.out.println("Period is selected");
			}

			return this;

	}
	
	public ebooks_BookViewer click_Apply() throws Throwable{
		clickOnElement(click_Apply);
		Thread.sleep(5000);
		
		return this;
	}
	
	
	public ebooks_BookViewer click_Reset() throws Throwable{
		clickOnElement(click_Reset);
		Thread.sleep(5000);
		Reporter.log("From date"+Enter_FromDate.getText(),true);
		Reporter.log("From date"+Enter_ToDate.getText(),true);
		
		return this;
	}
	
	

	
	// Creating Methods Nusrat 11July
	
	public ebooks_BookViewer getbackgroundcolor(){
	
	String attribute = driver.findElement(By.xpath("//table[contains(@id,'tblSearchResults')]//tbody[@class='scrollContent']/tr/td[1]")).getAttribute("backgroung-color");

	Reporter.log("Color Applicable for  columnName is :"+attribute,true);
	
	return this;
	}
	
	
	public ebooks_BookViewer display_columnName(){
		
		for(WebElement column : display_columnName ){
			
			Reporter.log("Displayed column Name are :"+column ,true);
		}
		return this;
		
	}
	
	
	public ebooks_BookViewer display_columnName_IsUnitApplicable(){
		
		for(WebElement column : display_columnName_IsUnitApplicable ){
			
			Reporter.log("Displayed Is unit applicable column Name are :"+column ,true);
		}
		return this;
		
	}
	
	
	
	
	
}
