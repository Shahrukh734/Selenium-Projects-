package com.pack.common.pageobjects.Dream;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class myTools_AllTeams  {

	
	private  WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}
	
	
	public myTools_AllTeams(WebDriver driver ) {
		
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'My Tools')]")
	private   WebElement linkMyTools;
	
	@FindBy(xpath="//a[contains(text(),'Clear My Cache')]")
	private   WebElement linkMyToolsClearMyCache;
	
	@FindBy(xpath="//a[contains(text(),'My Assets')]")
	private   WebElement linkMyToolsMyAssets;
	
	@FindBy(xpath="//a[contains(text(),'All Teams')]")
	private   WebElement linkMyToolsAllTeams;
	
	
	@FindBy(xpath="//a[contains(text(),'My Clusters')]")
	private   WebElement linkMyToolsMyClusters;
	
		
	@FindBy(name="btnRequestNewTeam")
	private   WebElement btnRequestNewTeam;
	
	@FindBy(id="txtTeamName")
	private   WebElement txtTeamName;
	
	@FindBy(id = "btnSubmit")
	private WebElement btnSubmit;
		
	@FindBy(id = "cboTeamOwner")
	 private WebElement TeamOwnerdrpdown;
	
	@FindBy(id = "txtPurpose")
	 private WebElement txtPurpose;
	
	
	@FindBy(id = "rblFavourites_1")
	 private WebElement radiobtnFavourites;
	
	
	@FindBy(id = "rblFavourites_0")
	 private WebElement radiobtnAll;
	 
	 @FindBy(id = "gvAllTeams_chbSelect_0_freezeitem")
	 private WebElement chkbxTeamname1;
	 
	 @FindBy(id = "gvAllTeams_chbSelect_1_freezeitem")
	 private WebElement chkbxTeamname2;
	 
	 @FindBy(id = "gvAllTeams_chbSelect_2_freezeitem")
	 private WebElement chkbxTeamname3;
	 
	 @FindBy(id = "gvAllTeams_chbSelect_3_freezeitem")
	 private WebElement chkbxTeamname4;
	 
	  @FindBy(id = "btnAddToFavorites")
	 private WebElement btnAddToFavorites;
	  
	  
	  @FindBy(id = "imgExpand")
	  private WebElement imgExpandTeamFilter;
	  
	  
	  @FindBy(id = "lstTeamOwner")
	  private WebElement lstTeamOwner;
	
	  
	  @FindBy(id = "btnApplyFilter")
	  private WebElement btnApplyFilter;  
	  
	  
	  @FindBy(id = "gvAllTeams_lnkBtnTeamName_0")
	  private WebElement lnkTeamName;  
	  
	  @FindBy(id = "lstTeamName")
	  private WebElement lstTeamName;
	  
	
	public WebElement getlinkMyToolsClearMyCache() {
		return linkMyToolsClearMyCache;
	}
	
	public WebElement getlinkMyToolsMyAssets() {
		return linkMyToolsMyAssets;
	}
	
	public WebElement getlinkMyToolsAllTeams() {
		return linkMyToolsAllTeams;
	}
	
	public WebElement getlinkMyToolsMyClusters() {
		return linkMyToolsMyClusters;
	}
	
		
	
	
	public WebElement getbtnRequestNewTeam() {
		return btnRequestNewTeam;
	}
	
	public WebElement gettxtTeamName() {
		return txtTeamName;
	}
	
	public WebElement getTeamOwnerDrpdown() {
	     return TeamOwnerdrpdown;

	 }
	
	public WebElement gettxtPurpose() {
		return txtPurpose;
	}
	
	public WebElement getbtnSubmit() {
		return btnSubmit;
	}
	
	public WebElement getbtnAddToFavorites() {
		return btnAddToFavorites;
	}
	
	public WebElement getradiobtnFavourites() {
		return radiobtnFavourites;
	}
	
	public WebElement getradiobtnAll() {
		return radiobtnAll;
	}
	
	
	public WebElement getimgExpandTeamFilter() {
		return imgExpandTeamFilter;
	}
	
	
	public WebElement getlstTeamOwner() {
		return lstTeamOwner;
	}
	
	public WebElement getbtnApplyFilter() {
		return btnApplyFilter;
	}
	
	public WebElement getlnkTeamName() {
		return lnkTeamName;
	}
	
	public WebElement getlstTeamName() {
		return lstTeamName;
	}
	
	//Generic method for  My Tools
	public void myToolsAllTeams(WebElement element) throws InterruptedException {
		  Actions actions = new Actions(driver);
		  actions.moveToElement(linkMyTools).click(element).build().perform();
		  Thread.sleep(2000);
		  driver.switchTo().frame(0);
		  Thread.sleep(2000);
		  
		  
	}
	
	public void myToolsAllTeamsWithoutFrame(WebElement element) throws InterruptedException {
		  Actions actions = new Actions(driver);
		  actions.moveToElement(linkMyTools).click(element).build().perform();
		  		  
	}
	
	//Switching back to Parent Window
	public void switchToParentWindow() throws InterruptedException {
		Set<String>windowid=driver.getWindowHandles();
		Iterator<String>itr=windowid.iterator();
		String mainwindow=itr.next();
		String childwindow=itr.next();
		driver.close();
		driver.switchTo().window(mainwindow);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
	}
	
	public void teamName() throws InterruptedException {
		
//		List<WebElement>teamname=driver.findElements(By.xpath("//*[@id='gvAllTeams']/tbody/tr/td[2]"));
//		Thread.sleep(2000);
//		System.out.println(teamname.size());
//		for(WebElement team:teamname) {
//			System.out.println(team.getText());
//		}
		
//		chkbxTeamname1.click();
//		chkbxTeamname2.click();
//		chkbxTeamname3.click();
//		chkbxTeamname4.click();
//		Thread.sleep(1000);
//	btnAddToFavorites.click();
//		Thread.sleep(1000);
//		radiobtnFavourites.click();
//		Thread.sleep(5000);
//		List<WebElement>teamnames=driver.findElements(By.xpath("//*[@id='gvAllTeams']/tbody/tr/td[2]"));
//		Thread.sleep(2000);
//		System.out.println(teamnames.size());
//		for(WebElement teams:teamnames) {
//			System.out.println(teams.getText());////*[@id='gvAllTeams_lnkBtnTeamName_3']
		
	}
	
	//Drop Down method to select items from the list
	public void drpdownTeamOwner(WebElement element,String text) throws InterruptedException {
		
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
	
	public void switchToFrame(String txt) throws Throwable{
		
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		
		for(int i=0;i<frame.size();i++){
		System.out.println(frame.get(i).toString());
		}
		
		driver.switchTo().frame(txt);
		Thread.sleep(2000);
						
	}


	
	public void SelectRecords(int Num) throws InterruptedException{ 
		List<WebElement> Checkboxitem=driver.findElements(By.xpath("//*[@id='gvAllTeamsPanelItemContentFreeze']/table/tbody/tr/td/div/input"));
		Thread.sleep(2000);
         System.out.println(Checkboxitem.size());
        for(int i=0;i<Checkboxitem.size()-Checkboxitem.size()+Num;i++){ 
        String text = Checkboxitem.get(i).getText(); 
        System.out.println(Checkboxitem.get(i).isDisplayed());
        System.out.println(text);
        Checkboxitem.get(i).click(); 
        Thread.sleep(2000);
        }   
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);"); 
     
}
	public String getText(WebElement element) {
		
		String message=element.getText();
		System.out.println(message);
		
		return message;
	}

}
