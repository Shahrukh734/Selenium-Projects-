package com.pack.common.tests.Dream;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.Dream.contextsearch;
import com.pack.common.pageobjects.Dream.fetchingReports;
import com.pack.common.pageobjects.Dream.homePage;

public class FetchingReport_ReserviourEngineering_AllReports extends TestBaseSetup {
	
	public homePage homepage ;
	//Reservoir Engineering-->pressure Survey Data 
@Test(enabled=true)
public void TC_001_contextSearch_PressureSurveyData_All_Excel_AllWelbore_BU_length_Feet() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Pressure Survey Data");
	 Reporter.log("Pressure Survey Data Data report opened successfully");
	 fetchingReports.switchWindows();
	// driver.close();
	 
	 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"AllWelbore");
	 
	 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"BU");
	 Reporter.log("Wellbore Selected as:ANJUM- 1, Servey Class as :BU");
	
	 //fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
	 fetchingReports.selectDate("", "");
     fetchingReports.Submit_Click();
     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits(),"length","feet");
     Thread.sleep(3000);
     fetchingReports.fetchPSDReport(true,"All", "Excel");
     Reporter.log("Excecel got exported in the format,(true,All,Excel)"); 


}
	

@Test(enabled=true)
public void TC_002_contextSearch_PressureSurveyData_All_Excel_ANJUM1_CLOSE_IN() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Pressure Survey Data");
	 Reporter.log("Pressure Survey Data Data report opened successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"ANJUM- 1");
	 
	 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"CLOSED IN");
	 Reporter.log("Wellbore Selected as:ANJUM- 1, Servey Class as :CLOSED IN");
	 Thread.sleep(3000);
	 //fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
     fetchingReports.Submit_Click();
     Thread.sleep(5000);
     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits() ,"length","meters");
     Thread.sleep(6000);
     fetchingReports.fetchDailyWellReport(true,"All", "Excel");
     Reporter.log("Excecel got exported in the format,(true,All,Excel)"); 

}


@Test(enabled=true)
public void TC_003_contextSearch_PressureSurveyData_currentPage_Excel() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Pressure Survey Data");
	 Reporter.log("Pressure Survey Data Data report opened successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"AllWelbore");
	 
	 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"FLOWING");
	   Reporter.log("Wellbore Selected as:AllWellbore, Servey Class as :FLOWING");
	 //fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
	 fetchingReports.selectDate("", "");
     fetchingReports.Submit_Click();
     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits() ,"pressure gradient","kPa/m");
     Thread.sleep(6000);
     fetchingReports.fetchDailyWellReport(true,"currentpage", "Excel");
  
     Reporter.log("Excecel got exported in the format,(true,currentpage,Excel)");
}



//Comment it no records found
/*@Test(enabled=true)
public void TC_004_contextSearch_PressureSurveyData_ALL_Excel_FO() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Pressure Survey Data");
	 Reporter.log("Pressure Survey Data Data report opened successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"ANJUM- 1");
	
	 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"FO");
	 Reporter.log("Wellbore Selected as:AllWellbore, Servey Class as :FO");
	 fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"FO");
	 fetchingReports.selectDate("", "");
     fetchingReports.Submit_Click();
     Thread.sleep(10000);
     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits() ,"time","min");
     Thread.sleep(6000);
     fetchingReports.fetchDailyWellReport(true,"All", "Excel");
     Reporter.log("Excecel got exported in the format,(true,All,Excel)");
}
*/




@Test(enabled=true)
public void TC_005_contextSearch_PressureSurveyData_currentPage_Excel_RFT() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Pressure Survey Data");
	 Reporter.log("Pressure Survey Data Data report opened successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"ANJUM- 1");
	 
	 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"RFT");
	 Thread.sleep(3000);
	 Reporter.log("Wellbore Selected as:ANJUM- 1, Servey Class as :RFT");
	 fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"CHRFT");
	 fetchingReports.selectDate("", "");
     fetchingReports.Submit_Click();
     Thread.sleep(15000);
     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits() ,"pressure","bara");
     Thread.sleep(6000);
     fetchingReports.fetchDailyWellReport(true,"currentpage", "Excel");
     Reporter.log("Excecel got exported in the format,(true,Current,Excel)");
}




@Test(enabled=true)
public void TC_006_contextSearch_PressureSurveyData_currentPage_Excel() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Pressure Survey Data");
	 Reporter.log("Pressure Survey Data Data report opened successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"AllWelbore");
	 
	 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"FLOWING");
	 Reporter.log("Wellbore Selected as:AllWelbore, Servey Class as :FLOWING");
	 Thread.sleep(3000);
	 //fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
	 fetchingReports.selectDate("", "");
     fetchingReports.Submit_Click();
     Thread.sleep(6000);
     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits() ,"temperature","degC");
     Thread.sleep(6000);
     fetchingReports.fetchDailyWellReport(true,"currentpage", "Excel");
     Reporter.log("Excecel got exported in the format,(true,Current,Excel)");
}



@Test(enabled=true)
public void TC_007_contextSearch_PressureSurveyData_All_Excel_ratedependentD() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Pressure Survey Data");
	 Reporter.log("Pressure Survey Data Data report opened successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"AllWelbore");
	 
	 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"BU");
	 Reporter.log("Wellbore Selected as:AllWelbore, Servey Class as :FLOWING");
	 
	 Thread.sleep(3000);
	 //fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
	 fetchingReports.selectDate("", "");
     fetchingReports.Submit_Click();
     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits() ,"rate dependent D","d/MMscf(60F)");
     Thread.sleep(6000);
     fetchingReports.fetchDailyWellReport(true,"currentpage", "Excel");
     Reporter.log("Excecel got exported in the format,(true,Current,Excel)");
}



@Test(enabled=true)
public void TC_008_contextSearch_PressureSurveyData_currentPage_Excel_pressure_barg() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Pressure Survey Data");
	 Reporter.log("Pressure Survey Data Data report opened successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"ANJUM- 1");
	 
	 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"RFT");
	 Reporter.log("Wellbore Selected as:ANJUM- 1, Servey Class as :RFT");
	
	 //fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
	 fetchingReports.selectDate("", "");
     fetchingReports.Submit_Click();

     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits() ,"pressure","barg");
     Thread.sleep(6000);
     fetchingReports.fetchDailyWellReport(true,"currentpage", "Excel");
     Reporter.log("Excecel got exported in the format,(true,Current,Excel)");
}







@Test(enabled=true)
public void TC_009_contextSearch_PressureSurveyData_currentPage_Excel_time() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Pressure Survey Data");
	 Reporter.log("Pressure Survey Data Data report opened successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"ANJUM- 1");
	 
	 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"BU");
	 Reporter.log("Wellbore Selected as:ANJUM- 1, Servey Class as :BU");
	
	 //fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
	 fetchingReports.selectDate("", "");
     fetchingReports.Submit_Click();
   
     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits() ,"time","min");
     Thread.sleep(6000);
     fetchingReports.fetchDailyWellReport(true,"currentpage", "Excel");
     Reporter.log("Excecel got exported in the format,(true,Current,Excel)");
}








@Test(enabled=true)
public void TC_010_contextSearch_PressureSurveyData_currentPage_Excel_pressure_gradient() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Pressure Survey Data");
	 Reporter.log("Pressure Survey Data Data report opened successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"AllWelbore");
	 
	 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"BU");
	 //fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
	 Reporter.log("Wellbore Selected as:AllWelbore, Servey Class as :BU");
	 fetchingReports.selectDate("", "");
     fetchingReports.Submit_Click();
     
     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits() ,"pressure gradient","psi/ft");
     Thread.sleep(6000);
     fetchingReports.fetchDailyWellReport(true,"AllSubReports", "Excel");
     Reporter.log("Excecel got exported in the format,(true,AllSubReports,Excel)");
}







@Test(enabled=true)
public void TC_011_contextSearch_PressureSurveyData_currentPage_Excel_ratedependentD() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Pressure Survey Data");
	 Reporter.log("Pressure Survey Data Data report opened successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"ANJUM- 1");
	 
	 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"CLOSED IN");
	 
	 Reporter.log("Wellbore Selected ANJUM- 1, Servey Class as :CLOSED IN");
	 //fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
	 fetchingReports.selectDate("", "");
     fetchingReports.Submit_Click();
    
     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits() ,"rate dependent D","d/MNm3 gas");
     Thread.sleep(6000);
     fetchingReports.fetchDailyWellReport(true,"AllSubReports", "Excel");
     Reporter.log("Excecel got exported in the format,(true,AllSubReports,Excel)");
}


////Reservoir Engineering-->pressure Survey Data --> Reservoirdata--> (Manual error Operation Timeout)


@Test(enabled=true)
public void TC_001_contextSearch_Reservoirdata_All_Excel_AllWelbore_BU_length_Feet() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Reservoir Data");
	 
	 Reporter.log("Reservoir Data report opened successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"AllWelbore");
	 
	 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"BU");
	 Reporter.log("Wellbore Selected as:ANJUM- 1, Servey Class as :BU");
	 
	
	 //fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
	 fetchingReports.selectDate("", "");
     fetchingReports.Submit_Click();
     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits(),"length","feet");
     Thread.sleep(3000);
     fetchingReports.fetchPSDReport(true,"All", "Excel");
     Reporter.log("Excecel got exported in the format,(true,All,Excel)");
}
	

@Test(enabled=true)
public void TC_002_contextSearch_Reservoirdata_All_Excel_ANJUM1_CLOSE_IN() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Reservoir Data");
	 Reporter.log("Reservoir Data report opened successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"ANJUM- 1");
	 
	 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"CLOSED IN");

 Reporter.log("Wellbore Selected as:ANJUM- 1, Servey Class as :CLOSED IN");
	 Thread.sleep(3000);
	 //fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
	 fetchingReports.selectDate("", "");
     fetchingReports.Submit_Click();
   
     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits() ,"length","meters");
     Thread.sleep(6000);
     fetchingReports.fetchDailyWellReport(true,"All", "Excel");
     Reporter.log("Excecel got exported in the format,(true,All,Excel)");
}


@Test(enabled=true)
public void TC_003_contextSearch_Reservoirdata_currentPage_Excel() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Reservoir Data");
	 Reporter.log("Reservoir Data report opened successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"AllWelbore");
	 
	 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"BU");
	 Reporter.log("Wellbore Selected as:ANJUM- 1, Servey Class as :FLOWING");
	 fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
	 fetchingReports.selectDate("", "");
     fetchingReports.Submit_Click();
     Thread.sleep(15000);
     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits() ,"pressure gradient","kPa/m");
     Thread.sleep(6000);
     fetchingReports.fetchDailyWellReport(true,"currentpage", "Excel");
     Reporter.log("Excecel got exported in the format,(true,currentpage,Excel)");
}



/*
@Test(enabled=true)
public void TC_004_contextSearch_Reservoirdata_ALL_Excel_FO() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Reservoir Data");
	 Reporter.log("Reservoir Data report opened successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"ANJUM- 1");
	 
	 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"FO");
	 Reporter.log("Wellbore Selected as:ANJUM- 1, Servey Class as :FO");
	 //fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
	 fetchingReports.selectDate("", "");
     fetchingReports.Submit_Click();
     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits() ,"time","min");
     Thread.sleep(6000);
     fetchingReports.fetchDailyWellReport(true,"All", "Excel");
     Reporter.log("Excecel got exported in the format,(true,All,Excel)");
}*/





@Test(enabled=true)
public void TC_005_contextSearch_Reservoirdata_currentPage_Excel_RFT() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Reservoir Data");
	 Reporter.log("Reservoir Data report opened successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"ANJUM- 1");
	 
	 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"RFT");
	 Reporter.log("Wellbore Selected as:ANJUM- 1, Servey Class as :RFT");
	 Thread.sleep(3000);
	 //fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
	 fetchingReports.selectDate("", "");
     fetchingReports.Submit_Click();
     Thread.sleep(6000);
     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits() ,"pressure","bara");
     Thread.sleep(6000);
     fetchingReports.fetchDailyWellReport(true,"currentpage", "Excel");
     Reporter.log("Excecel got exported in the format,(true,currentpage,Excel)");
}




@Test(enabled=true)
public void TC_006_contextSearch_Reservoirdata_currentPage_Excel() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Reservoir Data");
	 Reporter.log("Reservoir Data report opened successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"AllWelbore");
	 
	 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"FLOWING");
	 Reporter.log("Wellbore Selected as:AllWelbore, Servey Class as : FLOWING");
	 Thread.sleep(3000);
	 //fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
	 fetchingReports.selectDate("", "");
     fetchingReports.Submit_Click();
     Thread.sleep(6000);
     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits() ,"temperature","degC");
     Thread.sleep(6000);
     fetchingReports.fetchDailyWellReport(true,"currentpage", "Excel");
     Reporter.log("Excecel got exported in the format,(true,currentpage,Excel)");
}



@Test(enabled=true)
public void TC_007_contextSearch_Reservoirdataa_All_Excel_ratedependentD() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Reservoir Data");
	 Reporter.log("Reservoir Data report opened successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"AllWelbore");
	 
	 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"BU");
	 Reporter.log("Wellbore Selected as:ANJUM- 1, Servey Class as : BU");
	 Thread.sleep(3000);
	 //fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
	 fetchingReports.selectDate("", "");
     fetchingReports.Submit_Click();
     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits() ,"rate dependent D","d/MMscf(60F)");
     Thread.sleep(6000);
     fetchingReports.fetchDailyWellReport(true,"currentpage", "Excel");
     Reporter.log("Excecel got exported in the format,(true,currentpage,Excel)");
}



@Test(enabled=true)
public void TC_008_contextSearch_Reservoirdata_currentPage_Excel_pressure_barg() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Reservoir Data");
	 Reporter.log("Reservoir Data report opened successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"ANJUM- 1");
	 
	 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"RFT");
	 Reporter.log("Wellbore Selected as:ANJUM- 1, Servey Class as : RFT");
	
	 //fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
	 fetchingReports.selectDate("", "");
     fetchingReports.Submit_Click();

     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits() ,"pressure","barg");
     Thread.sleep(6000);
     fetchingReports.fetchDailyWellReport(true,"currentpage", "Excel");
     Reporter.log("Excecel got exported in the format,(true,currentpage,Excel)");
}







@Test(enabled=true)
public void TC_009_contextSearch_ReservoirdatacurrentPage_Excel_time() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Reservoir Data");
	 Reporter.log("Reservoir Data report opened successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"ANJUM- 1");
	 
	 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"BU");
	 Reporter.log("Wellbore Selected as:ANJUM- 1, Servey Class as : BU");
	
	 //fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
	 fetchingReports.selectDate("", "");
     fetchingReports.Submit_Click();
   
     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits() ,"time","min");
     Thread.sleep(6000);
     fetchingReports.fetchDailyWellReport(true,"currentpage", "Excel");
	 Reporter.log("Excecel got exported in the format,(true,currentpage,Excel)");
}








@Test(enabled=true)
public void TC_010_contextSearch_Reservoirdata_currentPage_Excel_pressure_gradient() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Reservoir Data");
	 Reporter.log("Reservoir Data report opened successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"AllWelbore");
	 
	 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"BU");
	 Reporter.log("Wellbore Selected as:AllWelbore, Servey Class as : BU");
	 //fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
	 fetchingReports.selectDate("", "");
     fetchingReports.Submit_Click();
     
     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits() ,"pressure gradient","psi/ft");
     Thread.sleep(6000);
     fetchingReports.fetchDailyWellReport(true,"currentpage", "Excel");
	 Reporter.log("Excecel got exported in the format,(true,currentpage,Excel)");
}







@Test(enabled=true)
public void TC_011_contextSearch_Reservoirdata_currentPage_Excel_ratedependentD() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Reservoir Data");
	 Reporter.log("Reservoir Data report opened successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.selectDataForReports(fetchingReports.getSelectWellbore(),"ANJUM- 1");

	 
	 fetchingReports.selectDataForReports(fetchingReports.getSurveyClass(),"CLOSED IN");
	 Reporter.log("Wellbore Selected as:ANJUM- 1, Servey Class as : CLOSED IN");
	
	 //fetchingReports.selectDataForReports(fetchingReports.getTest_Types(),"BU");
	 fetchingReports.selectDate("", "");
     fetchingReports.Submit_Click();
    
     fetchingReports.selectUnitConversionOptions_FromList_PSD(fetchingReports.getUnitGroups(),fetchingReports.getUnits() ,"rate dependent D","d/MNm3 gas");
     Thread.sleep(6000);
     fetchingReports.fetchDailyWellReport(true,"AllSubReports", "Excel");
	 Reporter.log("Excecel got exported in the format,(true,AllSubreports,Excel)");
     
}

//Reservoir Engineering-->pressure Survey Data--> Support Documents 


@Test(enabled=true)
public void TC_001_contextSearch_SuportDocuments_AllSubreports_Excel() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 Reporter.log("All records Selected");
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Support Documents");
	 Reporter.log("Support Document Report opened Successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.fetchDailyWellReport(true,"AllSubReports", "Excel"); 
	 Reporter.log("Excecel got exported in the format,(true,AllSubreports,Excel)");
	
}





@Test(enabled=true)
public void TC_002_contextSearch_SuportDocuments_All_Excel() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");
	 contextpage.selectFewcheck();
	 Reporter.log("All records Selected");
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	 fetchingReports fetchingReports = contextpage.selectreporting("Support Documents");
	 Reporter.log("Support Document Report opened Successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.fetchDailyWellReport(true,"All", "Excel"); 
	 Reporter.log("Excecel got exported in the format,(true,All,Excel)");
	
}
@Test(enabled=true)
public void TC_003_contextSearch_SuportDocuments_Currentpage_Excel() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");

	 contextpage.selectFewcheck();
	 Reporter.log("All records Selected");
	 contextpage.SelectReservoirEngineering();
	 contextpage.SelectPressureSurveyData();
	
	 fetchingReports fetchingReports = contextpage.selectreporting("Support Documents");
	 Reporter.log("Support Document Report opened Successfully");
	 fetchingReports.switchWindows();
	 fetchingReports.fetchDailyWellReport(true,"currentpage", "Excel"); 
	 Reporter.log("Excecel got exported in the format,(true,currentpage,Excel)");
	
}
//Reservoir Engineering--> PVT Sample Report




@Test(enabled=true)
public void TC_001_contextSearch_PVTSampleReport_Currentpage_Excel() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");

	 contextpage.selectFewcheck();
	 Reporter.log("All records Selected");
	 contextpage.SelectReservoirEngineering();
	 fetchingReports fetchingReports = contextpage.selectreporting("PVT Sample Report");
	 fetchingReports.switchWindows();
	 //fetchingReports.selectDataForReports(fetchingReports.Wellbore_PVT,"AllWellbore");
	 fetchingReports.fetchDailyWellReport(true,"currentpage","excel");
 
}

@Test(enabled=true)
public void TC_002_contextSearch_PVTSampleReport_All_Excel() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");

	 contextpage.selectFewcheck();
	 Reporter.log("All records Selected");
	 contextpage.SelectReservoirEngineering();
	 fetchingReports fetchingReports = contextpage.selectreporting("PVT Sample Report");
	 fetchingReports.switchWindows();

	 fetchingReports.fetchDailyWellReport(true, "All", "excel");
 
}

@Test(enabled=true)
public void TC_003_contextSearch_PVTSampleReport_All_Excel_Project_WellInformation() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");

	 contextpage.selectFewcheck();
	 Reporter.log("All records Selected");
	 contextpage.SelectReservoirEngineering();
	 fetchingReports fetchingReports = contextpage.selectreporting("PVT Sample Report");
	 fetchingReports.switchWindows();
	// fetchingReports.selectFewcheck();
//	 fetchingReports.Clicklink("Project & Well Information    ",true,"currentpage","excel");
	 fetchingReports.Clicklink("Project & Well Information    ",true,"All","excel");	
}

	 @Test(enabled=true)
	 public void TC_004_contextSearch_PVTSampleReport_All_Excel_Sample() throws Throwable{
	 	Reporter.log("Perform Quick Search");
	 	homepage=new homePage(driver);
	 	
	 	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	 	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	 	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	 	contextsearch contextpage = homepage.selectText("Anjum*");

	 	 contextpage.selectFewcheck();
	 	 Reporter.log("All records Selected");
	 	 contextpage.SelectReservoirEngineering();
	 	 fetchingReports fetchingReports = contextpage.selectreporting("PVT Sample Report");
	 	 fetchingReports.switchWindows();
	 	// fetchingReports.selectFewcheck();
//	 	 fetchingReports.Clicklink("Project & Well Information    ",true,"currentpage","excel");
	 	 fetchingReports.Clicklink("Project & Well Information    ",true,"currentpage","excel");
}


@Test(enabled=true)
public void TC_005_contextSearch_PVTSampleReport_Currentpage_Excel_Sample() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");

	 contextpage.selectFewcheck();
	 Reporter.log("All records Selected");
	 contextpage.SelectReservoirEngineering();
	 fetchingReports fetchingReports = contextpage.selectreporting("PVT Sample Report");
	 fetchingReports.switchWindows();
	// fetchingReports.selectFewcheck();
//	 fetchingReports.Clicklink("Project & Well Information    ",true,"currentpage","excel");
	 fetchingReports.Clicklink("Sample    ",true,"currentpage","excel");	 
}


@Test(enabled=true)
public void TC_006_contextSearch_PVTSampleReport_All_Excel_Sample() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");

	 contextpage.selectFewcheck();
	 Reporter.log("All records Selected");
	 contextpage.SelectReservoirEngineering();
	 fetchingReports fetchingReports = contextpage.selectreporting("PVT Sample Report");
	 fetchingReports.switchWindows();
	// fetchingReports.selectFewcheck();
//	 fetchingReports.Clicklink("Project & Well Information    ",true,"currentpage","excel");
	 fetchingReports.Clicklink("Sample    ",true,"All","excel");	 
}


@Test(enabled=true)
public void TC_007_contextSearch_PVTSampleReport_Currentpage_Excel_MeasuredProperties() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");

	 contextpage.selectFewcheck();
	 Reporter.log("All records Selected");
	 contextpage.SelectReservoirEngineering();
	 fetchingReports fetchingReports = contextpage.selectreporting("PVT Sample Report");
	 fetchingReports.switchWindows();
	// fetchingReports.selectFewcheck();
//	 fetchingReports.Clicklink("Project & Well Information    ",true,"currentpage","excel");
	 fetchingReports.Clicklink("Measured Properties(PVT)    ",true,"currentpage","excel");	 
}


@Test(enabled=true)
public void TC_008_contextSearch_PVTSampleReport_All_Excel_MeasuredProperties() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");

	 contextpage.selectFewcheck();
	 Reporter.log("All records Selected");
	 contextpage.SelectReservoirEngineering();
	 fetchingReports fetchingReports = contextpage.selectreporting("PVT Sample Report");
	 fetchingReports.switchWindows();
	// fetchingReports.selectFewcheck();
//	 fetchingReports.Clicklink("Project & Well Information    ",true,"currentpage","excel");
	 fetchingReports.Clicklink("Measured Properties(PVT)    ",true,"All","excel");	 
}
@Test(enabled=true)
public void TC_009_contextSearch_PVTSampleReport_Currentpage_Excel_RMP() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");

	 contextpage.selectFewcheck();
	 Reporter.log("All records Selected");
	 contextpage.SelectReservoirEngineering();
	 fetchingReports fetchingReports = contextpage.selectreporting("PVT Sample Report");
	 fetchingReports.switchWindows();
	// fetchingReports.selectFewcheck();
//	 fetchingReports.Clicklink("Project & Well Information    ",true,"currentpage","excel");
	 fetchingReports.Clicklink("Reservoir, Mud & Production/Well Test Samples    ",true,"currentpage","excel");	 
}


@Test(enabled=true)
public void TC_010_contextSearch_PVTSampleReport_All_Excel_RMP() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");

	 contextpage.selectFewcheck();
	 Reporter.log("All records Selected");
	 contextpage.SelectReservoirEngineering();
	 fetchingReports fetchingReports = contextpage.selectreporting("PVT Sample Report");
	 fetchingReports.switchWindows();
	// fetchingReports.selectFewcheck();
//	 fetchingReports.Clicklink("Project & Well Information    ",true,"currentpage","excel");
	 fetchingReports.Clicklink("Reservoir, Mud & Production/Well Test Samples    ",true,"All","excel");	 
}
@Test(enabled=true)
public void TC_011_contextSearch_PVTSampleReport_Currentpage_Excel_DecontaminatedProperties() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");

	 contextpage.selectFewcheck();
	 Reporter.log("All records Selected");
	 contextpage.SelectReservoirEngineering();
	 fetchingReports fetchingReports = contextpage.selectreporting("PVT Sample Report");
	 fetchingReports.switchWindows();
	// fetchingReports.selectFewcheck();
//	 fetchingReports.Clicklink("Project & Well Information    ",true,"currentpage","excel");
	 fetchingReports.Clicklink("QA/Decontaminated Properties    ",true,"currentpage","excel");	 
}


@Test(enabled=true)
public void TC_012_contextSearch_PVTSampleReport_All_Excel_DecontaminatedProperties() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");

	 contextpage.selectFewcheck();
	 Reporter.log("All records Selected");
	 contextpage.SelectReservoirEngineering();
	 fetchingReports fetchingReports = contextpage.selectreporting("PVT Sample Report");
	 fetchingReports.switchWindows();
	// fetchingReports.selectFewcheck();
//	 fetchingReports.Clicklink("Project & Well Information    ",true,"currentpage","excel");
	 fetchingReports.Clicklink("QA/Decontaminated Properties    ",true,"All","excel");	 
}
// issue in current page
@Test(enabled=true)
public void TC_013_contextSearch_PVTSampleReport_Currentpage_Excel_PVTDS() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");

	 contextpage.selectFewcheck();
	 Reporter.log("All records Selected");
	 contextpage.SelectReservoirEngineering();
	 fetchingReports fetchingReports = contextpage.selectreporting("PVT Sample Report");
	 fetchingReports.switchWindows();
	// fetchingReports.selectFewcheck();
//	 fetchingReports.Clicklink("Project & Well Information    ",true,"currentpage","excel");
	 fetchingReports.Clicklink("PVT Data & PVT Study    ",true,"currentpage","excel");	 
}


@Test(enabled=true)
public void TC_014_contextSearch_PVTSampleReport_All_Excel_PVTDS() throws Throwable{
	Reporter.log("Perform Quick Search");
	homepage=new homePage(driver);
	
	homepage.adminViaDropDown(homepage.getCountryDropdown(), "NETHERLANDS");
	homepage.adminViaDropDown(homepage.getAssetDropdown(), "Wellbore");
	homepage.adminViaDropDown(homepage.getColumnDropdown(), "--All Columns--");
	contextsearch contextpage = homepage.selectText("Anjum*");

	 contextpage.selectFewcheck();
	 Reporter.log("All records Selected");
	 contextpage.SelectReservoirEngineering();
	 fetchingReports fetchingReports = contextpage.selectreporting("PVT Sample Report");
	 fetchingReports.switchWindows();
	// fetchingReports.selectFewcheck();
//	 fetchingReports.Clicklink("Project & Well Information    ",true,"currentpage","excel");
	 fetchingReports.Clicklink("PVT Data & PVT Study    ",true,"All","excel");	
}
}

































