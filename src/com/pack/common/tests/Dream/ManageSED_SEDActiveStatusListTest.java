package com.pack.common.tests.Dream;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.manageSED_EditGroups;
import com.pack.common.pageobjects.Dream.manageSED_SEDActiveStatusList;

public class ManageSED_SEDActiveStatusListTest extends TestBaseSetup{
	
public manageSED_SEDActiveStatusList manageedActiveStatus ; 
	
	public fetchingReports fetchingreports;
	
	@Test(enabled=true)
	public void TC_077_ManageSED_SEDActiveStatusList() throws Throwable {
		
		Reporter.log("Move The Cursor On Manage SED");
		fetchingreports=new fetchingReports(driver);
		manageedActiveStatus= new manageSED_SEDActiveStatusList(driver);
		Reporter.log("Click on SED Active Status List under Manage SED");
		manageedActiveStatus.manageSED(manageedActiveStatus.getlnkSEDActiveStatusList());
		manageedActiveStatus.switchToFrame("ctl00_ctl00_BodyContent_radPaneRight");
		Thread.sleep(2000);
		manageedActiveStatus.getbtnInsert().click();
		Thread.sleep(2000);
		manageedActiveStatus.gettxtStatus().sendKeys("AAAA123");
		manageedActiveStatus.getbtnUpdate().click();
		fetchingreports.getAlert();
		Thread.sleep(3000);
		
//		WebElement table = driver.findElement(By.xpath("//table[@id='tblSearchResults']/tbody"));
//        //Get all rows (tr tags)
//
//        List<WebElement> rows = table.findElements(By.tagName("tr"));
//
//         //Print data from each row (Data from each td tag)
//
//         for (WebElement row : rows) {
//
//         List<WebElement> cols = row.findElements(By.tagName("td"));
//
//                for (WebElement col : cols) {
//
//                      System.out.print(col.getText() + "\t");
//
//                }
//
//        System.out.println();
//
//        }


				
	}

}
