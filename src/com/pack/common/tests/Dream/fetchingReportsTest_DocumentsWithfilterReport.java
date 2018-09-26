package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

public class fetchingReportsTest_DocumentsWithfilterReport extends TestBaseSetup{

	
	public homePage homepage ;
	
	//	ContextSearch->Documents-->Documents With Filter 
		
		
	//http://angiejones.tech/inheriting-webdriver/	

// Single Selection 
@Test(enabled=true)
public void TC_001_DocumentsWithfilterRepor_rightClick_current_Excel() throws Throwable{
	
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	contextsearch selectDaouments = contextpage.selectAllcheck();
    contextpage.selectDocuments();
	fetchingReports fetchingReports = selectDaouments.selectDocumentsWithfilter();
	fetchingReports.switchWindows();
	//fetchingReports.selectDate("04/Apr/2017", "13/Apr/2018");
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.getselect_epcatalog(),"Geochemical Data");
	fetchingReports.getEPCatlogRightClick();
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_RegionalProductTypes(),"Geological Data");
	fetchingReports.getselectRegionalGroupRightClick();
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_AdditionalProductTypes(),"2D seismic processing files");
	fetchingReports.getAdditionalProductTypesRightClick();
	fetchingReports.selectSubmitButton();
	fetchingReports.switchWindows();
	fetchingReports.exportClick();
	fetchingReports.selectExportoptions("currentpage","excel");
	Reporter.log("Documents with filter report is generated successfully");
}
@Test(enabled=true)
public void TC_002_DocumentsWithfilterRepor_rightClick_All_Excel() throws Throwable{
	
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	contextsearch selectDaouments = contextpage.selectAllcheck();
    contextpage.selectDocuments();
	fetchingReports fetchingReports = selectDaouments.selectDocumentsWithfilter();
	fetchingReports.switchWindows();
	//fetchingReports.selectDate("04/Apr/2017", "13/Apr/2018");
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.getselect_epcatalog(),"Geochemical Data");
	fetchingReports.getEPCatlogRightClick();
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_RegionalProductTypes(),"Geological Data");
	fetchingReports.getselectRegionalGroupRightClick();
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_AdditionalProductTypes(),"2D seismic processing files");
	fetchingReports.getAdditionalProductTypesRightClick();
	fetchingReports.selectSubmitButton();
	fetchingReports.switchWindows();
	fetchingReports.exportClick();
	fetchingReports.selectExportoptions("All","excel");
	Reporter.log("Documents with filter report is generated successfully");
}

///// Multiple Selection
@Test(enabled=true)
public void TC_003_DocumentsWithfilterRepor_multiSeletion_rightClick_currentpage_Excel() throws Throwable{
	
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	contextsearch selectDaouments = contextpage.selectAllcheck();
    contextpage.selectDocuments();
	fetchingReports fetchingReports = selectDaouments.selectDocumentsWithfilter();
	fetchingReports.switchWindows();
	//fetchingReports.selectDate("04/Apr/2017", "13/Apr/2018");
    fetchingReports.selectingDataUsingActions_FromList(fetchingReports.getselect_epcatalog(),"Geochemical Data");
    fetchingReports.getEPCatlogRightClick();
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.getselect_epcatalog(),"Geological Data");
	fetchingReports.getEPCatlogRightClick();
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_RegionalProductTypes(),"Geological Data");
	fetchingReports.getselectRegionalGroupRightClick();
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_RegionalProductTypes(),"HSE");
	fetchingReports.getselectRegionalGroupRightClick();
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_AdditionalProductTypes(),"2D seismic processing files");
	fetchingReports.getAdditionalProductTypesRightClick();
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_AdditionalProductTypes(),"3CAL - 3-Arm Caliper");
	fetchingReports.getAdditionalProductTypesRightClick();
	fetchingReports.selectSubmitButton();
	fetchingReports.switchWindows();
	fetchingReports.exportClick();
	fetchingReports.selectExportoptions("currentpage","excel");
	Reporter.log("Documents with filter report is generated successfully");
	
}
@Test(enabled=true)
public void TC_004_DocumentsWithfilterRepor_multiSeletion_rightClick_All_Excel() throws Throwable{
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	contextsearch selectDaouments = contextpage.selectAllcheck();
    contextpage.selectDocuments();
	fetchingReports fetchingReports = selectDaouments.selectDocumentsWithfilter();
	fetchingReports.switchWindows();
	//fetchingReports.selectDate("04/Apr/2017", "13/Apr/2018");
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.getselect_epcatalog(),"Geochemical Data");
	fetchingReports.getEPCatlogRightClick();
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.getselect_epcatalog(),"Geological Data");
	fetchingReports.getEPCatlogRightClick();
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_RegionalProductTypes(),"Geological Data");
	fetchingReports.getselectRegionalGroupRightClick();
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_RegionalProductTypes(),"HSE");
	fetchingReports.getselectRegionalGroupRightClick();
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_AdditionalProductTypes(),"2D seismic processing files");
	fetchingReports.getAdditionalProductTypesRightClick();
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_AdditionalProductTypes(),"3CAL - 3-Arm Caliper");
	fetchingReports.getAdditionalProductTypesRightClick();
	fetchingReports.selectSubmitButton();
	fetchingReports.switchWindows();
	fetchingReports.exportClick();
	fetchingReports.selectExportoptions("All","excel");
	Reporter.log("Documents with filter report is generated successfully");
	
}

////////////////////double Click
@Test(enabled=true)//No data
public void TC_005_DocumentsWithfilterRepor_doubleClick_current_Excel() throws Throwable{
	
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	contextsearch selectDaouments = contextpage.selectAllcheck();
    contextpage.selectDocuments();
	fetchingReports fetchingReports = selectDaouments.selectDocumentsWithfilter();
	fetchingReports.switchWindows();
	//fetchingReports.selectDate("04/Apr/2017", "13/Apr/2018");
	fetchingReports.getEPCatlogDoubleClick();
	fetchingReports.getRegionalGroupDoubleClick();
	fetchingReports.getAdditionalProductTypesDoubleClick();
	fetchingReports.selectSubmitButton();
	fetchingReports.switchWindows();
	fetchingReports.exportClick();
	fetchingReports.selectExportoptions("currentpage","excel");
	Reporter.log("Documents with filter report is generated successfully");
	
}
@Test(enabled=true)//No data
public void TC_006_DocumentsWithfilterRepor_doubleClick_All_Excel() throws Throwable{
	
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	contextsearch selectDaouments = contextpage.selectAllcheck();
    contextpage.selectDocuments();
	fetchingReports fetchingReports = selectDaouments.selectDocumentsWithfilter();
	fetchingReports.switchWindows();
	//fetchingReports.selectDate("04/Apr/2017", "13/Apr/2018");
	fetchingReports.getEPCatlogDoubleClick();
	fetchingReports.getRegionalGroupDoubleClick();
	fetchingReports.getAdditionalProductTypesDoubleClick();
	fetchingReports.selectSubmitButton();
	fetchingReports.switchWindows();
	fetchingReports.exportClick();
	fetchingReports.selectExportoptions("All","excel");
	Reporter.log("Documents with filter report is generated successfully");

}
@Test(enabled=true)
public void TC_007_DocumentsWithFilterReport_EPCatlog_doubleClick_Currentpage_Excel() throws Throwable
{
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(),"NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
	contextsearch contextpage=homepage.selectText("Anjum*");
	contextpage.selectAllcheck();
	contextpage.selectDocuments();
	fetchingReports fetchingReports=contextpage.selectDocumentsWithfilter();
	fetchingReports.switchWindows();
	//fetchingReports.selectDate("04/Apr/2000","13/Apr/2018");
	fetchingReports.getEPCatlogDoubleClick();
	fetchingReports.selectSubmitButton();
	fetchingReports.switchWindows();
	fetchingReports.exportClick();
	fetchingReports.selectExportoptions("currentpage","excel");
	Reporter.log("Documents with filter report is generated successfully");
}
@Test(enabled=true)
public void TC_008_DocumentsWithFilterReport_RegionalGroup_doubleClick_Currentpage_Excel() throws Throwable
{
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(),"NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
	contextsearch contextpage=homepage.selectText("Anjum*");
	contextpage.selectAllcheck();
	contextpage.selectDocuments();
	fetchingReports fetchingReports=contextpage.selectDocumentsWithfilter();
	fetchingReports.switchWindows();
	//fetchingReports.selectDate("04/Apr/2000","13/Apr/2018");
	fetchingReports.getRegionalGroupDoubleClick();
	fetchingReports.selectSubmitButton();
	fetchingReports.switchWindows();
	fetchingReports.exportClick();
	fetchingReports.selectExportoptions("currentpage","excel");
	Reporter.log("Documents with filter report is generated successfully");
}
@Test(enabled=true)//No data
public void TC_009_DocumentsWithFilterReport_AddtionalGroup_doubleClick_currentpage_Excel() throws Throwable
{
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(),"NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
	contextsearch contextpage=homepage.selectText("Anjum*");
	contextpage.selectAllcheck();
	contextpage.selectDocuments();
	fetchingReports fetchingReports=contextpage.selectDocumentsWithfilter();
	fetchingReports.switchWindows();
	//fetchingReports.selectDate("04/Apr/2000","13/Apr/2018");
	fetchingReports.getAdditionalProductTypesDoubleClick();
	fetchingReports.selectSubmitButton();
	fetchingReports.switchWindows();
	fetchingReports.exportClick();
	fetchingReports.selectExportoptions("currentpage","excel");
	Reporter.log("Documents with filter report is generated successfully");
}
@Test(enabled=true)
public void TC_010_DocumentsWithFilterReport_EPCatlog_doubleClick_All_Excel() throws Throwable
{
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(),"NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
	contextsearch contextpage=homepage.selectText("Anjum*");
	contextpage.selectAllcheck();
	contextpage.selectDocuments();
	fetchingReports fetchingReports=contextpage.selectDocumentsWithfilter();
	fetchingReports.switchWindows();
	//fetchingReports.selectDate("04/Apr/2000","13/Apr/2018");
	fetchingReports.getEPCatlogDoubleClick();
	fetchingReports.selectSubmitButton();
	fetchingReports.switchWindows();
	fetchingReports.exportClick();
	fetchingReports.selectExportoptions("All","excel");
	Reporter.log("Documents with filter report is generated successfully");
}
@Test(enabled=true)
public void TC_011_DocumentsWithFilterReport_RegionalGroup_doubleClick_All_Excel() throws Throwable
{
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(),"NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
	contextsearch contextpage=homepage.selectText("Anjum*");
	contextpage.selectAllcheck();
	contextpage.selectDocuments();
	fetchingReports fetchingReports=contextpage.selectDocumentsWithfilter();
	fetchingReports.switchWindows();
	//fetchingReports.selectDate("04/Apr/2000","13/Apr/2018");
	fetchingReports.getRegionalGroupDoubleClick();
	fetchingReports.selectSubmitButton();
	fetchingReports.switchWindows();
	fetchingReports.exportClick();
	fetchingReports.selectExportoptions("All","excel");
	Reporter.log("Documents with filter report is generated successfully");
}
@Test(enabled=true)//No data
public void TC_012_DocumentsWithFilterReport_AddtionalGroup_doubleClick_All_Excel() throws Throwable
{
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(),"NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(),"Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(),"--All Columns--");
	contextsearch contextpage=homepage.selectText("Anjum*");
	contextpage.selectAllcheck();
	contextpage.selectDocuments();
	fetchingReports fetchingReports=contextpage.selectDocumentsWithfilter();
	fetchingReports.switchWindows();
	//fetchingReports.selectDate("04/Apr/2000","13/Apr/2018");
	fetchingReports.getAdditionalProductTypesDoubleClick();
	fetchingReports.selectSubmitButton();
	fetchingReports.switchWindows();
	fetchingReports.exportClick();
	fetchingReports.selectExportoptions("All","excel");
	Reporter.log("Documents with filter report is generated successfully");
}
//////////////////////reset
@Test(enabled=true)
public void TC_013_DocumentsWithfilterRepor_reSet() throws Throwable{
	
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	contextsearch selectDaouments = contextpage.selectAllcheck();
    contextpage.selectDocuments();
	fetchingReports fetchingReports = selectDaouments.selectDocumentsWithfilter();
	fetchingReports.switchWindows();
	//fetchingReports.selectDate("04/Apr/2017", "13/Apr/2018");
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.getselect_epcatalog(),"Geochemical Data");
	fetchingReports.getEPCatlogRightClick();
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_RegionalProductTypes(),"Geological Data");
	fetchingReports.getselectRegionalGroupRightClick();
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_AdditionalProductTypes(),"2D seismic processing files");
	fetchingReports.getAdditionalProductTypesRightClick();
	fetchingReports.clickOnResetButton();
	
}
/////////////////////////////Delete

@Test(enabled=true)
public void TC_014_DocumentsWithfilterRepor_Delete_ExistingSelect () throws Throwable{
	homepage=new homePage(driver);
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	contextsearch selectDaouments = contextpage.selectAllcheck();
    contextpage.selectDocuments();
	fetchingReports fetchingReports = selectDaouments.selectDocumentsWithfilter();
	fetchingReports.switchWindows();
	//fetchingReports.selectDate("04/Apr/2017", "13/Apr/2018");
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.getselect_epcatalog(),"Geochemical Data");
	fetchingReports.getEPCatlogRightClick();
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_RegionalProductTypes(),"Geological Data");
	fetchingReports.getselectRegionalGroupRightClick();
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.select_AdditionalProductTypes(),"2D seismic processing files");
	fetchingReports.getAdditionalProductTypesRightClick();	
	fetchingReports.selectingDataUsingActions_FromList(fetchingReports.getSelectedProductTypes(),"Geochemical evaluations");
	fetchingReports.getselect_Delete_ExistsClick();
//	fetchingReports. isDelete();
	Reporter.log("Selected Product type deleted successfully");
	
}



}
