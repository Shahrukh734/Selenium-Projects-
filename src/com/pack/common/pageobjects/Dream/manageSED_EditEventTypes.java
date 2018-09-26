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

public class manageSED_EditEventTypes {
	
	
	
	private  WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}
	
	
	public manageSED_EditEventTypes(WebDriver driver ) {
		
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
	}
	
	
	@FindBy(xpath = "//a[contains(text(),'Manage SED')]")
	 private WebElement lnkManageSED;
	
	
	@FindBy(xpath = "//a[contains(text(),'Edit Event Types')]")
	 private WebElement lnkEditEventTypes;
	
	@FindBy(id = "btnInsert")
	 private WebElement btnInsert;
	
	 @FindBy(id = "gvBindsTable_EVENT TYPE ID_0")
	 private WebElement txtEventTypeCode;
	 
	 
	 @FindBy(id = "gvBindsTable_EVENT TYPE NAME_0")
	 private WebElement txtEventTypeName;
	 
	 @FindBy(id = "gvBindsTable_EVENT GROUP ID_0")
	 private WebElement lstGroupCode;
	 
	 @FindBy(id = "gvBindsTable_EDM EVENT CODE_0")
	 private WebElement txtEDMEventCode;
			 
	@FindBy(xpath = "(//input[@id='gvBindsTable_update_button_0'])[2]")
	private WebElement btnUpdate;
	
	@FindBy(id = "gvBindsTable_EVENT TYPE ID")
	private WebElement clkTableEventType;
	
	@FindBy(xpath= "(//input[@name='gvBindsTable$ctl03$edit_button'])[2]")
	private WebElement btnEdit;
	
	@FindBy(id = "gvBindsTable_EVENT GROUP ID_1")
	 private WebElement listGroupCode;
			 
	 @FindBy(xpath = "(//input[@id='gvBindsTable_update_button_1'])[2]")
	 private WebElement bttnupdate;
			 
	 @FindBy(xpath = "(//input[@id='gvBindsTable_delete_button_1'])[2]")
	 private WebElement btnDelete;		 
	 
			 
	public WebElement getlnkEditEventTypes() {
		return lnkEditEventTypes;
	}
	
	public WebElement getbtnInsert() {
		return btnInsert;
	}
	
	public WebElement gettxtEventTypeCode() {
		return txtEventTypeCode;
	}
	
	public WebElement gettxtEventTypeName() {
		return txtEventTypeName;
	}
	
	public WebElement getlstGroupCode() {
		return lstGroupCode;
	}
	
	public WebElement gettxtEDMEventCode() {
		return txtEDMEventCode;
	}
	
	public WebElement getbtnUpdate() {
		return btnUpdate;
	}
	
	
	public WebElement getclkTableEventType() {
		return clkTableEventType;
	}
	
	
	public WebElement getbtnEdit() {
		return btnEdit;
	}
	
	
	public WebElement getlistGroupCode() {
		return listGroupCode;
	}
	
	public WebElement getbttnupdate() {
		return bttnupdate;
	}
	
	public WebElement getbtnDelete() {
		return btnDelete;
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
	
			public void typeCode(String text) {
				
				driver.findElement(By.xpath("//*[contains(text(),'"+text+"')]/../../td/div/input[1]")).click();
			}
			
}
