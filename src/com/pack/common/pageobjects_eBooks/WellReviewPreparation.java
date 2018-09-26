package com.pack.common.pageobjects_eBooks;

import java.io.File;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.pack.base.BaseMethods;

public class WellReviewPreparation extends BaseMethods {
	
	
	private  WebDriver driver;
	

	public WebDriver getDriver() {
		return driver;
	}
//
	@FindBy(xpath="//span[@id='CurrentUser']")
	private  WebElement currentUser;
	
	
	@FindBy(xpath="//*[text()='Create Annual Well review']")
	private  WebElement CreateAnnualWellreview;
	
	@FindBy(xpath="//*[text()='ADD Annual Well Review']")
	private  WebElement ADDAnnualWellReview;
	
	@FindBy(xpath="//*[contains(@id,'awrName')]")
	private  WebElement awr_Name;
	
	//button to open calendar
	@FindBy(xpath="//*[contains(@id,'awrDate')]")
	private  WebElement awr_Date;
	
	
	//button to click on create page
	@FindBy(xpath="//*[text()='Create']")
	private  WebElement Button_createAWR;
	
	//button to click on create page
	@FindBy(xpath="//*[@id='btn_Cancel' and text()='Cancel']")
	private  WebElement Button_cancelAWR;
	
	
	@FindBy(xpath="//*[@id='btn_AddtoAWR']")
	private  WebElement Button_AddtoAWR;
	
	
	
	// list of pending well review
	@FindBy(xpath="//*[@id='list']/span/b")
	private  WebElement awr_PendingListTitle;
	
	// list of pending well review
	@FindBy(xpath="//table[@class='rgMasterTable']//tbody/tr/td[2]")
	private  List<WebElement> awr_PendingList;
	
	// select well/wellbore/conduit
	@FindBy(xpath="//*[@class='rgMasterTable']/thead/tr/th/b[contains(text(),'Select')]")
	private  WebElement select_AssetType;
	
	//Change Review Team Member
	@FindBy(xpath="//*[@class='rgMasterTable']/thead/tr/th/i[contains(text(),'Team')]")
	private  WebElement select_TeamMember;
	
	//Send AWR Agenda
	@FindBy(xpath="//*[@class='rgMasterTable']/thead/tr/th/i[contains(text(),'Send AWR')]")
	private  WebElement sendAWR;
	
	
	// Display Data Availability 
	@FindBy(xpath="//*[@class='rgMasterTable']/thead/tr/th/i[contains(text(),'Data')]")
	private  WebElement dataAvailability;
	
	// Adjust UOM
	@FindBy(xpath="//*[@class='rgMasterTable']/thead/tr/th/i[contains(text(),'UOM')]")
	private  WebElement adjustUOM;
	
	
	// Adjust Date Range for Plots & Report 
	@FindBy(xpath="//*[@class='rgMasterTable']/thead/tr/th/i[contains(text(),'Range')]")
	private  WebElement DateRange;
	
	
	// Adjust Date Range for Plots & Report 
	@FindBy(xpath="//*[@class='rgMasterTable']/thead/tr/th/i[contains(text(),'Depth Reference')]")
	private  WebElement DepthReference;
	
	
	
	
	
	
	
    //button to move next in calendar
	@FindBy(xpath="//*[@class='datepicker-days']//tr/th[@class='next']")
	private  WebElement nextLink;
	
	//button to click in center of calendar heade
	
	@FindBy(xpath="//*[@class='datepicker-days']//tr/th[@class='datepicker-switch']")
	private  WebElement midLink;
	
	
	//button to move previous month in calendar
	@FindBy(xpath="//*[@class='datepicker-days']//tr/th[@class='prev']")
	private  WebElement previousLink;
	
	
	 //Get all months from calendar to select correct one
	
	@FindBy(xpath="//*[@class='table-condensed']/tbody/tr/td/span[contains(@class,'month')]")
	private  List<WebElement> list_AllMonthToBook ;
	
	
	@FindBy(xpath="//*[@class='datepicker-days']//tbody/tr/td[contains(@class,'day')]")
	private  List<WebElement> list_AllDateToBook;
	
	// list of book in Select icon
	@FindBy(xpath="//div[@id='rd_books_DropDown']//ul/li")
	private  List<WebElement> listofBooks_DropDown;
	
	@FindBy(xpath="//div[@id='rd_books']")
	private  WebElement click_Books;
	
	// click on selected chapters
	
	@FindBy(xpath="//label[text()='Chapters']")
	private  WebElement chapters_Title;
	
	@FindBy(xpath="//label[text()='Chapters']/../div")
	private  WebElement click_ChaptersDropDown;
	
	@FindBy(xpath="//div[@id='rd_chapters_DropDown']//ul/li")
	private  List<WebElement> listofChapters;
	
	@FindBy(xpath="//*[@id='btn_AddtoAWR']")
	private  WebElement AddtoAWR;
	
	@FindBy(xpath="//*[@class='rtIn']/span")
	private  List<WebElement> AddedChapters;
	
	
	private static String awrName;
	
	public static String getAwrName() {
		return awrName;
	}


	public static void setAwrName(String awrName) {
		WellReviewPreparation.awrName = awrName;
	}


	public WellReviewPreparation(WebDriver driver) 
	{
	super(driver);
	this.driver = driver;
	AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
	PageFactory.initElements(factory, this);
	}


	public WellReviewPreparation Enter_awrName(String text){
		setAwrName(text);
		enterTextValue(awr_Name,text);
		
		
		
		return this;
	}
	
	public WellReviewPreparation CreateAnnualWellreview(){
		currentWindowHandle();
		clickOnElement(CreateAnnualWellreview);
		switchWindows();
		
		String text = ADDAnnualWellReview.getText();
		
		Reporter.log(text+" page  is displayed",true);
		
		return this;
	}
	
	

	// date should be in format = 12/07/2014

	public WellReviewPreparation select_awrDate(String date) throws Throwable{
		
		clickOnElement(awr_Date);
		
		//Split the date time to get only the date part

        String date_dd_MM_yyyy[] = (date.split(" ")[0]).split("/");

        //get the year difference between current year and year to set in calander

        int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2])- Calendar.getInstance().get(Calendar.YEAR);
        
        clickOnElement(midLink);
        if(yearDiff!=0){

            //if you have to move next year

            if(yearDiff>0){

                for(int i=0;i< yearDiff;i++){

                    System.out.println("Year Diff->"+i);

                    nextLink.click();

                }

            }
          //if you have to move previous year

            else if(yearDiff<0){

                for(int i=0;i< (yearDiff*(-1));i++){

                    System.out.println("Year Diff->"+i);

                    previousLink.click();

                }

            }

        }
        
      
        //Get all months from calendar to select correct one
        list_AllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1])-1).click();
        Thread.sleep(1000);
        
      //get all dates from calendar to select correct one
        list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0])-1).click();
        
        
        
		return this;
		
	}
	
	
	public WellReviewPreparation createAWR(){
		
		
		clickOnElement(Button_createAWR);
		
		for(WebElement list:awr_PendingList){
			
			if(list.getText().equalsIgnoreCase(getAwrName())){
				
				Reporter.log("AWR is created :"+getAwrName());
			}
			
		}
		
		return this;
	}
	
	
	
	
	
	
	public WellReviewPreparation listofPendingAWR(){
		
		if(awr_PendingListTitle.getText() != null){
			
			for(WebElement list:awr_PendingList){
				
				Reporter.log("List of pending AWR :"+list.getText(),true);
			}
			
		}
		

		return this;
	}
	
	
	
	public WellReviewPreparation clickOnselectAssetType() throws Throwable{
		
		String Name=getAwrName();
		
		if(Name != null && select_AssetType.getText().contains("Select")){
		
		driver.findElement(By.xpath("//table[@class='rgMasterTable']//tbody/tr/td[text()='"+Name+"']/../td[4]/a")).click();
		
		}
		Thread.sleep(5000);
		
		switchWindows();
		
		return this;
	}
	
	
	public WellReviewPreparation clickOnModify_teamMember() throws InterruptedException{
		
		String Name=getAwrName();
		
		if(Name != null && select_TeamMember.getText().contains("Team")){
		
		driver.findElement(By.xpath("//table[@class='rgMasterTable']//tbody/tr/td[text()='"+Name+"']/../td[5]/a")).click();
		
		Thread.sleep(5000);
		}
		switchWindows();
		return this;
	}
	
	
	
	public WellReviewPreparation click_sendAWR() throws Throwable{
		
		String Name=getAwrName();
		
		if(Name != null && sendAWR.getText().contains("Send")){
		
		driver.findElement(By.xpath("//table[@class='rgMasterTable']//tbody/tr/td[text()='"+Name+"']/../td[6]/a")).click();
		Thread.sleep(5000);
		}
		switchWindows();
		return this;
	}
	
	public WellReviewPreparation click_dataAvailability() throws Throwable{
		
		String Name=getAwrName();
		
		if(Name != null && dataAvailability.getText().contains("Data")){
		
		driver.findElement(By.xpath("//table[@class='rgMasterTable']//tbody/tr/td[text()='"+Name+"']/../td[7]/a")).click();
		Thread.sleep(5000);
		}
		switchWindows();
		return this;
	}
	
	
	public WellReviewPreparation click_adjustUOM() throws Throwable{
		
		String Name=getAwrName();
		
		if(Name != null && adjustUOM.getText().contains("UOM")){
		
		driver.findElement(By.xpath("//table[@class='rgMasterTable']//tbody/tr/td[text()='"+Name+"']/../td[7]/a")).click();
		Thread.sleep(5000);
		}
		switchWindows();

		return this;
	}
	
	
	public WellReviewPreparation click_DateRange() throws Throwable{
		
		String Name=getAwrName();
		
		if(Name != null && DateRange.getText().contains("Range")){
		
		driver.findElement(By.xpath("//table[@class='rgMasterTable']//tbody/tr/td[text()='"+Name+"']/../td[8]/a")).click();
		Thread.sleep(5000);
		}
		switchWindows();
		return this;
	}
	
	public WellReviewPreparation click_DepthReference() throws Throwable{
		
		String Name=getAwrName();
		
		if(Name != null && DepthReference.getText().contains("Depth")){
		
		driver.findElement(By.xpath("//table[@class='rgMasterTable']//tbody/tr/td[text()='"+Name+"']/../td[9]/a")).click();
		Thread.sleep(5000);
		}
		switchWindows();

		return this;
	}
	
	public WellReviewPreparation click_EditAWR() throws Throwable{
		
		String Name=getAwrName();
		
		if(Name != null){
		
		driver.findElement(By.xpath("//table[@class='rgMasterTable']//tbody/tr/td[text()='"+Name+"']/../td/div[@class='EditAWR']")).click();
		Thread.sleep(5000);
		}
		switchWindows();

		return this;
	}
	
	
	public WellReviewPreparation get_currentUser(){
		
		String user = currentUser.getText();
		
		Reporter.log("Current user "+user,true);
		
		return this;
	}
	
	
	public WellReviewPreparation addChapterstoAWR(String bookName,String chapters) throws Throwable{
		
		click_Books.click();
		Thread.sleep(1000);
		// 
		
		Reporter.log("Select bookPage from drop down",true);
		fecthdatafromlistandWriteDatatoExcel(listofBooks_DropDown,"Bookslist");
		WebElement element = driver.findElement(By.xpath("//div[@id='rd_books_DropDown']//ul/li[contains(text(),'"+bookName+"')]"));
		readDataFromExcelandclick("Bookslist","Sheet1","bookName",element);
		Thread.sleep(3000);
		Reporter.log("BookName is selected",true);
		
		Reporter.log("Select chapters from the dropdown",true);
		
		if(chapters_Title.getText().contains("chapters")){
			
			for(WebElement ch:listofChapters){
			driver.findElement(By.xpath("//div[@id='rd_chapters_DropDown']//ul/li/label[text()='"+chapters+"']/input[@type='checkbox']")).click();
				
				break;
			}
			Thread.sleep(3000);
		}
		
		Reporter.log("chapters are selected",true);
		
		AddtoAWR.click();
		Reporter.log("AddtoAWR is clicked",true);
		Thread.sleep(3000);
		
		for(WebElement added:AddedChapters)
		{
			
			Reporter.log("Added chapters are :"+added);
		}
		
		
			
	
		return this;
	}
	
	

	
	
	
	
}
