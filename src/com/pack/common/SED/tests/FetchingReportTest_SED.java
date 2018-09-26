package com.pack.common.SED.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.SED.pageObject.EventsandReviews;
import com.pack.common.SED.pageObject.SEDPage;
import com.pack.common.pageobjects.Dream.fetchingReports;


public class FetchingReportTest_SED  extends TestBaseSetup{
	
	public fetchingReports fetchingreports;
	public SEDPage SEDpage;
	public EventsandReviews EventsandReviews;
	//Field Test cases
	@Test(enabled=true)
	public void  TC_001_SED_create_addrecordsToCLuster() throws Throwable {
		SEDpage=new SEDPage(driver);
		SEDpage.getSED().click();
		SEDpage.Switchframe(SEDpage.getFrame());
		Thread.sleep(2000);
		SEDpage.DropdownSelection(SEDpage.getAssertOwner(),"BRENTANDFPSO");
		Thread.sleep(2000);
		SEDpage.DropdownSelection(SEDpage.getAssertType(), "Field");
		SEDpage.SelectRecords(5);
		Thread.sleep(2000);
		SEDpage.CreateCluster("SED_Wellbore_sed_Test");
	}


	@Test(enabled=false)
	public void  TC_002_SED_addrecordsToCLuster() throws Throwable {
		SEDpage=new SEDPage(driver);
		SEDpage.getSED().click();
		SEDpage.Switchframe(SEDpage.getFrame());
		Thread.sleep(2000);
		SEDpage.DropdownSelection(SEDpage.getAssertOwner(),"BRENTANDFPSO");
		SEDpage.DropdownSelection(SEDpage.getAssertType(), "Field");
		SEDpage.SelectRecords(5);
		Thread.sleep(2000);
		SEDpage.Addtocluster("SED_Test_1");
	
	
	}
	
	
	@Test(enabled=false)
	public void  TC_003_SED_Search_Export() throws Throwable {
		SEDpage=new SEDPage(driver);
		SEDpage.getSED().click();
		SEDpage.Switchframe(SEDpage.getFrame());
		Thread.sleep(2000);
		SEDpage.DropdownSelection(SEDpage.getAssertOwner(),"BRENTANDFPSO");
		SEDpage.DropdownSelection(SEDpage.getAssertType(), "Field");
		SEDpage.getChkboxNameStringwith().click();
		SEDpage.gettxtNameStartWith().sendKeys("CUR");
		SEDpage.getChkboxEvent().click();
		SEDpage.geFieldtbtnfilter().click();	
		//SEDpage.getListOfREcords(SEDpage.getEventlist());
		//SEDpage.getListOfREcords(SEDpage.getFieldnamelist());
		Thread.sleep(3000);
		SEDpage.getListOfREcords();
		Thread.sleep(2000);
		SEDpage.fetchSEDEventExport(true, "currentpage", "excel");
	}
	
	@Test(enabled=false)
	public void  TC_003_SED_EventReview() throws Throwable {	
		SEDpage=new SEDPage(driver);
		SEDpage.getSED().click();
		SEDpage.Switchframe(SEDpage.getFrame());
		Thread.sleep(2000);
		SEDpage.DropdownSelection(SEDpage.getAssertOwner(),"BRENTANDFPSO");
		Thread.sleep(1000);
		SEDpage.DropdownSelection(SEDpage.getAssertType(), "Field");
		Thread.sleep(1000);
		SEDpage.getFieldNamelink("CURLEW C");
		
	}		
	@Test(enabled=false)
	public void TC_004_SED_Wellbore_Search_Export() throws Throwable{
		SEDpage=new SEDPage(driver);
		SEDpage.getSED().click();
		SEDpage.Switchframe(SEDpage.getFrame());
		Thread.sleep(2000);
		SEDpage.DropdownSelection(SEDpage.getAssertOwner(),"BRENTANDFPSO");
		Thread.sleep(1000);
		SEDpage.DropdownSelection(SEDpage.getAssertType(), "Wellbore");
		Thread.sleep(10000);
		SEDpage.SelectfilterWellbore(true, true, true, "Cook");
		Thread.sleep(6000);
	    SEDpage.fetchSEDEventExport(true, "All", "excel");
		
	}
	@Test(enabled=false)
	public void TC_005_SED_Wellbore_AddtoCLuster() throws Throwable{
		SEDpage=new SEDPage(driver);
		SEDpage.getSED().click();
		SEDpage.Switchframe(SEDpage.getFrame());
		Thread.sleep(2000);
		SEDpage.DropdownSelection(SEDpage.getAssertOwner(),"BRENTANDFPSO");
		Thread.sleep(1000);
		SEDpage.DropdownSelection(SEDpage.getAssertType(), "Wellbore");
		Thread.sleep(20000);
		SEDpage.SelectfilterWellbore(true, true, true, "Cook");
		Thread.sleep(6000);
		SEDpage.getselectAllResults();
		SEDpage.Addtocluster("SED_WEllbore");
	}
	
	@Test(enabled=false)
	public void TC_006_SED_Wellbore_Search_Export() throws Throwable{
		SEDpage=new SEDPage(driver);
		SEDpage.getSED().click();
		SEDpage.Switchframe(SEDpage.getFrame());
		Thread.sleep(2000);
		SEDpage.DropdownSelection(SEDpage.getAssertOwner(),"BRENTANDFPSO");
		Thread.sleep(1000);
		SEDpage.DropdownSelection(SEDpage.getAssertType(),"Conduit");
		Thread.sleep(10000);
		SEDpage.SelectfilterWellbore(true, true, true, "");
		SEDpage.fetchSEDEventExport(true, "All", "excel");
	}
	
	@Test(enabled=false)
	public void TC_007_SED_Wellbore_Search_Export() throws Throwable{
		SEDpage=new SEDPage(driver);
		SEDpage.getSED().click();
		SEDpage.Switchframe(SEDpage.getFrame());
		Thread.sleep(2000);
		SEDpage.DropdownSelection(SEDpage.getAssertOwner(),"BRENTANDFPSO");
		Thread.sleep(1000);
		SEDpage.DropdownSelection(SEDpage.getAssertType(),"Conduit");
		Thread.sleep(10000);
		SEDpage.fetchSEDEventExport(true, "All", "excel");
	}
	
	@Test(enabled=false)
	public void TC_008_SED_Wellbore_Addtest() throws Throwable{
		SEDpage=new SEDPage(driver);
		SEDpage.getSED().click();
		SEDpage.Switchframe(SEDpage.getFrame());
		Thread.sleep(2000);
		SEDpage.DropdownSelection(SEDpage.getAssertOwner(),"BRENTANDFPSO");
		Thread.sleep(1000);
		SEDpage.DropdownSelection(SEDpage.getAssertType(),"Conduit");
		Thread.sleep(10000);
		SEDpage.getselectAllResults().click();
		Thread.sleep(10000);
		SEDpage.Addtocluster("SED_Conduit");
		
	}
	@Test(enabled=false)
	public void TC_008_SED_Field_viewAction() throws Throwable{
		SEDpage=new SEDPage(driver);
		SEDpage.getSED().click();
		SEDpage.Switchframe(SEDpage.getFrame());
		Thread.sleep(2000);
		SEDpage.DropdownSelection(SEDpage.getAssertOwner(),"BRENTANDFPSO");
		Thread.sleep(1000);
		SEDpage.DropdownSelection(SEDpage.getAssertType(), "Field");
		Thread.sleep(20000);
		SEDpage.getFieldNamelink("CURLEW C");
		SEDpage.switchWindows();
		EventsandReviews = new EventsandReviews(driver);
		EventsandReviews.btnViewActions();
		SEDpage.switchWindows();
		EventsandReviews.selectcheckbox(EventsandReviews.getchkboxOPEN());
		EventsandReviews.btnFilter().click();
		EventsandReviews.getEdit_img_ID0EG(EventsandReviews.getbtnEditImg());
		SEDpage.switchWindows();
		EventsandReviews.EditActionDetails(true,"All","Annulus top up","CT","Open" );
		EventsandReviews.gettxtCommmnents().clear();
		EventsandReviews.gettxtCommmnents().sendKeys("Test the sed");
		EventsandReviews.getbtnsave().click();
		
	}
	@Test(enabled=false)
	public void TC_009_SED_Wellbore_viewAction() throws Throwable{
		SEDpage=new SEDPage(driver);
		SEDpage.getSED().click();
		SEDpage.Switchframe(SEDpage.getFrame());
		Thread.sleep(2000);
		SEDpage.DropdownSelection(SEDpage.getAssertOwner(),"KINGFISHER");
		Thread.sleep(1000);
		SEDpage.DropdownSelection(SEDpage.getAssertType(), "Wellbore");
		Thread.sleep(20000);
		SEDpage.getWellborelink(SEDpage.getWellboreName() ,"KINGFISHER BP1.1");
		SEDpage.switchWindows();
		EventsandReviews = new EventsandReviews(driver);
		EventsandReviews.btnViewActions();
		SEDpage.switchWindows();
		EventsandReviews.selectcheckbox(EventsandReviews.getchkboxOPEN());
		EventsandReviews.btnFilter().click();
		EventsandReviews.getEdit_img_ID0EG(EventsandReviews.getbtnEditImg());
		SEDpage.switchWindows();
		EventsandReviews.EditActionDetails(true,"All","Annulus top up","CT","Open" );
		EventsandReviews.gettxtCommmnents().clear();
		EventsandReviews.gettxtCommmnents().sendKeys("Test_2 the sed");
		EventsandReviews.getbtnsave().click();
		
	}
	
	
	
	@Test(enabled=false)
	public void TC_010_SED_Wellbore_LinkExternalevent() throws InterruptedException{
		SEDpage=new SEDPage(driver);
		SEDpage.getSED().click();
		SEDpage.Switchframe(SEDpage.getFrame());
		Thread.sleep(2000);
		SEDpage.DropdownSelection(SEDpage.getAssertOwner(),"KINGFISHER");
		SEDpage.DropdownSelection(SEDpage.getAssertType(), "Wellbore");
		Thread.sleep(20000);
		SEDpage.getWellborelink(SEDpage.getWellboreName() ,"KINGFISHER BP1.1");
		SEDpage.switchWindows();
		EventsandReviews = new EventsandReviews(driver);
		EventsandReviews.getbtnLinkExternalEvent().click();;
		SEDpage.switchWindows();
		EventsandReviews.checkElement(EventsandReviews.getchkEDMDailySummary());
		EventsandReviews.checkElement(EventsandReviews.getchkEDMEvent());
		EventsandReviews.checkElement(EventsandReviews.getchkEDMHUD());
		EventsandReviews.checkElement(EventsandReviews.getchkEDMActivity());
		EventsandReviews.getbtnRetrieve().click();
//		SEDpage.switchWindows();
		Thread.sleep(2000);
		SEDpage.getselectAllResults().click();;
		EventsandReviews.getbtnImport().click();
		SEDpage.switchWindows();
		EventsandReviews.getbtnContinue().click();
	}
	
	
	
}
