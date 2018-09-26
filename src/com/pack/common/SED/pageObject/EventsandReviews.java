package com.pack.common.SED.pageObject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;



public class EventsandReviews {
	
	
	private   WebDriver driver;
	public  static String winHandleBefore;

	public EventsandReviews(WebDriver driver) {
		
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(factory, this);
		
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	


//Event Filter Only Event of Group 
@FindBy(xpath="//*[@id='MainContentPlaceHolder_cboEventGroup']")
private  WebElement EventGroup;

public WebElement EventGroup(){
	
	EventGroup.click();
	return EventGroup;
	
} 
//Only Event of Group ComboBox locator 
@FindBy(xpath="//*[@id='MainContentPlaceHolder_ddlEventGroup']")
private  WebElement EventGroupComboBox;
 

//Event Filter Only Event of Type 
@FindBy(xpath="//*[@id='MainContentPlaceHolder_cboEventType']")
private  WebElement EventType;

public WebElement EventType(){	
	EventType.click();
	return EventType;
	
} 
//Only Event of Type ComboBox locator 
@FindBy(xpath="//*[@id='MainContentPlaceHolder_ddlEventType']/option")
private  WebElement EventTypeComboBox;


//Only Created By
@FindBy(xpath="//*[@id='MainContentPlaceHolder_cboCreatedBy']")
private  WebElement CreatedBy;

public WebElement CreatedBy(){
	CreatedBy.click();
	return CreatedBy;
	
} 

//only Updated By
@FindBy(xpath="//*[@id='MainContentPlaceHolder_cboUpdatedBy']")
private  WebElement UpdatedBy;

public WebElement UpdatedBy(){
	
	UpdatedBy.click();
	return UpdatedBy;
	
} 

//only Owned By
@FindBy(xpath="//*[@id='MainContentPlaceHolder_cboOwnedBy']")
private  WebElement OwnedBy;

public WebElement OwnedBy(){
	
	OwnedBy.click();
	return OwnedBy;
	
} 

  // Owned By Combo Box Locator
@FindBy(xpath="//*[@id='MainContentPlaceHolder_ddlOwnedBy']/option")
private  WebElement ddlOwnedBy;

 // Date Filter Period(ChkBox)
   
@FindBy(xpath="//*[@id='MainContentPlaceHolder_usrctrlDateFilterOptions_chkEventDate']")
private  WebElement chkEventDate;

public WebElement chkEventDate(){
	
	chkEventDate.click();
	return chkEventDate;
	
} 
  // EventPeriod ComboBox

@FindBy(xpath="//*[@id='MainContentPlaceHolder_usrctrlDateFilterOptions_ddlEventPeriod']/option")
private  WebElement ddlEventPeriod;
 
 // Date TextBox  From & To
 
public EventsandReviews selectDate(String startDate, String endDate) {

	selectStartDate.sendKeys(startDate);
	selectEndDate.sendKeys(endDate);

	return this;
}
  @FindBy(xpath = "//*[@id='MainContentPlaceHolder_usrctrlDateFilterOptions_txtStartDateRange']")
 private WebElement selectStartDate;

 @FindBy(xpath = "//*[@id='MainContentPlaceHolder_usrctrlDateFilterOptions_txtEndDateRange']")
 private WebElement selectEndDate;

 // Filter Btn  
 
 @FindBy(xpath="//*[@id='MainContentPlaceHolder_btnFilter']")
 private  WebElement btnFilter;

 public WebElement btnFilter(){
 	
	 btnFilter.click();
 	return btnFilter;
 	
 } 
  
 // Include Events wellbore(Check) 
 @FindBy(xpath="//*[@id='MainContentPlaceHolder_chkWellbore']")
 private  WebElement chkWellbore;

 public WebElement chkWellbore(){
 	
	 chkWellbore.click();
 	return chkWellbore;
 	
 } 
 
 // Conduit(Check) 
 @FindBy(xpath="//*[@id='MainContentPlaceHolder_chkConduit']")
 private  WebElement chkConduit;

 public WebElement chkConduit(){
 	
	 chkConduit.click();
 	return chkConduit;
 	
 } 
 
  // Add Event Btn 
  @FindBy(xpath="//*[@id='MainContentPlaceHolder_btnAddEvent']")
 private  WebElement btnAddEvent;

 public WebElement btnAddEvent(){
 	
	 btnAddEvent.click();
 	return btnAddEvent;
 	
 } 
 
 // Add Field review Btn 
 @FindBy(xpath="//*[@id='MainContentPlaceHolder_btnAddWellReview']")
 private  WebElement btnAddWellReview;

 public WebElement btnAddWellReview(){
 	
	 btnAddWellReview.click();
 	return btnAddWellReview;
 	
 } 
 
 // view Actions Btn  
  @FindBy(xpath="//*[@id='MainContentPlaceHolder_btnViewActions']")
 private  WebElement btnViewActions;

 public WebElement btnViewActions(){
 	
	 btnViewActions.click();
 	return btnViewActions;
 	
 } 
 
 // Show Active Radio 
 @FindBy(xpath="//*[@id='MainContentPlaceHolder_rblStatus_0']")
 private  WebElement Active_Radio;

 public WebElement Active_Radio(){
 	
	 Active_Radio.click();
 	return Active_Radio;
 	
 } 
 
//Show Archived Radio 
@FindBy(xpath="//*[@id='MainContentPlaceHolder_rblStatus_1']")
private  WebElement Archived_Radio;

public WebElement Archived_Radio(){
	
	Archived_Radio.click();
	return Archived_Radio;
	
} 

 // Document Colmn Attach link(1st row) 

@FindBy(xpath="//*[@id='tblSearchResults']/tbody/tr[1]/td[9]/a")
private  WebElement Attach_link;

public WebElement Attach_link(){
	
	Attach_link.click();
	return Attach_link;
	
} 
 // Audit trail link (1st row) -   //*[@id="tblSearchResults"]/tbody/tr[1]/td[10]/a  
@FindBy(xpath="//*[@id='tblSearchResults']/tbody/tr[1]/td[10]/a")
private  WebElement Audit_trail;

public WebElement Audit_trail(){
	
	Audit_trail.click();
	return Audit_trail;
	
} 
// Remove link [@id="tblSearchResults"]/tbody/tr[1]/td[11]/a

@FindBy(xpath="//*[@id='tblSearchResults']/tbody/tr[1]/td[11]/a")
private  WebElement Remove_link;

public WebElement Remove_link(){
	
	Remove_link.click();
	return Remove_link;
	
} 

 // rec_img - //*[@id="rec_img_{generate-id()}"]   // need 2 make it unique  
@FindBy(xpath="//*[@id='rec_img_{generate-id()}']a")
private  WebElement rec_img_link;

public WebElement rec_img_link(){
	
	rec_img_link.click();
	return rec_img_link;
	
}  




public int DropdownSelection(WebElement Element, String Text) throws InterruptedException{	
	Select dropDown  = new Select(Element);
	List<WebElement> elementCount = dropDown.getOptions();
	int Count= elementCount.size();
	Thread.sleep(1000);
	dropDown.selectByVisibleText(Text);
	return Count;	
	                           } 


//view Action 
// Action Status 
@FindBy(xpath="//*[@id='MainContentPlaceHolder_lstStatus_1']")
private  WebElement chkboxExecuted;

@FindBy(xpath="//*[@id='MainContentPlaceHolder_lstStatus_0']")
private  WebElement chkboxOPEN;

@FindBy(xpath="//*[@id='MainContentPlaceHolder_lstStatus_2']")
private  WebElement chkboxDroped;

@FindBy(xpath="//*[@id='tblSearchResults']/tbody/tr/td[2]/img")
private  List<WebElement> btnEditImg;


public WebElement getchkboxOPEN(){
	return chkboxOPEN;
	
}
public WebElement getchkboxExecuted(){
	return chkboxExecuted;
	
}
public WebElement getchkboxDroped(){
	return chkboxDroped;
	
}

public List<WebElement> getbtnEditImg(){
	return btnEditImg;
	
}
//Edit Action Details





//id="MainContentPlaceHolder_ddlStatus"
@FindBy(xpath="//*[@id='MainContentPlaceHolder_ddlActions']")
private  WebElement Grouptype;

@FindBy(xpath="//*[@id='MainContentPlaceHolder_lstActionType']")
private  WebElement Actiontype;

@FindBy(xpath="//*[@id='MainContentPlaceHolder_ddlResource']")
private  WebElement RdbResource;

@FindBy(xpath="//*[@id='MainContentPlaceHolder_txtResources']")
private  WebElement txtresource;

@FindBy(xpath="//*[@id='MainContentPlaceHolder_txtComments']")
private  WebElement txtCommmnents;

@FindBy(xpath="//*[@id='MainContentPlaceHolder_ddlStatus']")
private  WebElement drpdnstatus;

@FindBy(xpath="//*[@id='MainContentPlaceHolder_btnSaveAction']")
private  WebElement btnsave;

//SED import External events

@FindBy(xpath="//*[@id='MainContentPlaceHolder_chkEDMEvent']")
private  WebElement chkEDMEvent;

@FindBy(xpath="//*[@id='MainContentPlaceHolder_chkEDMActivity']")
private  WebElement chkEDMActivity;


@FindBy(xpath="//*[@id='MainContentPlaceHolder_chkEDMHUD']")
private  WebElement chkEDMHUD;


@FindBy(xpath="//*[@id='MainContentPlaceHolder_chkECDeferment']")
private  WebElement chkECDeferment;


@FindBy(xpath="//*[@id='MainContentPlaceHolder_chkECPackerStatus']")
private  WebElement chkECPackerStatus;


@FindBy(xpath="//*[@id='MainContentPlaceHolder_chkEDMDailySummary']")
private  WebElement chkEDMDailySummary;

@FindBy(xpath="//*[@id='MainContentPlaceHolder_btnLinkExternalEvent']")
private  WebElement btnLinkExternalEvent;

@FindBy(xpath="//*[@id='MainContentPlaceHolder_btnRetrieve']")
private  WebElement btnRetrieve;

@FindBy(xpath="//*[@id='MainContentPlaceHolder_btnImport']")
private  WebElement btnImport;


@FindBy(xpath="//*[@id='MainContentPlaceHolder_btnContinue']")
private  WebElement btnContinue;
//*[@id="MainContentPlaceHolder_btnContinue"]


public WebElement getbtnImport(){
	return btnImport;
}
public WebElement getbtnContinue(){
	return btnContinue;
}
public WebElement getbtnRetrieve(){
	return btnRetrieve;
}

public WebElement getbtnLinkExternalEvent(){
	return btnLinkExternalEvent;
}

//*[@id="MainContentPlaceHolder_btnLinkExternalEvent"]


public WebElement getchkEDMEvent(){
	return chkEDMEvent;
}

public WebElement getchkEDMActivity(){
	return chkEDMActivity;
}


public WebElement getchkEDMHUD(){
	return chkEDMHUD;
}

public WebElement getchkECDeferment(){
	return chkECDeferment;
}

public WebElement getchkECPackerStatus(){
	return chkECPackerStatus;
}

public WebElement getchkEDMDailySummary(){
	return chkEDMDailySummary;
}

public WebElement getlstDateType(){
    return lstDateType;
      }




public WebElement getbtnsave(){
	return btnsave;
}

public WebElement getGrouptype(){
	return Grouptype;
}
public WebElement getActiontype(){
	return Actiontype;
}
public WebElement getRdbResource(){
	return RdbResource;
}
public WebElement gettxtresource(){
	return txtresource;
}
public WebElement gettxtCommmnents(){
	return txtCommmnents;
}
public WebElement getdrpdnstatus(){
	return drpdnstatus;
}

public void EditActionDetails(boolean Resource, String GroupType,String Actiontype,String Resousetype,String Status ) throws InterruptedException{
	DropdownSelection(Grouptype,GroupType);
	DropdownSelection(getActiontype(),Actiontype);
	if (Resource=true){
		DropdownSelection(RdbResource,Resousetype);
	}

	DropdownSelection(getdrpdnstatus(),Status);		
}
  public void selectcheckbox(WebElement Element){
	boolean text=Element.isSelected();
  if (text!=true){
   Element.click();
    System.out.println("Click operation Occured Successfully");
      }
     System.out.println("All ready seslected no need to select Again");
     }

public void getEdit_img_ID0EG(List<WebElement> Element){
	 for(int i=0;i<Element.size();){
	  String Details=Element.get(i).getText();
	       Element.get(i).click();
		   System.out.println(Details);
		    break;
	            }
          }
public void checkElement(WebElement Element){
	
	boolean text=Element.isSelected();
	if (text !=true)
	{
		Element.click();
	}	
}


@FindBy(xpath="//*[@id='WebHeader_MenuInternaln2']")
private WebElement SED;

public WebElement getSED(){
	return SED;
}
@FindBy(name="ctl00_ctl00_BodyContent_radPaneRight")
private WebElement frame;

public WebElement getFrame(){
    return frame;
      }
//Switch_frame 
		public void Switchframe(WebElement Element){
		
			List<WebElement> frame = driver.findElements(By.tagName("iframe"));
			
			for(int i=0;i<frame.size();i++){
			System.out.println(frame.get(i).toString());
			                               }
			driver.switchTo().frame(Element);
		      }
		@FindBy(xpath="//*[@id='MainContentPlaceHolder_ddlAssetOwner']")
		private WebElement AssertOwner;

		public WebElement getAssertOwner(){
			return AssertOwner;
		}
		
		@FindBy(xpath="//*[@id='MainContentPlaceHolder_ddlAssetType']")
		private WebElement AssertType;

		public WebElement getAssertType(){
		    return AssertType;
		      }
		public void getFieldNamelink(String Text){
		 	 for(int i=0;i<Fieldnamelist.size();){
			    String Deatails=Fieldnamelist.get(i).getText();
			    if (Deatails.equalsIgnoreCase(Text))
			    	Fieldnamelist.get(i).click();
				    System.out.println(Deatails);
				    break;
			            }
		           }
		

@FindBy(xpath = "//*[@id='tblSearchResults']/tbody/tr/td/a")
private List<WebElement> Fieldnamelist;

public EventsandReviews switchWindows() {
	
	// Switch to new window opened
	for (String winHandle : driver.getWindowHandles()) {
		WebDriver currentWindow = driver.switchTo().window(winHandle);

		System.out.println(currentWindow);
	}
	return this;
	}



public void addEvent(String dateType,String eventTypeGroup,String eventType,String owner,String remarks) throws InterruptedException {
	 DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");
	 //get current date time with Date()
	 Date date = new Date();
	 // Now format the date
	 String enterdate= dateFormat.format(date);
	 // Print the Date
	txtDate.clear();
	txtDate.sendKeys(enterdate);
	DropdownSelection(getlstDateType(),dateType);
	DropdownSelection(getlstEventTypeGroup(),eventTypeGroup);
	Thread.sleep(2000);
	DropdownSelection(getlstEventType(),eventType);
	DropdownSelection(getlstOwner(),owner);
	txtRemarks.sendKeys(remarks);
	}

public void getFieldName(){
	
	ArrayList<String> obtainedList = new ArrayList<>(); 
	List<WebElement> elementList= driver.findElements(By.xpath("//*[@id='tblSearchResults']/tbody/tr/td"));
	for(WebElement we:elementList){
	   obtainedList.add(we.getText());
	   Collections.sort(obtainedList);
	   System.out.println(obtainedList);
	}
	
	
       }


@FindBy(id="MainContentPlaceHolder_txtdate")
private  WebElement txtDate;

public WebElement gettxtDate(){
    return txtDate;
      }
@FindBy(id= "MainContentPlaceHolder_cboCreatedBy")
private WebElement chkbxOnlyCreatedBy;

@FindBy(id= "MainContentPlaceHolder_cboUpdatedBy")
private WebElement chkbxOnlyUpdatedBy;


@FindBy(id= "MainContentPlaceHolder_ddlEventGroup")
private WebElement listOnlyEventofGroup;


@FindBy(id= "MainContentPlaceHolder_ddlEventType")
private WebElement listOnlyEventType;

@FindBy(id= "MainContentPlaceHolder_ddlOwnedBy")
private WebElement listOnlyOwnedBy;

@FindBy(id= "MainContentPlaceHolder_usrctrlDateFilterOptions_ddlEventPeriod")
private WebElement listPeriod;


public WebElement getchkbxOnlyCreatedBy(){
   return chkbxOnlyCreatedBy;
     }


public WebElement getchkbxOnlyUpdatedBy(){
   return chkbxOnlyUpdatedBy;
     }


public WebElement getlistOnlyEventofGroup(){
   return listOnlyEventofGroup;
     }

public WebElement getlistOnlyEventType(){
   return listOnlyEventType;
     }

public WebElement getlistOnlyOwnedBy(){
   return listOnlyOwnedBy;
     }

public WebElement getlistPeriod(){
   return listPeriod;
     }

public void checkBox(boolean check,WebElement element) {

	 	
boolean text=element.isSelected();
	if (text!=check)
		element.click();
	}

public void eventFilter(String onlyEventGroup,String onlyOwnedBy,String period) throws InterruptedException {

	 DropdownSelection(getlistOnlyEventofGroup(),onlyEventGroup);
	// DropdownSelection(getlistOnlyEventType(),onlyEventType);	
	 DropdownSelection(getlistOnlyOwnedBy(),onlyOwnedBy);
	 DropdownSelection(getlistPeriod(),period);
}

public void editEventImage(int num) {
	List<WebElement> event = driver.findElements(By.xpath("//*[@id='tblSearchResults']/tbody/tr/td[1]"));

			for(int i = 0; i < event.size(); ++i) {
			//System.out.println(elementsRoot.get(i).getText());	
			  event.get(num).click();
			}
			 
	}


@FindBy(id= "MainContentPlaceHolder_ddlEventGroup")
private WebElement lstEventTypeGroup;

public WebElement getlstEventTypeGroup(){
    return lstEventTypeGroup;
      }

@FindBy(id= "MainContentPlaceHolder_lstEventType")
private WebElement lstEventType;

public WebElement getlstEventType(){
    return lstEventType;
      }

@FindBy(id= "MainContentPlaceHolder_ddlOwner")
private WebElement lstOwner;
public WebElement getlstOwner(){
    return lstOwner;
      }

@FindBy(id= "MainContentPlaceHolder_txtREMARKS")
private WebElement txtRemarks;

public WebElement gettxtRemarks(){
    return txtRemarks;
      }

@FindBy(id= "MainContentPlaceHolder_btnSubmit")
private WebElement btnSubmit;

public WebElement getbtnSubmit(){
    return btnSubmit;
      }


@FindBy(id= "MainContentPlaceHolder_ddlDateFormat")
private WebElement lstDateType;



}

