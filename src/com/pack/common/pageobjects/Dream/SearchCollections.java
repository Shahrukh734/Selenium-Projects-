package com.pack.common.pageobjects.Dream;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchCollections 
{
	private WebDriver driver;
	public static String winHandleAfter;

	public WebDriver getDriver() 
	{
		return driver;
	}

	public SearchCollections(WebDriver driver) 
	{
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
		PageFactory.initElements(factory, this);
	}

	fetchingReports fetching = new fetchingReports(driver);

	@FindBy(xpath = "//*[contains(text(),'Search Collection')]")
	private WebElement searchCollection;
	@FindBy(xpath = "//*[@id='BodyContent_bsMenu_linkQuerySearch']/div")
	private List<WebElement> searchCollectionItems;
	@FindBy(xpath = "//*[@id='QuerySearch_plusImg']")
	private WebElement imgIcon;
	@FindBy(xpath = "//*[@id='cboSavedSearch']")
	private WebElement ddlSavedSearch;
	@FindBy(xpath = "//*[@name='ctl00_ctl00_BodyContent_radPaneRight']")
	private WebElement fameByname;
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement selectSearchButton;
	@FindBy(xpath = "//input[@value='Save Search']")
	private WebElement btnSavedSearch;
	@FindBy(xpath = "//*[@id='txtSaveSearchName']")
	private WebElement txtSaveSearchName;
	@FindBy(xpath = "//*[@value='Reset']")
	private WebElement getBtnReset;
	@FindBy(xpath = "//*[@id='editButton']")
	private WebElement editButton;
	@FindBy(xpath = "//input[@id='viewButton']")
	private WebElement viewSqlButton;
	@FindBy(xpath = "//*[@id='saveButton']")
	private WebElement saveButtonIcon;
	@FindBy(xpath = "//input[@id='ClearButton']")
	private WebElement resetIcon;
	@FindBy(xpath = "//*[@id='RunButton']")
	private WebElement runButton;
	@FindBy(xpath = "//*[@id='WellAdvanceSearch_plusImg']")
	private WebElement WellAdvanceSearchPlusImg;
	@FindBy(xpath = "//*[@id='WellboreAdvanceSearch_plusImg']")
	private WebElement WellboreAdvanceSearchPlusImg;
	@FindBy(xpath = "//*[@id='FieldAdvanceSearch_plusImg']")
	private WebElement FieldAdvanceSearch;
	@FindBy(xpath = "//*[@id='QuerySearch_plusImg']")
	private WebElement QuaryAdvanceSearch;
	@FindBy(xpath = "//*[@id='GeneralQuerySearch_plusImg']")
	private WebElement GeneralQuaryAdvanceSearch;

	@FindBy(xpath = "//*[@id='BiostratigraphySplSearch_plusImg']")
	private WebElement BiostratigraphySplSearch;
	@FindBy(xpath = "//*[@id='FluidSampleSplSearch_plusImg']")
	private WebElement FluidSampleSplSearch;
	@FindBy(xpath="//*[@id='DeleteWellAdvanceSearch']")
	private WebElement DeleteWellAdvanceSearch;
	@FindBy(xpath = "//*[@id='txtSaveSearch']")
	private WebElement txtSaveSearcInAdvance;
	@FindBy(xpath = "//*[@id='cmdSaveSearch']")
	private WebElement btnSavedSearchInAdvance;
	@FindBy(xpath = "//*[@id='txtCommon_Name']")
	private WebElement txtWellCommonName;
	
	public WebElement gettxtWellCommonName()
	{
		return txtWellCommonName;
	}
	
	public WebElement gettxtSaveSearcInAdvance()
	{
		return txtSaveSearcInAdvance;
	}
	public SearchCollections getDeleteWellAdvanceSearch()throws Throwable
	{
		Thread.sleep(1000);
		DeleteWellAdvanceSearch.click();
		isAlertPresentSearch();
		return this;
	}
	public SearchCollections getBiostratigraphySplSearch() throws Throwable 
	{
		Thread.sleep(2000);
		BiostratigraphySplSearch.click();
		return this;
	}

	public SearchCollections getFluidSampleSplSearch() throws Throwable 
	{
		Thread.sleep(2000);
		FluidSampleSplSearch.click();
		return this;
	}

	public SearchCollections getGeneralQuaryAdvanceSearch() throws Throwable 
	{
		Thread.sleep(2000);
		GeneralQuaryAdvanceSearch.click();
		return this;
	}

	public SearchCollections getQuaryAdvanceSearch() throws Throwable 
	{
		Thread.sleep(2000);
		QuaryAdvanceSearch.click();
		return this;
	}

	public SearchCollections getFieldAdvanceSearch() throws Throwable 
	{
		Thread.sleep(2000);
		FieldAdvanceSearch.click();
		return this;
	}
	
	public SearchCollections getWellboreAdvanceSearchPlusImg() throws Throwable 
	{
		Thread.sleep(2000);
		WellboreAdvanceSearchPlusImg.click();
		return this;
	}

	public SearchCollections getSharedSearchItemsSub(String item) 
	{
		try 
		{
			driver.findElement(By.xpath("//a[contains(text(),'" + item + "')]/../../td[3]/a")).click();
		} catch (Exception e) {
			System.out.println("item not found" + e);
		}
		return this;
	}
	//a[contains(text(),'Auto_Spl_Well')]/../../td[1]

	public SearchCollections getSharedSearchItemsMain(String item) 
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'" + item + "')]")).click();
		} catch (Exception e) {
			System.out.println("item not found" + e);
		}
		return this;
	}
	public SearchCollections getMySearchCheckBox(String item) 
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'"+ item +"')]/../../td[1]")).click();
		} catch (Exception e) {
			System.out.println("item not found" + e);
		}
		return this;
	}
	public SearchCollections getSharedSearchItemsModify(String item) 
	{
		try 
		{
			driver.findElement(By.xpath("// a[contains(text(),'"+ item +"')]/../../td[4]/a")).click();
		} catch (Exception e) {
			System.out.println("item not found" + e);
		}
		return this;
	}

	public SearchCollections getWellAdvanceSearchPlusImg() throws Throwable 
	{
		Thread.sleep(2000);
		WellAdvanceSearchPlusImg.click();
		return this;
	}

	public SearchCollections getrunButton() throws Throwable 
	{
		Thread.sleep(2000);
		runButton.click();
		return this;
	}

	public SearchCollections getresetIcon() throws Throwable 
	{
		Thread.sleep(2000);
		resetIcon.click();
		return this;
	}

	public SearchCollections getsaveButtonIcon() throws Throwable 
	{
		Thread.sleep(2000);
		saveButtonIcon.click();
		return this;
	}

	public SearchCollections getViewSqlButton() throws Throwable
	{
		Thread.sleep(2000);
		viewSqlButton.click();
		return this;
	}

	public SearchCollections geteditButton() throws Throwable 
	{
		Thread.sleep(2000);
		editButton.click();
		Thread.sleep(2000);
		return this;
	}

	public SearchCollections getBtnReset() 
	{
		getBtnReset.click();
		return this;
	}

	public WebElement gettxtSavedSearch() 
	{
		return txtSaveSearchName;
	}

	public WebElement getDdlSavedSearch() 
	{
		return ddlSavedSearch;
	}

	public SearchCollections getImgIcon() throws Throwable 
	{
		imgIcon.click();
		Thread.sleep(2000);
		return this;
	}

	public SearchCollections selectSearchCollection() throws Throwable 
	{
		//Thread.sleep(10000);
		searchCollection.click();
		Thread.sleep(30000);
		return this;
	}

	public SearchCollections selectingItems(String items) throws Exception 
	{
		Thread.sleep(1000);
		for (int i = 0; i < searchCollectionItems.size(); i++)
		{
			String text = searchCollectionItems.get(i).getText();
			System.out.println(text);
			if (text.equalsIgnoreCase(items)) 
			{
				searchCollectionItems.get(i).click();
				break;
			}

		}
		return this;
	}

	public SearchCollections getSwitchFrame() 
	{
		driver.switchTo().frame(fameByname);
		return this;
	}

	public SearchCollections selectBtnSavedSearch() 
	{
		btnSavedSearch.click();
		return this;
	}
	public SearchCollections getbtnSavedSearchInAdvance() 
	{
		btnSavedSearchInAdvance.click();
		return this;
	}
	
	public SearchCollections selectDropdown(WebElement QuarySearchDropdown, String dropdownvalue) 
	{

		try
		{
			Select dd = new Select(QuarySearchDropdown);
			dd.selectByValue(dropdownvalue);
		} catch (Exception e) {
			System.out.println("element not selected" + e);
		}
		return this;

	}

	public SearchCollections selectSearchButton() 
	{
		getSelectSearchButton().click();
		return this;
	}

	public WebElement getSelectSearchButton() 
	{
		return selectSearchButton;
	}
	public SearchCollections getAlert()
	{

		Alert alert = driver.switchTo().alert();		
		System.out.println(alert.getText());
		alert.accept();
		return new SearchCollections(driver);	
	}
	public boolean isAlertPresentSearch()
	{
		try
		{
			getAlert();
		} 
		catch (NoAlertPresentException ex)
		{
			return false;
		}
		return true;
	}

}
