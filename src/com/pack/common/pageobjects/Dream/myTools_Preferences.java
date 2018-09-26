package com.pack.common.pageobjects.Dream;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class myTools_Preferences {

	
	private  WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}
	
	
	public myTools_Preferences(WebDriver driver ) {
		
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'My Tools')]")
	private   WebElement linkMyTools;
	
	@FindBy(xpath="//a[contains(text(),'My Preferences')]")
	private   WebElement linkMyToolsMyPreferences;
	
	@FindBy(id="cmdReset")
	private   WebElement btnReset;
	
	@FindBy(id="cboDisplay")
	private   WebElement drpdownDefaultResultDisplay;
	
	
	@FindBy(id="ddlUnitGroup")
	private   WebElement drpdownUnitGroup;
	
	
	@FindBy(xpath="//*[@id='btnUnit']")
	private   WebElement bttnUnit;
	
	@FindBy(id="cboCountry")
	private   WebElement drpdowncboCountry;
	
	@FindBy(id="cboSEDAssetOwner")
	private   WebElement drpdownDefaultAssetOwner;
	
	@FindBy(id="cboAsset")
	private   WebElement drpdownDefaultDreamAsset;
	
	@FindBy(id="cboSEDAsset")
	private   WebElement drpdownDefaultSEDAsset;
	
	@FindBy(id="cboDefaultColumn")
	private   WebElement drpdownDefaultColumn;
	
	@FindBy(id="cboRecordsPerPage")
	private   WebElement drpdownRecordsPerPage;
	
	@FindBy(id="cboBasin")
	private   WebElement drpdownBasin;
	
	@FindBy(id="cboSearchCollection")
	private   WebElement drpdownSearchCollection;
	
	@FindBy(id="cboDefaulteBookDisplay")
	private   WebElement drpdownDefaulteBookDisplay;
	
	@FindBy(id="cboDefaultFilterView")
	private   WebElement drpdownDefaultFIlterView;
	
	@FindBy(id="txtLinkTitle1")
	private   WebElement txtTitle;
	
	@FindBy(id="txtLinkUrl1")
	private   WebElement txtURL;
	
	@FindBy(id="ddlUnits")
	private   WebElement drpdownUnits;
	
	@FindBy(id="cmdSubmit")
	private   WebElement btnSubmit;
	
	@FindBy(id="cmdClose")
	private   WebElement btnClose;
	
	@FindBy(id="lblMessage")
	private   WebElement txtMessage;
	
	@FindBy(xpath="//a[contains(text(),'My Links')]")
	private   WebElement linkMyToolsMyLinks;
	
	@FindBy(xpath="//*[@id=\"WebHeader_tMenu_MenuInternaln41\"]/td/table/tbody/tr/td/a ")
	private   WebElement linkMyToolsMyLinksSubmenu;
	
	
	public WebElement getlinkMyToolsMyLinks() {
		return linkMyToolsMyLinks;
	}
	
	public WebElement getlinkMyToolsMyPreferences() {
		return linkMyToolsMyPreferences;
	}
	
	public WebElement getdrpdownDefaultResultDisplay() {
		return drpdownDefaultResultDisplay;
	}
	
	public WebElement getdrpdownUnitGroup() {
		return drpdownUnitGroup;
	}
	
	public WebElement getbttnUnit() {
		return bttnUnit;
	}
	
	public WebElement getdrpdowncboCountry() {
		return drpdowncboCountry;
	}
	
	public WebElement getdrpdownDefaultAssetOwner() {
		return drpdownDefaultAssetOwner;
	}
	
	public WebElement getdrpdownDefaultDreamAsset() {
		return drpdownDefaultDreamAsset;
	}
	
	public WebElement getdrpdownDefaultSEDAsset() {
		return drpdownDefaultSEDAsset;
	}
	
	public WebElement getdrpdownDefaultColumn() {
		return drpdownDefaultColumn;
	}
	
	public WebElement getdrpdownRecordsPerPage() {
		return drpdownRecordsPerPage;
	}
	
	public WebElement getdrpdownBasin() {
		return drpdownBasin;
	}
	
	public WebElement getdrpdownSearchCollection() {
		return drpdownSearchCollection;
	}
	
	public WebElement getdrpdownDefaulteBookDisplay() {
		return drpdownDefaulteBookDisplay;
	}
	
	public WebElement getdrpdownDefaultFIlterView() {
		return drpdownDefaultFIlterView;
	}
	
	public WebElement gettxtTitle() {
		return txtTitle;
	}
	
	public WebElement gettxtURL() {
		return txtURL;
	}
	
	public WebElement getdrpdownUnits() {
		return drpdownUnits;
	}
	
	public WebElement getbtnSubmit() {
		return btnSubmit;
	}
	
	public WebElement getbtnClose() {
		return btnClose;
	}
	
	public WebElement gettxtMessage() {
		return txtMessage;
	}
	
	public WebElement getbtnReset() {
		return btnReset;
	}
	
	public WebElement getlinkMyToolsMyLinksSubmenu() {
		return linkMyToolsMyLinksSubmenu;
	}
	
	//Generic method for  My Tools
		public myTools_Preferences myToolsPreferences(WebElement element) throws InterruptedException {
			  Actions actions = new Actions(driver);
			  actions.moveToElement(linkMyTools).click(element).build().perform();
			  Thread.sleep(3000);
			return this;
			 	  
			  
		}
	
		public void switchToParentWindow() throws InterruptedException {
			Set<String>windowid=driver.getWindowHandles();
			Iterator<String>itr=windowid.iterator();
			String mainwindow=itr.next();
			String childwindow=itr.next();
			driver.close();
			driver.switchTo().window(mainwindow);
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			
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
	
	public void getText(WebElement element) {
		String message=element.getText();
		System.out.println(message);
	}
	
	
	public myTools_Preferences subMenuLink(WebElement element) throws InterruptedException {
		  Actions actions = new Actions(driver);
		  actions.moveToElement(linkMyTools).perform();
		  Thread.sleep(3000);
		  actions.moveToElement(linkMyToolsMyLinks).click(element).build().perform();
		  
		return this;
			  
	}
	
}
