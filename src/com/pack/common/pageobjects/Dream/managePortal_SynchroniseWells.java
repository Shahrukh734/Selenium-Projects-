package com.pack.common.pageobjects.Dream;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class managePortal_SynchroniseWells {
	
	
	private  WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}
	
	
	public managePortal_SynchroniseWells(WebDriver driver ) {
		
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
	}
	
	@FindBy(xpath = "//*[contains(text(),'Manage Portal')]")
	 private WebElement lnkManagePortal;
	
	
	@FindBy(xpath = "//a[contains(text(),'Synchronise Wells')]")
	 private WebElement lnkSynchroniseWells;
	 
	 @FindBy(id = "MainContentPlaceHolder_lblMessage")
	 private WebElement msgSynchronisationCDS;
	
	public WebElement getlnkSynchroniseWellse() {
		return lnkSynchroniseWells;
	}
	
	public WebElement getmsgSynchronisationCDS() {
		return msgSynchronisationCDS;
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
	
			public void getText(WebElement element) {
				String message=element.getText();
				System.out.println(message);
			}

}
