package com.pack.common.tests_eBooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects_eBooks.homePage;

public class homePageTest extends TestBaseSetup{
	
	
	
	
	//public  WebDriver driver;
	public homePage homepage ;
	
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
	public void TC_001_ebooks() throws Throwable{
		
		homepage = new homePage(driver);
		
		homepage.clickOnMasterPage();

	}


	
}
