package com.pack.common.pageobjects.Dream;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class managePortal_ManageCountry {
	
	
	private  WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}
	
	
	public managePortal_ManageCountry(WebDriver driver ) {
		
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
	}
	
	
	@FindBy(xpath = "//*[contains(text(),'Manage Portal')]")
	 private WebElement lnkManagePortal;
	
	@FindBy(xpath = "//*[contains(text(),'Manage Country')]")
	 private WebElement lnkManagecountry;
	 
	 @FindBy(id = "btnInsert")
	 private WebElement btnInsert;
	
	 
	 @FindBy(id = "gvBindsTable_Country_Name_0")
	 private WebElement txtCountryName;
	 
	 @FindBy(id = "gvBindsTable_Country_Code_0")
	 private WebElement txtCountryCode;
	 
	 
	 @FindBy(id = "gvBindsTable_Active_Choice_0")
	 private WebElement chkbxActive_Choice;
	 
	 
	 @FindBy(xpath ="(//*[@id='gvBindsTable_update_button_0'])[2]")
	 private WebElement btnadd;
	 
	 @FindBy(xpath ="(//input[@id='gvBindsTable_edit_button_6'])[2]")
	 private WebElement btnEdit;
	 
	 @FindBy(xpath= "//textarea[@id='gvBindsTable_Country_Code_6']")
	 private WebElement txtUpdateCountryCode;
	
	 @FindBy(xpath ="(//*[@id='gvBindsTable_update_button_6'])[2]")
	 private WebElement btnUpdate;
	 
			 
	@FindBy(xpath ="(//*[@id='gvBindsTable_cancel_button_6'])[2]")
	private WebElement btnCancel;
	
	@FindBy(xpath ="(//*[@id='gvBindsTable_delete_button_6'])[2]")
	private WebElement btnDelete;		
			
	public WebElement getbtnInsert() {
		return btnInsert;
	}
	
	public WebElement getlnkManagecountry() {
		return lnkManagecountry;
	}
	
	public WebElement gettxtCountryName() {
		return txtCountryName;
	}
	
	public WebElement gettxtCountryCode() {
		return txtCountryCode;
	}
	
	public WebElement getchkbxActive_Choice() {
		return chkbxActive_Choice;
	}
	
	public WebElement getbtnadd() {
		return btnadd;
	}
	
	public WebElement getbtnEdit() {
		return btnEdit;
	}
	
	public WebElement getbtnUpdate() {
		return btnUpdate;
	}
	
	public WebElement gettxtUpdateCountryCode() {
		return txtUpdateCountryCode;
	}
	
	
	public WebElement getbtnCancel() {
		return btnCancel;
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
