package com.pack.common.pageobjects_eBooks;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.pack.base.BaseMethods;



public class MaintainMasterPage extends BaseMethods{

	//BaseMethods basepage;
	
	private  WebDriver driver;

	

	public WebDriver getDriver() {
		return driver;
	}
	
	
	  @FindBy(name="ctl00_ctl00_BodyContent_radPaneRight")
	  private  WebElement frameName;
	  
	  @FindBy(xpath="//*[@id='btnNewMaster']")
	  private  WebElement click_NewMasterPage;
		


	public MaintainMasterPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
	}
	

	
	public AddMasterPage click_NewMasterPage() throws Throwable{
		
		Reporter.log(" Select NewMaster Page");
		
		switchtoFrame(frameName);
		
		Thread.sleep(3000);
		
		clickOnElement(click_NewMasterPage);
		Thread.sleep(5000);
		
		//driver.switchTo().defaultContent();
		
		Reporter.log(" NewMaster Page is clicked");
		
		return new AddMasterPage(driver);
	}
	
	
	public AddMasterPage select_MasterPage(String text) throws Throwable{
		Reporter.log(" Select Master Page to edit");
		
		switchtoFrame(frameName);
		
		Thread.sleep(3000);
		
		WebElement masterPage = driver.findElement(By.xpath("//td[contains(text(),'" + text + "')]"));
		
		String pageName=AddMasterPage.getMasterPageName();
		
		
		driver.findElement(By.xpath("//*[text()='" + pageName + "']/..//td[@class='printerFriendly'][1]")).click();
		
		
		Thread.sleep(3000);
		
		return new AddMasterPage(driver);
	}
	

	
	
	
	
	
	
	
	
	

}
