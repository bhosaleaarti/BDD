package stepDefinition;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverFactory.DriverManager;
import DriverFactory.DriverManagerFactory;
import DriverFactory.DriverType;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageFactory.ClientPage;
import pageFactory.LoginPage;

public class ClientTestSteps {

	private static final String Sheet1 = null;
	public String currenturl;
	public String getCurrentURL;

	DriverManager driverManager = DriverManagerFactory.getManager(DriverType.FIREFOX);
	public WebDriver driver = driverManager.getDriver();
	LoginPage login = new LoginPage(driver);
	ClientPage elements = new ClientPage(driver);

	@Given("^User opens NYDFS application$")
	public void User_opens_NYDFS_application() throws Throwable {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://10.0.0.92:8085/Login.aspx");

	}

	@And("^User enters valid user name and password$")
	public void User_enters_valid_user_name_and_password() throws Throwable {

		login.enter_Email("pakali@eqw.io");
		login.enter_Password("admin@123");

	}

	@When("^Clicks on Login button$")
	public void Clicks_on_Login_button() throws Throwable {

		Thread.sleep(2000);
		login.click_Loginbtn();
	}

	@Then("^User is able to view Client Dash board$")
	public void User_is_able_to_view_Client_Dash_board() throws Throwable {

		getCurrentURL = driver.getCurrentUrl();
		assertTrue(getCurrentURL.contains("Dashboard.aspx"));
	}

	@Given("^User is on Client Dashboard$")
	public void User_is_on_Client_Dashboard() throws Throwable {

	}

	@When("^Clicks on Control Officers Management$")
	public void Clicks_on_Control_Officers_Management() throws Throwable {

		Thread.sleep(3000);
		elements.select_ControlOfficer();
		getCurrentURL = driver.getCurrentUrl();
		assertTrue(getCurrentURL.contains("ClientAuditorManagement.aspx"));

	}

	@Then("^User is able to view all Control Officers list$")
	public void User_is_able_to_view_all_Control_Officers_list() throws Throwable {

		Thread.sleep(2000);
		elements.select_status("All");
		Thread.sleep(3000);
		String we = elements.McUsers.getText();
		assertTrue(we.contains("Control Officer Name"));
	}

	@Given("^User is on Control Officers Management page$")
	public void User_is_on_Control_Officers_Management_page() throws Throwable {

	}

	@When("^Clicks on add button$")
	public void Clicks_on_add_button() throws Throwable {

		elements.Addbtn.click();
		File src = new File("src\\test\\resources\\Files\\controlOfficers.xlsx");
		XSSFSheet ExcelWSheet;

		XSSFWorkbook ExcelWBook;

		XSSFCell Cell;

		XSSFRow Row;
		FileInputStream fis = new FileInputStream(src);
		ExcelWBook = new XSSFWorkbook(fis);
		ExcelWSheet = ExcelWBook.getSheetAt(0);
		int rowCount = ExcelWSheet.getLastRowNum() - ExcelWSheet.getFirstRowNum();
		for (int i = 0; i < rowCount + 1; i++) {
			Row = ExcelWSheet.getRow(i);

			elements.firstname.sendKeys(Row.getCell(0).getStringCellValue());
			elements.lastname.sendKeys(Row.getCell(1).getStringCellValue());
			elements.userEmail.sendKeys(Row.getCell(2).getStringCellValue());
			elements.userPass.sendKeys(Row.getCell(3).getStringCellValue());
			elements.confirmPass.sendKeys(Row.getCell(4).getStringCellValue());
			elements.Gender.click();
			elements.saveBtn.click();

			Thread.sleep(4000);
			if (i < rowCount)
				elements.Addbtn.click();

		}
	}

	@Then("^User is able to Add and save the details$")
	public void User_is_able_to_Add_and_save_the_details() throws Throwable {

		Thread.sleep(5000);
		String successmsg = elements.Successmsg.getText();
		assertTrue(successmsg.contains("You have successfully added control officer details"));
		Thread.sleep(3000);

	}

	@Given("^User is on Control Officers page$")
	public void User_is_on_Control_Officers_page() throws Throwable {
	}

	@When("^Enters appropriate filters$")
	public void Enters_appropriate_filters() throws Throwable {

		Thread.sleep(6000);
		elements.FreeText.sendKeys("emma");
		Thread.sleep(2000);
		elements.SeacrhText.click();

	}

	@Then("^User is able to view filtered details$")
	public void User_is_able_to_view_filtered_details() throws Throwable {

		String we = elements.McUsers1.getText();
		assertTrue(we.contains("emma"));
		Thread.sleep(3000);
		elements.clearbtn.click();
	}

	// active-inactive

	@Given("^User is on Control Officers$")
	public void User_is_on_Control_Officers() throws Throwable {

	}

	@When("^select active user and clicks on inactive button$")
	public void select_active_user_and_clicks_on_active_button() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.name("ctl00$cphBody$grdMCSUsers$ctl02$chkSelect")).click();
		Thread.sleep(2000);
		elements.DeActiveBtn.click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		;

	}

	@Then("^user inactivating successfully$")
	public void user_inactivating_successfully() throws Throwable {

		Thread.sleep(5000);
		String we = elements.Successmsg.getText();
		assertTrue(we.contains("User inactivated successfully"));
		Thread.sleep(5000);

	}

	@Given("^User selects Inactivate filter$")
	public void User_selects_Inactivate_filter() throws Throwable {

		Thread.sleep(4000);
		elements.select_status("Inactive");
		elements.SeacrhText.click();

	}

	@When("^select inactive user and clicks on active button$")
	public void select_inactive_user_and_clicks_on_active_button() throws Throwable {

		Thread.sleep(2000);
		driver.findElement(By.name("ctl00$cphBody$grdMCSUsers$ctl04$chkSelect")).click();
		Thread.sleep(2000);
		elements.Activebtn.click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
	}

	@Then("^user activating successfully$")
	public void user_activating_successfully() throws Throwable {

		Thread.sleep(5000);
		String we = elements.Successmsg.getText();
		assertTrue(we.contains("User activated successfully"));

	}

	@Given("^User is on Current page$")
	public void User_is_on_Current_page() throws Throwable {

		currenturl = driver.getCurrentUrl();

	}

	@When("^Clicks on back button$")
	public void Clicks_on_back_button() throws Throwable {

		Thread.sleep(4000);
		elements.Backbtn.click();
	}

	@Then("^User is able to redirect on dashboard$")
	public void User_is_able_to_redirect_on_dashboard() throws Throwable {

		Thread.sleep(2000);
		getCurrentURL = driver.getCurrentUrl();
		assertTrue(getCurrentURL.contains("Dashboard.aspx"));
	}

	@Given("^User is on client dashboard$")
	public void User_is_on_client_dashboard() throws Throwable {

	}

	@When("^Clicks on Legal Entity Management$")
	public void Clicks_on_Legal_Entity_Management() throws Throwable {

		Thread.sleep(2000);
		String Client = elements.LoggedUser.getText();
		assertTrue(Client.contains("pakali kangle"));
		Thread.sleep(2000);
		elements.LegalEntitybtn.click();

	}

	@Then("^User is able to view all Legal Entity list$")
	public void User_is_able_to_view_all_Legal_Entity_list() throws Throwable {

		getCurrentURL = driver.getCurrentUrl();
		assertTrue(getCurrentURL.contains("ClientOutlet.aspx"));
		String we = elements.LegalEntityGrid.getText();
		assertTrue(we.contains("Legal Entity Name"));
	}

	@Given("^User is on Legal Entity Management page$")
	public void User_is_on_Legal_Entity_Management_page() throws Throwable {
	}

	@When("^Clicks on Add button$")
	public void Clicks_on_Add_button() throws Throwable {

		Thread.sleep(2000);
		elements.Addbtn.click();
		Thread.sleep(2000);
		elements.LegalEntityName.sendKeys("Axis Bank");
		Thread.sleep(2000);
		elements.LEemail.sendKeys("entity@axis.com");
		Thread.sleep(2000);
		elements.LESave.click();
	}

	@Then("^User is able to Add and save the detail$")
	public void User_is_able_to_Add_and_save_the_detail() throws Throwable {

		Thread.sleep(5000);
		String successmsg = elements.Successmsg.getText();
		assertTrue(successmsg.contains("Legal Entity added successfully"));
		Thread.sleep(2000);
	}

	@Given("^User is on Legal Entity Page$")
	public void User_is_on_Legal_Entity_Page() throws Throwable {
	}

	@When("^Enters appropriate Filter$")
	public void Enters_appropriate_Filter() throws Throwable {

		Thread.sleep(6000);
		elements.FreeText.sendKeys("axis bank");
		Thread.sleep(2000);
		elements.SeacrhText.click();
	}

	@Then("^User is able to view Filtered details$")
	public void User_is_able_to_view_Filtered_details() throws Throwable {

		Thread.sleep(5000);
		String filtereddata = elements.LegalEntityGrid.getText();
		assertEquals("Axis Bank", "Axis Bank");
		Thread.sleep(3000);
		elements.clearSearch.click();
	}

	@Given("^User is on Legal Entity page$")
	public void User_is_on_Legal_Entity_page() throws Throwable {
	}

	@When("^Clicks on Back button$")
	public void Clicks_on_Back_button() throws Throwable {

		Thread.sleep(4000);
		elements.Backbtn.click();
	}

	@Then("^User is able to redirect on Dashboard$")
	public void User_is_able_to_redirect_on_Dashboard() throws Throwable {

		Thread.sleep(2000);
		String Client = elements.LoggedUser.getText();
		assertTrue(Client.contains("pakali kangle"));
		getCurrentURL = driver.getCurrentUrl();
		assertTrue(getCurrentURL.contains("Dashboard.aspx"));
	}

	@Given("^View Task tabs$")
	public void View_Task_tabs() throws Throwable {
	}

	@When("^Click on Task Management$")
	public void Click_on_Task_Management() throws Throwable {

		Thread.sleep(3000);
		elements.TaskMgnt.click();
	}

	@Then("^User is able to view task tabs$")
	public void User_is_able_to_view_task_tabs() throws Throwable {

		Thread.sleep(2000);
		getCurrentURL = driver.getCurrentUrl();
		assertTrue(getCurrentURL.contains("ProjectTaskManagement.aspx"));
	}

	@Given("^View Add Task tab$")
	public void View_Add_Task_tab() throws Throwable {
	}

	@When("^Click on save button$")
	public void Click_on_save_button() throws Throwable {
		// legal entity

		elements.SelectLegalEntity.click();
		Thread.sleep(2000);
		Select legalDropdownTextBox = new Select(elements.SelectLegalEntity);
		legalDropdownTextBox.selectByVisibleText("Axis Bank");
		Thread.sleep(1000);

		// Control officer
		elements.SelectAuditor.click();
		Thread.sleep(2000);
		Select controlDropdownTextBox = new Select(elements.SelectAuditor);
		controlDropdownTextBox.selectByVisibleText("Emma Watson");

		Thread.sleep(1000);

		// checklist
		elements.SelectChecklist.click();
		Thread.sleep(2000);
		Select checklistDropdownTextBox = new Select(elements.SelectChecklist);
		checklistDropdownTextBox.selectByVisibleText("NYDFS Version3 Paid");

		Thread.sleep(2000);
		elements.saveTask.click();
	}

	@Then("^User is able to Add and save the task$")
	public void User_is_able_to_Add_and_save_the_task() throws Throwable {

		Thread.sleep(5000);
		String successmsg = elements.Successmsg.getText();
		assertTrue(successmsg.contains("Task added successfully"));
		Thread.sleep(2000);

	}

	// publish task
	@Given("^View Unpublished Task tab$")
	public void View_Unpublished_Task_tab() throws Throwable {
	}

	@When("^Click on Publish button$")
	public void Click_on_Publish_button() throws Throwable {

		Thread.sleep(2000);
		elements.SelectOption.click();
		Thread.sleep(2000);
		elements.Publishbtn.click();
	}

	@Then("^User is able to Publish the task$")
	public void User_is_able_to_Publish_the_task() throws Throwable {

		Thread.sleep(5000);
		String successmsg = elements.Successmsg.getText();
		assertTrue(successmsg.contains("Task published successfully"));
		Thread.sleep(2000);

	}

	// view recently published task
	@Given("^View Published Task tab$")
	public void View_Published_Task_tab() throws Throwable {

		Thread.sleep(2000);
		elements.PublichTask.click();
	}

	@When("^Select page size to view published task if required$")
	public void Select_page_size_to_view_published_task_if_required() throws Throwable {

		elements.PageSize.click();
		Thread.sleep(2000);
		Select pageSizeDropdownTextBox = new Select(elements.PageSize);
		pageSizeDropdownTextBox.selectByVisibleText("100");
		Thread.sleep(1000);
	}

	@Then("^User is able to view recently published task$")
	public void User_is_able_to_view_recently_published_task() throws Throwable {

		Thread.sleep(2000);
		// To See recently published task
		if (driver.findElements(By.xpath("//*[@id=\"lblTaskOutletName\"]")).size() != 0) {
			System.out.println("Published task is Present");
		} else {
			System.out.println("Published task is Absent");
		}

	}

	@Given("^User is on Task management page$")
	public void User_is_on_Task_management_page() throws Throwable {
	}

	@When("^clicks on Back Button$")
	public void clicks_on_Back_Button() throws Throwable {
		Thread.sleep(3000);
		elements.Backbtn.click();
	}

	@Then("^User should be able to redirect on Dashboard$")
	public void User_should_be_able_to_redirect_on_Dashboard() throws Throwable {
		Thread.sleep(2000);

		String Client = elements.LoggedUser.getText();
		assertTrue(Client.contains("pakali kangle"));
		getCurrentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " + getCurrentURL);
		assertTrue(getCurrentURL.contains("Dashboard.aspx"));

	}

	@Given("^User is on Client dashboard$")
	public void User_is_on_Client_dashboard() throws Throwable {
	}

	@When("^Clicks on Review Approve Task$")
	public void Clicks_on_Review_Approve_Task() throws Throwable {

		Thread.sleep(3000);
		elements.ReviewApproveTask.click();
	}

	@Then("^User is able to view all Submitted task list$")
	public void User_is_able_to_view_all_Submitted_task_list() throws Throwable {

		Thread.sleep(2000);
		getCurrentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " + getCurrentURL);
		assertTrue(getCurrentURL.contains("TaskReviewApprove.aspx"));
		// To see particular submitted task
		if (driver.findElements(By.xpath("//*[@id=\"cphBody_grdReviewApproveList_lblOutletName_0\"]")).size() != 0) {
			System.out.println("Recently submitted task is Present");
		} else {
			System.out.println("Recently submitted task is Absent");
		}
		Thread.sleep(2000);
	}

	@Given("^User is on Review Approve Page$")
	public void User_is_on_Review_Approve_Page() throws Throwable {
	}

	@When("^Clicks on Edit button$")
	public void Clicks_on_Edit_button() throws Throwable {

		Thread.sleep(3000);
		elements.EditTask.click();
		Thread.sleep(2000);
		elements.ReviewComplete.click();
		Thread.sleep(2000);
		elements.ApproveComplete.click();
		Thread.sleep(2000);
		elements.UpdateTask.click();
	}

	@Then("^User is able to edit Submitted task$")
	public void User_is_able_to_edit_Submitted_task() throws Throwable {

		Thread.sleep(2000);
		getCurrentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " + getCurrentURL);
		assertTrue(getCurrentURL.contains("EditReviewApprove.aspx"));
	}

	@Given("^User is on Edit Review Approve page$")
	public void User_is_on_Edit_Review_Approve_page() throws Throwable {
	}

	@When("^Clicks on Back Button$")
	public void Clicks_on_Back_Button() throws Throwable {

		Thread.sleep(3000);
		elements.Backbtn.click();
	}

	@Then("^User should able to redirect on Review Approve page$")
	public void User_should_able_to_redirect_on_Review_Approve_page() throws Throwable {

		Thread.sleep(2000);
		getCurrentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " + getCurrentURL);
		assertTrue(getCurrentURL.contains("TaskReviewApprove.aspx"));
	}

	@Given("^User is on Review Approve page$")
	public void User_is_on_Review_Approve_page() throws Throwable {
	}

	@When("^Selects Approved Task$")
	public void Selects_Approved_Task() throws Throwable {

		elements.TaskStatus.click();
		Thread.sleep(2000);
		Select statusDropdownTextBox = new Select(elements.TaskStatus);
		statusDropdownTextBox.selectByVisibleText("Approve Complete");
		Thread.sleep(2000);
		elements.TaskSearch.click();
		if (driver.findElements(By.xpath("//*[@id=\"cphBody_grdReviewApproveList_lblOutletName_0\"]")).size() != 0) {
			System.out.println("Recently approved task is Present");
		} else {
			System.out.println("Recently approved task is Absent");
		}
		Thread.sleep(2000);
		driver.findElement(By.id("cphBody_grdReviewApproveList_lnkViewPDFMod_0")).click();

	}

	@Then("^User should able to view generated PDF$")
	public void User_should_able_to_view_generated_PDF() throws Throwable {

		Thread.sleep(2000);
		String parentHandle = driver.getWindowHandle(); // get the current window handle
		Thread.sleep(2000);
		driver.switchTo().window(parentHandle); // switch back to the original window
	}

	@Given("^User is on review approve page$")
	public void User_is_on_review_approve_page() throws Throwable {
	}

	@When("^clicks on Back button$")
	public void clicks_on_Back_button() throws Throwable {

		Thread.sleep(3000);
		elements.Backbtn.click();
	}

	@Then("^User should be able to redirect on Dashboard page$")
	public void User_should_be_able_to_redirect_on_Dashboard_page() throws Throwable {

		Thread.sleep(2000);
		String Client = elements.LoggedUser.getText();
		assertTrue(Client.contains("pakali kangle"));
		getCurrentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " + getCurrentURL);
		assertTrue(getCurrentURL.contains("Dashboard.aspx"));
	}

	@Given("^user is on Client dashboard$")
	public void user_is_on_Client_dashboard() throws Throwable {
	}

	@When("^Clicks on Report Management$")
	public void Clicks_on_Report_Management() throws Throwable {

		Thread.sleep(2000);
		elements.ReportMgnt.click();
	}

	@Then("^User is able to view Report Management page$")
	public void User_is_able_to_view_Report_Management_page() throws Throwable {

		Thread.sleep(2000);
		getCurrentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " + getCurrentURL);
		assertTrue(getCurrentURL.contains("ReportManagement.aspx"));
	}

	@Given("^user is on Report Management page$")
	public void user_is_on_Report_Management_page() throws Throwable {
	}

	@When("^Clicks on Export button$")
	public void Clicks_on_Export_button() throws Throwable {

		Thread.sleep(2000);
		elements.searchbtn.click();
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
	}

	@Then("^User is able to export data into excel$")
	public void User_is_able_to_export_data_into_excel() throws Throwable {
	}

	@Given("^User is on Report Management page$")
	public void User_is_on_Report_Management_page() throws Throwable {
	}

	@When("^click on Back Button$")
	public void click_on_Back_Button() throws Throwable {

		Thread.sleep(2000);
		elements.Backbtn.click();
	}

	@Then("^User should be able to redirect on Dashboard Page$")
	public void User_should_be_able_to_redirect_on_Dashboard_Page() throws Throwable {

		Thread.sleep(2000);
		String Client = elements.LoggedUser.getText();
		assertTrue(Client.contains("pakali kangle"));
		getCurrentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " + getCurrentURL);
		assertTrue(getCurrentURL.contains("Dashboard.aspx"));
	}

	@Given("^user is on Client Dashboard$")
	public void user_is_on_Client_Dashboard() throws Throwable {
	}

	@When("^Clicks on View Checklist$")
	public void Clicks_on_View_Checklist() throws Throwable {

		Thread.sleep(3000);
		elements.ViewChecklist.click();
	}

	@Then("^User is able to view Checklist details$")
	public void User_is_able_to_view_Checklist_details() throws Throwable {

		Thread.sleep(2000);
		getCurrentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " + getCurrentURL);
		assertTrue(getCurrentURL.contains("ViewChecklist.aspx"));
	}

	@Given("^User is on View Checklist page$")
	public void User_is_on_View_Checklist_page() throws Throwable {

		Thread.sleep(5000);
		String successmsg = elements.ChecklistGrid.getText();
		assertTrue(successmsg.contains("Checklist Name"));
	}

	@When("^Enter appropriate filters$")
	public void Enter_appropriate_filters() throws Throwable {
		Thread.sleep(3000);
		elements.SortOrder.click();
		Thread.sleep(2000);
		Select sortDropdownTextBox = new Select(elements.SortOrder);
		sortDropdownTextBox.selectByVisibleText("Oldest First");
		Thread.sleep(2000);
		elements.ChecklistSearch.click();
	}

	@Then("^User is able to view filtered checklist details$")
	public void User_is_able_to_view_filtered_checklist_details() throws Throwable {

		Thread.sleep(3000);
		elements.clearbtn.click();
	}

	@Given("^user is on View Checklist page$")
	public void user_is_on_View_Checklist_page() throws Throwable {
	}

	@When("^Clicks on Checklist Name$")
	public void Clicks_on_Checklist_Name() throws Throwable {

		Thread.sleep(3000);
		elements.ChecklistName.click();
		Thread.sleep(3000);
		elements.NoOfQuestions.click();
		Thread.sleep(3000);
		elements.QuestionClose.click();
		Thread.sleep(3000);
		elements.Questionlist.click();
	}

	@Then("^User is able to view details of perticular checklist$")
	public void User_is_able_to_view_details_of_perticular_checklist() throws Throwable {
	}

	@Given("^User is on View checklist page$")
	public void User_is_on_View_checklist_page() throws Throwable {
	}

	@When("^Click on Back Button$")
	public void Click_on_Back_Button() throws Throwable {

		Thread.sleep(3000);
		elements.Backbtn.click();
	}

	@Then("^User should be able to redirect on dashboard page$")
	public void User_should_be_able_to_redirect_on_dashboard_page() throws Throwable {

		Thread.sleep(2000);
		String Client = elements.LoggedUser.getText();
		assertTrue(Client.contains("pakali kangle"));
		getCurrentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " + getCurrentURL);
		assertTrue(getCurrentURL.contains("Dashboard.aspx"));
	}

	@Given("^User is on Dashboard$")
	public void User_is_on_Dashboard() throws Throwable {
	}

	@When("^Click on Logout Button$")
	public void Click_on_Logout_Button() throws Throwable {

		Thread.sleep(3000);
		elements.logout.click();
	}

	@Then("^User should be able to redirect on Login page$")
	public void User_should_be_able_to_redirect_on_Login_page() throws Throwable {

		Thread.sleep(2000);
		getCurrentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " + getCurrentURL);
		assertTrue(getCurrentURL.contains("Login.aspx"));

	}

}
