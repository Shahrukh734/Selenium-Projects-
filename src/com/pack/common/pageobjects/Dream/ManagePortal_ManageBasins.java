package com.pack.common.pageobjects.Dream;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ManagePortal_ManageBasins {
	
	
	private  WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}
	
	
	public ManagePortal_ManageBasins(WebDriver driver ) {
		
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
	}
	
	@FindBy(xpath = "//*[contains(text(),'Manage Portal')]")
	 private WebElement lnkManagePortal;
	
	@FindBy(xpath = "//*[contains(text(),'Manage Basin')]")
	 private WebElement lnkManageBasin;
	
	@FindBy(id = "btnInsert")
	 private WebElement btnInsert;
	 
	 @FindBy(id = "gvBindsTable_Basin_Name_0")
	 private WebElement txtBasinName;
	 
	 @FindBy(id = "gvBindsTable_Active_0")
	 private WebElement chkbxActive;
			 
	@FindBy(xpath = "(//*[@id='gvBindsTable_update_button_0'])[2]")
	private WebElement btnUpdate;		 
	
	@FindBy(xpath = "(//*[@id='gvBindsTable_edit_button_5'])[2]")
	private WebElement btnEdit;			
	
	@FindBy(xpath = "(//*[@id='gvBindsTable_update_button_5'])[2]")
	private WebElement bttnUpdate;	
	
			
	@FindBy(id = "gvBindsTable_Basin_Name_5")
	private WebElement textBasinName;	
	
	@FindBy(xpath = "(//*[@id='gvBindsTable_delete_button_5'])[2]")
	private WebElement btnDelete;	
			
	public WebElement getbtnInsert() {
		return btnInsert;
	}
	
	public WebElement getlnkManageBasin() {
		return lnkManageBasin;
	}
	
	public WebElement gettxtBasinName() {
		return txtBasinName;
	}
	
	public WebElement getchkbxActive() {
		return chkbxActive;
	}
	
	public WebElement getbtnUpdate() {
		return btnUpdate;
	}
	
	public WebElement getbtnEdit() {
		return btnEdit;
	}
	
	public WebElement getbttnUpdate() {
		return bttnUpdate;
	}
	
	public WebElement gettextBasinName() {
		return textBasinName;
	}
	
	public WebElement getbtnDelete() {
		return btnDelete;
	}
	
	//Generic method for manage portal
			public void manageTools(WebElement element) throws InterruptedException {
				  Actions actions = new Actions(driver);
				  actions.moveToElement(lnkManagePortal).click(element).build().perform();
				  		  
			}
			
			public void switchToFrame(String txt) throws Throwable{
				
				List<WebElement> frame = driver.findElements(By.tagName("iframe"));
				
				for(int i=0;i<frame.size();i++){
				System.out.println(frame.get(i).toString());
				}
				
				driver.switchTo().frame(txt);
				Thread.sleep(2000);
								
			}
	

}
