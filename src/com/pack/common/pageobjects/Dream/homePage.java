package com.pack.common.pageobjects.Dream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class homePage {

	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(id = "BodyContent_ddlCountry")
	private WebElement countryDropdown;

	@FindBy(id = "BodyContent_ddlAsset")
	private WebElement AssetDropdown;

	@FindBy(id = "BodyContent_ddlColumn")
	private WebElement columnDropdown;

	@FindBy(id = "BodyContent_txtCriteria")
	private WebElement searchText;

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public void setCountryDropdown(WebElement countryDropdown) {
		this.countryDropdown = countryDropdown;
	}

	public WebElement getAssetDropdown() {
		return AssetDropdown;
	}

	public void setAssetDropdown(WebElement assetDropdown) {
		AssetDropdown = assetDropdown;
	}

	public WebElement getColumnDropdown() {
		return columnDropdown;
	}

	public void setColumnDropdown(WebElement columnDropdown) {
		this.columnDropdown = columnDropdown;
	}

	@FindBy(id = "BodyContent_btnGo")
	public static WebElement GoBtn;

	public homePage(WebDriver driver) {
		// super(driver);
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
		PageFactory.initElements(factory, this);
	}

	/**
	 * @param quicksearchdropdown
	 * @param dropdownvalue
	 * @return
	 */
	public homePage adminViaDropDown(WebElement quicksearchdropdown, String dropdownvalue) {
		Select drop = new Select(quicksearchdropdown);
		drop.selectByVisibleText(dropdownvalue);

		return this;
		// drop.selectByValue(dropdownvalue);
	}

	/**
	 * @param text
	 * @return
	 */
	public contextsearch selectText(String text) {

		searchText.sendKeys(text);
		GoBtn.click();

		return new contextsearch(driver);

	}

}
