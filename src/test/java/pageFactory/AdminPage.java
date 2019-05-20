package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {

WebDriver driver;
	
	public AdminPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "lblLoggedUserDetails")
	public WebElement LoggedUser;
	
	@FindBy(how = How.ID, using = "cphBody_ancClientUserMngt")
	public WebElement ClientMgnt;
	
	@FindBy(how = How.ID, using = "cphBody_grdClientUsers")
	public WebElement ClientMgntGrid;
	
	@FindBy(how = How.ID, using = "cphBody_txtFreeText")
	public WebElement SearchText;
	
	@FindBy(how = How.ID, using = "cphBody_btnSearch")
	public WebElement Searchbtn;
	
	@FindBy(how = How.ID, using = "cphBody_btnClear")
	public WebElement Clearbtn;
	
	@FindBy(how = How.NAME, using = "ctl00$cphBody$grdClientUsers$ctl02$chkSelect")
	public WebElement SelectUser;
	
	@FindBy(how = How.NAME, using = "ctl00$cphBody$ddlStatus")
	public WebElement Status;
	
	@FindBy(how = How.ID, using = "divSuccess")
	public WebElement Successmsg;
	
	@FindBy(how = How.ID, using = "cphBody_btnDeActivate")
	public WebElement Deactivatebtn;
	
	@FindBy(how = How.NAME, using = "ctl00$cphBody$grdClientUsers$ctl02$chkSelect")
	public WebElement SelectUser1;
	
	@FindBy(how = How.ID, using = "cphBody_btnActivate")
	public WebElement Activatebtn;
	
	@FindBy(how = How.ID, using = "cphBody_grdClientUsers_hyperEdit_0")
	public WebElement Editbtn;
	
	@FindBy(how = How.NAME, using = "ctl00$cphBody$DropDownListChecklistType")
	public WebElement SelectPlan;
	
	@FindBy(how = How.ID, using = "cphBody_btnMPSave")
	public WebElement Savebtn;
	
	@FindBy(how = How.ID, using = "ancHome")
	public WebElement Backbtn;
	
	@FindBy(how = How.ID, using = "cphBody_TrialChecklist")
	public WebElement Traillist;
	
	@FindBy(how = How.ID, using = "cphBody_grdChecklist")
	public WebElement TraillistGrid;
	
	@FindBy(how = How.ID, using = "cphBody_btnChecklistSearch")
	public WebElement SearchChecklist;
	
	@FindBy(how = How.ID, using = "cphBody_grdChecklist_lnkChecklistName_0")
	public WebElement ChecklistName;
	
	@FindBy(how = How.ID, using = "cphBody_grdSectionQuestionView_LinkButton2_0")
	public WebElement NoOfQuestions;
	
	@FindBy(how = How.ID, using = "cphBody_lnkQuestionViewDetailsClose")
	public WebElement CloseQuestions;
	
	@FindBy(how = How.ID, using = "cphBody_lnkCloseChecklistDetails")
	public WebElement CloseDetails;
	
	@FindBy(how = How.ID, using = "cphBody_PaidChecklist")
	public WebElement PaidChecklist;
	
	@FindBy(how = How.ID, using = "cphBody_grdChecklist")
	public WebElement PaidChecklistGrid;
	
	@FindBy(how = How.ID, using = "UserLoginView_MCSLoginStatus")
	public WebElement logout;
	
public void select_status(String control) {
		
		Select StatusDropdownTextBox = new Select(Status);
		StatusDropdownTextBox.selectByVisibleText(control);
		Searchbtn.click();
	}
	
}
