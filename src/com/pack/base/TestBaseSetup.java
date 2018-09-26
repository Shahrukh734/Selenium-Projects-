package com.pack.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;





public class TestBaseSetup {

	protected  WebDriver driver;
	
	

	public WebDriver getDriver() {
		return driver;
	}

	private void setDriver(String browserType, String appURL) {
		switch (browserType) {
		case "chrome":
			driver = initChromeDriver(appURL);
			break;
		case "internet":
			

			driver=initInternetDriver(appURL);
			//driver = initInternetDriver(appURL);
			
			break;
		default:
			System.out.println("browser : " + browserType
					+ " is invalid, Launching Firefox as browser of choice..");
			driver = initInternetDriver(appURL);
		}
	}

	private static WebDriver initChromeDriver(String appURL) {
		System.out.println("Launching google chrome with new profile..");
		System.out.println(System.getProperty("user.dir"));
	//	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "chromedriver.exe");
		
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		 

		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	private static WebDriver initInternetDriver(String appURL) {
		System.out.println("Launching Internet browser..");
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+ "\\Drivers\\IEDriverServer.exe");
		

		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
     	caps.setCapability("requireWindowFocus", true);
     	caps.setCapability("enablePersistentHover", true);
     	WebDriver  driver = new InternetExplorerDriver(caps);
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	@Parameters({ "browserType", "appURL" })
	@BeforeClass
	public void initializeTestBaseSetup(String browserType, String appURL) {
		try {
			setDriver(browserType, appURL);

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
	}
	
	
	@AfterMethod(alwaysRun = true)//AfterMethod annotation - This method executes after every test execution
	public void screenShot(ITestResult result) throws Throwable{
	//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
		if(ITestResult.SUCCESS==result.getStatus()|| ITestResult.FAILURE==result.getStatus()){
			try{
				// To create reference of TakesScreenshot
				TakesScreenshot screenshot=(TakesScreenshot)driver;
				// Call method to capture screenshot
				File src=screenshot.getScreenshotAs(OutputType.FILE);
				// Copy files to specific location 
				// result.getName() will return name of test case so that screenshot name will be same as test case name
				FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\Screenshots\\"+result.getName()+".png"));
				System.out.println("Successfully captured a screenshot");
			}catch (Exception e){
				System.out.println("Exception while taking screenshot "+e.getMessage());
			} 
	}
	driver.quit();
	Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
	
	System.out.println("Tasked Killed");
	}
	
	
}
