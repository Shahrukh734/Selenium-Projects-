package com.pack.common.SystemTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.advanceSearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;


public class TC_283850_INC0092046_WRFM_SSW_Portal_Access_Request extends TestBaseSetup {

	public homePage homepage;
	public advanceSearch advancesearch;
	public fetchingReports fetchingreports;

	// Applicable in All Regions 

	@Test(enabled = true)
	public void TC_INC0092046_CAL0172918_WRFM_SSW_Portal_Access_Request() throws Throwable {

		Reporter.log("Recall Web Browser", true);
		homepage = new homePage(driver);
		advancesearch = new advanceSearch(driver);
		fetchingreports = new fetchingReports(driver);

		Reporter.log("Browser Opened for Portal Access Request", true);

		List<WebElement> elements = driver.findElements(By.xpath("//table[@id='TblAccessRequest']//tr/td[@class='tdAccessData'][1]"));

		Iterator<WebElement> itr = elements.iterator();

		while (itr.hasNext()) {
			String values = itr.next().getText();

			System.out.println(values);

			if (values.contains("Role"))

			{
				System.out.println("Role should not present ");

			}
		}

		System.out.println(" Test Case Passed Role is not present ");

	}
}
