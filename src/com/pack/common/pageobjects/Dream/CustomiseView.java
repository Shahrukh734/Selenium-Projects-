package com.pack.common.pageobjects.Dream;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CustomiseView {
	
	private   WebDriver driver;
	public  static String winHandleBefore;

	public CustomiseView(WebDriver driver) {
		
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
		// TODO Auto-generated constructor stub
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	
	// Customise view Click 
	
	@FindBy(xpath="//*[@id='btnShowDiv']")
	private  WebElement btnShowDivClick;
	
	public WebElement btnShowDivClick(){
		
		btnShowDivClick.click();
		return btnShowDivClick;
			
		
	}
	
	// Customise view Select All
	
		@FindBy(xpath="//*[@id='chkbxCheckUncheckAll']")
		private  WebElement chkbxCheckUncheckAll;
		
		public WebElement chkbxCheckUncheckAll(){
			
			chkbxCheckUncheckAll.click();
			return chkbxCheckUncheckAll;
				
			
		} 
		// Customise view Apply
		
			@FindBy(xpath="//*[@id='btnShow']")
			private  WebElement btnShow;
			
			public WebElement btnShow(){
				
				btnShow.click();
				return btnShow;
					
				
			} 
		
			// Customise view Apply & Save
			
				@FindBy(xpath="//*[@id='btnSavenShow']")
				private  WebElement btnSavenShow;
				
				public WebElement btnSavenShow(){
					
					btnSavenShow.click();
					return btnSavenShow;
						
					
				} 
							
				 // Selecting Frame 
				public CustomiseView selectFrame() throws Throwable{
					
					
					
					List<WebElement> frame = driver.findElements(By.tagName("iframe"));
					
					for(int i=0;i<frame.size();i++){
					System.out.println(frame.get(i).toString());
					}
					
					WebElement frameId1 = driver.findElement(By.name("ctl00_ctl00_BodyContent_radPaneRight"));

					driver.switchTo().frame(frameId1);
					Thread.sleep(3000);

					//SelectRecords(8);
					//driver.switchTo().defaultContent();
					
					return this;
					
				}	
}
