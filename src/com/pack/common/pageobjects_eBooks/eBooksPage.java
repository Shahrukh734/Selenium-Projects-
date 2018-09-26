package com.pack.common.pageobjects_eBooks;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.pack.base.BaseMethods;

public class eBooksPage extends BaseMethods{
	
	//iframeDWB
	@FindBy(className="frame")
	  private  WebElement frameId_eBooks;
	
	
	
	
	
	
	@FindBy(xpath="//*[text()='eBook configuration']")
	private  WebElement eBook_configuration;
	
	
	// xpath for ebookLibrary
	@FindBy(xpath="//*[text()='eBook Library']")
	private  WebElement eBookLibrary;
	
	@FindBy(id="tdListBook")
	private  WebElement listofBooks;
	
	public static String actualtext_ebooksPage="List of Books";
	
	@FindBy(id="ddlBookType")
	private  WebElement select_BookType;
	
	@FindBy(id="ddlActiveTeams")
	private  WebElement select_ActiveTeams;
	
	@FindBy(xpath="//input[contains(@id,'btnAddToFavorites')]")
	private  WebElement button_AddToFavourite;
	
	
	//xpath of well Review
	@FindBy(xpath="//*[text()='Well Review']")
	private  WebElement wellReview;
	
	@FindBy(xpath="//*[text()='Well Review Preparation']")
	private  WebElement select_wellReviewPreparation;
	
	
	
	
	private  WebDriver driver;
	
	
	

	public WebDriver getDriver() {
		return driver;
	}
//

public eBooksPage(WebDriver driver) {
	super(driver);
	this.driver = driver;
	AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
	PageFactory.initElements(factory, this);
}


public ebooks_BookViewer selectBooks(String BookName) throws Throwable{
	System.out.println("Switched to Frame");
	clickOnElement(eBookLibrary);
	Thread.sleep(5000);
	switchtoFrame(frameId_eBooks);
	
	String expected = listofBooks.getText();
	
	WebElement book = driver.findElement(By.xpath("//*[contains(text(),'" + BookName + "')]"));	
	clickOnElement(book);

	Thread.sleep(10000);
	switchWindows();
	maximizeWindowScreen();

	return new ebooks_BookViewer(driver);
	
}


	public eBooksPage click_showfavourites(String text){
	
	WebElement button = driver.findElement(By.xpath("//input[contains(@id,'rblFavourites') and @value='"+text+"']"));
	
	clickOnElement(button);
	return this;
	}

	public eBooksPage button_AddToFavourite(){
	
	clickOnElement(button_AddToFavourite);
	
	return this;
	}

	
	public WellReviewPreparation clickOn_wellReviewPreparation() throws Throwable{
		Reporter.log("Select wellReviewPreparation Page from well Review dropdown");
		
		mouseHoverJScript(wellReview, select_wellReviewPreparation);
	
		Reporter.log("WellReviewPreparation Page is selected");
		Thread.sleep(4000);
		
		return new WellReviewPreparation(driver);
	}

	
	



}
