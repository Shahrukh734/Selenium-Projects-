package com.pack.common.pageobjects_eBooks;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.pack.base.BaseMethods;



public class MaintainBooks extends BaseMethods{

	//BaseMethods basepage;
	
	private  WebDriver driver;
	public static MaintainGenericComponents admin;
	

	public WebDriver getDriver() {
		return driver;
	}
	
	
	  
	  @FindBy(xpath="//*[@id='btnNewMaster']")
	  private  WebElement click_NewMasterPage;
		
	  @FindBy(xpath="//*[@id='chbHeader']")
	  private  WebElement selectAll_ChapterName;
	
	  @FindBy(xpath="//*[@id='btnAddMasterPage']")
	  private  WebElement button_AddMasterPage;
	  
	  @FindBy(xpath="//*[@id='cboMasterPages']")
	  private  WebElement select_PageInLibrary;
	  
	  @FindBy(xpath="//*[@id='cmdSave']")
	  private  WebElement savePage;
	  
	  @FindBy(xpath="//*[@id='cmdCancel']")
	  private  WebElement cancelPage;
	  

	public MaintainBooks(WebDriver driver) {
		super(driver);
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
	}
	

	

	

	
	public MaintainBooks selectBookName(String text){
		
		WebElement bookName = driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]/.."));
		try{
		if(bookName!=null){
			WebElement checkBookName = driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]/../td[1]"));
			checkBookName.click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]/..//td[@class='printerFriendly'][3]")).click();
			
			
		}
		}
		
		catch(Exception e){
			
			System.out.println("BookName and Chapters not selected" +e);
		}
		
		
		
		return this;

	}

	
	public MaintainBooks select_ChapterName(String assetType){
		
		WebElement assetName = driver.findElement(By.xpath("//td[text()='" + assetType + "']"));
		try{
	
			List<WebElement> elements = driver.findElements(By.xpath("//td[text()='" + assetType + "']/../td/input[@type='checkbox']"));
			
			for(WebElement e:elements){

				e.click();
			}
		
		}
		
		catch(Exception e){
			
			System.out.println(e);
		}
		
		
		return this;
	}
	
	public MaintainBooks select_UniqueChapterName(String assetType,String chapter){
		
		WebElement assetName = driver.findElement(By.xpath("//td[text()='" + assetType + "']"));
		WebElement chapters = driver.findElement(By.xpath("//td[text()='" + chapter + "']"));
		try{
	
			List<WebElement> elements = driver.findElements(By.xpath("//td[text()='" + assetType + "']/../td/input[@type='checkbox']"));
			
			for(WebElement e:elements){
				
				WebElement chapterName = driver.findElement(By.xpath("//td[.='"+chapter+"']/../td/input[@type='checkbox']"));
				
				if(chapters.getText().equalsIgnoreCase(chapter)) {
					clickOnElement(chapterName);
					break;
				}
				
			}
		
		}
		
		catch(Exception e){
			
			System.out.println(e +"chapter not selected");
		}
		
		
		return this;
	}
	
	
	
	public homePage AddMasterPageToChapters(String AssetType,String MasterpageName) throws Throwable{
		
		String pageName=AddMasterPage.getMasterPageName();
		Thread.sleep(3000);
		select_ChapterName(AssetType);
		Thread.sleep(3000);
		button_AddMasterPage.click();
		Thread.sleep(3000);
		selectFromDropDownByText(select_PageInLibrary,pageName);
		
		//"_"+java.time.LocalDate.now()+"_"+randInt(0,99)
		
		Thread.sleep(3000);
		savePage.click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		return new homePage(driver);

	}
public homePage UniqueAddMasterPageToChapters(String AssetType,String chapterName ) throws Throwable{
		
		Thread.sleep(3000);
		select_UniqueChapterName(AssetType,chapterName);
		String pageName=AddMasterPage.getMasterPageName();
		Thread.sleep(3000);
		button_AddMasterPage.click();
		Thread.sleep(3000);
		selectFromDropDownByText(select_PageInLibrary,pageName);
		
		//"_"+java.time.LocalDate.now()+"_"+randInt(0,99)
		
		Thread.sleep(3000);
		savePage.click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		return new homePage(driver);

	}

	
	
	
	
	

}
