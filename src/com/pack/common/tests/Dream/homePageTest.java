package com.pack.common.tests.Dream;

import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.homePage;

public class homePageTest extends TestBaseSetup{
	
	
	
	
	//public  WebDriver driver;
	public homePage basePage ;
	
/*	@BeforeClass
	public void setUp() {
		
	getDriver();
	}*/
	
	
	//@Test
/*	public void urlLogin(){
		
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Nusrat.Pathan\\workspace\\WRFM Automation\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://wrfm-ssw-pt-st.sharing.shell.com/App/Dream/Home.aspx#");
		
	}*/
	
	@Test(enabled=true)
	public void TC_001_Quicksearch() throws Throwable{
		
	 basePage = new homePage(driver);

	 basePage.adminViaDropDown(basePage.getCountryDropdown(), "NETHERLANDS");
	 basePage.adminViaDropDown(basePage.getAssetDropdown(), "Wellbore");
	 basePage.adminViaDropDown(basePage.getColumnDropdown(), "--All Columns--");
	 basePage.selectText("T*");
	 
	}
	
	/*@AfterMethod(enabled=true)
	public void browserClose(){
		
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().defaultContent();
		driver.navigate().refresh();	
		
	}*/
	
	
	
	@Test(enabled=true)
	public void TC_002_Quicksearch() throws Throwable{
		
	 basePage = new homePage(driver);

	 basePage.adminViaDropDown(basePage.getCountryDropdown(), "NETHERLANDS");
	 basePage.adminViaDropDown(basePage.getAssetDropdown(), "Well");
	 basePage.adminViaDropDown(basePage.getColumnDropdown(), "--All Columns--");
	 basePage.selectText("T*");
	 
	}
	
	@Test(enabled=true)
	public void TC_003_Quicksearch() throws Throwable{
		
	 basePage = new homePage(driver);

	 basePage.adminViaDropDown(basePage.getCountryDropdown(), "NETHERLANDS");
	 basePage.adminViaDropDown(basePage.getAssetDropdown(), "Field");
	 basePage.adminViaDropDown(basePage.getColumnDropdown(), "--All Columns--");
	 basePage.selectText("T*");
	 
	}
	
	@Test(enabled=true)
	public void TC_004_Quicksearch() throws Throwable{
		
	 basePage = new homePage(driver);

	 basePage.adminViaDropDown(basePage.getCountryDropdown(), "NETHERLANDS");
	 basePage.adminViaDropDown(basePage.getAssetDropdown(), "Conduit");
	 basePage.adminViaDropDown(basePage.getColumnDropdown(), "--All Columns--");
	 basePage.selectText("T*");
	 
	}
	
	
}
