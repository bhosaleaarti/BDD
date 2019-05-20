package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ClientPage {
	
WebDriver driver;
	
	public ClientPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.ID, using = "cphBody_ancClientAuditorManagement") 
	private WebElement contolOfficerIcon;
	
	
	@FindBy(how = How.ID, using = "ddlStatus") 
	private WebElement status;
	
	@FindBy(how = How.ID, using = "cphBody_btnSearch")
	public WebElement searchbtn;
	
	@FindBy(how = How.ID, using = "cphBody_grdMCSUsers")
	public WebElement McUsers;
	
	@FindBy(how = How.ID, using = "cphBody_btnAdd")
	public WebElement Addbtn;
	
	@FindBy(how = How.ID, using = "cphBody_txtFName")
	public WebElement firstname;
	
	@FindBy(how = How.ID, using = "cphBody_txtLName")
	public WebElement lastname;
	

	@FindBy(how = How.ID, using = "cphBody_txtEmail")
	public WebElement userEmail;
	
	@FindBy(how = How.ID, using = "cphBody_txtPassword")
	public WebElement userPass;
	
	@FindBy(how = How.ID, using = "cphBody_txtConfirmPassword")
	public WebElement confirmPass;
	
	@FindBy(how = How.ID, using = "cphBody_btnMPSave")
	public WebElement saveBtn;
	
	@FindBy(how = How.ID, using = "cphBody_rblGender_0")
	public WebElement Gender;
	
	
	@FindBy(how = How.ID, using = "cphBody_txtFreeText")
	public WebElement FreeText;
	
	@FindBy(how = How.ID, using = "cphBody_btnSearch")
	public WebElement SeacrhText;
	
	
	@FindBy(how = How.ID, using = "cphBody_btnClear")
	public WebElement clearbtn;
	
	
	@FindBy(how = How.ID, using = "cphBody_grdMCSUsers")
	public WebElement McUsers1;
	
	
	@FindBy(how = How.ID, using = "ctl00$cphBody$grdMCSUsers$ctl02$chkSelect")
	public WebElement selectUser;
	
	
	@FindBy(how = How.ID, using = "cphBody_btnDeActivate")
	public WebElement DeActiveBtn;
	
	
	@FindBy(how = How.ID, using = "divSuccess")
	public WebElement Successmsg;
	
	
	@FindBy(how = How.ID, using = "ctl00$cphBody$ddlStatus")
	public WebElement DeActivatestatus;
	
	
	@FindBy(how = How.ID, using = "ctl00$cphBody$grdMCSUsers$ctl04$chkSelect")
	public WebElement SelectuserToActivate;
	
	@FindBy(how = How.ID, using = "cphBody_btnActivate")
	public WebElement Activebtn;
	
	@FindBy(how = How.ID, using = "ancHome")
	public WebElement Backbtn;
	
	@FindBy(how = How.ID, using = "lblLoggedUserDetails")
	public WebElement LoggedUser;
	
	@FindBy(how = How.ID, using = "cphBody_ancClientOutletMgt")
	public WebElement LegalEntitybtn;
	
	@FindBy(how = How.ID, using = "cphBody_txtOutletNm")
	public WebElement LegalEntityName ;
	
	@FindBy(how = How.ID, using = "cphBody_grdClientOutlet")
	public WebElement LegalEntityGrid ;
	
	@FindBy(how = How.ID, using = "cphBody_txtEmailAddress")
	public WebElement LEemail ;
	
	@FindBy(how = How.ID, using = "cphBody_btnSave")
	public WebElement LESave ;
	
	@FindBy(how = How.ID, using = "cphBody_btnClearSearch")
	public WebElement clearSearch ;
	
	
	@FindBy(how = How.ID, using = "cphBody_ancProjectTaskManagement")
	public WebElement TaskMgnt ;
	
	@FindBy(how = How.ID, using = "mpeddlBranch")
	public WebElement SelectLegalEntity ;
	
	@FindBy(how = How.ID, using = "mpeddlAuditor")
	public WebElement SelectAuditor ;
	
	@FindBy(how = How.ID, using = "ddlChecklist")
	public WebElement SelectChecklist ;
	
	@FindBy(how = How.NAME, using = "ctl00$cphBody$taskTabContainer$tbpnlTaskUnPublished$grdUnPublished$ctl02$chkSelect")
	public WebElement SelectOption ;
	
	@FindBy(how = How.ID, using = "lnkPublish")
	public WebElement Publishbtn ;
		
	
	@FindBy(how = How.ID, using = "btnMPSave")
	public WebElement saveTask ;
	
	@FindBy(how = How.ID, using = "lblHeaderPublished")
	public WebElement PublichTask ;
	
	@FindBy(how = How.ID, using = "ddlPublished")
	public WebElement PageSize ;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"lblTaskOutletName\"]")
	public WebElement PublishedTask ;
	
	@FindBy(how = How.ID, using = "cphBody_ancTaskRAkMgt")
	public WebElement ReviewApproveTask;
	
	@FindBy(how = How.ID, using = "cphBody_grdReviewApproveList_lnkEditRATask_0")
	public WebElement EditTask;
	
	@FindBy(how = How.ID, using = "chkReviewComplete")
	public WebElement ReviewComplete;
	

	@FindBy(how = How.ID, using = "chkApproveComplete")
	public WebElement ApproveComplete;
	
	@FindBy(how = How.ID, using = "cphBody_lnkBtnUpdateReviewApproveList")
	public WebElement UpdateTask;
	
	@FindBy(how = How.ID, using = "ddlRAStatus")
	public WebElement TaskStatus;
	
	@FindBy(how = How.ID, using = "cphBody_btnRASearch")
	public WebElement TaskSearch;
	
	@FindBy(how = How.ID, using = "cphBody_ancReportMgt")
	public WebElement ReportMgnt;
	
	@FindBy(how = How.ID, using = "cphBody_ancViewChecklist")
	public WebElement ViewChecklist;
	
	@FindBy(how = How.ID, using = "cphBody_grdChecklist")
	public WebElement ChecklistGrid;
	
	@FindBy(how = How.ID, using = "cphBody_ddlSortOrder")
	public WebElement SortOrder;
	
	@FindBy(how = How.ID, using = "cphBody_btnChecklistSearch")
	public WebElement ChecklistSearch;
	
	@FindBy(how = How.ID, using = "cphBody_grdChecklist_lnkChecklistName_0")
	public WebElement ChecklistName;
	
	@FindBy(how = How.ID, using = "cphBody_grdSectionQuestionView_LinkButton2_0")
	public WebElement NoOfQuestions;
	
	@FindBy(how = How.ID, using = "cphBody_lnkQuestionViewDetailsClose")
	public WebElement QuestionClose;
	
	@FindBy(how = How.ID, using = "cphBody_lnkCloseChecklistDetails")
	public WebElement Questionlist;

	@FindBy(how = How.ID, using = "UserLoginView_MCSLoginStatus")
	public WebElement logout;
	
	
	public void select_ControlOfficer() {
		contolOfficerIcon.click();
	}
		
	public void select_status(String control) {
		
		Select StatusDropdownTextBox = new Select(status);
		StatusDropdownTextBox.selectByVisibleText(control);
		searchbtn.click();
	}
	
    public void select_status() {
		
	}

}
