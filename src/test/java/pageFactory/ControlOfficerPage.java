package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ControlOfficerPage {

	
WebDriver driver;
	
	public ControlOfficerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(how = How.ID, using = "lblLoggedUserDetails")
	public WebElement LoggedUser;

	@FindBy(how = How.ID, using = "BranchNameID")
	public WebElement BranchID;


	@FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/div[2]/div[3]/a/span")
	public WebElement evaluatenbtn;

	@FindBy(how = How.ID, using = "cphBody_IDBranchName")
	public WebElement Branchname;

	@FindBy(how = How.ID, using = "cphBody_IDChecklistName")
	public WebElement Checklistname;

	@FindBy(how = How.ID, using = "cphBody_ctl00_ctl01_txtComments")
	public WebElement Comments;
	
	@FindBy(how = How.ID, using = "cphBody_ctl00_ctl01_FileUpload1")
	public WebElement Uploadbtn;

	@FindBy(how = How.ID, using = "cphBody_ctl00_ctl01_btnUpload")
	public WebElement Uploadbtn1;
	
	@FindBy(how = How.NAME, using = "ctl00$cphBody$btnSaveAuditData")
	public WebElement Savebtn;
	
	@FindBy(how = How.ID, using = "lblHeaderSubittedTask")
	public WebElement SubmittedTask;
	
	@FindBy(how = How.ID, using = "UserLoginView_MCSLoginStatus")
	public WebElement Logoutbtn;
	
}
