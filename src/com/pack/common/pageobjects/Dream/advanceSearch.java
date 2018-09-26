package com.pack.common.pageobjects.Dream;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class advanceSearch {
	
	private   WebDriver driver;
	public  static String winHandleBefore;

	public advanceSearch(WebDriver driver) {
		
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
		// TODO Auto-generated constructor stub
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	
	 // adv. search click on home page 
	@FindBy(xpath="//*[contains(text(),'Adv. Search')]")
	private  WebElement AdvanceSearchClick;
	
	public WebElement selectadvanceSearch(){
		
		AdvanceSearchClick.click();
		return AdvanceSearchClick;
			
		
	}
	      // saved search drop down selection 
	@FindBy(id="cboSavedSearch")
	private WebElement drpdowncboSavedSearch;

	
	
	public WebElement getdrpdowncboSavedSearch() {

		return drpdowncboSavedSearch;
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
             // Selecting Frame 
			public advanceSearch selectFrame() throws Throwable{
				
				
				
				List<WebElement> frame = driver.findElements(By.tagName("iframe"));
				
				for(int i=0;i<frame.size();i++){
				System.out.println(frame.get(i).toString());
				}
				
				WebElement frameId1 = driver.findElement(By.name("ctl00_ctl00_BodyContent_radPaneRight"));

				driver.switchTo().frame(frameId1);
				Thread.sleep(3000);

				//SelectRecords(8);
				//driver.switchTo().defaultContent();
				
				return this;
				
			}	
			// cmd Top Search Btn Click 
			@FindBy(xpath = "//*[@id='cmdTopSearch']")
			private WebElement selectcmdTopSearch;
			
	public advanceSearch selectcmdTopSearch() throws Throwable {
		selectcmdTopSearch.click();
		return this;
	}
			
			//id="chkbxRowSelectAll"
			@FindBy(xpath="//*[@id='chkbxRowSelectAll']")
			private   WebElement selectAllResults;
			
			public advanceSearch selectAllResults() throws Throwable {
				selectAllResults.click();
				return this;
			
			}
			
			// Reset
			
			@FindBy(xpath="//*[@id='cmdTopReset']")
			private   WebElement clickReset;
			
			public advanceSearch clickReset() throws Throwable {
				clickReset.click();
				return this;
			
			}
			// Last Search
			
						@FindBy(xpath="//*[@id='btnLastSearch']")
						private   WebElement clickbtnLastSearch;
						
						public advanceSearch clickbtnLastSearch() throws Throwable {
							clickbtnLastSearch.click();
							return this;
						
						}
						public advanceSearch selectFewcheck() throws Throwable{
																					
							Thread.sleep(3000);
							SelectRecords(5);
							Thread.sleep(8000);							
							return this;
							
						}	
						public advanceSearch SelectRecords(int NumCheckbox){
							
							
							for(int i = 0; i < Checkboxitem.size()-Checkboxitem.size()+ NumCheckbox; i++){
							
							String text = Checkboxitem.get(i).getText();
							System.out.println(text);	
							Checkboxitem.get(i).click();
							//WebElement button=Checkboxitem.get(i);
							//((JavascriptExecutor) driver).executeScript("get(i).click();", button);
							}	
							
							return new advanceSearch(driver);	
							
						}
						@FindBy(xpath="//*[@id='chkbxRow']")
						public List<WebElement> Checkboxitem;
						
						// File search drop down selection 
						@FindBy(id="cboSearchCriteria")
						private WebElement drpdowncboSearchCriteria;

						
						
						public WebElement getdrpdowncboSearchCriteria() {

							return drpdowncboSearchCriteria;
						}
						
						// fileUploader 
						@FindBy(xpath="//*[@id='fileUploader']")
						private  WebElement fileUploaderClick;
						
						public advanceSearch fileUploader() throws  AWTException 
						{
							JavascriptExecutor jse = (JavascriptExecutor)driver;
							jse.executeScript("document.getElementById('fileUploader').click();");
							System.out.println("upload button is press");
							ClipboardOwner owner=null;
							String path="C:\\Users\\sireesha.kondaveeti\\Desktop\\task";
							Robot robot=new Robot();
							StringSelection attachment_path= new StringSelection(path);
							Toolkit.getDefaultToolkit().getSystemClipboard().setContents(attachment_path, owner);
							robot.setAutoDelay(3000);
							robot.keyPress(KeyEvent.VK_CONTROL);
							robot.keyPress(KeyEvent.VK_V);
							robot.keyRelease(KeyEvent.VK_CONTROL);
							robot.keyPress(KeyEvent.VK_ENTER);
							 
							return this;
							
						}
						
						
						
						 // country user control text Box
						public void CountryUserControlTextBox(String text) throws InterruptedException {
							
							WebElement element_enter = driver.findElement(By.xpath("//*[@id='countryUserControl_txtSearchCountry']"));
							element_enter.findElement(By.xpath("//*[@id='countryUserControl_txtSearchCountry']")).sendKeys(text);
							
								}
						
						// BtnSearch 
						@FindBy(xpath="//*[@id='countryUserControl_btnSearchCountry']")
						private  WebElement btnSearchCountry;
						
						public WebElement btnSearchCountry(){
							
							btnSearchCountry.click();
							
							return btnSearchCountry;
							
								
							
						}
						
						// countryUserControl 
						@FindBy(xpath="//*[@id='countryUserControl_lstCountryLeft']/option")
						private  WebElement countryUserControl_lstCountryLeft;
						
						public WebElement countryUserControl_lstCountryLeft() throws InterruptedException{
							
							countryUserControl_lstCountryLeft.click();
							Thread.sleep(2000);
							// >> Add Btn 
							WebElement AddBtn = driver.findElement(By.xpath("//*[@id='countryUserControl_btnAdd']"));
							AddBtn.click();
							
							return countryUserControl_lstCountryLeft;
							
								
							
						}
						
						
						// countryUserControl delete record
						@FindBy(xpath="//*[@id='countryUserControl_lstCountry']/option")
						private  WebElement countryUserControl_lstCountry;
						
						public WebElement countryUserControl_lstCountry() throws InterruptedException{
							
							countryUserControl_lstCountry.click();
							countryUserControl_lstCountry.click();
							Thread.sleep(2000);
							
							// x Delete Btn 
							WebElement DelBtn = driver.findElement(By.xpath("//*[@id='countryUserControl_btnDelete']"));
							DelBtn.click();
							
							return countryUserControl_lstCountry;
							
								
							
						}
						
						// stateProviceUserControl lstState Or Province_Left
						@FindBy(xpath="//*[@id='stateProviceUserControl_lstState_Or_Province_Left']/option")
						private  WebElement stateProviceUserControl_lstState;
						
						  // stateProviceUserControl_lstState_Or_Province_Left"]
                           public WebElement stateProviceUserControl_lstState() throws InterruptedException{
							
                        	   stateProviceUserControl_lstState.click();
                        	   
							Thread.sleep(2000);
							// >> Add Btn 
							WebElement AddBtn = driver.findElement(By.xpath("//*[@id='stateProviceUserControl_btnAdd']"));
							AddBtn.click();
							
							return stateProviceUserControl_lstState;
							
								
							
						}
						
						
						
						
						// selecting stateProviceUserControl_lstState names from list 
						 public advanceSearch stateProviceUserControl(int NumCheckbox) throws InterruptedException {

								List<WebElement> Checkboxitem = driver.findElements(By.xpath("//*[@id='stateProviceUserControl_lstState_Or_Province_Left']/option"));
								// Thread.sleep(2000);
								// System.out.println(Checkboxitem.size());
								for (int i = 0; i < Checkboxitem.size()-Checkboxitem.size()+ NumCheckbox; i++) {
									String text = Checkboxitem.get(i).getText();
									System.out.println(text);
									// System.out.println(Checkboxitem.get(i).isDisplayed());
									// System.out.println(Checkboxitem.get(i).isSelected());
									Checkboxitem.get(i).click();
								}
								
								WebElement AddBtn = driver.findElement(By.xpath("//*[@id='stateProviceUserControl_btnAdd']"));
								AddBtn.click();
								return this;
							}
						 
						// selecting countyUserControl_lstCountyLeft names from list 
						 public advanceSearch countyUserControl_lstCountyLeft(int NumCheckbox) throws InterruptedException {

								List<WebElement> Checkboxitem = driver.findElements(By.xpath("//*[@id='countyUserControl_lstCountyLeft']/option"));
								// Thread.sleep(2000);
								// System.out.println(Checkboxitem.size());
								for (int i = 0; i < Checkboxitem.size()-Checkboxitem.size()+ NumCheckbox; i++) {
									String text = Checkboxitem.get(i).getText();
									System.out.println(text);
									// System.out.println(Checkboxitem.get(i).isDisplayed());
									// System.out.println(Checkboxitem.get(i).isSelected());
									Checkboxitem.get(i).click();
								}
								
								WebElement AddBtn = driver.findElement(By.xpath("//*[@id='countyUserControl_btnAdd']"));
								AddBtn.click();
								return this;
							}
						 
						// selecting OnShore OffShore names from list 
						 public advanceSearch OnShore_OffShore(int NumCheckbox) throws InterruptedException {

								List<WebElement> Checkboxitem = driver.findElements(By.xpath("//*[@id='lstOnshore_Or_Offshore']/option"));
								// Thread.sleep(2000);
								// System.out.println(Checkboxitem.size());
								for (int i = 0; i < Checkboxitem.size()-Checkboxitem.size()+ NumCheckbox; i++) {
									String text = Checkboxitem.get(i).getText();
									System.out.println(text);
									// System.out.println(Checkboxitem.get(i).isDisplayed());
									// System.out.println(Checkboxitem.get(i).isSelected());
									Checkboxitem.get(i).click();
								}
								
								
								return this;
							}

						// selecting Wellbore names from list 
						 public advanceSearch WellboreStatus(int NumCheckbox) throws InterruptedException {

								List<WebElement> Checkboxitem = driver.findElements(By.xpath("//div[@id='lstCurrent_Status']/div/ul/li"));
								// Thread.sleep(2000);
								// System.out.println(Checkboxitem.size());
								for (int i = 0; i < Checkboxitem.size()-Checkboxitem.size()+ NumCheckbox; i++) {
									String text = Checkboxitem.get(i).getText();
									System.out.println(text);
									// System.out.println(Checkboxitem.get(i).isDisplayed());
									// System.out.println(Checkboxitem.get(i).isSelected());
									Checkboxitem.get(i).click();
								}
								
								
								return this;
							}
						 
						// cmdSearch BtnSearch 
							@FindBy(xpath="//*[@id='cmdSearch']")
							private  WebElement cmdSearch;
							
							public WebElement cmdSearch(){
								
								cmdSearch.click();
								return cmdSearch;
								
							}
							
							 // Spu/Kickoff
							
							@FindBy(xpath="//*[@id='rdoRbDate_0']")
							private  WebElement Spudkickoff;
							
							public WebElement Spudkickoff(){
								
								Spudkickoff.click();
								return Spudkickoff;
								
							}
							
                            // Completion
							
							@FindBy(xpath="//*[@id='rdoRbDate_1']")
							private  WebElement Completion;
							
							public WebElement Completion(){
								
								Completion.click();
								return Completion;
								
							}
							
							 // Calander click  from
							 
							@FindBy(xpath="//*[@id='imgFrom']")
							private  WebElement CalanderClickFrom;
							
							public WebElement CalanderClickFrom(){
								
								CalanderClickFrom.click();
								return CalanderClickFrom;
								
							}
							// Calander click  To
							 
							@FindBy(xpath="//*[@id='imgTo']")
							private  WebElement CalanderClickTo;
							
							public WebElement CalanderClickTo(){
								
								CalanderClickTo.click();
								return CalanderClickTo;
								
							}
							
							// Previous Year click 
							 
							@FindBy(xpath="//*[@id='CalendarControl']/table/tbody/tr[1]/td[1]/a[2]")
							private  WebElement PreviousYrClick;
							
							public WebElement PreviousYrClick(){
								
								PreviousYrClick.click();
								return PreviousYrClick;
								
							}
							
							// Previous Month click 
							 
							@FindBy(xpath="//*[@id='CalendarControl']/table/tbody/tr[1]/td[1]/a[1]")
							private  WebElement PreviousMnthClick;
							
							public WebElement PreviousMnthClick(){
								
								PreviousMnthClick.click();
								return PreviousMnthClick;
								
							}
							
							// Clicking Random day in Month From
							
							@FindBy(xpath="//*[@id='CalendarControl']/table/tbody/tr[3]/td[1]/a")
							private  WebElement RandomDayClickFrom;
							
							public WebElement RandomDayClickFrom(){
								
								RandomDayClickFrom.click();
								return RandomDayClickFrom;
								
							}
                              
							
						public advanceSearch SpudKickoff() throws InterruptedException 
						{
							
							Spudkickoff();
							Thread.sleep(3000);
							
							return null;
							
						}
						public advanceSearch Completion_Click() throws InterruptedException 
						{
							
							Completion();
							Thread.sleep(3000);
							
							return null;
							
						}
						
						public advanceSearch selectDate(String startDate, String endDate) {

							selectStartDate.sendKeys(startDate);
							selectEndDate.sendKeys(endDate);

							return this;
						}
						@FindBy(xpath = "//*[@id='txtFrom']")
						private WebElement selectStartDate;
						
						@FindBy(xpath = "//*[@id='txtTo']")
						private WebElement selectEndDate;
						
						// REset Date  
						@FindBy(xpath="//*[@id='AdvancedSearchContent']/table[1]/tbody/tr[32]/td/a ")
						private  WebElement ResetDate;
						
						public WebElement ResetDate(){
							
							ResetDate.click();
							return ResetDate;
							
						}
						
						// Biostratigraphy Search 
						@FindBy(xpath="//*[@id='chbBiostratigraphySearch']")
						private  WebElement Biostratigraphy_Click;
						
						public WebElement Biostratigraphy_Click(){
							
							Biostratigraphy_Click.click();
							return Biostratigraphy_Click;
							
						} 
						
						// Epoch search drop down selection 
						@FindBy(id="ddlEpoch")
						private WebElement drpdownddlEpoch;

						
						
						public WebElement getdrpdownddlEpoch() {

							return drpdownddlEpoch;
						}
						
						// Sub Epoch search drop down selection 
						@FindBy(id="ddlSubEpoch")
						private WebElement drpdownddlSubEpoch;

						
						
						public WebElement getdrpdownddlSubEpoch() {

							return drpdownddlSubEpoch;
						}
						
						// Age Epoch search drop down selection 
						@FindBy(id="ddlAge")
						private WebElement drpdownddlAge;

						
						
						public WebElement getdrpdownddlAge() {

							return drpdownddlAge;
						}
						
						// Epoch radio Button  
						@FindBy(xpath="//*[@id='rdbBiostratigraphy_0']")
						private  WebElement EpochRadio;
						
						public WebElement EpochRadio(){
							
							EpochRadio.click();
							return EpochRadio;
							
						}  
						
						// Surface Age radio Button  
						@FindBy(xpath="//*[@id='rdbBiostratigraphy_1']")
						private  WebElement SurfaceAgeRadio;
						
						public WebElement SurfaceAgeRadio(){
							
							SurfaceAgeRadio.click();
							return SurfaceAgeRadio;
							
						}  
						
						
						
						// Surface Age From
							public void SurfaceAge_From(int value) throws InterruptedException {
								String value1= String.valueOf(value);
							WebElement element_enter = driver.findElement(By.xpath("//*[@id='txtFromAge']"));
							element_enter.findElement(By.xpath("//*[@id='txtFromAge']")).sendKeys(value1);
							
							
								}
							// Surface Age To
							public void SurfaceAge_To(int value) throws InterruptedException {
								String value1= String.valueOf(value);
							WebElement element_enter = driver.findElement(By.xpath("//*[@id='txtToAge']"));
							element_enter.findElement(By.xpath("//*[@id='txtToAge']")).sendKeys(value1);
							
								}
							
							
							// Biostratigraphy reset  
							@FindBy(xpath="//*[@id='AdvancedSearchContent']/table[1]/tbody/tr[35]/td/a")
							private  WebElement Biostratigraphy_Reset;
							
							public WebElement Biostratigraphy_Reset(){
								
								Biostratigraphy_Reset.click();
								return Biostratigraphy_Reset;
								
							}  
							
							// Gulf of Mexico  
							@FindBy(xpath="//*[@id='chbGOMBlockQuerySearch']")
							private  WebElement BlockQuerySearch;
							
							public WebElement BlockQuerySearch(){
								
								BlockQuerySearch.click();
								return BlockQuerySearch;
								
							}  
							
							// From Area 
							
							public void GulfofMexico_FromArea(int value) throws InterruptedException {
								String value1= String.valueOf(value);
							WebElement element_enter = driver.findElement(By.xpath("//*[@id='txtFromArea']"));
							element_enter.findElement(By.xpath("//*[@id='txtFromArea']")).sendKeys(value1);
							
							
								}
                                   //To Area - //*[@id="txtFromArea"] 
							
							public void GulfofMexico_ToArea(int value) throws InterruptedException {
								String value1= String.valueOf(value);
							WebElement element_enter = driver.findElement(By.xpath("//*[@id='txtToArea']"));
							element_enter.findElement(By.xpath("//*[@id='txtToArea']")).sendKeys(value1);
							
							
								}
							
							// From Block - //*[@id="txtFromBlock"] 
							public void GulfofMexico_FromBlock(int value) throws InterruptedException {
								String value1= String.valueOf(value);
							WebElement element_enter = driver.findElement(By.xpath("//*[@id='txtFromBlock']"));
							element_enter.findElement(By.xpath("//*[@id='txtFromBlock']")).sendKeys(value1);
							}
							// To Block - //*[@id="txtFromBlock"] 
							public void GulfofMexico_ToBlock(int value) throws InterruptedException {
								String value1= String.valueOf(value);
							WebElement element_enter = driver.findElement(By.xpath("//*[@id='txtToBlock']"));
							element_enter.findElement(By.xpath("//*[@id='txtToBlock']")).sendKeys(value1);
							}
							
							
							// Geographical Search 
							@FindBy(xpath="//*[@id='chbGeographicalSearch']")
							private  WebElement GeographicalSearch;
							
							public WebElement GeographicalSearch(){
								
								GeographicalSearch.click();
								return GeographicalSearch;
								
							}  
							
							// Co-ordinate Reference System 
							
							/*@FindBy(xpath="//*[@id='ddlCoordinate']/option")
							private  WebElement ddlCoordinate;
							
							public WebElement CoordinateReference() throws InterruptedException{
								
								ddlCoordinate.click();
								Thread.sleep(2000);
								
								return CoordinateReference();
								
									
								
							}*/
							// Geographical search Co ordinate System
							 
							@FindBy(id="ddlCoordinate")
							private WebElement drpdownddlCoordinate;

							
							
							public WebElement getdrpdownddlCoordinate() {

								return drpdownddlCoordinate;
							}
							
							
							// Bottom radio 
							@FindBy(xpath="//*[@id='rdbLatLonSB_1']")
							private  WebElement BottomRadio;
							
							public WebElement BottomRadio() throws InterruptedException{
								
								BottomRadio.click();
								Thread.sleep(2000);
								return BottomRadio;
																			
								
							}
							
							 // Min Latitude degree 
							public void MinLatitudedegree(int value) throws InterruptedException {
								String value1= String.valueOf(value);
							WebElement element_enter = driver.findElement(By.xpath("//*[@id='txtMinLatDeg']"));
							element_enter.findElement(By.xpath("//*[@id='txtMinLatDeg']")).sendKeys(value1);
							}
							
							// Min Latitude  min
							public void MinLatitudeMin(int value) throws InterruptedException {
								String value1= String.valueOf(value);
							WebElement element_enter = driver.findElement(By.xpath("//*[@id='txtMinLatMin']"));
							element_enter.findElement(By.xpath("//*[@id='txtMinLatMin']")).sendKeys(value1);
							}
							// Min Latitude  sec
							public void MinLatitudeSec(int value) throws InterruptedException {
								String value1= String.valueOf(value);
							WebElement element_enter = driver.findElement(By.xpath("//*[@id='txtMinLatSec']"));
							element_enter.findElement(By.xpath("//*[@id='txtMinLatSec']")).sendKeys(value1);
							}
						    
							//Min Longitude degree 
							public void MinLongitudedegree(int value) throws InterruptedException {
								String value1= String.valueOf(value);
							WebElement element_enter = driver.findElement(By.xpath("//*[@id='txtMinLonDeg']"));
							element_enter.findElement(By.xpath("//*[@id='txtMinLonDeg']")).sendKeys(value1);
							}
						     
							//Longitude Min 
							public void MinLongitudeMin(int value) throws InterruptedException {
								String value1= String.valueOf(value);
							WebElement element_enter = driver.findElement(By.xpath("//*[@id='txtMinLonMin']"));
							element_enter.findElement(By.xpath("//*[@id='txtMinLonMin']")).sendKeys(value1);
							}
							//Longitude Sec 
							public void MinLongitudeSec(int value) throws InterruptedException {
								String value1= String.valueOf(value);
							WebElement element_enter = driver.findElement(By.xpath("//*[@id='txtMinLonSec']"));
							element_enter.findElement(By.xpath("//*[@id='txtMinLonSec']")).sendKeys(value1);
							}
						
							//Max Latitude degree 
							public void MaxLatitudeDegree(int value) throws InterruptedException {
								String value1= String.valueOf(value);
							WebElement element_enter = driver.findElement(By.xpath("//*[@id='txtMaxLatDeg']"));
							element_enter.findElement(By.xpath("//*[@id='txtMaxLatDeg']")).sendKeys(value1);
							}
							
							//Max Latitude Min 
							public void MaxLatitudeMin(int value) throws InterruptedException {
								String value1= String.valueOf(value);
							WebElement element_enter = driver.findElement(By.xpath("//*[@id='txtMaxLatMin']"));
							element_enter.findElement(By.xpath("//*[@id='txtMaxLatMin']")).sendKeys(value1);
							}
							//Max Latitude Sec 
							public void MaxLatitudeSec(int value) throws InterruptedException {
								String value1= String.valueOf(value);
							WebElement element_enter = driver.findElement(By.xpath("//*[@id='txtMaxLatSec']"));
							element_enter.findElement(By.xpath("//*[@id='txtMaxLatSec']")).sendKeys(value1);
							}
							
							 
							//Max Longitude degree 
							public void MaxLongitudeDegree(int value) throws InterruptedException {
								String value1= String.valueOf(value);
							WebElement element_enter = driver.findElement(By.xpath("//*[@id='txtMaxLonDeg']"));
							element_enter.findElement(By.xpath("//*[@id='txtMaxLonDeg']")).sendKeys(value1);
							}
							
							//Max Longitude Min 
							public void MaxLongitudeMin(int value) throws InterruptedException {
								String value1= String.valueOf(value);
							WebElement element_enter = driver.findElement(By.xpath("//*[@id='txtMaxLonMin']"));
							element_enter.findElement(By.xpath("//*[@id='txtMaxLonMin']")).sendKeys(value1);
							}
							//Max Longitude Sec 
							public void MaxLongitudeSec(int value) throws InterruptedException {
								String value1= String.valueOf(value);
							WebElement element_enter = driver.findElement(By.xpath("//*[@id='txtMaxLonSec']"));
							element_enter.findElement(By.xpath("//*[@id='txtMaxLonSec']")).sendKeys(value1);
							}
							
							//East/North Search radio 
							@FindBy(xpath="//*[@id='rdbEastNorthSearch']")
							private  WebElement EastNorthRadio;
							
							public WebElement EastNorthRadio(){
								
								EastNorthRadio.click();
								return EastNorthRadio;
								
							}
							
							// East/North Bottom radio 
							@FindBy(xpath="//*[@id='rdbEasNorSB_1']")
							private  WebElement EastNorthBottomRadio;
							
							public WebElement EastNorthBottomRadio(){
								
								EastNorthBottomRadio.click();
								return EastNorthBottomRadio;
								
							}
							
							//  Min Grid X(m)
							public void MinGridX(int value) throws InterruptedException {
								String value1= String.valueOf(value);
							WebElement element_enter = driver.findElement(By.xpath("//*[@id='txtXGridMin']"));
							element_enter.findElement(By.xpath("//*[@id='txtXGridMin']")).sendKeys(value1);
							}
							// Min Grid Y(m)
							public void MinGridY(int value) throws InterruptedException {
								String value1= String.valueOf(value);
							WebElement element_enter = driver.findElement(By.xpath("//*[@id='txtYGridMin']"));
							element_enter.findElement(By.xpath("//*[@id='txtYGridMin']")).sendKeys(value1);
							}
							
							 
						    //  Max Grid X(m)
							public void MaxGridX(int value) throws InterruptedException {
								String value1= String.valueOf(value);
							WebElement element_enter = driver.findElement(By.xpath("//*[@id='txtXGridMax']"));
							element_enter.findElement(By.xpath("//*[@id='txtXGridMax']")).sendKeys(value1);
							}
							// Max Grid Y(m)
							public void MaxGridY(int value) throws InterruptedException {
								String value1= String.valueOf(value);
							WebElement element_enter = driver.findElement(By.xpath("//*[@id='txtYGridMax']"));
							element_enter.findElement(By.xpath("//*[@id='txtYGridMax']")).sendKeys(value1);
							} 
							
							
							// Save Search Criteria
							 
							// Search Name 
							public void SaveSearchCriteria(String text) throws InterruptedException {
								
								WebElement element_enter = driver.findElement(By.xpath("//*[@id='txtSaveSearch']"));
								element_enter.findElement(By.xpath("//*[@id='txtSaveSearch']")).sendKeys(text);
								
									}
							
							// Shared  
							@FindBy(xpath="//*[@id='chbShared']")
							private  WebElement chbShared;
							
							public WebElement chbShared(){
								
								chbShared.click();
								return chbShared;
								
							}
							
							// cmdSavesearch 
							
							@FindBy(xpath="//*[@id='cmdSaveSearch']")
							private  WebElement cmdSaveSearch;
							
							public WebElement cmdSaveSearch(){
								
								cmdSaveSearch.click();
								return cmdSaveSearch;
								
							}
							
							// Reset 
							@FindBy(xpath="//*[@id='cmdReset']")
							private  WebElement cmdReset;
							
							public WebElement cmdReset(){
								
								cmdReset.click();
								return cmdReset;
								
							}
							
}
