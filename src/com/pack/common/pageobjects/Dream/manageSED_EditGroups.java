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

public class manageSED_EditGroups {
	
	
	private  WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}
	
	
	public manageSED_EditGroups(WebDriver driver ) {
		
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Manage SED')]")
	 private WebElement lnkManageSED;
	
	@FindBy(xpath = "//a[contains(text(),'Edit Groups')]")
	 private WebElement lnkEditGroups;
	
	@FindBy(id = "btnInsert")
	 private WebElement btnInsert;
	
	@FindBy(xpath = "//input[@name='gvBindsTable$ctl02$EVENT GROUP NAME']")
	 private WebElement txtGroupName;
	
	@FindBy(xpath = "//*[@id='gvBindsTable_EVENT GROUP ID_0']")
	 private WebElement lstGroupId;
			 
	@FindBy(xpath = "(//input[@id='gvBindsTable_update_button_0'])[2]")
	private WebElement btnUpdate;		 
	
	public WebElement getlnkEditGroups() {
		return lnkEditGroups;
	}
	
	public WebElement getbtnInsert() {
		return btnInsert;
	}
	
	public WebElement gettxtGroupName() {
		return txtGroupName;
	}
	
	public WebElement getlstGroupId() {
		return lstGroupId;
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
