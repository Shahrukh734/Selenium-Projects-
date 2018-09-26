package com.pack.common.pageobjects_eBooks;

import java.util.List;
import java.util.concurrent.TimeUnit;


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



public class AddMasterPage extends BaseMethods{

	//BaseMethods basepage;
	
	private  WebDriver driver;
	 public static MaintainGenericComponents admin;
	

	public WebDriver getDriver() {
		return driver;
	}
	
	
	  
	  @FindBy(xpath="//*[@id='txtPageTitle']")
	  private  WebElement enter_Name;
		
	  @FindBy(xpath="//*[@id='txtTitleTemplate']")
	  private  WebElement Enter_PageTitle;
	  
	  
	  @FindBy(xpath="//*[@name='cboBookType']")
	  private  WebElement select_BookType;
	
	  @FindBy(xpath="//*[@name='cboAssetType']")
	  private  WebElement select_AssetType;
	  
	  @FindBy(xpath="//*[@name='cboDiscipline']")
	  private  WebElement select_Discipline;
	  
	  @FindBy(xpath="//*[@name='cboConnectionType']")
	  private  WebElement select_ConnectionType;
	  
	  @FindBy(xpath="//*[@id='txtToolTip']")
	  private  WebElement enter_ToolTip;
	  
	  @FindBy(xpath="//*[@class='rlbGroup rlbGroupRight']")
	  private  WebElement componentBox;
	  
	  @FindBy(xpath="//span[@id='lblException']")
	  private  WebElement errorMassage_AddMasterPage;
	  
	
	  
	  @FindBy(xpath="//ul[@class='rlbList']/li")
	  private  List<WebElement> select_ComponentToAdd;
	  
	  @FindBy(xpath="//*[contains(@class,'ui-dialog-buttonset')]//span[text()='Add To Existing']")
	  private  WebElement click_AddExistingPage;
	  
	  @FindBy(xpath="//*[contains(@class,'ui-dialog-buttonset')]//span[text()='Override']")
	  private  WebElement click_Override;
	
	  
	  @FindBy(xpath="//*[contains(@class,'ui-dialog-buttons')]//div[@id='ConfirmPanel']")
	  private  WebElement select_ConfirmationText;
	  
	
	  public List<WebElement> getSelect_ComponentToAdd() {
		return select_ComponentToAdd;
	}
	  
	  @FindBy(xpath="//*[contains(@id,'rdViewComponent')]//tbody/tr/td[2]")
	  private  List<WebElement> get_AddedComponent;

	

	  @FindBy(xpath="//*[@id='btnComponent']")
	  private  WebElement button_ComponentAdd;
	  
	  @FindBy(xpath="//input[contains(@id,'txtName')]")
	  private  WebElement select_ComponentName;
	  
	  @FindBy(xpath="//input[contains(@id,'txtHeight')]")
	  private  WebElement select_Height;
	  
	  @FindBy(xpath="//input[contains(@id,'txtWidth')]")
	  private  WebElement select_Width;
	  
	  @FindBy(xpath="//input[contains(@id,'txtMaxChar')]")
	  private  WebElement select_MaxChar;
	
	  @FindBy(xpath="//*[@id='cmdOK' and @value='Save']")
	  private  WebElement button_Save;
	  
	  @FindBy(xpath="//*[@id='cmdCancel' and @value='Cancel']")
	  private  WebElement button_Cancel;
	
	
	  public static String masterPageName;
	  
	public static String getMasterPageName() {
		return masterPageName;
	}

	public static void setMasterPageName(String masterPageName) {
		AddMasterPage.masterPageName = masterPageName;
	}



	public AddMasterPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
	}
	

	
	public AddMasterPage enter_Name(String masterPageName){
		Reporter.log(" Enter the MasterPage Name");
		
		masterPageName=masterPageName+"_"+java.time.LocalDate.now()+"_"+randInt(0,99);
		setMasterPageName(masterPageName);
	
		enterTextValue(enter_Name,masterPageName);
		return this;
	}
	
	public AddMasterPage Enter_PageTitle(String text){
		Reporter.log(" Enter the MasterPage TitleName");
		enterTextValue(Enter_PageTitle,text);
		return this;
	}
	
	public AddMasterPage select_BookType(String element){
		Reporter.log(" select the MasterPage BookType");
		selectFromDropDownByText(select_BookType,element);
		return this;
	}

	public AddMasterPage select_AssetType(String element){
		Reporter.log(" select the MasterPage AssetType");
		selectFromDropDownByText(select_AssetType,element);
		return this;
	}
	
	
	public AddMasterPage select_Discipline(String element) throws Throwable{
		Reporter.log(" select the MasterPage DisciplineName");
		selectFromDropDownByText(select_Discipline,element);
		Thread.sleep(2000);
		return this;
	}
	
	public AddMasterPage select_ConnectionType(String element){
		Reporter.log(" select the MasterPage ConnectionType");
		selectFromDropDownByText(select_ConnectionType,element);
		return this;
	}
	
	public AddMasterPage enter_ToolTip(String text){
		Reporter.log(" Enter the MasterPage ToolTip");
		enterTextValue(enter_ToolTip,text);
		return this;
	}
	
	
	public AddMasterPage select_ComponentToAdd(String text1,String text2) throws Throwable{
		Reporter.log(" Select the MasterPage Component to be added");
		componentBox.click();
		
		if(text2==null ){
			
			selectElementFromList(select_ComponentToAdd,text1);
		
		}
		
		if(text1!=null && text2!=null ){
		selectElementFromList(select_ComponentToAdd,text1);
		selectElementFromList(select_ComponentToAdd,text2);
		}
		
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("//*[@id='radListBoxComponent']/table/tbody/tr/td/a[1]/span/span/span/span/span"));
		
		if(button.isEnabled()){
		Thread.sleep(5000);
		clickOnElement(button_ComponentAdd);
		}
	
		return this;
	}
	
	
	
	
	public AddMasterPage Edit_ComponetToAdd(String text) throws Throwable{
		
		selectElementFromList(select_ComponentToAdd,text);
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("//*[@id='radListBoxComponent']/table/tbody/tr/td/a[1]/span/span/span/span/span"));
		
		if(button.isEnabled()){
		Thread.sleep(5000);
		clickOnElement(button_ComponentAdd);
		Thread.sleep(3000);
		
		if(select_ConfirmationText.getText() != null){
			click_Override.click();
			for (WebElement element  : get_AddedComponent) {
				
				
				
				Reporter.log("Added component Name in Page are :"+element.getText(), true);

				
				   }
			
		}
		
		Thread.sleep(3000);
		
		}		
		return this;
	}
	
	public AddMasterPage EditMasterPage_AddSelectedComponent(String c1,String c2,String c3) throws Throwable{
		
		String text="Plot";
		

			List<WebElement> check_ComponentToAdd = driver.findElements(By.xpath("//ul[@class='rlbList']/li//span[@class='rlbText']"));
			
			
			for(int i=0;i<=check_ComponentToAdd.size();i++){
				
			
					
					WebElement checkbox_c1 = driver.findElement(By.xpath("//ul[@class='rlbList']/li//span[contains(.,'" + c1 + "')]/../input"));
					WebElement checkbox_c2= driver.findElement(By.xpath("//ul[@class='rlbList']/li//span[contains(.,'" + c2 + "')]/../input"));
					WebElement checkbox_c3= driver.findElement(By.xpath("//ul[@class='rlbList']/li//span[contains(.,'" + c3 + "')]/../input"));
					Actions act = new Actions(driver);
					
					act.click(checkbox_c1).click(checkbox_c2).click(checkbox_c3).build().perform();
			}
	
				Thread.sleep(1000);
		
			
			
		
		
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("//*[@id='radListBoxComponent']/table/tbody/tr/td/a[1]/span/span/span/span/span"));
		
		if(button.isEnabled()){
		Thread.sleep(5000);
		clickOnElement(button_ComponentAdd);
		Thread.sleep(5000);
		
		if(select_ConfirmationText.getText() != null){
			click_Override.click();
			for (WebElement element  : get_AddedComponent) {
				
				
				
				Reporter.log("Added component Name in Page are :"+element.getText(), true);

				
				   }
		}
		
		
		
		Thread.sleep(3000);
		
		}
	
		
		
		
		return this;
	}
	
	
	public AddMasterPage Edit_MultipleComponetToAdd(String text) throws Throwable{
		
		//List<WebElement> check_ComponentToAdd = driver.findElements(By.xpath("//ul[@class='rlbList']/li//span[@class='rlbText']"));
		
		
		for(int i=0;i<select_ComponentToAdd.size();i++){
			
			
			if(select_ComponentToAdd.get(i).getText().contains(text)){
				List<WebElement> checkbox = driver.findElements(By.xpath("//ul[@class='rlbList']/li//span[contains(.,'" + text + "')]/../input"));
				select_ComponentToAdd.get(i).click();
				
				Actions act = new Actions(driver);
				
				act.click(checkbox.get(0)).click(checkbox.get(1)).click(checkbox.get(2)).build().perform();
				
				break;

				
	
			}
			else if(text==null){
				
				List<WebElement> checkbox = driver.findElements(By.xpath("//ul[@class='rlbList']/li//span[not contains(.,'" + text + "')]/../input"));
				select_ComponentToAdd.get(i).click();
				
				Actions act = new Actions(driver);
				
				act.click(checkbox.get(0)).click(checkbox.get(1)).click(checkbox.get(2)).build().perform();
				
				break;
				
			}
			

			
		}
		
		WebElement button = driver.findElement(By.xpath("//*[@id='radListBoxComponent']/table/tbody/tr/td/a[1]/span/span/span/span/span"));
		
		if(button.isEnabled()){
		Thread.sleep(5000);
		clickOnElement(button_ComponentAdd);
		Thread.sleep(5000);
		
		if(select_ConfirmationText.getText() != null){
			click_Override.click();
			for (WebElement element  : get_AddedComponent) {
				
				
				
				Reporter.log("Added component Name in Page are :"+element.getText(), true);

				
				   }
		}
		
		
		
		Thread.sleep(3000);
		
		}
		return this;
		
	}
	
	
	public AddMasterPage addcomponent_MasterPage() throws Throwable{
		
		List<WebElement> addcomponent_MasterPage = driver.findElements(By.xpath("//ul[@class='rlbList']/li//span[@class='rlbText']/../input"));
		int lastIndex = addcomponent_MasterPage.size()-1;
		
		for(int i=0;i<3;i++){
			addcomponent_MasterPage.get(i).click();
			
			Thread.sleep(1000);
		}
		

		WebElement button = driver.findElement(By.xpath("//*[@id='radListBoxComponent']/table/tbody/tr/td/a[1]/span/span/span/span/span"));

		if(button.isEnabled()){
			Thread.sleep(5000);
			clickOnElement(button_ComponentAdd);
			Thread.sleep(5000);
			}
		
		return this;
	}
	
	
	
	public AddMasterPage select_ComponentName(String componentName){
		select_ComponentName.clear();
		select_ComponentName.sendKeys(componentName);
		return this;	
	}
	
	public AddMasterPage select_Height(String height){
		select_Height.clear();
		select_Height.sendKeys(height);
		return this;	
	}
	
	public AddMasterPage select_Width(String width){
		select_Width.clear();
		select_Width.sendKeys(width);
		return this;	
	}
	
	public AddMasterPage select_MaxChar(String charCount){
		select_MaxChar.clear();
		select_MaxChar.sendKeys(charCount);
		return this;	
	}
	
	

	public AddMasterPage AddtoExisting(String text) throws Throwable{
		
		selectElementFromList(select_ComponentToAdd,text);
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement button = driver.findElement(By.xpath("//*[@id='radListBoxComponent']/table/tbody/tr/td/a[1]/span/span/span/span/span"));
		
		if(button.isEnabled()){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickOnElement(button_ComponentAdd);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		if(select_ConfirmationText.getText() != null){
			click_AddExistingPage.click();
			for (WebElement element  : get_AddedComponent) {
				
				
				
				Reporter.log("Existing  components  in Page are :"+element.getText(), true);

				
				   }
		}
		
		Thread.sleep(3000);
		
		}
		
		return this;
	}
	
public AddMasterPage overridetheExistingcomponent(String text) throws Throwable{
		
		selectElementFromList(select_ComponentToAdd,text);
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement button = driver.findElement(By.xpath("//*[@id='radListBoxComponent']/table/tbody/tr/td/a[1]/span/span/span/span/span"));
		
		if(button.isEnabled()){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickOnElement(button_ComponentAdd);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		if(select_ConfirmationText.getText() != null){
			click_Override.click();
			
			
			for (WebElement element  : get_AddedComponent) {
				
				
				
				Reporter.log("Added component Name in Page are :"+element.getText(), true);

				
				   }
			
		}
		
		
		
		Thread.sleep(3000);
		
		}
		
		return this;
	}
	
	public AddMasterPage deleteComponent_MasterPage(String componentName){
	
		WebElement deleteComponentName = driver.findElement(By.xpath("//*[contains(@id,'rdViewComponent')]//tbody/tr/td[text()='" + componentName + "']"));
		try{
		if(deleteComponentName.isSelected()){
			
			WebElement deletedComponentName = driver.findElement(By.xpath("//*[contains(@id,'rdViewComponent')]//tbody/tr/td[text()='" + componentName + "']/../td[4]/input"));
			
			Thread.sleep(3000);
			
			Reporter.log("Deleted component is :"+componentName, true);
			
			for (WebElement element  : get_AddedComponent) {
				
				
				
				Reporter.log("Deleted component Name in Page are :"+element.getText(), true);

				
				   }
		}
		}
		catch(Exception e){
			
			System.out.println("Element not deleted");
		}

		return this;
	}


	public AddMasterPage reArrangeTheGridView_component(String text1, String text2){
	

	WebElement Drag = driver.findElement(By.xpath("//*[contains(@id,'rdViewComponent')]//tbody/tr/td[text()='" + text1 + "']/.."));
	
	WebElement Drop = driver.findElement(By.xpath("//*[contains(@id,'rdViewComponent')]//tbody/tr/td[text()='" + text2 + "']/.."));
	
	
	DragandDrop(Drag,Drop);
	
	return this;
	}

	public MaintainMasterPage saveMasterPage() throws Throwable{
		try{
		Reporter.log(" Save the Component Added",true);
		clickOnElement(button_Save);
		}
		catch(Exception e)
		{
			Reporter.log(errorMassage_AddMasterPage.getText(),true);
		}
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		return new MaintainMasterPage(driver);
	}
	
	public MaintainMasterPage cancelMasterPage(){
		
		clickOnElement(button_ComponentAdd);
		clickOnElement(button_Cancel);
		driver.switchTo().defaultContent();
		return new MaintainMasterPage(driver);
	}
	
	

	//Sidheswar 
	
	
	  @FindBy(xpath="//*[contains(@id,'rdViewComponent')]/span")
	  private  WebElement Expand_Icon;
	
	  
	  public void getExpand_Icon() {
		  Expand_Icon.click();
	  } 
	
	

}
