package com.pack.common.pageobjects.Dream;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SpecialSearches {
	private WebDriver driver;
	public static String winHandleAfter;

	public WebDriver getDriver() {
		return driver;
	}

	public SpecialSearches(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
		PageFactory.initElements(factory, this);
	}

	@FindBy(xpath = "//*[@id='BodyContent_bsMenu_divSplSearch']")
	WebElement specialSearches;
	@FindBy(xpath = "//*[@id='BodyContent_bsMenu_logsFieldTR']/td/div")
	private List<WebElement> specialCollectionItems;
	@FindBy(xpath = "//*[@id='txtWellboreName']")
	private WebElement BiotxtWellboreName;
	@FindBy(xpath = "//*[@id='txtStratigraphicUnit']")
	private WebElement BiotxtStratigraphicUnit;
	@FindBy(xpath = "//*[@id='txtStratigraphicColumn']")
	private WebElement BiotxtStratigraphicColumn;
	@FindBy(xpath = "//*[@id='txtSaveSearch']")
	private WebElement BiotxtSaveSearch;
	@FindBy(xpath = "//*[@id='chbShared']")
	private WebElement BiochbShared;
	@FindBy(xpath = "//*[@id='cmdSaveSearch']")
	private WebElement BiocmdSaveSearch;
	@FindBy(xpath="//*[@id='txtWell']")
	private WebElement FluidtxtWell;
	@FindBy(xpath="//*[@id='txtReservior']")
	private WebElement FluidtxtReservior;
	@FindBy(xpath="//*[@id='txtField']")
	private WebElement FluidtxtField;
	@FindBy(xpath="//*[@id='txtSiteFacility']")
	private WebElement FluidtxtSiteFacility;
	@FindBy(xpath="//*[@id='txtHoleNumber']")
	private WebElement FluidtxtHoleNumber;
	@FindBy(xpath="//*[@id='txtFiscalPoint']")
	private WebElement FluidtxtFiscalPoint;
	@FindBy(xpath="//*[@id='txtFromDate']")
	private WebElement FluidtxtFromDate;
	@FindBy(xpath="//*[@id='txtToDate']")
	private WebElement FluidtxtToDate;
	@FindBy(xpath="//*[@id='ddlFluidType']")
	private WebElement FluidddlFluidType;
	public WebElement getFluidddlFluidType() 
	{
		return FluidddlFluidType;
	}
	public WebElement getFluidtxtToDate() 
	{
		return FluidtxtToDate;
	}
	public WebElement getFluidtxtFromDate() 
	{
		return FluidtxtFromDate;
	}
	public WebElement getFluidtxtFiscalPoint() 
	{
		return FluidtxtFiscalPoint;
	}
	public WebElement getFluidtxtHoleNumber() 
	{
		return FluidtxtHoleNumber;
	}
	public WebElement getFluidtxtSiteFacility() 
	{
		return FluidtxtSiteFacility;
	}
	public WebElement getFluidtxtField() 
	{
		return FluidtxtField;
	}
	public WebElement getFluidtxtReservior() 
	{
		return FluidtxtReservior;
	}
	public WebElement getFluidtxtWell() 
	{
		return FluidtxtWell;
	}
	public SpecialSearches getBiocmdSaveSearch() {
		BiocmdSaveSearch.click();
		return this;
	}

	public WebElement getBiotxtStratigraphicUnit() {
		return BiotxtStratigraphicUnit;
	}

	public SpecialSearches getBiochbShared() {
		BiochbShared.click();
		return this;
	}

	public WebElement gettxtStratigraphicColumn() {
		return BiotxtStratigraphicColumn;
	}

	public WebElement gettxtSaveSearch() {
		return BiotxtSaveSearch;
	}

	public WebElement getBiotxtWellboreName() {
		return BiotxtWellboreName;
	}

	public SpecialSearches getSpecialSearches() throws Throwable {
		specialSearches.click();
		Thread.sleep(10000);
		return this;
	}

	public SpecialSearches selectingItems(String items) throws Exception {
		Thread.sleep(1000);
		for (int i = 0; i < specialCollectionItems.size(); i++)

		{
			String text = specialCollectionItems.get(i).getText();
			System.out.println(text);
			if (text.equalsIgnoreCase(items)) {
				specialCollectionItems.get(i).click();
				break;
			}

		}
		return this;
	}

}
