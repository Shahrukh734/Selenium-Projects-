package com.pack.common.pageobjects.Dream;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ManageSED_EditResourceTypes {
	
	
	private WebDriver driver;
	public  static String winHandleBefore;
	
	

	public WebDriver getDriver() {
		return driver;
	}
	

	public  ManageSED_EditResourceTypes(WebDriver driver ) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
	}
	
	
	
	
	@FindBy(xpath="//*[@id='btnInsert']")
	private WebElement btnInsert;
	
	
	@FindBy(xpath="(//*[@id='gvBindsTable_edit_button_0'])[2]")
	private WebElement btnEdit;
	
	
	@FindBy(xpath="(//*[@id='gvBindsTable_delete_button_0'])[2]")
	private WebElement btnDelete;
	
	@FindBy(xpath="(//*[@id='gvBindsTable_update_button_0'])[2]")
	private WebElement btnUpdate;

	
	@FindBy(xpath="(//*[@id='gvBindsTable_cancel_button_0'])[2]")
	private WebElement btnCancel;
	
	
	@FindBy(xpath="//*[@id='gvBindsTable_RESOURCE TYPE NAME_0' and @type='text']")
	private WebElement ABBREV;
	
	@FindBy(xpath="//*[@id='gvBindsTable']/tbody/tr[2]/td[3]/div/input")
	private WebElement Description;
	
	
	
	
	//id="gvBindsTable_RESOURCE TYPE DESC_0"--> description ].
	public WebElement getABBREV(){
		return ABBREV;	
	}
	public WebElement getDescription(){
		return Description;	
	}
		
	
	public WebElement getbtnInsert(){
		return btnInsert;	
	}
	
	public WebElement gebtnCancel(){
		return btnCancel;	
	}
	public WebElement gebtnUpdate(){
		return btnUpdate;	
	}
	
	public WebElement getbtnEdit(){
		return btnEdit;	
	}
	
	
	public WebElement getbtnDelete(){
		return btnDelete;	
	}
	
	public fetchingReports getAlert(){
		
		Alert alert = driver.switchTo().alert();		
		System.out.println(alert.getText());
		alert.accept();
		
		return new fetchingReports(driver);	
		
	}

  	public boolean isAlertPresent() {
  		try {
  			getAlert();
  		} // try
  		catch (NoAlertPresentException Ex) {

  			return false;
  		}
  		return true;
  	}
  	
  
  	public static String RandomString(int length){
  		String alphabet =  new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"); //9
  		int n = alphabet.length(); //10

  		String result = new String(); 
  		Random r = new Random(); //11

  		for (int i=0; i<length; i++) //12
  		    result = "AA" +result + alphabet.charAt(r.nextInt(n)); //13
        System.out.println(result);
  		return result;
  		}
	
    public void Swichframe(){
  	  WebElement frameId1 = driver.findElement(By.name("ctl00_ctl00_BodyContent_radPaneRight"));
		driver.switchTo().frame(frameId1);
    }
	
	
	
	
	
	
	
}


