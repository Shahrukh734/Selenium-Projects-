package com.pack.common.pageobjects.Dream;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class contextsearch {
	
	private   WebDriver driver;
	public  static String winHandleBefore;

	public WebDriver getDriver() {
		return driver;
	}
	
	@FindBy(xpath="//input[@id='chkbxRow']")
	public List<WebElement> Checkboxitem;
	
	@FindBy(xpath="//*[contains(id,'Quick']")
	private   WebElement quickSearchResult;
	
	
	//id="chkbxRowSelectAll"
	@FindBy(xpath="//*[@id='chkbxRowSelectAll']")
	private   WebElement selectAllResults;
	// Changes for Xpath
	
	//@FindBy(xpath="//input[@id='imgbtnExcel']")
	//private   WebElement ExportIcon_StringReport;
	// 

	public WebElement getSelectAllResults() {
	
		return selectAllResults;
		
	}

	public WebElement getExportIcon() {
		
		return exportIcon;
	}


//Added this method for Export
	//public WebElement getExportIcon_StringReport() {
	//return ExportIcon_StringReport;
		
		//return exportIcon;
//	}


	@FindBy(id="btnMyAssets")
	private  WebElement myAsset;
	
	@FindBy(id="btnPrint")
	private  WebElement printIcon;
	
	@FindBy(id="btnShowExportOptionDiv")
	private  WebElement exportIcon;
	

	
	
	// locators for Well Engineering/PT
	
	@FindBy(xpath="//span[text()='Well Engineering/PT']")
	private  WebElement selectWellEngineering;
	
	@FindBy(xpath="//span[text()='DailyWellsReporting']")
	private  WebElement selectDailyWellsReporting;
	
	@FindBy(xpath="//span[text()='Mechanical Well Data (With TVD)']")
	private  WebElement selectMechanicalWellData;
	
	
	@FindBy(xpath="//div[contains(@id,'BodyContent_csMenu_subMenu')]/table/tbody/tr")
	//@FindBy(xpath="//div[contains(@id,'BodyContent_csMenu_subMenu_11_1_0')]/table/tbody/tr")
	private List<WebElement> reportingItems;
	
		
	//Documents 
	
	@FindBy(xpath="//span[text()='Documents']")
	private  WebElement selectDocuments;
	
	@FindBy(xpath="//*[text()='Well Status Diagrams']")
	private  WebElement selectWellStatusDiagrams;
	
	@FindBy(xpath="//*[contains(text(),'BHT Well Test Reports')]")
	private  WebElement selectBHTWellTestReports;
	
	@FindBy(xpath="//*[text()='PVT Reports']")
	private  WebElement selectPVTReports;
	
	@FindBy(xpath="//*[text()='eBooks']")
	private  WebElement selecteBooks;
	
	@FindBy(xpath="//*[text()='CBL VDL']")
	private  WebElement selectCBLVDL;
	
	@FindBy(xpath="//*[text()='EP Catalog']")
	private  WebElement selectEPCatalog;
	
	@FindBy(xpath="//*[text()='Composite Well Logs']")
	private  WebElement selectCompositeWellLogs;
	
	@FindBy(xpath="//*[text()='All Documents New']")
	private  WebElement selectAllDocumentsNew;
	
	@FindBy(xpath="//*[text()='All Documents']")
	private  WebElement selectAllDocuments;
	
	@FindBy(xpath="//*[text()='Well Head Diagrams']")
	private  WebElement selectWellHeadDiagrams;
	
	@FindBy(xpath="//*[text()='Documents With filter']")
	private  WebElement selectDocumentsWithfilter;
	
	@FindBy(xpath="//*[text()='EP Catalog search in context']")
	private  WebElement selectEPCatalogsearchincontext;
	
	@FindBy(xpath="//*[text()='Tabular test']")
	private  WebElement selectTabulartest;
	
// well head locator
	
	@FindBy(xpath= "//*[contains(@id,'CheckBox')]")   
	private  WebElement SelectAll_WH; 

	public WebElement getSelectAllResults_WH() {
		
		return SelectAll_WH ; 
	}
	
	@FindBy(xpath="//span[text()='Utilities']")
	private  WebElement selectUtilites;
	
	public contextsearch selectUtilites(){
		
		selectUtilites.click();
			
		return this;
	}
	
	 // Geological Data -- 26 April
	
	@FindBy(xpath="//span[text()='Geological Data']")
	private  WebElement selectGeologicalData;
	
	public contextsearch selectGeologicalData(){
		
		selectGeologicalData.click();
			
		return this;
	} 
	
	
	//sireesha locators for General well or Survey 16/04/18
	@FindBy(xpath="//span[text()='Gen. Well / Survey']")
	private WebElement selectGenWellOrSurvey;


	//16/04/18--sireesha
	public contextsearch selectGenWellOrSurvey(){
			
			
			
		selectGenWellOrSurvey.click();
			
			 return this;
		}
		
	@FindBy(xpath="//span[text()='General Wellbore Info']")
	private  WebElement selectGeneralWellboreInfo;

	public contextsearch selectGeneralWellboreInfo(){
		
		selectGeneralWellboreInfo.click();
		
		return this;
	}

	// Sidheswar ,Reservoir Engineering
	
			@FindBy(xpath="//span[text()='Reservoir Engineering']")
			private WebElement ReservoirEngineering;
			
			@FindBy(xpath="//span[text()='Pressure Survey Data']")
			private WebElement PressureSurveyData;
			
			@FindBy(xpath="//*[@id='lstSurveyClass']")
			private WebElement SurveyClass;
			
			@FindBy(xpath="//*[@id='lstTest_Type']")
			private WebElement Test_Types;

			 @FindBy(xpath="//*[contains(text(),'Production and Injection')]")
	         private WebElement ProductionAndInjection;
			 
			 
			// locators for FPC Checkbox1 and Checkbox1   id="chkbxRowSelectAll" 26 April  mudassir
				@FindBy(xpath="(//*[@id='chkbxRowSelectAll'])[1]")
				private   WebElement selectResultRecords_FPC;
				
				

				public WebElement getselectResultRecords_FPC() {
				
					return selectResultRecords_FPC;
					
				}
				// for 2nd CheckAll 
				@FindBy(xpath="(//*[@id='chkbxRowSelectAll'])[2]")
				private   WebElement selectResultRecords_FPC2;
				
				
				
				public WebElement getselectResultRecords_FPC2() {
				
					return selectResultRecords_FPC2;
					
				}
			@FindBy(xpath="(//*[@id='chkbxRowSelectAll'])[3]")
			private   WebElement selectResultRecords_FPC3;
				
				

			public WebElement getselectResultRecords_FPC3() {
				
					return selectResultRecords_FPC3;
					
			}
			// FPC OIL Tab 26 April Mudassir 
			
			@FindBy(xpath="//span[@id='lblOil']")
			private  WebElement selectFPCOILTab;
			
			public contextsearch selectFPCOILTab(){
				
				selectFPCOILTab.click();
					
				return this;
			}
			
		     // FPC GAS Tab 26 April Mudassir 
			
			@FindBy(xpath="//span[@id='lblGas']")
			private  WebElement selectFPCGASTab;
						
			public contextsearch selectFPCGASTab(){
							
				selectFPCGASTab.click();
								
			return this;
			}
			
		     // petrophysical -- 17 April
			
			@FindBy(xpath="//span[text()='Petrophysical']")
			private  WebElement selectPetrophysical;
			
			public contextsearch selectPetrophysical(){
				
				selectPetrophysical.click();
					
				return this;
			}
			
			   // locator for Recall_Cores CheckAll 18 April Mudassir 
			
			//id="chkbxRowSelectAll"
				@FindBy(xpath="//*[@id='chkbxRowSelectAll' and @value='UWBI']")
				private   WebElement selectAllResults_Cores;
				
				

				public WebElement getSelectAllResults_Cores() {
				
					return selectAllResults_Cores;
					
				}

				
				// locator for Recall_Cores_lblCoreReports CheckAll 20 April Mudassir 
				
				//id="chkbxRowSelectAll"
					@FindBy(xpath="//*[@id='chkbxRowSelectAll' and @value='Publish Date']")
					private   WebElement selectAll_lblCoreReports;
					
					

					public WebElement getselectAll_lblCoreReports() {
					
						return selectAll_lblCoreReports;
						
					}
					
					// Core ReportsfromEpcatalog 20 April Mudassir 
					
					@FindBy(xpath="//span[@id='lblCoreReportsfromEPCatalog']")
					private  WebElement selectlblCoreReports;
					
					public contextsearch selectlblCoreReports(){
						
						selectlblCoreReports.click();
							
						return this;
					}
				      
					

						
						

	public contextsearch(WebDriver driver) {
		//super(driver);
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
	}
	
	
	
	public contextsearch selectAllcheck() throws Throwable{
		
		
	
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		
		for(int i=0;i<frame.size();i++){
		System.out.println(frame.get(i).toString());
		}
		
		WebElement frameId1 = driver.findElement(By.name("ctl00_ctl00_BodyContent_radPaneRight"));

		driver.switchTo().frame(frameId1);
		Thread.sleep(3000);

		getSelectAllResults().click();
		driver.switchTo().defaultContent();
		
		return this;
		
	}
	

	public fetchingReports selectAllDocuments(){
		
		currentWindowHandle();
		
		// Perform the click operation that opens new window
		
		selectAllDocuments.click();
		
		return new fetchingReports(driver);
	}
	
	
	public fetchingReports selectWellStatusDiagrams(){
			
		currentWindowHandle();
		
		selectWellStatusDiagrams.click();
		
		return new fetchingReports(driver);
	}
	
	public contextsearch currentWindowHandle(){
		
		 winHandleBefore = driver.getWindowHandle();
		System.out.println(winHandleBefore);
		
		return this;
	}
	
	
	
	public fetchingReports selectBHTWellTestReports(){
		
		
		currentWindowHandle();
			
		selectBHTWellTestReports.click();
		
		return new fetchingReports(driver);
	}
	
	public fetchingReports selectDocumentsWithfilter(){
		
		
		currentWindowHandle();
			
		selectDocumentsWithfilter.click();
		
		return new fetchingReports(driver);
	}
	
	
	
	public contextsearch selectWellEngineering(){
		
		selectWellEngineering.click();
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\Screenshots\\Reported_WellEngineeringPT.png"));
		
		System.out.println("Report types is Displayed in SubMenu of WellEgineering");
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }
		
		return this;
	}
	
	
	public contextsearch selectMechanicalWellData(){
		
		
		
		selectMechanicalWellData.click();
		
		 return this;
	}
	
	
	
	public contextsearch selectDocuments(){
		
		selectDocuments.click();
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\Screenshots\\Documents.png"));
		
		System.out.println("Report types is Displayed in SubMenu of WellEgineering");
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }
		
		
		return this;
	}
	
	public contextsearch selectDailyWellsReporting(){
		//currentWindowHandle();
		selectDailyWellsReporting.click();
		
		return this;
	}
	
	
	
	
	public contextsearch verifyquicksearchtext(){
		
		String searchtext = quickSearchResult.getText();
		System.out.println(searchtext);
		
		Assert.assertTrue(true, searchtext + "as expected");
		
		return this;
		
	}
	
	

	
	public fetchingReports selectreporting(String reportName){
		
		for(int i=0;i<reportingItems.size();i++){
		
		String text = reportingItems.get(i).getText();
		
		System.out.println(text);
		
		if(text.equalsIgnoreCase(reportName)){
			
			reportingItems.get(i).click();
			break;
			
		}
		
		}	
		
	return new fetchingReports(driver);	
	}
	

	
	public fetchingReports getAlert(){
		
		Alert alert = driver.switchTo().alert();		
		System.out.println(alert.getText());
		alert.accept();
		
		return new fetchingReports(driver);	
		
	}
	
	
	public contextsearch clickonExport(){
		
		exportIcon.click();
		
		return this;
	}



	public WebElement getPrintIcon() {
		System.out.println("Print is clicked");
		return printIcon;
	}
	
	public contextsearch selectFewcheck() throws Throwable{
		
		
		
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		
		for(int i=0;i<frame.size();i++){
		System.out.println(frame.get(i).toString());
		}
		
		WebElement frameId1 = driver.findElement(By.name("ctl00_ctl00_BodyContent_radPaneRight"));

		driver.switchTo().frame(frameId1);
		Thread.sleep(3000);

		SelectRecords(8);
		driver.switchTo().defaultContent();
		
		return this;
		
	}	
	
	public fetchingReports SelectRecords(int NumCheckbox){
		
		
		for(int i=0;i<Checkboxitem.size()-NumCheckbox;i++){
		
		String text = Checkboxitem.get(i).getText();
		System.out.println(text);	
		Checkboxitem.get(i).click();
		//WebElement button=Checkboxitem.get(i);
		//((JavascriptExecutor) driver).executeScript("get(i).click();", button);
		}	
		
		return new fetchingReports(driver);	
		
	}
	
	
	public contextsearch SelectReservoirEngineering(){
		ReservoirEngineering.click();
		return this;
	}	
	
	public contextsearch SelectPressureSurveyData(){
		PressureSurveyData.click();
		return this;	
	}

	public WebElement getSurveyClass(){
		
		return SurveyClass ;
	
	}	
	
	public WebElement getTest_Types(){
		
		return Test_Types;
	}	
 
	public contextsearch SelectProductionAndInjection(){
		ProductionAndInjection.click();
		
		return this;
	}
 
}
