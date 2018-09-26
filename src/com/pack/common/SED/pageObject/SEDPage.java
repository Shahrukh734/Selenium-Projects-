package com.pack.common.SED.pageObject;

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

import com.pack.common.pageobjects.Dream.fetchingReports;



public class SEDPage {
	
	
	private   WebDriver driver;
	public  static String winHandleBefore;

	public SEDPage(WebDriver driver) {
		
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
		
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	
	@FindBy(xpath="//*[@id='WebHeader_MenuInternaln2']")
	private WebElement SED;
	

	
	@FindBy(xpath="//*[@id='MainContentPlaceHolder_ddlAssetOwner']")
	private WebElement AssertOwner;
	
	@FindBy(xpath="//*[@id='MainContentPlaceHolder_ddlAssetType']")
	private WebElement AssertType;
	
	//Selection Filter locater
	@FindBy(xpath="//*[@id='MainContentPlaceHolder_chkNameFilter']")
	private WebElement ChkboxNameStringwith;
	
	
	@FindBy(xpath="//*[@id='MainContentPlaceHolder_txtNameStartingWith']")
	private WebElement ChkboxEvent;

	
	@FindBy(xpath="//*[@id='MainContentPlaceHolder_btnReset1']")
	private WebElement btnReset;

	
	@FindBy(xpath="//*[@id='MainContentPlaceHolder_btnFilter1']")
	private WebElement Fieldbtnfilter;
	
	@FindBy(id="MainContentPlaceHolder_txtNameStartingWith")
	private WebElement txtNameStartWith;
	
	
	//include Event locater 
	@FindBy(id="MainContentPlaceHolder_chkWellbore")
	private WebElement chkboxWellbore;
	
	@FindBy(xpath="//*[@id='MainContentPlaceHolder_chkConduit']")
	private WebElement chkboxConduit;
	
	
	
	@FindBy(xpath="//*[@id='chkbxRow']")
    private List<WebElement> chkboxRecords;
	
	
	@FindBy(xpath="//*[@id='MainContentPlaceHolder_imgbtnAddToMyClusters']")
	private WebElement btnADDtoCluster;
	
	// Add cluster Window
	@FindBy(xpath="//*[@id='ddlClusters']")
	private WebElement AddtoexistingCluster;
	
	
	
	@FindBy(xpath="//*[@id='btnOK']")
	private WebElement btnOK;


	@FindBy(xpath="//*[@id='btnCreate']")
	private WebElement btnCreate;	
	
	@FindBy(xpath="//*[@id='txtClusters']")
	private WebElement txtClusters;	
//end
	
	

	@FindBy(name="ctl00_ctl00_BodyContent_radPaneRight")
	private WebElement frame;
	
	@FindBy(xpath="//*[@id='chkbxRowSelectAll']")
	private   WebElement selectAllResults;
	
	@FindBy(xpath = "//*[@id='rdblExportSelectionAll']")
	private WebElement selectExport_AllPage;
	
	@FindBy(xpath = "//*[@id='rdblExportSelectionCurrentPage']")
	private WebElement selectExport_CurrentPage;
	
	@FindBy(xpath = "//*[@id='rdblExportFormatExcel']")
	private WebElement selectExcel;
	
	@FindBy(id="MainContentPlaceHolder_btnShowExportOptionDiv")
	private  WebElement exportIcon;
	
	@FindBy(xpath = "//input[contains(@id, 'btnExportContinue')]")
	private WebElement click_btnExportContinue;
	
	@FindBy(xpath = "//*[@id='tblSearchResults']/tbody/tr/td/a")
	private List<WebElement> Fieldnamelist;
	
	
	@FindBy(xpath = "//*[@id='tblSearchResults']/tbody/tr/td[7]")
	private List<WebElement> Eventlist;
	   
	@FindBy(xpath="//*[@id='MainContentPlaceHolder_btnPrint']")
	private WebElement Printicon;
	@FindBy(xpath="//button[@class='print default']")
	private WebElement btnPrint;
	
	
	@FindBy(xpath="//*[@id='tblSearchResults']/tbody/tr/td/a")
	private List<WebElement> WellboreName;
	
	@FindBy(xpath="//*[@id='MainContentPlaceHolder_chkActiveOnly']")
	private WebElement Activeonly;		
	
	@FindBy(xpath="//*[@id='MainContentPlaceHolder_spnWithEvents']")
	 private WebElement OnlyWithEvents;
	
	
	@FindBy(xpath="//*[@id='MainContentPlaceHolder_btnFilter']")	
	private WebElement btnfilter;

	
	
	
	public WebElement getbtnPrint(){
	    return btnPrint;
	    }
	      public WebElement getPrinticon(){
	          return Printicon;
	          }

			public List<WebElement> getEventlist(){
				return Eventlist;
			}


		  public List<WebElement> getFieldnamelist() {
			return Fieldnamelist;
		                          }
		
		
		
		public WebElement getselectAllResults(){
		    return selectAllResults;
		      }
		
		
		public WebElement getAssertType(){
		    return AssertType;
		      }
		
		      public WebElement getFrame(){
			     return frame;
		           }

		public WebElement gettxtClusters(){
			return txtClusters;
		}
		public WebElement getbtnCreate(){
			return btnCreate;
		}

		public WebElement getbtnOK(){

			return btnOK;
		}
		
		public WebElement getSED(){
			return SED;
		}
		public WebElement getAssertOwner(){
			return AssertOwner;
		}
		
		public WebElement getChkboxNameStringwith(){
			return ChkboxNameStringwith;
		}
		public WebElement getChkboxEvent(){
			return ChkboxEvent;
		}	
		
		public WebElement getbtnReset(){
			return btnReset;
		}	
		
		public WebElement geFieldtbtnfilter(){
			return Fieldbtnfilter;
		}
		
		public WebElement gettxtNameStartWith(){
			return txtNameStartWith;
		}
		
		public WebElement getchkboxWellbore(){
			return chkboxWellbore;
		}
		
		public WebElement getchkboxConduit(){
			return chkboxConduit;
		}
		
		public WebElement getbtnADDtoCluster(){
			return btnADDtoCluster;
		}
		
		
		public List<WebElement> getchkboxRecors(){
			return chkboxRecords;
		}
			
		
		 public WebElement getAddtoexistingCluster(){
			 return AddtoexistingCluster;
		 }
		 
		 
		 public WebElement getSelectExport_AllPage() {
				return selectExport_AllPage;
			}

			public WebElement getSelectExport_CurrentPage() {
				return selectExport_CurrentPage;
			}

			public WebElement getSelectExcel() {
				return selectExcel;
			}
			
			public WebElement getExportIcon() {
				
				return exportIcon;
			}
			
			public WebElement getClick_btnExportContinue() {
				return click_btnExportContinue;
			}
			
			public WebElement getbtnfilter(){
				return btnfilter;
			}
			
			 public WebElement getOnlyWithEvents(){
				 return OnlyWithEvents;
			 }
			
			 public WebElement getActiveonly(){
				 return Activeonly;
			 } 
			 
			 public List<WebElement> getWellboreName(){
				 return WellboreName;
			 } 
			
			
			public SEDPage exportClick() {

				getExportIcon().click();

				return this;
			}
	
	
	
public void printpage(){
	getPrinticon().click();
	isAlertPresent();
	switchWindows();
	getbtnPrint().click();
}


	// Selecting Check boxes 
       public SEDPage SelectRecords(int NumCheckbox){
		
		
		for(int i=0;i<chkboxRecords.size()-chkboxRecords.size()+NumCheckbox;i++){
		
		String text = chkboxRecords.get(i).getText();
		System.out.println(text);	
		chkboxRecords.get(i).click();
				}
		return this;
   }
// Add records to the cluster 
      public SEDPage Addtocluster(String text) throws InterruptedException{
	
	 getbtnADDtoCluster().click();
	 switchWindows();
	 Thread.sleep(1000);
	 driver.manage().window().maximize();
	 DropdownSelection(AddtoexistingCluster,text);
	 btnOK.click();;
	 isAlertPresent();
	 return this;
		
	  } 
// create a cluster 
    public SEDPage CreateCluster(String Text) throws InterruptedException{
    	 Thread.sleep(100);
		 getbtnADDtoCluster().click();
	     Thread.sleep(100);
		 switchWindows();
	      Thread.sleep(100);
		 driver.manage().window().maximize();
	      Thread.sleep(100);
		 txtClusters.sendKeys(Text);
		 btnCreate.click(); 
		 isAlertPresent();
		 driver.switchTo().defaultContent();
		return this;
         }


		public SEDPage switchWindows() {
		
			// Switch to new window opened
			for (String winHandle : driver.getWindowHandles()) {
				WebDriver currentWindow = driver.switchTo().window(winHandle);
		
				System.out.println(currentWindow);
			}
			return this;
			                 }



			// Select Records from drop down 
			public int DropdownSelection(WebElement Element, String Text) throws InterruptedException{	
			Select dropDown  = new Select(Element);
			List<WebElement> elementCount = dropDown.getOptions();
			int Count= elementCount.size();
			Thread.sleep(1000);
			dropDown.selectByVisibleText(Text);
			return Count;	
			                                     }
			


		
		// Switch_frame 
		public void Switchframe(WebElement Element){
		
			List<WebElement> frame = driver.findElements(By.tagName("iframe"));
			
			for(int i=0;i<frame.size();i++){
			System.out.println(frame.get(i).toString());
			                               }
			driver.switchTo().frame(Element);
		      }
		
		
		
		public boolean isAlertPresent() {
			try {
				getAlert();
			} // try
			catch (NoAlertPresentException Ex) {
		
				return false;
			}
			return true;
		}
		public fetchingReports getAlert(){
			
			Alert alert = driver.switchTo().alert();		
			System.out.println(alert.getText());
			alert.accept();
			
			return new fetchingReports(driver);	
			
		}
		
		
		
		
		public SEDPage fetchSEDEventExport(boolean check, String selectpage, String reportformat)
				throws Throwable {
		
			selectResultRecords(check).exportClick().selectExportoptions(selectpage, reportformat);
			isAlertPresent();
		
			if (selectpage.equalsIgnoreCase("All")) {
		
				switchWindows();
		
				Thread.sleep(5000);
			}
		
			return this;
		}
		
		
		public SEDPage selectResultRecords(boolean check) throws Throwable {
			try {
				Thread.sleep(10000);
				if (getselectAllResults().isEnabled() && check) {
		
					getselectAllResults().click();
		
					Thread.sleep(3000);
				} else {
					System.out.println("Records not checked");
		
				}
			}
		
			catch (Exception e) {
		
				System.out.println("Records not checked" + e);
			}
		
			return this;
		}
		
		
		public SEDPage selectExportoptions(String selectpage, String reportformat) throws Throwable {
		
			// getSelectExportOptions().click();
		
			if (selectpage.equalsIgnoreCase("currentpage")) {
		
				if (reportformat.equalsIgnoreCase("excel")) {
		
					getSelectExcel().click();
		
				}
				/*
				 * else{
				 * 
				 * getSelectCSV().click();
				 * 
				 * }
				 */
		
				selectExport_CurrentPage();
			}
		
			else if (selectpage.equalsIgnoreCase("All")) {
		
				if (reportformat.equalsIgnoreCase("excel")) {
		
					getSelectExcel().click();
		
				}
				/*
				 * else if(reportformat.equalsIgnoreCase("CSV")) {
				 * 
				 * getSelectCSV().click();
				 * 
				 * }
				 */
				selectExport_AllPage();
			}
		
		
		
			Thread.sleep(3000);
			return this;
		
		}
		public SEDPage selectExport_CurrentPage() {
		
			getSelectExport_CurrentPage().click();
		
			getClick_btnExportContinue().click();
			isAlertPresent();
			// getAlert();
			// driver.switchTo().defaultContent();
			// driver.navigate().refresh();
		
			return this;
		
		}
		
		
		public SEDPage selectExport_AllPage() throws Throwable {
		
			getSelectExport_AllPage().click();
		
			getClick_btnExportContinue().click();
			isAlertPresent();
			// getAlert();
		
			/*
			 * //switchWindows(); Thread.sleep(5000); //driver.close();
			 * driver.switchTo().window(winHandleBefore);
			 * 
			 * Thread.sleep(5000); driver.navigate().refresh();
			 */
			return this;
		
		}

		
		 public void getFieldNamelink(String Text){
		 	 for(int i=0;i<Fieldnamelist.size();i++){
			    String Deatails=Fieldnamelist.get(i).getText();
			    if (Deatails.equalsIgnoreCase(Text))
			    	Fieldnamelist.get(i).click();
				    System.out.println(Deatails);
				    break;
			            }
		           }
	
		
		 public void SelectfilterWellbore(boolean NameStartWith,Boolean Event, boolean Active,String text){
			 
			 if ( NameStartWith=true){
			 getChkboxNameStringwith().click(); 
			 gettxtNameStartWith().sendKeys(text);
			 }
			 if (Event=true){
				 getOnlyWithEvents().click(); 
			 }
			 if (Active= true){
				 getActiveonly().click();
			 }
			 getbtnfilter().click();
		 }
		 
				 
		 public void getWellborelink(List<WebElement> Element,String Text){
		 	 for(int i=0;i<Element.size();i++){
			    String Deatails=Element.get(i).getText();
			    if (Deatails.equalsIgnoreCase(Text))
			    	Element.get(i).click();
				    System.out.println(Deatails);
				    break;
			            }
		           }
	
		
	
		public void getListOfREcords() throws InterruptedException{
		Thread.sleep(1000);
	    WebElement Table = driver.findElement(By.xpath("//table[@id='tblSearchResults']/tbody"));
	    List<WebElement> rows = Table.findElements(By.tagName("tr")); 
			Thread.sleep(1000);
			// And iterate over them and get all the cells 
			for (WebElement row : rows) { 
			    List<WebElement> cols = row.findElements(By.tagName("td")); 
				Thread.sleep(1000);
			    // Print the contents of each cell
			    for (WebElement col : cols) { 
			    	Thread.sleep(1000);

			    System.out.println(col.getText()+"\t");
			    //Or try below code 
			    //System.out.println(cell.getAttribute("innerHTML"));
		                              	}
			            System.out.println();
			                                    }
		}

		
		


}
