package com.pack.common.pageobjects.Dream;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class managePortal_TeamManagement {
	
	
	private  WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}
	
	
	public managePortal_TeamManagement(WebDriver driver ) {
		
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
	}

	@FindBy(xpath = "//*[contains(text(),'Manage Portal')]")
	 private WebElement lnkManagePortal;
	
	
	@FindBy(xpath = "//a[contains(text(),'Team Management')]")
	 private WebElement lnkTeamManagement;
	 
	 @FindBy(id= "btnNewTeam")
	 private WebElement btnNewTeam;
	
	 @FindBy(id= "txtTEAMNAME")
	 private WebElement txtTEAMNAME;
	 
	 @FindBy(id= "lstTeamOwner")
	 private WebElement lstTeamOwner;
	 
	 @FindBy(id= "ddBookMark")
	 private WebElement drpdownMapBookmark;
	 
	 @FindBy(id= "cboAssetOwner")
	 private WebElement drpdownAssetOwner;
	 
	 @FindBy(id= "btnSave")
	 private WebElement btnSave;
	 
	 @FindBy(id= "dualManageStaff_LeftBox")
	 private WebElement listUsers;
	 
	 @FindBy(id= "dualManageStaff_MoveRight")
	 private WebElement btndualManageStaff_MoveRight;
	 
	 @FindBy(id= "cmdSave")
	 private WebElement btncmdSave;
	 
	 @FindBy(xpath= "//*[@id='dualManageStaff_RightBox']")
	 private WebElement listStaffinTeam;
	 
	 @FindBy(id= "dualManageStaff_MoveLeft")
	 private WebElement btndualManageStaff_MoveLeft;
	 
	public WebElement getlnkTeamManagement() {
		return lnkTeamManagement;
	}
	
	
	public WebElement getbtnNewTeam() {
		return btnNewTeam;
	}
	
	public WebElement gettxtTEAMNAME() {
		return txtTEAMNAME;
	}
	
	public WebElement getlstTeamOwner() {
		return lstTeamOwner;
	}
	
	public WebElement getdrpdownMapBookmark() {
		return drpdownMapBookmark;
	}
	
	
	public WebElement getdrpdownAssetOwner() {
		return drpdownAssetOwner;
	}
	
	public WebElement getbtnSave() {
		return btnSave;
	}
	
	public WebElement getlistUsers() {
		return listUsers;
	}
	
	public WebElement getbtndualManageStaff_MoveRight() {
		return btndualManageStaff_MoveRight;
	}
	
	public WebElement getbtncmdSave() {
		return btncmdSave;
	}
	
	public WebElement getlistStaffinTeam() {
		return listStaffinTeam;
	}
	
	public WebElement getbtndualManageStaff_MoveLeft() {
		return btndualManageStaff_MoveLeft;
	}
	
	//Generic method for manage portal
	public void manageTools(WebElement element) throws InterruptedException {
		  Actions actions = new Actions(driver);
		  actions.moveToElement(lnkManagePortal).click(element).build().perform();
		  		  
	}
	
public void switchToFrame(String txt) throws Throwable{
		
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		
		for(int i=0;i<frame.size();i++){
		System.out.println(frame.get(i).toString());
		}
		
		driver.switchTo().frame(txt);
		Thread.sleep(2000);
						
	}

public void drpdownSelection(WebElement element,String text) throws InterruptedException {

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

public void teamName(String text,int num) throws InterruptedException {
		
	driver.findElement(By.xpath("//*[contains(text(),'"+text+"')]/../td['"+num+"']/a")).click();
	
}

public void addRemoveStaff(String text) {
	driver.findElement(By.xpath("//*[contains(text(),'"+text+"')]/../td[5]/a")).click();
	}

public void deleteTeam(String text) {
	driver.findElement(By.xpath("//*[contains(text(),'"+text+"')]/../td[6]/a")).click();
	}

public fetchingReports getAlert(){
	
	Alert alert = driver.switchTo().alert();		
	System.out.println(alert.getText());
	alert.accept();
	
	return new fetchingReports(driver);	
	
}


}
