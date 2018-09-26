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

public class manageSED_EditOwners {
	
	
	private  WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}
	
	
	public manageSED_EditOwners(WebDriver driver ) {
		
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
	}
	
	
	@FindBy(xpath = "//a[contains(text(),'Manage SED')]")
	 private WebElement lnkManageSED;
	
	
	@FindBy(xpath = "//a[contains(text(),'Edit Owners')]")
	 private WebElement lnkEditOwners;
	
	@FindBy(id = "btnInsert")
	 private WebElement btnInsert;
	
	@FindBy(xpath = "//input[@id='gvBindsTable_Owner Id_0']")
	 private WebElement txtID;
	
	@FindBy(xpath = "//input[@id='gvBindsTable_Owner Name_0']")
	 private WebElement txtName;
	
	@FindBy(xpath = "//input[@id='gvBindsTable_DISCIPLINE_0']")
	 private WebElement txtDiscipline;
	 
	 @FindBy(xpath = "//*[@id='gvBindsTable_Is Active_0']")
	 private WebElement lstActive;
	 
	 @FindBy(xpath = "(//input[@id='gvBindsTable_update_button_0'])[2]")
	 private WebElement btnUpdate;
	 
	 @FindBy(xpath = "(//a[@id='gvBindsTable_Owner Name'])[1]")
	 private WebElement lnkName;
	 
	 @FindBy(xpath= "(//input[@name='gvBindsTable$ctl02$edit_button'])[2]")
	 private WebElement btnEdit;
	 
	 
	 @FindBy(xpath= "(//input[@id='gvBindsTable_delete_button_0'])[2]")
	 private WebElement btnDelete;
	
	public WebElement getlnkEditOwners() {
		return lnkEditOwners;
	}
	
	public WebElement getbtnInsert() {
		return btnInsert;
	}
	
	
	public WebElement gettxtID() {
		return txtID;
	}
	
	public WebElement gettxtName() {
		return txtName;
	}
	
	public WebElement gettxtDiscipline() {
		return txtDiscipline;
	}
	
	public WebElement getlstActive() {
		return lstActive;
	}
	
	public WebElement getbtnUpdate() {
		return btnUpdate;
	}
	
	public WebElement getlnkName() {
		return lnkName;
	}
	
	public WebElement getbtnEdit() {
		return btnEdit;
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
	

}
