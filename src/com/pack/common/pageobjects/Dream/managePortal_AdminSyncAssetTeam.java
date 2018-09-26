package com.pack.common.pageobjects.Dream;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class managePortal_AdminSyncAssetTeam {
	
	
	private  WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}
	
	
	public managePortal_AdminSyncAssetTeam(WebDriver driver ) {
		
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
	}
	
	@FindBy(xpath = "//*[contains(text(),'Manage Portal')]")
	 private WebElement lnkManagePortal;

	
	@FindBy(xpath = "//a[contains(text(),'Admin Sync Asset Team')]")
	 private WebElement lnkAdminSyncAssetTeam;
	 
	 
	 @FindBy(id = "linkClickeHere")
	 private WebElement linkClickeHere;
	 
	 @FindBy(xpath= "//input[@id='gvAdminSyncAssetTeam_imgbtnEdit_1']")
	 private WebElement btnEdit;
	 
	 @FindBy(id= "gvAdminSyncAssetTeam_ddlStatus_1")
	 private WebElement listStatus;
	 
	 @FindBy(id= "gvAdminSyncAssetTeam_imgbtnUpdate_1")
	 private WebElement btnUpdate;
	 
	
	public WebElement getlnkAdminSyncAssetTeam() {
		return lnkAdminSyncAssetTeam;
	}
	
	public WebElement getlinkClickeHere() {
		return linkClickeHere;
	}
	
	public WebElement getbtnEdit() {
		return btnEdit;
	}
	
	public WebElement getlistStatus() {
		return listStatus;
	}
	
	public WebElement getbtnUpdate() {
		return btnUpdate;
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
	
		//Drop Down method to select items from the list
		public void drpdownList(WebElement element,String text) throws InterruptedException {
			
			Select oSelect = new Select(element);
			List <WebElement> elementCount = oSelect.getOptions();
			Thread.sleep(3000);
			for(WebElement we:elementCount){
				//System.out.println(we.getText());
				if(we.getText().equalsIgnoreCase(text)) {
					we.click();
				break;
				}
			}
		}
	
	
}
