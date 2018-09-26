package com.pack.common.pageobjects_eBooks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.pack.base.BaseMethods;



public class MaintainGenericComponents extends BaseMethods{

	//BaseMethods basepage;
	
	private  WebDriver driver;
	AddMasterPage page;
	//homePage homepage;
	public WebDriver getDriver() {
		return driver;
	}
	

	
	
	 @FindBy(xpath="//*[@id='ddlComponentType']")
	  private  WebElement select_ComponentType;
	  
	  @FindBy(xpath="//*[@id='btnCreate']")
	  private  WebElement buttonCreateComponent;
	  
	  @FindBy(xpath="//input[contains(@class,'rgPageNext')][@type='button']")
	  private  WebElement click_PageNext;
		
	  @FindBy(xpath="//*[@id='txtName']")
	  private  WebElement enter_Name;
	
	  @FindBy(xpath="//*[@id='ddlAssetType']")
	  private  WebElement select_AssetType;
	  
	  @FindBy(xpath="//*[@id='ddlDataSource']")
	  private  WebElement select_DataSource;
	  
	  @FindBy(xpath="//*[@id='ddlViews']")
	  private  WebElement select_Views;
	  
	  @FindBy(xpath="//ul[@class='rlbList']/li")
	  private  List<WebElement> select_ColumnToAdd;
	
	  
	  @FindBy(xpath="//*[contains(@class,'rlbTransferFrom')]//span[@class='rlbButtonText']")
	  private  WebElement click_AddButton;
	  
	  @FindBy(xpath="//*[@id='ddlLegendBoxPositions']")
	  private  WebElement select_LegendBoxPositions;
	  
	  @FindBy(xpath="//*[@id='ddlIdentifierColumn']")
	  private  WebElement select_GeneratePlotPer;
	  
	  @FindBy(xpath="//*[@id='btnPreview']")
	  private  WebElement button_Preview;
	  
	  @FindBy(xpath="//*[@id='btnSave']")
	  private  WebElement button_Save;
	  
	  @FindBy(xpath="//*[@id='btnReset']")
	  private  WebElement button_Reset;
	  
	  @FindBy(xpath="//*[contains(@id,'btnReset')]")
	  private  WebElement click_ResetButton;
	  
	  @FindBy(name="ctl00_ctl00_BodyContent_radPaneRight")
	  private  WebElement frameName;
	  
	  @FindBy(xpath="//label[text()='DREAM']//../*[contains(@id,'chkDreamEbooks')]")
	  private  WebElement check_Dream;
	  
	  @FindBy(xpath="//label[text()='eBooks']//../*[contains(@id,'chkDreamEbooks')]")
	  private  WebElement check_eBooks;
	  
	  
	  @FindBy(xpath="//*[@id='ddlGroupHeader']")
	  private  WebElement select_GroupHeader;
	  
	  @FindBy(xpath="//*[@id='ddlIdentifierColumn']")
	  private  WebElement select_GeneratingPlotPerColumns;
	  
	  @FindBy(xpath="//*[@id='txtMarkerSize']")
	  private  WebElement enter_txtMarkerSize;
	  
	  @FindBy(xpath="//*[@id='txtWidth']")
	  private  WebElement enter_txtWidth;
	  
	  @FindBy(xpath="//*[@id='txtHeight']")
	  private  WebElement enter_txtHeight;
	  
	  @FindBy(xpath="//*[@id='chkMarkerErrorLine']")
	  private  WebElement check_chkMarkerErrorLine;
	  
	  @FindBy(xpath="//*[@id='chkEnableZoom']")
	  private  WebElement check_chkEnableZoom;
	  
	  @FindBy(xpath="//*[@id='ddlDateRangeColumn']")
	  private  WebElement select_EnableDateRange;
	  
	  @FindBy(xpath="//*[@id='chkPeriod']")
	  private  WebElement click_EnableDatePeriod;
	  
	  @FindBy(xpath="//*[@id='rgColConfig']//input[contains(@id,'chkIsDisplay')]/../..//td[@class='DWBqueryfieldmini']")
	  private  List<WebElement> preview_columnName;
	  
	  @FindBy(xpath="//*[@id='rgColConfig']//input[contains(@id,'chkIsDisplay')]")
	  private  List<WebElement> preview_DisplayCheckbox;
	  
	  
	  @FindBy(xpath="//input[contains(@id,'chkIsUnitApplicable')]")
	  private  WebElement click_IsUnitApplicable;
	  
	  @FindBy(xpath="//input[contains(@id,'chkIsColorApplicable')]")
	  private  List<WebElement> click_IscolorApplicable;
	
	  
	 // locator for plots
	  // x- Y axis locator
	  @FindBy(xpath="//*[@id='ddlViewsOrTopics']")
	  private  WebElement select_PlotViews;
	  
	  @FindBy(xpath="//*[@id='txtGenericName']")
	  private static  WebElement enter_PlotName;
	  
	  public static WebElement getEnter_PlotName() {
		return enter_PlotName;
	}




	@FindBy(xpath="//*[@id='lstColumnsSource']")
	  private  WebElement selectColumnToAdd_Plot;
	  
	  @FindBy(xpath="//*[@id='btnMoveToRight']")
	  private  WebElement clickAddButton_Plot;
	  
	  @FindBy(xpath="//*[contains(@id,'ddlColumnName')]")
	  private  WebElement select_columnName_X;
	  
	  @FindBy(xpath="//*[contains(@id,'ddlCmbAxis')]")
	  private  WebElement select_Axis_X;
	  
	  @FindBy(xpath="//*[contains(@id,'UpdateButton')]")
	  private  WebElement click_updateButton;
	 
	  //x axis locator add button
	  @FindBy(xpath="//*[@class='rgXAxisCommandTable']//input[contains(@id,'AddNewRecordButton')]")
	  private  WebElement click_AddNewButton_X;
	  
	  @FindBy(xpath="//input[contains(@id,'txtDisplayName')]")
	  private  WebElement displayName_Plots;
	
	
	  
	// y- axis locator add button
	  
	  @FindBy(xpath="//*[@class='rgYAxisCommandTable']//input[contains(@id,'AddNewRecordButton')]")
	  private  WebElement click_AddNewButton_Y;
	  
	//  @FindBy(xpath="//*[contains(@id,'rgYAxisDetails_ctl00_ctl04_EditButton')]")
	  @FindBy(xpath="//*[contains(@id,'rgYAxisDetails_ctl00_ctl04_UpdateButton')]")
	  private WebElement click_YaxisUpdate;
	
	  @FindBy(xpath="//*[contains(@id,'ddlPlottingType')]")
	  private  WebElement select_PlottingType;
	
	  @FindBy(xpath="//*[contains(@id,'ddlCPlottingColor')]")
	  private  WebElement select_PlottingColor;
	  
	  @FindBy(xpath="//*[contains(@id,'ddlTooltip')]")
	  private  WebElement select_ToolTip;
	  
	  @FindBy(xpath="//*[contains(@id,'ShowValueOnPlot')]")
	  private  WebElement click_showValueOnPlot;
	  
	  @FindBy(xpath="//*[contains(@id,'InsertButton')]")
	  private  WebElement click_InsertButton;
	
	  @FindBy(xpath="//input[@id='chkIsVertical']")
	  private  WebElement click_IsXaxisVertical ;
	
	  @FindBy(xpath="//*[@id='chkShowGridLines']")
	  private  WebElement click_ShowGridLines ;
	  
	  @FindBy(xpath="//*[@id='chkLogScale']")
	  private  WebElement click_EnableLogScale ;
	  
	  @FindBy(xpath="//*[@id='rgYAxisDetails_ctl00_ctl04_cbShowValueOnPlot']")
	  private WebElement click_ShowValueOnPlot;
	  
	 //Tabular Report Xpath 
	  
	  @FindBy(xpath="//*[contains(@id,'chkGenericFeaturesList')]")
	  private  WebElement click_IsVertical ;
	  
	 
	  private static String componentName1;
	  
		public String getComponentName() {
			
			
			return componentName1;
		}


		public void setComponentName(String componentName1) {
			
			
			this.componentName1 = componentName1;
		}
	  
	public MaintainGenericComponents(WebDriver driver) {
		super(driver);
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
	}
	

	public MaintainGenericComponents clickOnCreate(){
		
		
		clickOnElement(buttonCreateComponent);
		return this;
	}
	public MaintainGenericComponents clickShowValueOnPlot()
	{
		clickOnElement(click_ShowValueOnPlot);
		return this;
	}

	public MaintainGenericComponents clickEnableZoom()
	{
		clickOnElement(check_chkEnableZoom);
		return this;
	}
	// Tabular component Name 
	public MaintainGenericComponents enterName(String componentName){

		//System.out.println(java.time.LocalDate.now());  
		//setComponentName(componentName);
		componentName1=componentName+"_"+java.time.LocalDate.now()+"_"+randInt(0,99);
		setComponentName(componentName1);
		enterTextValue(enter_Name,componentName1);
		return this;
	}
	



	/**
	 * @param componentName
	 * @return
	 */
	// PLot component name 
	public MaintainGenericComponents enter_PlotName(String componentName){

		//System.out.println(java.time.LocalDate.now());  
		componentName1=componentName+"_"+java.time.LocalDate.now()+"_"+randInt(0,99);
		setComponentName(componentName1);
		enterTextValue(enter_PlotName,componentName1);
		
		return this;
		
	}
	
	public MaintainGenericComponents click_IsXaxisVertical(){
		clickOnElement(click_IsXaxisVertical);
		
		
		
		return this;
	}
	
	public MaintainGenericComponents click_ShowGridLines(){
		clickOnElement(click_ShowGridLines);
	
		
		return this;
	}
	
	public MaintainGenericComponents click_EnableLogScale(){
		clickOnElement(click_EnableLogScale);
		
		
		
		return this;
	}
	public MaintainGenericComponents click_IsVertical(){
		clickOnElement(click_IsVertical);
		
		return this;
	}
	
	
	
	public MaintainGenericComponents click_EnableDatePeriod(){
		clickOnElement(click_EnableDatePeriod);
	
		
		
		return this;
	}
	

	
	public MaintainGenericComponents enter_HeightWidth(String height , String width){
		enterTextValue(enter_txtWidth,width);
		enterTextValue(enter_txtHeight,height);
		
		return this;
	}
	
	public MaintainGenericComponents select_LegendBoxPosition(String position) throws Throwable{

		selectFromDropDownByText(select_LegendBoxPositions,position);

		Thread.sleep(1000);
		
		
		return this;
	}
	
	public MaintainGenericComponents select_GeneratePlotPer(String columnName) throws Throwable{

		selectFromDropDownByText(select_GeneratePlotPer,columnName);

		Thread.sleep(1000);

		return this;
	}
	
	
	
	
	public MaintainGenericComponents select_EnableDateRange(String columnName) throws Throwable{
		

		selectFromDropDownByText(select_EnableDateRange,columnName);

		Thread.sleep(1000);
		
		
		return this;
	}
	
	
	public MaintainGenericComponents selectAssetType(String AssetName) throws Throwable{

		selectFromDropDownByText(select_AssetType,AssetName);

		Thread.sleep(5000);
		
		
		return this;
	}

	public MaintainGenericComponents selectDataSource(String DataSource) throws Throwable{

		selectFromDropDownByText(select_DataSource,DataSource);
		Thread.sleep(5000);
		
		return this;
	}
	
	public MaintainGenericComponents select_PlotViews(String ViewId) throws Throwable{

		selectFromDropDownByText(select_PlotViews,ViewId);
		
		Thread.sleep(5000);

		return this;
	}
	
	public MaintainGenericComponents selectView(String ViewId) throws Throwable{

		selectFromDropDownByText(select_Views,ViewId);
		
		Thread.sleep(5000);

		return this;
	}
	
	public MaintainGenericComponents enter_txtMarkerSize(String size){
		
		int num = Integer.parseInt(size);
		
		if(num<=14){
			enter_txtMarkerSize.clear();
		enter_txtMarkerSize.sendKeys(size);
		}
		
		else if (num>14){
			
			getAlert();
			
			enter_txtMarkerSize.getText();
		
		}
		
		
		return this;
	}
	
	public MaintainGenericComponents selectColumnToAdd() throws Throwable
	{

		Map<String, Integer> textCounts = new HashMap<>();
		
		for(WebElement column: select_ColumnToAdd ){
			String text = column.getText();
			System.out.println(text);
			
			if(textCounts.containsKey(text))
			{
				Integer duplicateCount = textCounts.put(text, textCounts.get(text) + 1);
	
			}
			 else
			 {
			        Integer non_duplicateCount = textCounts.put(text, 1);
			        Actions actions = new Actions(driver);
					actions.keyDown(Keys.CONTROL).click(column).keyUp(Keys.CONTROL).build().perform();
  
			  }

		}
		Thread.sleep(5000);
		return this;
		
	}
	
	
	
	
	
	public MaintainGenericComponents selectColumnToAdd_Plot() throws Throwable
	{
		
	selectFromDropDownByText(selectColumnToAdd_Plot,"All");
	
	return this;
	}
	
	
	
	
	
	public MaintainGenericComponents click_AddButton()
	{
		try{
			if(click_AddButton.isEnabled()){
		click_AddButton.click();
		Thread.sleep(5000);
			}
		}
		catch(Exception e){
			
			System.out.println("Add button is  not displayed");
		}
		return this;
	}
	
	
	public MaintainGenericComponents clickAddButton_Plot(){
		
		
		try{
			if(clickAddButton_Plot.isEnabled()){
				clickAddButton_Plot.click();
		Thread.sleep(5000);
			}
		}
		catch(Exception e){
			
			System.out.println("Add button is not displayed");
		}
		
		
		return this;
	}
	
	
	
	public MaintainGenericComponents button_Preview()
	{
		try{
		if(button_Preview.isEnabled()){
		button_Preview.click();
		Thread.sleep(5000);
		}
		}
		catch(Exception e){
			
			System.out.println("Preview not displayed");
		}
		return this;
	}
	

	
	public MaintainGenericComponents button_Save() throws Throwable{
		button_Save.click();
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		return this;
		
	}
	
	public MaintainGenericComponents check_Dream(){
		
		check_Dream.click();
		return this;
	}
	
	public MaintainGenericComponents check_eBooks() throws Throwable{
		
		check_eBooks.click();
		Thread.sleep(3000);
		return this;
	}
	
	public MaintainGenericComponents select_ComponentType(String componentType) throws Throwable{
		
		switchtoFrame(frameName);
		selectFromDropDownByText(select_ComponentType,componentType);
		Thread.sleep(2000);
		return this;
	}
	
	public MaintainGenericComponents select_GroupHeader() throws Throwable{
		
		
		selectFromDropDownByText(select_GroupHeader,"Documents");
		Thread.sleep(2000);
		return this;
	}
	
	

	public MaintainGenericComponents validate_PreviewSection(){
		
		int checkbox = preview_DisplayCheckbox.size();

		for(int i=0;i<checkbox;i++){

		if(preview_DisplayCheckbox.get(i).isSelected())
		{
			String columnName = preview_columnName.get(i).getText();
			
			System.out.println(columnName);
			break;
		
		}
		
	}
		
		return this;
	}

	
	
	
	
	// specific display name
	
	//td[text()='ACTIONCODE']/../td/input[contains(@id,'txtDisplayName')]
	
	

	public MaintainGenericComponents Rename_DisplayName_Previewsection(String columnName,String text){
		
		int checkbox = preview_DisplayCheckbox.size();

		for(int i=0;i<checkbox;i++){

		if(preview_DisplayCheckbox.get(i).isSelected())
		{
			String cName = preview_columnName.get(i).getText();
			
			System.out.println(cName);
			
			
			if(cName.equalsIgnoreCase(columnName)){
				
				WebElement DisplayName = driver.findElement(By.xpath("//td[text()='+="+columnName+"']/../td/input[contains(@id,'txtDisplayName')]"));
				
				DisplayName.clear();
				enterTextValue(DisplayName,text);
			}
			
			break;
		
		}
		
	}
		
		return this;
	}
	
	
public MaintainGenericComponents Uncheck_DisplayColumn_Previewsection(String columnName){
		
		int checkbox = preview_DisplayCheckbox.size();

		for(int i=0;i<checkbox;i++){

			String cName = preview_columnName.get(i).getText();
		
			if(cName.equalsIgnoreCase(columnName)){
				
				preview_DisplayCheckbox.get(i).click();
				
				
			}
			
			if(preview_DisplayCheckbox.get(i).isSelected())
				{
					
					String cName_selectedName = preview_columnName.get(i).getText();
					
					System.out.println(cName_selectedName);
			}
			
			
		
		}
		

		
		return this;
	}
	
	
public MaintainGenericComponents check_IsColorApplicableColumn_Previewsection(){
	
	int checkbox = preview_DisplayCheckbox.size();

	for(WebElement unitapplicable :click_IscolorApplicable){
	if(unitapplicable.isEnabled()){
		
		unitapplicable.click();
		
		WebElement displayname_colorapplicable = driver.findElement(By.xpath("//input[contains(@id,'chkIsColorApplicable')]/../../../tr/td//input[contains(@id,'txtDisplayName')]"));
		
		Reporter.log("IsColorApplicable columnName are :"+displayname_colorapplicable.getText(),true );
	}
	}
		
	
	return this;
}


	// Methods for Plots creation
	
	public MaintainGenericComponents select_XaxisCoordinates(String columnName,String AxisName,String displayName) throws Throwable{
		
		selectFromDropDownByText(select_columnName_X,columnName);
		selectFromDropDownByText(select_Axis_X,AxisName);
		
		if(displayName!=null){
			displayName_Plots.clear();
			enterTextValue(displayName_Plots,displayName);
		}
		
		click_updateButton.click();
		
		Thread.sleep(3000);
		return this;
	}
	
	public MaintainGenericComponents click_AddNewButton_X() throws Throwable{
		
		click_AddNewButton_X.click();
		Thread.sleep(3000);
		return this;
	}
	
	public MaintainGenericComponents select_YaxisCoordinates(String columnName,String AxisName,String plottingType,String displayName) throws Throwable{
		
		selectFromDropDownByText(select_columnName_X,columnName);
		selectFromDropDownByText(select_Axis_X,AxisName);
		if(displayName!=null){
			displayName_Plots.clear();
			enterTextValue(displayName_Plots,displayName);
			
		}
		
		
		selectFromDropDownByText(select_PlottingType,plottingType);
		
		
		  switch (plottingType) {
          case "Arealine": case "Arealine-Circle":
        	  
        	  selectFromDropDownByText(select_PlottingColor,"Green");
        	  break;
        	
          case "Bar": case "Gantt":
        	  
        	  selectFromDropDownByText(select_PlottingColor,"Blue");
        	  break;
        	  
          case "Line": case "Line-Circle":
        	  
        	  selectFromDropDownByText(select_PlottingColor,"Purple");
        	  break;
        	  
          case "Marker-Circle": case "Marker-Square": case "Marker-Triangle" :
        	  
        	  selectFromDropDownByText(select_PlottingColor,"Red");
        	  break;
        
          case "Spline":
        	  
        	  selectFromDropDownByText(select_PlottingColor,"Violet");
        	  break;
        	  
          	case "Stacked-Area": case "Stacked-Bar" :
        	  
        	  selectFromDropDownByText(select_PlottingColor,"Yellow");
        	  break;
        	  
          default:
              System.out.println("Plots Type and Colors not selected");
              break;
      }
				
		Thread.sleep(3000);
		return this;
	}
	
	public MaintainGenericComponents select_toolTip(int index){
		
		selectFromDropDownByIndex(select_ToolTip,index);
		
		return this;
		
	}
	
	public MaintainGenericComponents click_showValueOnPlot(){
		
		clickOnElement(click_showValueOnPlot);
		
		return this;
		
	}
	
	
	public MaintainGenericComponents click_updateButton(){
		
		clickOnElement(click_updateButton);
		
		return this;
		
	}
	
	public MaintainGenericComponents getclick_YaxisUpdate()
	{
		clickOnElement(click_YaxisUpdate);
		return this;
	}
	public MaintainGenericComponents click_InsertButton(){
		
		clickOnElement(click_InsertButton);
		
		return this;
		
	}
	
	public MaintainGenericComponents click_AddNewButton_Y(){
		
		
		clickOnElement(click_AddNewButton_Y);
		
		return this;
	}
	
	
	public MaintainGenericComponents button_Reset(){
		
		
		clickOnElement(button_Reset);
		
		return this;
	}
	
	
	public MaintainGenericComponents select_ComponentName() throws Throwable{
		Reporter.log(" Select Generic component  Page to edit");
		
		String text1=getComponentName();
			
		List<WebElement> allpages = driver.findElements(By.xpath("//div[@class='rgWrap rgNumPart']//a"));
		    System.out.println("Total pages :" +allpages.size());
		    for(int i=0; i<=allpages.size(); i++)
		        {
		    	if(allpages.size()>0){
		    	allpages.get(i).click();
		    	Thread.sleep(3000);
		    	}
		    	
		    	List<WebElement> allrows = driver.findElements(By.xpath("//div[@id='rdGCList_GridData']/table/tbody/tr"));
		            for(int row=1; row<allrows.size(); row++)
		                {
		            	
		            	
		                    System.out.println("Total rows :" +allrows.size()); 
		                    String name = driver.findElement(By.xpath("//div[@id='rdGCList_GridData']/table/tbody/tr["+row+"]/td[1]")).getText();
		                    //System.out.println(name);
		                    System.out.println("Row loop");
		                    if(name.contains(text1))
		                        {
		                    	WebElement masterPage = driver.findElement(By.xpath("//td[contains(text(),'" + text1 + "')]"));
		                		driver.findElement(By.xpath("//*[text()='" + text1 + "']/..//td[@class='printerFriendly'][1]//td/a[text()='Edit']")).click();
		                		Thread.sleep(3000);
		                            break;
		                        }
		                    else
		                    {
		                        System.out.println("Element doesn't exist");
		                    }
		                 //   allpages = driver.findElements(By.xpath("//div[@id='page-navigation']//a"));
		                }

		           // allpages = driver.findElements(By.xpath("//div[@class='rgWrap rgNumPart']//a"));
		            driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		            
		        }
		
		Thread.sleep(3000);
		
		return this;
	}
	
	
	public MaintainGenericComponents click_IsUnitApplicable(){
		
		if(click_IsUnitApplicable.isEnabled()){
			
			click_IsUnitApplicable.click();
		}
		
		return this;
	}
	
	
	
}
