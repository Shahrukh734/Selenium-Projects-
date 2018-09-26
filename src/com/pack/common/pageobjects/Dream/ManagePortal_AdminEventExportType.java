package com.pack.common.pageobjects.Dream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ManagePortal_AdminEventExportType {
	
	
	private  WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}
	
	
	public ManagePortal_AdminEventExportType(WebDriver driver ) {
		
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
	}
	
	@FindBy(xpath = "//*[contains(text(),'Manage Portal')]")
	 private WebElement lnkManagePortal;
	
	@FindBy(xpath = "//a[contains(text(),'Admin Export Event Types')]")
	 private WebElement lnkAdminExportEventTypes;
	
	public WebElement getlnkAdminExportEventTypes() {
		return lnkAdminExportEventTypes;
	}

	//Generic method for manage portal
	public void manageTools(WebElement element) throws InterruptedException {
		  Actions actions = new Actions(driver);
		  actions.moveToElement(lnkManagePortal).click(element).build().perform();
		  		  
	}
	
}
