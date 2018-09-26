package com.pack.common.pageobjects.Dream;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class fetchingReports extends contextsearch {

	private WebDriver driver;

	public static String winHandleAfter;

	public WebDriver getDriver() {
		return driver;
	}

	public fetchingReports(WebDriver driver) {
		super(driver);
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
		PageFactory.initElements(factory, this);
	}

	@FindBy(id = "ddlAssets")
	private WebElement selectWellbore;

	@FindBy(xpath="//*[@id='DDLASSETS']")
	private WebElement selectWellbore_perforation;
	
	@FindBy(id = "lstAssets")
	private WebElement selectWellbore_AllDocuments;

	public WebElement getSelectWellbore_AllDocuments() {
		return selectWellbore_AllDocuments;
	}

	public WebElement getSelectWellbore() {
		return selectWellbore;
	}

	
	public WebElement getselectWellbore_perforation() {
		return selectWellbore_perforation;
	}

	// locators of DailyWellsReporting
	@FindBy(id = "cboTimePeriod")
	private WebElement selectTimePeriod;

	public WebElement getSelectTimePeriod() {
		return selectTimePeriod;
	}

	@FindBy(xpath = "//input[@name='rbLstYesNo' and @value='Yes']")
	private WebElement selectEventsYes;

	@FindBy(xpath = "//input[@name='rbLstYesNo' and @value='No']")
	private WebElement selecEventstNo;

	@FindBy(xpath = "//input[@name='rbLstDisplayFormat' and @value='Tabular']")
	private WebElement selectViewTabular;

	@FindBy(xpath = "//input[@name='rbLstDisplayFormat' and @value='Hierarchical']")
	private WebElement selectViewHierarchical;

	@FindBy(xpath = "//*[contains(text(),'No records')]")
	private WebElement NoRecordsMessage;

	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement selectSubmitButton;

	@FindBy(xpath = "//input[@name='txtStartDate']")
	private WebElement selectStartDate;

	@FindBy(xpath = "//input[@name='txtEndDate']")
	private WebElement selectEndDate;

	// specific locator required for HoldUpDepth

	@FindBy(xpath = "//*[@id='rdblViewSelectionSingleTab']")
	private WebElement selectSinglePage;

	public WebElement getSelectSinglePage() {
		return selectSinglePage;
	}

	public WebElement getSelectMutliPage() {
		return selectMutliPage;
	}

	@FindBy(xpath = "//*[@id='rdblViewSelectionMultiTab']")
	private WebElement selectMutliPage;

	// locator for String Data

	@FindBy(xpath = "//*[@id='expImageUnit']")
	private WebElement clickUnitconversionicon;

	@FindBy(xpath = "//*[@id='ddlUnitType']")
	private WebElement selectUnitGroups;

	@FindBy(xpath = "//*[@id='ddlUnit']")
	private WebElement selectddlUnitType;

	@FindBy(xpath = "//*[@id='btnUnit']")
	private WebElement clickUnitButton;

	@FindBy(xpath = "//input[@id='rdbDataSheet']")
	private WebElement selectDataSheet;

	@FindBy(xpath = "//input[@id='rdbTabular']")
	private WebElement selectTabular;
	

	@FindBy(xpath = "//*[@id='lnkInfo']")
	private WebElement btninfo ;
	
	@FindBy(xpath="//img[@src='../Images/DepthReference.jpg']")
	private WebElement Image;
	
	

	public WebElement getImage() {
		return Image;
	}
	public WebElement getbtninfo() {
		return btninfo;
	}
	public WebElement getSelectDataSheet() {
		return selectDataSheet;
	}

	public WebElement getSelectTabular() {
		return selectTabular;
	}

	@FindBy(xpath = "//*[@id='cboDepthRef']")
	private WebElement selectDepthReference;

	public WebElement getSelectDepthReference() {
		return selectDepthReference;
	}

	@FindBy(xpath = "//*[@id='chkParentStrings']")
	private WebElement selectComponentInfo;

	@FindBy(xpath = "//*[@id='chkChildStrings']")
	private WebElement selectWirelineRetrievables;

	@FindBy(xpath = " //input[@id='LinkPrint']")
	private WebElement selectStringPrintReport;

	public WebElement getSelectStringPrintReport() {
		return selectStringPrintReport;
	}

	@FindBy(xpath = "//input[@id='imgbtnExcel']")
	private WebElement selectStringExportReport;

	public WebElement getSelectStringExportReport() {
		return selectStringExportReport;
	}

	@FindBy(xpath = "//*[@id='rdblExportSelectionCurrentPage']")
	private WebElement selectExport_CurrentPage;

	public WebElement getSelectSubmitButton() {
		return selectSubmitButton;
	}

	@FindBy(xpath = "//*[@id='rdblExportSelectionAll']")
	private WebElement selectExport_AllPage;

	@FindBy(xpath = "//*[@id='rdblExportSelectionAllSubReports']")
	private WebElement selectExport_AllSubReport;

	@FindBy(xpath = "//input[contains(@id, 'btnExportContinue')]")
	private WebElement click_btnExportContinue;

	@FindBy(xpath = "//input[contains(@id, 'btnExportCancel')]")
	private WebElement click_cancelButton;

	public WebElement getClick_btnExportContinue() {
		return click_btnExportContinue;
	}

	@FindBy(xpath = "//*[@id='divExportOptions']")
	private WebElement selectExportOptions;

	public WebElement getSelectExportOptions() {
		return selectExportOptions;
	}

	@FindBy(xpath = "//*[@id='rdblExportFormatCSV']")
	private WebElement selectCSV;

	@FindBy(xpath = "//*[@id='rdblExportFormatExcel']")
	private WebElement selectExcel;

	public WebElement getSelectExport_AllSubReport() {
		return selectExport_AllSubReport;
	}

	public WebElement getSelectCSV() {
		return selectCSV;
	}

	public WebElement getSelectExcel() {
		return selectExcel;
	}

	@FindBy(xpath = "//*[@id='EPCatalogDocuments']")
	private WebElement Message_Norecords;

	public WebElement getSelectExport_AllPage() {
		return selectExport_AllPage;
	}

	public WebElement getSelectExport_CurrentPage() {
		return selectExport_CurrentPage;
	}

	// WellStatusDiagramCachedm locator

	@FindBy(xpath = "//*[@id='ddlDatum']")
	private WebElement selectDatum;

	public WebElement getSelectDatum() {
		return selectDatum;
	}

	@FindBy(xpath = "//*[@id='ddlTemplate']")
	private WebElement selectTemplate;

	public WebElement getselectTemplate() {
		return selectTemplate;
	}

	@FindBy(xpath = "//*[@id='ddlUnits']")
	private WebElement selectUnits;

	public WebElement getselectUnits() {
		return selectUnits;
	}

	@FindBy(xpath = "//*[@id='ddlUnits']")
	private WebElement checkchbCache;

	public WebElement getcheckchbCache() {
		return checkchbCache;
	}

	@FindBy(xpath = "//*[@id='WSD' and @value='Generate WSD']")
	private WebElement generateWSD;

	public WebElement getgenerateWSD() {
		return generateWSD;
	}

	@FindBy(xpath = "//*[@id='chkShowParentWellBore']")
	private WebElement ShowparentWellbore;

	public void getShowparentWellbore() throws InterruptedException {
		ShowparentWellbore.click();
		Thread.sleep(5000);

	}

	// well head locators

	@FindBy(xpath = "//*[@id='imgPlus']")
	private WebElement clickUnitconversionicon_Utilities;

	@FindBy(xpath = "//*[contains(@id,'CheckBox')]")
	private WebElement check_Allrecords;

	@FindBy(xpath = "//*[@id='UnitConversionView_btnMove']")
	private WebElement clickArrowButton;

	// locators and method for length and feet Meters

	public WebElement getUnitconversionView() {
		return UnitconversionView;

	}

	@FindBy(xpath = "//*[@id='UnitConversionView_rdUnitGroups_DropDown']//ul/li")
	private List<WebElement> UnitconversionViewList;

	public List<WebElement> getUnitconversionView_selection() {
		return UnitconversionViewList;

	}

	@FindBy(xpath = "//*[@id='UnitConversionView_rdUnits_DropDown']//ul/li")
	private List<WebElement> UnitTypeViewList;

	public List<WebElement> getUnitTypeViewList_selection() {
		return UnitTypeViewList;

	}

	@FindBy(xpath = "//*[@id='UnitConversionView_rdUnitGroups']")
	private WebElement UnitconversionView;

	@FindBy(xpath = "//*[@id='UnitConversionView_rdUnits']")
	private WebElement UnitTypeView;

	// locator for SubmitBTN imam

	@FindBy(xpath = "//*[@id='UnitConversionView_btnSubmit']")
	private WebElement clickSubmitButton;

	@FindBy(xpath = "//*[@id='tdDepthReference']")
	private WebElement DepthReference;

	public WebElement getDepthReference() {
		return DepthReference;

	}

	@FindBy(xpath = "//*[@id='rddlDepthReference_DropDown']//ul/li")
	private List<WebElement> DepthReference_selection;

	public List<WebElement> getDepthReference_selection() {
		return DepthReference_selection;

	}

	@FindBy(xpath = "//*[@id='ddlDataPreference']")
	private WebElement DataPreference;

	public WebElement getDataPreference() {
		return DataPreference;
	}

	@FindBy(xpath = "//*[@id='UnitConversionView_rdUnitGroups' and  @class ='RadDropDownList RadDropDownList_Simple']")
	private WebElement UnitGroups_GeoPressure;
	@FindBy(xpath = "//*[@id='UnitConversionView_rdUnits' and  @class ='RadDropDownList RadDropDownList_Simple']")
	private WebElement Unit_GeoPressure;

	public WebElement getUnitGroups_GeoPressure() {
		return UnitGroups_GeoPressure;
	}

	public WebElement getUnit_GeoPressure() {
		return Unit_GeoPressure;
	}

	@FindBy(xpath = "//*[@id='ddlUnitType']")
	private WebElement UnitGroups;
	@FindBy(xpath = "//*[@id='ddlUnit']")
	private WebElement Units;

	@FindBy(xpath = "//*[@id='expImageUnit']")
	public WebElement clickUnitconversionicon_PSD;

	@FindBy(xpath = "//*[@id='btnUnit']")
	private WebElement ClickArrow_Btn;

	@FindBy(xpath = "//*[@id='btnSubmitUnit']")
	private WebElement Submit_Btn;

	public fetchingReports check_Allrecords() throws Throwable {
		System.out.println("select All records");
		Thread.sleep(3000);
		check_Allrecords.click();
		System.out.println("selected");
		return this;
	}

	@FindBy(xpath = "//img[@alt='Report classification errors']")

	private WebElement clickReportclassificationerrors;

	public WebElement getclickReportClassificationErrors() {

		clickReportclassificationerrors.click();

		return clickReportclassificationerrors;
	}

	// Unit Conversion submit btn for LOgs 23 april mudassir

	@FindBy(xpath = "//*[@id='btnSubmitUnit']")
	private WebElement selectLogsSubmitButton;

	public WebElement getUnit_ConversionLogsSubmitButton() {
		return selectLogsSubmitButton;
	}

	// for selecting Log Services -- 23 April mudassir

	@FindBy(id = "lstLogService")
	private WebElement selectLogServices;

	public WebElement getselectLogServices() {
		return selectLogServices;
	}

	// for selecting Log Type -- 23 April mudassir
	@FindBy(id = "lstLogType")
	private WebElement selectLogType;

	public WebElement getselectLogType() {
		return selectLogType;
	}

	// submit Btn Logs Recall

	@FindBy(xpath = "//*[@id='btnSubmit']")
	private WebElement clickLogsSubmitButton;

	public WebElement getclickLogsSubmitButton() {

		clickLogsSubmitButton.click();
		return clickLogsSubmitButton;
	}

	// for selecting Techlog Main family -- 24 April mudassir

	@FindBy(id = "FilterOption_lstFilter0")
	private WebElement selectTechLogMainfamily;

	public WebElement getselectTechLogMainfamily() {
		return selectTechLogMainfamily;
	}

	// for selecting Techlog family Name -- 24 April mudassir

	@FindBy(id = "FilterOption_lstFilter1")
	private WebElement selectTechLogfamilyName;

	public WebElement getselectTechLogfamilyName() {
		return selectTechLogfamilyName;
	}

	// for selecting Curve Business Value -- 24 April mudassir

	@FindBy(id = "FilterOption_lstFilter2")
	private WebElement selectCurveBusinessValue;

	public WebElement getselectCurveBusinessValue() {
		return selectCurveBusinessValue;
	}

	// Submit Btn for Recall Curves -- 24 April mudassir
	@FindBy(xpath = "//*[@id='FilterOption_btnSubmit']")
	private WebElement clickFilterOption_btnSubmit;

	public WebElement getclickFilterOption_btnSubmit() {

		clickFilterOption_btnSubmit.click();
		return clickFilterOption_btnSubmit;
	}

	////// sireesha for Directional data1 export button

	public WebElement getSelectExport_CurrentPageData() {
		return selectExport_CurrentPageData;
	}

	@FindBy(xpath = "//*[@id='btnShowExportOptionDiv']")
	private WebElement click_btnExportContinueData;

	public WebElement getClick_btnExportContinueData() {
		return click_btnExportContinueData;
	}

	@FindBy(xpath = "//*[@name='btnShowExportOptionDiv' and @id='btnShowExportOptionDiv']")
	private WebElement selectExport_CurrentPageData;

	@FindBy(xpath = " //*[@name='ExportPage' and @id='rdblExportSelectionCurrentPage']")
	private WebElement selectExport_CurrentPageTime;

	public WebElement getSelectExport_CurrentPageTime() {
		return selectExport_CurrentPageTime;
	}

	// Locators for Documents with Filter By Sireesha

	@FindBy(xpath = "//*[@id='lstGrpOfProdType']//ul/li")
	private List<WebElement> select_epcatalog;

	@FindBy(xpath = "//*[@id='lstGrpOfProdType']//a[contains(@class,'rlbButton rlbNoButtonText rlbTransferFrom')]")
	private WebElement selectedEPCatlogRightClick;

	@FindBy(xpath = "//*[@id='lstGrpOfProdType']//a[contains(@class,'rlbButton rlbTransferAllFrom rlbNoButtonText')]")
	private WebElement selectEPCatlogDoubleClick;

	@FindBy(id = "cmdReset")
	private WebElement selectResetButton;

	@FindBy(xpath = "//*[@class='rlbGroup rlbGroupBottom']")
	private WebElement selectedProductTypes;

	@FindBy(xpath = "//*[@id='lstRgnGrpOfProdType']//ul/li")
	private List<WebElement> select_RegionalGroupofProductTypes;

	@FindBy(xpath = "//*[@id='lstAdditonalProdType']//ul/li")
	private List<WebElement> select_additionalProductTypes;

	@FindBy(xpath = "//*[@id='lstRgnGrpOfProdType']//*[contains(@class,'rlbButton rlbNoButtonText rlbTransferFrom' )]")
	private WebElement selectRegionalGroupRightClick;

	@FindBy(xpath = "//*[@id='lstRgnGrpOfProdType']//*[contains(@class,'rlbButton rlbTransferAllFrom rlbNoButtonText' )]")
	private WebElement selectRegionalGroupDoubleClick;

	@FindBy(xpath = "//*[@id='lstAdditonalProdType']//*[contains(@class,'rlbButton rlbNoButtonText rlbTransferFrom' )]")
	private WebElement selectAdditionalProductTypesRightClick;

	@FindBy(xpath = "//*[@id='lstAdditonalProdType']//*[contains(@class,'rlbButton rlbTransferAllFrom rlbNoButtonText' )]")
	private WebElement selectAdditionalProductTypesDoubleClick;

	@FindBy(xpath = "//*[@class='rlbButton rlbDelete']")
	private WebElement select_Delete_Exists;

	@FindBy(xpath = "//a[@class='rlbButton rlbDeleteDisabled rlbDisabled']")
	private WebElement select_Delete_Disable;

	@FindBy(xpath = "//*[@id='lstSelectedProdType']/div/ul/li")
	private List<WebElement> selectedProdType;

	/*
	 * public fetchingReports selectMultipelValues(String multipleVals) { String
	 * multipleSel[] = multipleVals.split(",");
	 * 
	 * for (String valueToBeSelected : multipleSel) { new
	 * Select((WebElement)getselect_epcatalog()).selectByVisibleText(
	 * valueToBeSelected);
	 * 
	 * Actions actions = new Actions(driver); actions.keyDown(Keys.LEFT_CONTROL)
	 * .click(first_WebElement) .click(second_WebElement)
	 * .click(third_WebElement) .keyUp(Keys.LEFT_CONTROL) .build() .perform();
	 * ((Actions) getselect_epcatalog()).sendKeys(Keys.LEFT_CONTROL); } return
	 * this; }
	 */
	public fetchingReports getEPCatlogDoubleClick() {
		selectEPCatlogDoubleClick.click();
		return this;
	}

	public List<WebElement> getSelectedProductTypes() {
		return selectedProdType;
	}

	public List<WebElement> getselect_epcatalog() {
		return select_epcatalog;
	}

	public List<WebElement> select_RegionalProductTypes() {
		return select_RegionalGroupofProductTypes;
	}

	public List<WebElement> select_AdditionalProductTypes() {
		return select_additionalProductTypes;
	}

	public fetchingReports getEPCatlogRightClick() {

		selectedEPCatlogRightClick.click();

		return this;
	}

	public fetchingReports getselect_Delete_ExistsClick() {

		select_Delete_Exists.click();

		return this;
	}

	public fetchingReports getselect_Delete_DisableClick() {

		select_Delete_Disable.click();

		return this;
	}

	public fetchingReports getAdditionalProductTypesRightClick() {

		selectAdditionalProductTypesRightClick.click();

		return this;
	}

	public fetchingReports getRegionalGroupDoubleClick() {

		selectRegionalGroupDoubleClick.click();

		return this;
	}

	public fetchingReports getselectRegionalGroupRightClick() {

		selectRegionalGroupRightClick.click();

		return this;
	}

	public fetchingReports getAdditionalProductTypesDoubleClick() {

		selectAdditionalProductTypesDoubleClick.click();

		return this;
	}

	
	//Recall core 
	@FindBy(xpath = "//*[@id='lblCoreReportsfromEPCatalog']")
	private WebElement CoreReportsfromEPCatalog;
	
	@FindBy(xpath = "//*[contains(text(),'Publish Date')]/a/img")
	private WebElement Publish_Date;


	@FindBy(xpath="//*[@id='SendTo']")
	private WebElement txtSend_to;
	
	public void gettextSend_to_recall_core() throws InterruptedException {
		Thread.sleep(3000);
		switchWindows();
		String Act_Email=txtSend_to.getAttribute("value");
		String Exp_Email="EPE-Data-Services-Centre@shell.com";
		Assert.assertEquals(Act_Email, Exp_Email);
	}
	public void gettextSend_to_core__report() throws InterruptedException {
		Thread.sleep(5000);
		switchWindows();
		String Act_Email=txtSend_to.getAttribute("value");
		String Exp_Email="EPE-Wellfile@shell.com";
		Assert.assertEquals(Act_Email, Exp_Email);
	}
	
	@FindBy(xpath = "//*[@id='hidePrintCol']/a/img")
	private List<WebElement> btnQC;
	
	
	public fetchingReports getbtnQCClick() {
		for(int i=0;i<=btnQC.size();i++) {
			btnQC.get(30).click();
			break;
		}
		return this;

	}
	public fetchingReports getCoreReportsfromEPCatalogClick() {

		CoreReportsfromEPCatalog.click();

		return this;
	}

	
	
	public fetchingReports getPublish_DateClick() {

		Publish_Date.click();

		return this;
	}

	//*[@id="lblCoreReportsfromEPCatalog"]
	public fetchingReports selectingDataUsingActions_FromList(List<WebElement> element, String text) {
		// Iterator <WebElement> itr = element.iterator();
		try {
			/*
			 * while(itr.hasNext()) {
			 * 
			 * 
			 * if(itr.next().getText().contains(text)) {
			 * System.out.println(itr.next().getText());
			 * 
			 * 
			 * itr.next().click();
			 * 
			 * Actions actions = new Actions(driver);
			 * 
			 * actions.click(itr.next()).build().perform();
			 * System.out.println("ELement from the list box"); break;
			 * 
			 * }
			 */

			int size = element.size();

			for (int i = 0; i < size; i++) {

				if (element.get(i).getText().contains(text)) {

					element.get(i).click();
					break;
				}

			}
			Thread.sleep(3000);
		}

		catch (Exception e) {
			System.out.println("Element not selected from list" + e);
		}

		return this;

	}

	public fetchingReports selectingDataUsingActions_FromListEx(List<WebElement> element, String text) {

		Iterator<WebElement> itr = element.iterator();
		try {
			while (itr.hasNext()) {
				if (itr.next().getText().contains(text))

					System.out.println(itr.next().getText());

				itr.next().click();

				Actions actions = new Actions(driver);

				actions.click(itr.next()).build().perform();
				System.out.println("ELement from the list box");
				break;

			}
		}

		catch (Exception e) {
			System.out.println("Element not selected from list" + e);
		}

		return this;

	}

	public fetchingReports clickOnResetButton() {

		getSelectResetButton().click();

		return this;
	}

	public WebElement getSelectResetButton() {
		return selectResetButton;
	}

	/////// sireesha for position log data 23/04
	@FindBy(xpath = "//*[@id='ddlWellBore']")
	private WebElement select_Wellbore;

	public WebElement getWellbore() {
		return select_Wellbore;
	}

	@FindBy(xpath = "//*[@id='ddlProjectionSystem']")
	private WebElement select_CoardinateSystem;

	public WebElement getCoardinateSystem() {
		return select_CoardinateSystem;
	}

	////
	@FindBy(xpath = "//*[@id='imgPlus']")
	public WebElement clickUnitconversionicon_ProdutionHistory;
	
	
	@FindBy(xpath = "//*[@id='ddlUnitType']")
	public WebElement UnitGroup;

	public WebElement getUnitGroup() {
		return UnitGroup;
	}

	@FindBy(xpath = "//*[@id='ddlUnit']")
	public WebElement UnitType;

	public WebElement getUnitType() {
		return UnitType;
	}


	public fetchingReports selectExportoptionsStatiousSummary(boolean check, String selectpage, String reportformat)
			throws Throwable {

		fetchingReports exportReport = selectResultRecords(check);
		getClick_btnExportContinueData().click();

		if (selectpage.equalsIgnoreCase("currentpage")) {
			if (reportformat.equalsIgnoreCase("excel")) {
				getSelectExcel().click();

			} else {

				getSelectCSV().click();

			}

			selectExport_CurrentPage();
		} else if (selectpage.equalsIgnoreCase("All")) {

			if (reportformat.equalsIgnoreCase("excel")) {

				getSelectExcel().click();

			} else if (reportformat.equalsIgnoreCase("CSV")) {

				getSelectCSV().click();

			}
			selectExport_AllPage();
		}

		else if (selectpage.equalsIgnoreCase("AllSubReports")) {

			getSelectExcel().click();

			selectExport_AllSubReport();
		}

		Thread.sleep(3000);
		// isAlertPresent();
		return this;

	}

	public fetchingReports isDelete() {
		try {
			boolean DeleteBtn = select_Delete_Exists.isDisplayed();
			if (DeleteBtn == true) {

				getselect_Delete_ExistsClick();

			} else {
				System.out.println("Delete is Disable");
			}

		} catch (Exception e) {
			System.out.println("Element Not found" + e);
		}
		return this;

	}

	@FindBy(xpath = "//*[@id='imgSelectChartID1']")
	private WebElement selectChart;

	public void getChart() {
		selectChart.click();
	}

	public fetchingReports selectUnitConversionOptions(String text) throws Throwable {

		clickUnitconversionicon.click();

		selectUnitGroups();

		Thread.sleep(2000);

		if (text.equalsIgnoreCase("feet")) {
			clickUnitButton.click();
		} else if (text.equalsIgnoreCase("meters")) {

			selectDataForReports(getSelectddlUnitType(), text);

			clickUnitButton.click();

		}
		selectSubmitButton();

		Thread.sleep(3000);
		return this;

	}

	public fetchingReports selectUnitGroups() throws Throwable {

		selectDataForReports(getSelectUnitGroups(), "length");

		return this;
	}

	public WebElement getSelectUnitGroups() {
		return selectUnitGroups;
	}

	public WebElement getSelectddlUnitType() {
		return selectddlUnitType;
	}

	public fetchingReports selectDataForReports(WebElement ellement, String text) throws Throwable {
		Select select = new Select(ellement);
		List<WebElement> options = select.getOptions();

		try {

			if (select.isMultiple() && text.equalsIgnoreCase("AllWelbore")) {

				//select.deselectAll();

				Thread.sleep(2000);

				for (WebElement we : options) {

					select.selectByVisibleText(we.getText());

				}
			}

			else if (select.isMultiple()) {
				for (WebElement we : options) {

					if (we.getText().equalsIgnoreCase(text)) {

						Actions actions = new Actions(driver);
						actions.click(we).build().perform();

						break;
					}

					Thread.sleep(3000);

				}
			}

			else {
				for (WebElement we : options) {

					if (we.getText().equalsIgnoreCase(text)) {

						select.selectByVisibleText(we.getText());
						break;
					}

					Thread.sleep(3000);

				}
			}

			Thread.sleep(3000);
		}

		catch (Exception e)

		{

			System.out.println("Element not selected");
		}

		return this;

	}

	@FindBy(xpath = "//*[@name='ExportPage' and @id='rdblExportSelectionAll']") //
	private WebElement selectExport_AllPageData;

	public WebElement getSelectExport_AllPageData() {
		return selectExport_AllPageData;
	}

	public fetchingReports selectCustomView() {

		getSelectAllResults();

		return this;
	}

	public fetchingReports selectSubmitButton() {

		getSelectSubmitButton().click();

		return this;
	}

	public fetchingReports selectEventsYes() {

		selectEventsYes.click();

		return this;
	}

	public fetchingReports selectEventsNo() {

		selecEventstNo.click();

		return this;
	}

	public fetchingReports selectViewTabular() {

		selectViewTabular.click();

		return this;
	}

	public fetchingReports selectViewHierarchical() {

		selectViewHierarchical.click();

		return this;
	}

	public fetchingReports exportClick() {

		getExportIcon().click();

		// driver.switchTo().defaultContent();

		return this;
	}
	// Code changes for Export having two options

	// public fetchingReports Exportclick_Btn(){

	// getExportIcon_StringReport().click();

	// driver.switchTo().defaultContent();

	// return this;
	// }

	public fetchingReports selectDataSheet() {

		getSelectDataSheet().click();

		return this;
	}

	public fetchingReports selectTabular() throws InterruptedException {

		getSelectTabular().click();

		Thread.sleep(3000);

		return this;
	}

	public fetchingReports switchWindows() {

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			WebDriver currentWindow = driver.switchTo().window(winHandle);

			System.out.println(currentWindow);
		}

		/*
		 * String windowHandle = driver.getWindowHandle(); WebDriver
		 * currentWindow = driver.switchTo().window(windowHandle);
		 */

		return this;

	}

	public fetchingReports selectExportoptions(String selectpage, String reportformat) throws Throwable {

		// getSelectExportOptions().click();

		if (selectpage.equalsIgnoreCase("currentpage")) {

			if (reportformat.equalsIgnoreCase("excel")) {

				getSelectExcel().click();

			}
			
			  else{
			 
			  getSelectCSV().click();
			 
			  }
			 

			selectExport_CurrentPage();
		}

		else if (selectpage.equalsIgnoreCase("All")) {

			if (reportformat.equalsIgnoreCase("excel")) {

				getSelectExcel().click();

			}
	
			 else if(reportformat.equalsIgnoreCase("CSV")) {
			  
			 getSelectCSV().click();
			  
			  }
			
			selectExport_AllPage();
		}

		else if (selectpage.equalsIgnoreCase("AllSubReports")) {

			getSelectExcel().click();

			selectExport_AllSubReport();
		}
		else if (selectpage.equalsIgnoreCase("AllPages")) {
			if (reportformat.equalsIgnoreCase("excel")) {
			getSelectExcel().click();
			getrdblExportSelectionAllPages().click();
			getClick_btnExportContinue().click();
		
		                   }
		}
		Thread.sleep(3000);
		return this;

	}
	        @FindBy(xpath="//*[@id='rdblExportSelectionAllPages']")
             private WebElement rdblExportSelectionAllPages;
	        
	        public   WebElement getrdblExportSelectionAllPages() {
	        	return rdblExportSelectionAllPages;
	        }
	        
	public fetchingReports selectExport_CurrentPage() {

		getSelectExport_CurrentPage().click();

		getClick_btnExportContinue().click();
		isAlertPresent();
		// isAlertPresent();
		// driver.switchTo().defaultContent();
		// driver.navigate().refresh();

		return this;

	}

	public fetchingReports selectExport_AllPage() throws Throwable {

		getSelectExport_AllPage().click();

		getClick_btnExportContinue().click();
		isAlertPresent();
		// isAlertPresent();

		/*
		 * //switchWindows(); Thread.sleep(5000); //driver.close();
		 * driver.switchTo().window(winHandleBefore);
		 * 
		 * Thread.sleep(5000); driver.navigate().refresh();
		 */
		return this;

	}

	public fetchingReports selectExport_AllSubReport() throws Throwable {

		getSelectExport_AllSubReport().click();

		getClick_btnExportContinue().click();
		isAlertPresent();
		// isAlertPresent();
		/*
		 * // switchWindows(); Thread.sleep(5000); // driver.close();
		 * driver.switchTo().window(winHandleBefore); Thread.sleep(5000);
		 * driver.navigate().refresh();
		 */

		return this;

	}

	public fetchingReports selectDate(String startDate, String endDate) {

		selectStartDate.sendKeys(startDate);
		selectEndDate.sendKeys(endDate);

		return this;
	}

	public fetchingReports selectrecords() {

		if (Message_Norecords.getText().contains("There are no items to show in this view")) {

			System.out.println(Message_Norecords.getText());

		}

		else {

			getSelectAllResults().click();
		}

		return this;

	}

	public fetchingReports submitEventReport(String EventType, String ViewType) {

		try {

			if (EventType.equalsIgnoreCase("Yes")) {

				selectEventsYes.click();

				if (ViewType.contains("Hierarchical")) {
					selectViewHierarchical.click();
				}
				selectViewTabular.click();
			}

			else if (EventType.equalsIgnoreCase("No")) {

				selecEventstNo.click();

				if (ViewType.contains("Hierarchical")) {

					selectViewHierarchical.click();

				}

				selectViewTabular.click();

			}

			selectSubmitButton();

		}

		catch (Exception e) {

			System.out.println("Message" + NoRecordsMessage.getText());
		}
		return this;
	}

	public fetchingReports selectResultRecords(boolean check) throws Throwable {
		try {
			Thread.sleep(10000);
			if (getSelectAllResults().isEnabled() && check) {

				getSelectAllResults().click();

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

	public fetchingReports fetchDailyWellReport(boolean check, String selectpage, String reportformat)
			throws Throwable {

		selectResultRecords(check).exportClick().selectExportoptions(selectpage, reportformat);
		//isAlertPresent();

		if (selectpage.equalsIgnoreCase("All")) {

			switchWindows();

			Thread.sleep(5000);
		}
		Thread.sleep(5000);
		return this;
		
	}

	public fetchingReports fetchWellheadReport(boolean check, String selectpage, String reportformat) throws Throwable {

		selectResultRecords(check).exportClick().selectExportoptions(selectpage, reportformat);

		if (!check) {

			selectResultRecords(check).exportClick().selectExportoptions(selectpage, reportformat);

			isAlertPresent();

			click_cancelButton.click();

			Thread.sleep(5000);
		}

		return this;
	}

	public fetchingReports fetchStringReportResult(boolean check, String selectpage, String reportformat)
			throws Throwable {

		// selectResultRecords(check).selectStringExportReport().selectExportoptions(selectpage,
		// reportformat);

		currentWindowHandle();
		fetchingReports exportReport = selectResultRecords(check).selectStringExportReport();

		exportReport.switchWindows();

		exportReport.selectExportoptions(selectpage, reportformat);
		isAlertPresent();

		if (selectpage.equalsIgnoreCase("All") || selectpage.equalsIgnoreCase("AllSubReports")) {

			switchWindows();

			Thread.sleep(5000);
		}

		return this;
	}

	public fetchingReports fetchHoldUpDepthReportResult(boolean check, String selectpage, String reportformat,String ViewSelection) throws Throwable {

		// selectResultRecords(check).selectStringExportReport().selectExportoptions(selectpage,
		// reportformat);
		Thread.sleep(2000);

		fetchingReports exportReport = selectResultRecords(check).exportClick();

		Thread.sleep(2000);

		exportReport.switchWindows();

		try {
			if (selectpage.contains("currentpage") || selectpage.contains("All")) {
				exportReport.selectViewSelection(ViewSelection);

				exportReport.selectExportoptions(selectpage, reportformat);

				isAlertPresent();

				if (selectpage.equalsIgnoreCase("All")) {

					switchWindows();

					Thread.sleep(5000);
				}

			}

			else if (selectpage.equalsIgnoreCase("AllSubReports")) {
				exportReport.selectExportoptions(selectpage, "excel");

				isAlertPresent();
				switchWindows();

				Thread.sleep(5000);

			}

		}

		catch (Exception e) {
			System.out.println("Required  Details for generating Report not selected" + e);
		}

		return this;
	}

	public fetchingReports selectViewSelection(String viewSelection) {

		if (viewSelection.equalsIgnoreCase("single")) {

			getSelectSinglePage().click();
		} else if (viewSelection.equalsIgnoreCase("Multi")) {
			getSelectMutliPage().click();
		}
		return this;

	}

	public fetchingReports selectComponentInfo() {

		selectComponentInfo.click();
		return this;

	}

	public fetchingReports selectWirelineRetrievables() {

		selectWirelineRetrievables.click();
		return this;

	}

	public fetchingReports selectStringData() {

		getSelectAllResults().click();

		return this;
	}

	public fetchingReports selectStringExportReport() {

		getSelectStringExportReport().click();

		// driver.switchTo().defaultContent();

		return this;
	}

	public fetchingReports selectStringPrintReport() {

		getSelectStringPrintReport().click();

		return this;
	}

	public fetchingReports selectPrintReport() {

		getPrintIcon().click();

		return this;
	}

	public void switchtoParentWindow() {

		// driver.close();

		driver.navigate().back();

		driver.navigate().refresh();

	}

	public fetchingReports FetchExportReportResult_Utilities(boolean check, String selectpage, String reportformat,
			String ViewSelection) throws Throwable {

		// selectResultRecords(check).selectStringExportReport().selectExportoptions(selectpage,
		// reportformat);

		fetchingReports exportReport = selectResultRecords_WH(check).exportClick();

		Thread.sleep(2000);

		exportReport.switchWindows();

		try {

			exportReport.selectViewSelection(ViewSelection);

			exportReport.selectExportoptions(selectpage, reportformat);

		}

		catch (Exception e) {

			isAlertPresent();
			System.out.println("Required  Details for generating Report not selected" + e);
		}

		return this;
	}

	// Changes by Sidheswar

	// Method for Export of WellHeadReport
	public fetchingReports FetchExportReportResult(boolean check, String selectpage, String reportformat,
			String ViewSelection) throws Throwable {

		// selectResultRecords(check).selectStringExportReport().selectExportoptions(selectpage,
		// reportformat);

		fetchingReports exportReport = selectResultRecords_WH(check).exportClick();

		Thread.sleep(2000);

		exportReport.switchWindows();

		try {
			if (selectpage.contains("currentpage") || selectpage.contains("All")) {
				exportReport.selectViewSelection(ViewSelection);

				exportReport.selectExportoptions(selectpage, reportformat);

				isAlertPresent();

				if (selectpage.equalsIgnoreCase("All")) {

					switchWindows();

					Thread.sleep(5000);
				}

			}

			else if (selectpage.equalsIgnoreCase("AllSubReports")) {
				exportReport.selectExportoptions(selectpage, "excel");

				// isAlertPresent();
				switchWindows();

				Thread.sleep(5000);

			}

		}

		catch (Exception e) {
			System.out.println("Required  Details for generating Report not selected" + e);
		}

		return this;
	}

	public fetchingReports selectSubMenutFromList(WebElement mainmenu, List<WebElement> submenu, String text) {

		mainmenu.click();
		for (WebElement df : submenu) {

			if (df.getText().contains(text)) {

				df.click();
				break;
			}

		}

		return this;

	}

	public fetchingReports selectResultRecords_WH(boolean check) throws Throwable {
		try {

			if (check)

				getSelectAllResults_WH().click();

			Thread.sleep(3000);

		}

		catch (Exception e) {

			System.out.println("Records not checked" + e);
		}

		return this;
	}

	// For Selection of export with pop up 09-04-18 by sireesha
	public fetchingReports fetchDocumentReport(boolean check, String selectpage, String reportformat) throws Throwable {
          Thread.sleep(1000);
		selectResultRecords(check).exportClick().selectExportoptions(selectpage, reportformat);

		if (selectpage.equalsIgnoreCase("All")) {
			isAlertPresent();
			switchWindows();

		}
		Thread.sleep(5000);
		return this;
	}

	// imam unit conversion , selecting the options from the ul list
	public fetchingReports selectUnitConversionOptions_FromList(String unit_group, String Unit_type) throws Throwable {

		driver.manage().window().maximize();

		clickUnitconversionicon_Utilities.click();

		Thread.sleep(3000);
		// UnitconversionView.click();
		selectSubMenutFromList(UnitconversionView, UnitconversionViewList, unit_group);

		if (Unit_type.equalsIgnoreCase("feet") || Unit_type.equalsIgnoreCase("kg/m3")) {

			clickArrowButton.click(); // >> buttn
			System.out.println("unit type Selected as" + Unit_type);
		} else {

			selectSubMenutFromList(UnitTypeView, UnitTypeViewList, Unit_type);

			clickArrowButton.click(); // >> buttn
			System.out.println("unit type Selected as :" + Unit_type);

		}
		// selectSubmitButton();

		clickSubmitButton.click(); // >> submit

		Thread.sleep(2000);

		return this;

	}

	public WebElement getUnitGroups() {

		return UnitGroups;

	}

	public WebElement getUnits() {

		return Units;

	}

	public fetchingReports selectUnitConversionOptions_FromList_PSD(WebElement UnitGroups, WebElement units,String UnitGroups_text, String Unit_text) throws Throwable {

		driver.manage().window().maximize();

		clickUnitconversionicon_PSD.click();
		Select dropdown_UnitGroups = new Select(UnitGroups);
		dropdown_UnitGroups.selectByVisibleText(UnitGroups_text);
		Thread.sleep(2000);
		Select dropdown_units = new Select(units);
		dropdown_units.selectByVisibleText(Unit_text);
		ClickArrow_Btn.click(); // >> buttn
		Thread.sleep(6000);
		Submit_Btn.click();
		Thread.sleep(2000);
		return this;
	}
	// selectSubmitButton();

	public fetchingReports fetchPSDReport(boolean check, String selectpage, String reportformat) throws Throwable {

		selectResultRecords(check).exportClick().selectExportoptions(selectpage, reportformat);
		isAlertPresent();
		Thread.sleep(5000);

		if (selectpage.equalsIgnoreCase("All")) {

			switchWindows();

			Thread.sleep(5000);
		}

		return this;
	}

	////////////////////

	@FindBy(xpath = "//*[@id='btnSubmit']")
	private WebElement SUBMIT_BTN;

	public fetchingReports Submit_Click() {
		SUBMIT_BTN.click();
		return this;

	}

	@FindBy(xpath = "//*[@id='pnlDetailReportHyperLinks']/table/tbody/tr/td")
	private List<WebElement> Links;

	// Locater of Production history

	@FindBy(xpath = "//*[@id='pnlGroupBy']/fieldset/table/tbody/tr/td")
	private List<WebElement> Group_By;

	@FindBy(xpath = "//*[@id='pnlReportFormat']/fieldset/table/tbody/tr/td")
	public List<WebElement> Report_Formarts;

	@FindBy(xpath = "//*[@id='pnlAveraging']/fieldset/table/tbody/tr/td")
	public List<WebElement> Averaging;
	@FindBy(xpath = "//*[@id='pnlMeasure']/fieldset/table/tbody/tr/td")
	public List<WebElement> Measure;

	public List<WebElement> SelectGroup_By() {
		return Group_By;
	}

/*	@FindBy(xpath = "//*[@id='imgPlus']")
	public WebElement clickUnitconversionicon_ProdutionHistory;*/
	
	@FindBy(xpath = "//*[@id='ddlUnit']")
	public WebElement Unit;

	@FindBy(xpath = "//*[@id='lstReservoir']")
	public WebElement Reservior;

	@FindBy(xpath = "//*[@id='lstWell']")
	public WebElement Well;

	@FindBy(xpath = "//*[@id='lstField']")
	public WebElement Field;

	@FindBy(xpath = "//*[@id='lstWellBore']")
	public WebElement Wellbore;

	@FindBy(xpath = "//*[@id='lstBlockConcession']")
	public WebElement Block_Concession;

	@FindBy(xpath = "//*[@id='DateFilterOptions_ddlEventPeriod']")
	public WebElement Period;

	// Pipeline monthly
	@FindBy(xpath = "//*[@id='FilterOption_lstFilter4']")
	private WebElement P_CUM_WGR_UOM;

	@FindBy(xpath = " //*[@id='FilterOption_lstFilter3']")
	private WebElement P_CUM_OIL_UOM;

	@FindBy(xpath = "//*[@id='FilterOption_lstFilter2']")
	private WebElement I_GAS_UOM;

	@FindBy(xpath = "//*[@id='FilterOption_lstFilter1']")
	private WebElement RESERVOIR_NAME;

	@FindBy(xpath = " //*[@id='FilterOption_lstFilter0']")
	private WebElement WELLBORE_NAME;

	public WebElement getWELLBORE_NAME() {

		return WELLBORE_NAME;
	}

	public WebElement getRESERVOIR_NAME() {

		return RESERVOIR_NAME;
	}

	public WebElement getI_GAS_UOM() {
		return I_GAS_UOM;
	}

	public WebElement getP_CUM_OIL_UOM() {
		return P_CUM_OIL_UOM;
	}

	public WebElement getP_CUM_WGR_UOM() {
		return P_CUM_WGR_UOM;
	}

	@FindBy(xpath = "//*[@id='FilterOption_btnSubmit']")
	private WebElement Submit;

	public fetchingReports Clicksubmit() {
		Submit.click();
		return this;

	}

	public fetchingReports selectResultRecords_R(boolean check) throws Throwable {
		try {
			if (getSelectAllResults().isSelected() && check) {

				System.out.println("Records are already checked");
				Thread.sleep(3000);
			} else {

				getSelectAllResults().click();

			}
		}

		catch (Exception e) {

			System.out.println("Records not checked" + e);
		}

		return this;
	}

	public fetchingReports Clicklink(String reportName, boolean check, String selectpage, String reportformat)
			throws Throwable {
		try {
			for (int i = 0; i < Links.size(); i++) {

				String text = Links.get(i).getText();
				driver.manage().window().maximize();
				System.out.println(text);

				if (text.equalsIgnoreCase(reportName)) {
					getSelectAllResults().click();
					Links.get(i).click();
					break;
				}

			}

			if (getSelectAllResults().isDisplayed() && check) {
				// System.out.println(getSelectAllResults().isEnabled());

				switchWindows();
				System.out.println("Records are available you can proceed for Export");

				selectResultRecords_R(check).exportClick().selectExportoptions(selectpage, reportformat);
				isAlertPresent();
				Thread.sleep(10000);

				if (selectpage.equalsIgnoreCase("All")) {

					switchWindows();

					Thread.sleep(5000);
				}

				return this;
			} else {
				System.out.println("No records were found in the database.");
			}
		}

		catch (Exception e) {
			System.out.println("No record in database");
		}
		return this;

	}

	public fetchingReports selectreporting(String CheckboxtName, List<WebElement> FilterType) {

		for (int i = 0; i < FilterType.size(); i++) {

			String text = FilterType.get(i).getText();

			System.out.println(text);

			if (text.equalsIgnoreCase(CheckboxtName)) {

				FilterType.get(i).click();
				break;

			}

		}

		return new fetchingReports(driver);

	}

	public fetchingReports selectUnitConversionOptions_FromList_PH(WebElement UnitGroups, WebElement units,String UnitGroups_text, String Unit_text) throws Throwable {

		driver.manage().window().maximize();

		clickUnitconversionicon_ProdutionHistory.click();
		Select dropdown_UnitGroups = new Select(UnitGroups);
		dropdown_UnitGroups.selectByVisibleText(UnitGroups_text);
		Thread.sleep(2000);
		Select dropdown_units = new Select(units);
		dropdown_units.selectByVisibleText(Unit_text);
		ClickArrow_Btn.click(); // >> buttn
		Thread.sleep(2000);
		Submit_Btn.click();
		Thread.sleep(2000);
		return this;
	}
	public fetchingReports selectUnitConversionOptions_FromList_WSS(WebElement UnitGroups, WebElement units,String UnitGroups_text, String Unit_text) throws Throwable {

		driver.manage().window().maximize();

		clickUnitconversionicon.click();
		Select dropdown_UnitGroups = new Select(UnitGroups);
		dropdown_UnitGroups.selectByVisibleText(UnitGroups_text);
		Thread.sleep(2000);
		Select dropdown_units = new Select(units);
		dropdown_units.selectByVisibleText(Unit_text);
		ClickArrow_Btn.click(); // >> buttn
		Thread.sleep(2000);
		Submit_Btn.click();
		Thread.sleep(2000);
		return this;
	}
	// Method for FPC Export Select and checkAll -- 26April mudassir

	public fetchingReports FPCExportSelect(boolean check, String selectpage, String reportformat) throws Throwable {
           Thread.sleep(1000);
		selectResultRecords_FPCGeochemistry(check).selectResultRecords_FPCGeochemistry2(check).selectResultRecords_FPCGeochemistry3(check).selectStringExportReport().selectExportoptions(selectpage, reportformat);

		// selectResultRecords_FPC
		if (!check) {

			// isAlertPresent();

			isAlertPresent();

			// click_cancelButton.click();

			Thread.sleep(8000);
		}

		return this;
	}

	// method for select ResultRecords_FPCGeochemistry 26 April
	public fetchingReports selectResultRecords_FPCGeochemistry(boolean check) throws Throwable {
		try {
			if (getselectResultRecords_FPC().isEnabled() && check) {

				getselectResultRecords_FPC().click();

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

	// method for select ResultRecords_FPCGeochemistry 26 April 2nd
	public fetchingReports selectResultRecords_FPCGeochemistry2(boolean check) throws Throwable {
		try {
			if (getselectResultRecords_FPC2().isEnabled() && check) {

				getselectResultRecords_FPC2().click();

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

	// method for select ResultRecords_FPCGeochemistry 26 April 3rd
	public fetchingReports selectResultRecords_FPCGeochemistry3(boolean check) throws Throwable {
		try {
			if (getselectResultRecords_FPC3().isEnabled() && check) {

				getselectResultRecords_FPC3().click();

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

	public boolean isAlertPresent() {
		try {
			getAlert();
		} // try
		catch (NoAlertPresentException Ex) {

			return false;
		}
		return true;
	}

	

	// Geological feature 27 April mudassir
	@FindBy(id = "ddlGeologicFeature")
	private WebElement selectGeologicFeature;

	public WebElement getSelectGeologicFeature() {
		return selectGeologicFeature;
	}

	// Radio AND click 27 April Mudassir
	@FindBy(xpath = "//*[@id='rdbPicksearch_0']")
	private WebElement selectAND;

	public void getSelectAND() throws InterruptedException {
		selectAND.click();
		Thread.sleep(3000);

	}
	
	// Radio AND2 click 27 April Mudassir
		@FindBy(xpath = "//*[@id='rdbInterpreter_0']")
		private WebElement selectAND2;

		public void getSelectAND2() throws InterruptedException {
			selectAND2.click();
			Thread.sleep(3000);

		}

	// Radio OR click 27 April Mudassir
	@FindBy(xpath = "//*[@id='rdbPicksearch_1']")
	private WebElement selectOR;
	
	public void getSelectOR() throws InterruptedException {
		selectOR.click();
		Thread.sleep(3000);

	}

	// Radio OR2 click 27 April Mudassir
		@FindBy(xpath = "//*[@id='rdbInterpreter_1']")
		private WebElement selectOR2;
		
		public void getSelectOR2() throws InterruptedException {
			selectOR2.click();
			Thread.sleep(3000);

		} 
		
	// Picks BtnAdd

	@FindBy(xpath = "//*[@id='btnAdd']")
	private WebElement clickBtnAddArrowButton;

	

	// AND || OR Method 27 April mudassir
	public fetchingReports selectANDOR(String text) throws Throwable {
		if (text.equalsIgnoreCase("and")) {
			getSelectAND(); // AND btn click
			
		} else if (text.equalsIgnoreCase("or")) {

			getSelectOR(); // OR btn click

		} else {
			System.out.println("AND/OR Not Clicked");
		}
		return this;
	}

	
	// AND || OR Method 27 April mudassir
		public fetchingReports selectANDOR2(String text) throws Throwable {
			if (text.equalsIgnoreCase("and")) {
				getSelectAND2(); // AND btn click
				
			} else if (text.equalsIgnoreCase("or")) {

				getSelectOR2(); // OR btn click

			} else {
				System.out.println("AND/OR Not Clicked");
			}
			return this;
		}
		
	// Pick Names 27 April mudassir
	@FindBy(xpath = "//*[@id='lstPickName']//ul/li")
	private List<WebElement> selectPickNames;

	public List<WebElement> getselectPickNames() {

		return selectPickNames;
	}

	// method for selecting Pick Names 27 April mudassir

	// Pick names menu from list and text 27 April

	public fetchingReports selectPickNamesFromList(List<WebElement> submenu, String text) {

		// mainmenu.click();
		for (WebElement df : submenu) {

			if (df.getText().contains(text)) {

				df.click();
				break;
			}

		}

		return this;

	}

	public fetchingReports selectPickNames_FromList(String text) throws Throwable {

		selectPickNamesFromList(selectPickNames, text);

		if (text.equalsIgnoreCase("CC__B") || text.equalsIgnoreCase("kg/m3")) {

			clickBtnAddArrowButton.click(); // >> buttn
			System.out.println("CC__B selected" + text);
		} else {

			selectPickNamesFromList(selectPickNames, text);

			clickBtnAddArrowButton.click(); // >> buttn
			System.out.println("unit type Selected as :" + text);

		}
		// selectSubmitButton();

		// clickSubmitButton.click(); // >> submit

		Thread.sleep(2000);

		return this;

	}

	// Method for Recall Cores -- 18April mudassir

	public fetchingReports fetchCoresReport(boolean check, String selectpage, String reportformat) throws Throwable {

		selectResultRecords_Cores(check).selectStringExportReport().selectExportoptions(selectpage, reportformat);

		if (!check) {

			// selectResultRecords_Cores(check).selectStringExportReport().selectExportoptions(selectpage,reportformat);

			//isAlertPresent();
			
			

			// click_cancelButton.click();

			Thread.sleep(8000);
		}

		return this;
	}

	// method for select ResultRecords_cores and iblCoreReports
	public fetchingReports selectResultRecords_Cores(boolean check) throws Throwable {
		try {
			if ((getSelectAllResults_Cores().isEnabled() && check)
					|| (getselectAll_lblCoreReports().isEnabled() && check)) {

				if (getSelectAllResults_Cores().isEnabled() && check) {
					getSelectAllResults_Cores().click();

				}

				/*
				 * else if(getselectAll_lblCoreReports().isEnabled() && check) {
				 * getselectAll_lblCoreReports().click(); }
				 */

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

	// method for select iblCoreReports -- 20 April Mudassir
	public fetchingReports selectResultRecords_Cores_iblCoreReports(boolean check) throws Throwable {
		try {
			if (getselectAll_lblCoreReports().isEnabled() && check) {

				getselectAll_lblCoreReports().click();

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

	// Method for Recall Cores_iblCoreReports -- 20April mudassir

	public fetchingReports fetch_iblCoreReport(boolean check, String selectpage, String reportformat) throws Throwable {

		selectResultRecords_Cores_iblCoreReports(check).selectStringExportReport().selectExportoptions(selectpage,
				reportformat);

		if (!check) {

			// selectResultRecords_Cores(check).selectStringExportReport().selectExportoptions(selectpage,reportformat);

			isAlertPresent();

			// click_cancelButton.click();

			Thread.sleep(8000);
		}

		return this;
	}

	// method for unit conversion of Logs recall 23 April mudassir

	public fetchingReports selectUnitConversionOptions_Logs(String text) throws Throwable {

		clickUnitconversionicon_Utilities.click();
		Thread.sleep(4000);

		selectUnitGroups();

		Thread.sleep(3000);

		if (text.equalsIgnoreCase("feet")) {
			clickUnitButton.click(); // >> btn click
		} else if (text.equalsIgnoreCase("meters")) {

			selectDataForReports(getSelectddlUnitType(), text);

			clickUnitButton.click(); // >> btn click

		}
		getUnit_ConversionLogsSubmitButton();

		Thread.sleep(3000);
		return this;

	}

	public fetchingReports selectExport_AllPageTime() throws Throwable {

		getSelectExport_AllPageData().click();

		getClick_btnExportContinue().click();
		// isAlertPresent();

		/*
		 * //switchWindows(); Thread.sleep(5000); //driver.close();
		 * driver.switchTo().window(winHandleBefore);
		 * 
		 * Thread.sleep(5000); driver.navigate().refresh();
		 */
		return this;

	}

	public fetchingReports selectExportoptionsTime(String selectpage, String reportformat) throws Throwable {

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

			selectExport_CurrentPageTime();
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
			selectExport_AllPageTime();
		}

		else if (selectpage.equalsIgnoreCase("AllSubReports")) {

			getSelectExcel().click();

			selectExport_AllSubReport();
		}

		Thread.sleep(3000);
		return this;

	}

	public fetchingReports selectExport_CurrentPageTime() {

		getSelectExport_CurrentPageTime().click();

		getClick_btnExportContinue().click();
		// isAlertPresent();
		// driver.switchTo().defaultContent();
		// driver.navigate().refresh();

		return this;

	}

	public fetchingReports FetchExportReportResultData(boolean check, String selectpage, String reportformat,
			String ViewSelection) throws Throwable {

		// selectResultRecords(check).selectStringExportReport().selectExportoptions(selectpage,
		// reportformat);

		fetchingReports exportReport = selectResultRecords_WH(check).exportClick();
		Thread.sleep(2000);
		exportReport.switchWindows();
		try {
			if (selectpage.contains("currentpage") || selectpage.contains("All")) {
				exportReport.selectViewSelection(ViewSelection);

				exportReport.selectExportoptionsTime(selectpage, reportformat);

				// isAlertPresent();

				if (selectpage.equalsIgnoreCase("All")) {

					switchWindows();

					Thread.sleep(5000);
				}
			}

			else if (selectpage.equalsIgnoreCase("AllSubReports")) {
				exportReport.selectExportoptions(selectpage, "excel");

				// isAlertPresent();
				switchWindows();

				Thread.sleep(5000);

			}
		}

		catch (Exception e) {
			System.out.println("Required  Details for generating Report not selected" + e);
		}

		return this;
	}
	
	// 19/4/2018--sireesha for Wellbore StatusData
	 public fetchingReports selectUnitConversionOptionsStatus(String text) throws Throwable{
		 
				  driver.manage().window().maximize();
				  	Thread.sleep(1000);
					clickUnitconversionicon.click();
					  
					  selectUnitGroups();
					  
					  Thread.sleep(2000);
					  
					  if(text.equalsIgnoreCase("feet"))
					  {
						  clickUnitButton.click();
					  }
					  else if(text.equalsIgnoreCase("meters")){ 
						  
					  selectDataForReports(getSelectddlUnitType(),text);
					  

					  clickUnitButton.click();
						  
					  }
					  selectSubmitButton();
					  
					  Thread.sleep(3000);
					  return this;
				  
				  }
	 
	 public fetchingReports selectExportoptionsStatious(String selectpage,String reportformat) throws Throwable{
		 
		 //fetchingReports exportReport = selectResultRecords(check);//.getClick_btnExportContinueData().click();//.exportClick();
		 getClick_btnExportContinueData().click();

		 if(selectpage.equalsIgnoreCase("currentpage"))
		 {
			 
			
			
			if(reportformat.equalsIgnoreCase("excel")){
				
				
				getSelectExcel().click();
				
			}
			else{
				
				getSelectCSV().click();
	
			}
			
			selectExport_CurrentPage();
		 }
		 
		 else if(selectpage.equalsIgnoreCase("All")){
			 
			
			 
			 if(reportformat.equalsIgnoreCase("excel")){
					
				 getSelectExcel().click();
					
				}
			else if(reportformat.equalsIgnoreCase("CSV"))
					{
					
					getSelectCSV().click();
					
				}
			 selectExport_AllPage();
		 }
		 
		 else if(selectpage.equalsIgnoreCase("AllSubReports")){
			 

				 getSelectExcel().click();

				 selectExport_AllSubReport();
		 }
		 
		 Thread.sleep(3000);
		 return this;
		 
		 
	 }
	 
	 // selecting Pick names from list 
	 public fetchingReports SelectRecords_picks(int NumCheckbox) throws InterruptedException {

			List<WebElement> Checkboxitem = driver.findElements(By.xpath("//*[@id='lstPickName']/div/ul/li"));
			// Thread.sleep(2000);
			// System.out.println(Checkboxitem.size());
			for (int i = 0; i < Checkboxitem.size()-Checkboxitem.size()+ NumCheckbox; i++) {
				String text = Checkboxitem.get(i).getText();
				System.out.println(text);
				// System.out.println(Checkboxitem.get(i).isDisplayed());
				// System.out.println(Checkboxitem.get(i).isSelected());
				Checkboxitem.get(i).click();
			}
			
			WebElement AddBtn = driver.findElement(By.xpath("//*[@id='btnAdd']"));
			AddBtn.click();
			return this;
		}

	 // selecting Interpreter from list 
	 public fetchingReports SelectRecords_Interpreter(int NumCheckbox) throws InterruptedException {

			List<WebElement> Checkboxitem = driver.findElements(By.xpath("//*[@id='lstBxInterpreter']//li"));
			// Thread.sleep(2000);
			// System.out.println(Checkboxitem.size());
			for (int i = 0; i < Checkboxitem.size() - NumCheckbox; i++) {
				String text = Checkboxitem.get(i).getText();
				System.out.println(text);
				// System.out.println(Checkboxitem.get(i).isDisplayed());
				// System.out.println(Checkboxitem.get(i).isSelected());
				Checkboxitem.get(i).click();
			}
			
			
			return this;
		}

	  // 
	 @FindBy(xpath = "//*[@id='btnSearch']")
		private WebElement bntSearch;

		public void getbntSearch() throws InterruptedException {
			bntSearch.click();
			Thread.sleep(5000);

		}
		//sireesha 5/3/2018 for SearchCollection
		 public fetchingReports selectExportoptionsSearch(boolean check, String selectpage, String reportformat)
					throws Throwable {

				fetchingReports exportReport = selectResultRecords(check);
				getClick_btnExportContinueData().click();

				if (selectpage.equalsIgnoreCase("Current Page Only")) {
					if (reportformat.equalsIgnoreCase("excel")) {
						getSelectExcel().click();

					} else {

						getSelectCSV().click();

					}

					selectExport_CurrentPage();
				} else if (selectpage.equalsIgnoreCase("All")) {

					if (reportformat.equalsIgnoreCase("excel")) {

						getSelectExcel().click();

					} else if (reportformat.equalsIgnoreCase("CSV")) {

						getSelectCSV().click();

					}
					selectExport_AllPage();
				}

				else if (selectpage.equalsIgnoreCase("AllSubReports")) {

					getSelectExcel().click();

					selectExport_AllSubReport();
				}

				Thread.sleep(3000);
				// isAlertPresent();
				return this;

			}

		//Raj-->For Admin-->7/5/2018
		 public fetchingReports selectExportoptionsadmin(String selectpage, String reportformat)
					throws Throwable {

			 Thread.sleep(1000);
			 driver.manage().window().maximize();
			 Thread.sleep(1000);
				getClick_btnExportContinueData().click();
				
				if (selectpage.equalsIgnoreCase("Current Page Only")) {
					if (reportformat.equalsIgnoreCase("excel")) {
						getSelectExcel().click();

					} else {

						getSelectCSV().click();

					}

					selectExport_CurrentPage();
				} else if (selectpage.equalsIgnoreCase("All")) {

					if (reportformat.equalsIgnoreCase("excel")) {

						getSelectExcel().click();

					} else if (reportformat.equalsIgnoreCase("CSV")) {

						getSelectCSV().click();

					}
					selectExport_AllPage();
				}

				else if (selectpage.equalsIgnoreCase("AllSubReports")) {

					getSelectExcel().click();

					selectExport_AllSubReport();
				}

				Thread.sleep(3000);
				// isAlertPresent();
				return this;

			}

@FindBy(xpath="//*[@id='rdbTabular']")
public WebElement chkRadiobtn;

public fetchingReports selectTabularRadioButton()
{
	if(chkRadiobtn.isSelected())
	{
		System.out.println("Radio button is Selected No need to select");
	}
	else
	{
		chkRadiobtn.click();
	}

	return this;
}
	 
@FindBy(xpath ="//*[@id='rgTabularResult_ctl00_ctl02_ctl01_CheckBox1']")
private WebElement WellboreAnullichkAll;

public void getWellboreAnullichkAll() {
	
	WellboreAnullichkAll.click();
}

public fetchingReports GenericexportReport( String selectpage, String reportformat,String ViewSelection) throws Throwable {

	// selectResultRecords(check).selectStringExportReport().selectExportoptions(selectpage,
	// reportformat);
	Thread.sleep(2000);

	fetchingReports exportReport = switchWindows();
			//exportReport.switchWindows();
// selectResultRecords(check).exportClick();
	Thread.sleep(2000);

	

	try {
		if (selectpage.contains("currentpage") || selectpage.contains("All")) {
			exportReport.selectViewSelection(ViewSelection);

			exportReport.selectExportoptions(selectpage, reportformat);

			isAlertPresent();

			if (selectpage.equalsIgnoreCase("All")) {

				switchWindows();

				Thread.sleep(5000);
			}

		}

		else if (selectpage.equalsIgnoreCase("AllSubReports")) {
			exportReport.selectExportoptions(selectpage, "excel");

			isAlertPresent();
			switchWindows();

			Thread.sleep(5000);

		}

	}

	catch (Exception e) {
		System.out.println("Required  Details for generating Report not selected" + e);
	}

	return this;
}
// CSV removal Check as part of the FS
public void  Csvcheck() {
	 // Click on Export icon
      driver.findElement(By.xpath("//*[@id='btnShowExportOptionDiv']")).click();
           switchWindows();
           WebElement CheckCSV= driver.findElement(By.xpath("//*[@id='rdblExportFormatCSV']")); 
         String  expected="CSV radio button is not present in Export options";
     if (CheckCSV.isDisplayed()==true) {
    	  String msg="Test cases failed due to CSV radio button is present in Export options";
		  System.out.println(msg);
		  Assert.assertEquals(expected, msg);
                                           }
     
    else if (CheckCSV.isDisplayed()==false) {
    	     String validmsg="CSV radio button is not present in Export options";
	         System.out.println(validmsg);
	         Assert.assertEquals(expected, validmsg);
	                                        }
         driver.findElement(By.xpath("//*[@id='btnExportCancel']")).click();
               }
public void getListOfREcords() throws InterruptedException{
	Thread.sleep(1000);
    WebElement Table = driver.findElement(By.xpath("//*[@id='lblMainTable']/table/tbody"));
    List<WebElement> rows = Table.findElements(By.tagName("tr")); 
		Thread.sleep(1000);
		// And iterate over them and get all the cells 
		for (WebElement row : rows) { 
		    List<WebElement> cols = row.findElements(By.tagName("td")); 
			Thread.sleep(1000);
		    // Print the contents of each cell
		    for (WebElement col : cols) { 
		    	Thread.sleep(1000);
		    System.out.print(col.getText()+"\t");
		   // System.out.print("  ");
		    
		    //Or try below code 
		    //System.out.println(row.getAttribute("innerHTML"));
	                              	}
		            System.out.println();
		                                    }
	}




}
