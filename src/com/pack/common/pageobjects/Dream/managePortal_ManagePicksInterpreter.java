package com.pack.common.pageobjects.Dream;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class managePortal_ManagePicksInterpreter {
	
	
	private  WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}
	
	
	public managePortal_ManagePicksInterpreter(WebDriver driver ) {
		
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
	}
	
	@FindBy(xpath = "//*[contains(text(),'Manage Portal')]")
	 private WebElement lnkManagePortal;
	
	@FindBy(xpath = "//*[contains(text(),'Manage Picks Interpreter')]")
	 private WebElement lnkManagePicksInterpreter;
	
	
	@FindBy(xpath = "(//*[@id='gvBindsTable_edit_button_1'])[2]")
	 private WebElement btnEdit;
	 
	 @FindBy(id = "gvBindsTable_Title_1")
	 private WebElement txtTitle;
	
	@FindBy(id= "gvBindsTable_Active_1")
	 private WebElement chkbxActive;
			 
	@FindBy(xpath= "(//*[@id='gvBindsTable_update_button_1'])[2]")
	private WebElement btnUpdate;		 
	
	public WebElement getlnkManagePicksInterpreter() {
		return lnkManagePicksInterpreter;
	}
	
	public WebElement getbtnEdit() {
		return btnEdit;
	}
	
	public WebElement gettxtTitle() {
		return txtTitle;
	}
	
	public WebElement getchkbxActive() {
		return chkbxActive;
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

}
