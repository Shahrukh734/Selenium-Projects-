package com.pack.common.SED.tests;

import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.SED.pageObject.EventsandReviews;
import com.pack.common.pageobjects.Dream.fetchingReports;

public class EventsandReviewsTest extends TestBaseSetup{
	
	public fetchingReports fetchingreports;
	public EventsandReviews events;
	
	@Test(enabled=true)
	public void  TC_001_SED_EventReviewField() throws Throwable {	
		events=new EventsandReviews(driver);
		events.getSED().click();
		events.Switchframe(events.getFrame());
		Thread.sleep(20000);
		events.DropdownSelection(events.getAssertOwner(),"BRENTANDFPSO");
		Thread.sleep(1000);
		events.DropdownSelection(events.getAssertType(), "Field");
		Thread.sleep(1000);
		events.getFieldNamelink("CURLEW C");
		events.switchWindows();
		Thread.sleep(2000);
		events.btnAddEvent().click();
		Thread.sleep(2000);
		events.switchWindows();
		events.addEvent("M","Production","FTHP","test123","Testing");
		events.getbtnSubmit().click();
		
		
		}
	
	@Test(enabled=true)
	public void  TC_002_SED_EventReviewWellbore() throws Throwable {	
		events=new EventsandReviews(driver);
		events.getSED().click();
		events.Switchframe(events.getFrame());
		Thread.sleep(2000);
		events.DropdownSelection(events.getAssertOwner(),"BRENTANDFPSO");
		Thread.sleep(1000);
		events.DropdownSelection(events.getAssertType(), "Wellbore");
		Thread.sleep(10000);
		events.getFieldNamelink("COOK P1");
		events.switchWindows();
		Thread.sleep(2000);
		events.btnAddEvent().click();
		Thread.sleep(2000);
		events.switchWindows();
		events.addEvent("M","Production","FTHP","test123","Testing");
		events.getbtnSubmit().click();
		}
	
	@Test(enabled=true)
	public void  TC_003_SED_EventReviewConduit() throws Throwable {	
		events=new EventsandReviews(driver);
		events.getSED().click();
		events.Switchframe(events.getFrame());
		Thread.sleep(2000);
		events.DropdownSelection(events.getAssertOwner(),"BRENTANDFPSO");
		Thread.sleep(1000);
		events.DropdownSelection(events.getAssertType(), "Conduit");
		//Thread.sleep(10000);
		/*events.getFieldNamelink("");
		events.switchWindows();
		Thread.sleep(2000);
		events.btnAddEvent().click();
		Thread.sleep(2000);
		events.switchWindows();
		events.addEvent("M","Production","FTHP","test123","Testing");
		events.getbtnSubmit().click();*/
		}
	
	@Test(enabled=true)
	public void  TC_004_SED_EventReviewWellbore() throws Throwable {	
		events=new EventsandReviews(driver);
		events.getSED().click();
		events.Switchframe(events.getFrame());
		Thread.sleep(2000);
		events.DropdownSelection(events.getAssertOwner(),"BRENTANDFPSO");
		Thread.sleep(1000);
		events.DropdownSelection(events.getAssertType(), "Wellbore");
		Thread.sleep(10000);
		events.getFieldNamelink("COOK P1");
		events.switchWindows();
		Thread.sleep(2000);
		//events.editEventImage(0);
		events.switchWindows();
		events.checkBox(true, events.getchkbxOnlyCreatedBy());
    	events.checkBox(true, events.getchkbxOnlyUpdatedBy());
    	Thread.sleep(2000);
		events.eventFilter("Production","Babula.Parida","Previous Year");
		events.btnFilter();
		}
}

