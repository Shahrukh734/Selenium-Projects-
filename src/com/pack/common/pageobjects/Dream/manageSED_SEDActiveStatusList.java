package com.pack.common.pageobjects.Dream;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class manageSED_SEDActiveStatusList {
	
	private  WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}
	
	
	public manageSED_SEDActiveStatusList(WebDriver driver ) {
		
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Manage SED')]")
	 private WebElement lnkManageSED;
	
	@FindBy(xpath = "//a[contains(text(),'SED Active Status List')]")
	 private WebElement lnkSEDActiveStatusList;
	
	@FindBy(id = "btnInsert")
	 private WebElement btnInsert;
	 
	 @FindBy(xpath = "//input[@id='gvBindsTable_STATUS VALUE_0']")
	 private WebElement txtStatus;
			 
	@FindBy(xpath = "(//input[@id='gvBindsTable_update_button_0'])[2]")
	private WebElement btnUpdate;		 
	
	public WebElement getlnkSEDActiveStatusList() {
		return lnkSEDActiveStatusList;
	}
	
	public WebElement getbtnInsert() {
		return btnInsert;
	}
	
	public WebElement gettxtStatus() {
		return txtStatus;
	}
	
	public WebElement getbtnUpdate() {
		return btnUpdate;
	}
	
	//Generic method for manage portal
	public void manageSED(WebElement element) throws InterruptedException {
		  Actions actions = new Actions(driver);
		  actions.moveToElement(lnkManageSED).click(element).build().perform();
		  		  
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
