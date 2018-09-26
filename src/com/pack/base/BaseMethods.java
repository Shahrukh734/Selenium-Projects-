package com.pack.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class BaseMethods {
	
	private  WebDriver driver;
	
	public WebDriverWait wait ;

	public WebDriver getDriver() {
		return driver;
	}
	

	public BaseMethods(WebDriver driver) {
		//super(driver);
		this.driver = driver;
		/*AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);*/
	}
	
	public BaseMethods hoverandselectElement(WebElement mainElement,WebElement subElement){
		
		Actions action = new Actions(driver);
		action.moveToElement(mainElement).click(subElement).build().perform();
	
	return this;
	}
	
	
	
	public BaseMethods doubleClickElement(){
		
		Actions action = new Actions(driver);
		action.doubleClick();
		
		return this;
		
	}
	
	public BaseMethods contextClick(){
		
		Actions action = new Actions(driver);
		action.contextClick();
		
		return this;
		
	}
	
	public BaseMethods clickOnElement(WebElement element){
	 
		element.click();
	
		return this;
	}
	
	public BaseMethods enterTextValue(WebElement element,String text){
	
		element.sendKeys(text);
	
		return this;
	}
	
	public BaseMethods selectFromDropDownByText(WebElement element,String text){
		 Select select = new Select(element);
		  List<WebElement> options = select.getOptions(); 
		  try{
			  
		  if (select.isMultiple() && text.equalsIgnoreCase("All")) { 
			  
			  select.deselectAll();
			  
			  Thread.sleep(2000);
	
			    for (WebElement we : options) 
			    {  

			    		
			    	select.selectByVisibleText(we.getText());
			    
			    }
			    }
		  
		  
		  else
		  {
			  for (WebElement we : options) {  
			    	
			    	if(we.getText().equalsIgnoreCase(text))
			    	{
				    	
				    	select.selectByVisibleText(we.getText());
				    } 
			  
		  }
		  
		  }
		  }

		  catch(Exception e)
		  
		  {
			  
			  System.out.println("Element not selected");
		  }
		  
		  return this;
		  
	  
	  
	  
	}
	
	public BaseMethods selectMultipleOptionsFromList(WebElement element){
		
		
		//WebElement list = driver.findElement(By.id("sel"));
		
		List<WebElement> listOpts = element.findElements(By.tagName("option"));

		int lastIndex = listOpts.size()-1;
		Actions act = new Actions(driver);
		
		act.clickAndHold(listOpts.get(0)).perform();
		act.moveToElement(listOpts.get(lastIndex)).release().perform();

		return this;
	}
	
	
	
	public BaseMethods selectFromDropDownByIndex(WebElement element,int index){
	Select select = new Select(element);
	  List<WebElement> options = select.getOptions();
	  
	  for (WebElement we : options) {  
	
		    	//select.selectByVisibleText(we.getText());
		    	select.selectByIndex(index);
		    	
		    	break;
	  
	  	}
	  
	  return this;
	  
	}
	
	
	public BaseMethods selectElementFromList(List<WebElement> element,String text){
		
		
		
		for (WebElement li : element) {
			
			//li.clear();
			//System.out.println(li.getText());
			WebElement check_ComponentToAdd = driver.findElement(By.xpath("//ul[@class='rlbList']/li//span[contains(.,'" + text + "')]/../input"));
			if (li.getText().contains(text)){
				li.click();
				check_ComponentToAdd.click();

				break;
			   }
			
			}		
		return this;
	}
	
	public BaseMethods switchtoFrame(WebElement frameId){
		
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		
		for(int i=0;i<frame.size();i++){
		System.out.println(frame.get(i).toString());
		}
		
		//WebElement frameId1 = driver.findElement(By.name("ctl00_ctl00_BodyContent_radPaneRight"));
		
		driver.switchTo().frame(frameId);
			
		return this;	
	}
	
	public BaseMethods getAlert(){
		
		Alert alert = driver.switchTo().alert();		
		System.out.println(alert.getText());
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		alert.accept();
		
		return this;
		
	}
	
	 
	 public BaseMethods switchWindows(){

		// Switch to new window opened
		 for(String winHandle : driver.getWindowHandles()){
			    WebDriver currentWindow = driver.switchTo().window(winHandle);
			    
			    System.out.println("Switched window"+currentWindow);
			}

		 return this;

	 }
	 
		public BaseMethods currentWindowHandle(){
			
			String  winHandleBefore = driver.getWindowHandle();
			System.out.println("winHandleBefore"+winHandleBefore);
			
			return this;
		}
		
		
		
		public BaseMethods GetDateinJava(){
		 // Create object of SimpleDateFormat class and decide the format
		 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
		 
		 // Print the Date
		 System.out.println(date1);
		 
		 return this;
		 
		}
		
		public BaseMethods GetCurrentTime(){
			
			  DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHH"); 
		      Date date = new Date();
		      String FinalDate = dateFormat.format(date);
		      System.out.print(FinalDate);
        
        return this;
		}
		 
		public static int randInt(int min, int max) {


			Random ran = new Random();
			int randomNum = min + ran.nextInt(max - min + 1);
		    return randomNum;
		}
		
		 public  BaseMethods takeSnapShot(String fileWithPath) throws Exception{

		        //Convert web driver object to TakeScreenshot

		        TakesScreenshot scrShot =((TakesScreenshot)driver);

		        //Call getScreenshotAs method to create image file

		                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

		            //Move image file to new destination

		                File DestFile=new File(fileWithPath);

		                //Copy file at destination

		                FileUtils.copyFile(SrcFile, DestFile);
		                
		                return this;
		    }
	
		 
		 public BaseMethods DragandDrop(WebElement text1, WebElement text2){
			 
			 Actions builder = new Actions(driver);

			 Action dragAndDrop = builder.clickAndHold(text1)
			    .moveToElement(text2)
			    .release(text2)
			    .build();
			 
			 dragAndDrop.perform();
			 
			 return this;
			 
		 }
		 
		 public BaseMethods mouseHoverJScript(WebElement HoverElement,WebElement clickElement ) {
				try {
					if (isElementPresent(HoverElement)) {
						
						String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
						JavascriptExecutor executor = (JavascriptExecutor)driver;
						executor.executeScript(mouseOverScript,HoverElement);
						clickElement.click();
					}
				}
		  catch(Exception e) {
			  
		  }
				return this;
	}
		 
		 public static boolean isElementPresent(WebElement element) {
				boolean flag = false;
				try {
					if (element.isDisplayed()
							|| element.isEnabled())
						flag = true;
				} catch (NoSuchElementException e) {
					flag = false;
				} catch (StaleElementReferenceException e) {
					flag = false;
				}
				return flag;
			} 
		 
		 public BaseMethods  getWhenVisible(By locator, int timeout) {
			 
			 WebElement element = null;
			  
			 WebDriverWait wait = new WebDriverWait(driver, timeout);
			  
			 element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			  
			 return this;
			  
			 }
		 
		 
		 public BaseMethods maximizeWindowScreen() throws Throwable{
			 
			 driver.manage().window().maximize();
			 
			 Thread.sleep(3000);
			 
			 return this;
		 }

		 
		 //Read from excel 
		 
		 
		 public BaseMethods readDataFromExcelandclick(String fileName,String sheetName,String element,WebElement element1 ) throws Throwable{
			 
			//Create an object of File class to open xlsx file
			 
			 	File file =    new File(System.getProperty("user.dir")+"\\"+fileName);
			   if (file.createNewFile()){
			    System.out.println("File is created!");
			   }else{
			    System.out.println("File already exists.");
			   }


			    //Create an object of FileInputStream class to read excel file

			    FileInputStream inputStream = new FileInputStream(file);

			    Workbook workbook = null;

			    //Find the file extension by splitting file name in substring  and getting only extension name

			    String fileExtensionName = fileName.substring(fileName.indexOf("."));

			    //Check condition if the file is xlsx file

			    if(fileExtensionName.equals(".xlsx")){

			    //If it is xlsx file then create object of XSSFWorkbook class

			   workbook = new XSSFWorkbook(inputStream);

			    }

			    //Check condition if the file is xls file

			    else if(fileExtensionName.equals(".xls")){

			        //If it is xls file then create object of XSSFWorkbook class

			        workbook = new HSSFWorkbook(inputStream);

			    }

			    //Read sheet inside the workbook by its name

			    Sheet sheet = workbook.getSheet(sheetName);

			    //Find number of rows in excel file

			    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

			    //Create a loop over all the rows of excel file to read it

			    for (int i = 0; i < rowCount+1; i++) {

			        Row row = sheet.getRow(i);

			        //Create a loop to print cell values in a row

			        for (int j = 0; j < row.getLastCellNum(); j++) {

			            //Print Excel data in console

			            if(row.getCell(j).getStringCellValue().contains(element)){
			            	
			            element1.click();
			            	
			         
			            	
			            }
			            }
			            

					

			        }
			    return this;
			    }


		 
		 
		 public BaseMethods writeDatatoExcel(String fileName,String sheetName,String[] dataToWrite) throws IOException{

		        //Create an object of File class to open xlsx file

		        File file =    new File(System.getProperty("user.dir")+"\\"+fileName);
		        
		        if (file.createNewFile()){
				    System.out.println("File is created!");
				   }else{
				    System.out.println("File already exists.");
				   }


		        //Create an object of FileInputStream class to read excel file

		        FileInputStream inputStream = new FileInputStream(file);

		        Workbook workbook = null;

		        //Find the file extension by splitting  file name in substring and getting only extension name

		        String fileExtensionName = fileName.substring(fileName.indexOf("."));

		        //Check condition if the file is xlsx file

		        if(fileExtensionName.equals(".xlsx")){

		        //If it is xlsx file then create object of XSSFWorkbook class

		       workbook = new XSSFWorkbook(inputStream);

		        }

		        //Check condition if the file is xls file

		        else if(fileExtensionName.equals(".xls")){

		            //If it is xls file then create object of XSSFWorkbook class

		            workbook = new HSSFWorkbook(inputStream);

		        }


		    //Read excel sheet by sheet name    
		        
		    Sheet sheet = workbook.getSheet(sheetName);

		    //Get the current count of rows in excel file

		    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

		    //Get the first row from the sheet

		    Row row = sheet.getRow(0);

		    //Create a new row and append it at last of sheet

		    Row newRow = sheet.createRow(rowCount+1);

		    //Create a loop over the cell of newly created Row

		    for(int j = 0; j < row.getLastCellNum(); j++){

		        //Fill data in row

		        Cell cell = newRow.createCell(j);

		        cell.setCellValue(dataToWrite[j]);

		    }

		    //Close input stream

		    inputStream.close();

		    //Create an object of FileOutputStream class to create write data in excel file

		    FileOutputStream outputStream = new FileOutputStream(file);

		    //write data in the excel file

		    workbook.write(outputStream);

		    //close output stream

		    outputStream.close();

		    
		    return this;
		    }
		 
		 
		 
		 
		 public BaseMethods fecthdatafromlistandWriteDatatoExcel(List<WebElement> element,String FileName)
		 {
			 
			 
			 for(int i=0;i<element.size();i++){
				 
				 try
			        {
					 	File file =    new File(System.getProperty("user.dir")+"\\"+FileName);
			            FileInputStream fis = new FileInputStream(file);
			            Workbook wb = WorkbookFactory.create(fis);
			            int firstVisibleTab = wb.getFirstVisibleTab();
			            Sheet st = wb.getSheetAt(firstVisibleTab);
			            Row r =st.getRow(i);
			            Cell c = r.getCell(0);
			            c.setCellValue(element.get(i).getText());
			            FileOutputStream fos = new FileOutputStream(file);
			            wb.write(fos);
			        }
			        catch(Exception e)
			        {

			        }
			 }
			 
			 return this;
		 }
		 
		 private static String downloadPath = "D:\\seleniumdownloads";
		 public void filecheck(){
			 
		
		   Assert.assertTrue(isFileDownloaded_Ext(downloadPath,".ics"),"Failed to download document which has extension .xls");
		   Assert.assertTrue(isFileDownloaded(downloadPath, "mailmerge.ics"), "Failed to download Expected document");
			}

			
		   private boolean isFileDownloaded_Ext(String dirPath, String ext){
		   	boolean flag=false;
		       File dir = new File(dirPath);
		       File[] files = dir.listFiles();
		       if (files == null || files.length == 0) {
		           flag = false;
		       }
		       
		       for (int i = 1; i < files.length; i++) {
		       	if(files[i].getName().contains(ext)) {
		       		flag=true;
		       	}
		       }
		       return flag;
		   }
		   
		   public boolean isFileDownloaded(String downloadPath, String fileName) {
				boolean flag = false;
			    File dir = new File(downloadPath);
			    File[] dir_contents = dir.listFiles();
			  	    
			    for (int i = 0; i < dir_contents.length; i++) {
			        if (dir_contents[i].getName().equals(fileName))
			            return flag=true;
			            }

			    return flag;
			}
		 
}
