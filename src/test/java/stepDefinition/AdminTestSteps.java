package stepDefinition;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import DriverFactory.DriverManager;
import DriverFactory.DriverManagerFactory;
import DriverFactory.DriverType;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageFactory.AdminPage;
import pageFactory.LoginPage;


public class AdminTestSteps {

	public String getCurrentURL;
	DriverManager driverManager = DriverManagerFactory.getManager(DriverType.FIREFOX);
	public WebDriver driver = driverManager.getDriver();
	LoginPage login = new LoginPage(driver);
	AdminPage elements = new AdminPage(driver);

	@Given("^Open NYDFS application$")
	public void open_NYDFS_application() throws Throwable {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://10.0.0.92:8085/Login.aspx");

		String url = driver.getCurrentUrl();
		assertTrue(url.contains("Login.aspx"));

	}

	@And("^Enters valid user name and password$")
	public void enters_valid_user_name_and_password() throws Throwable {

		Thread.sleep(2000);
		login.enter_Email("admin@nydfs.com");
		Thread.sleep(1000);
		login.enter_Password("admin@123");

	}

	@When("^User clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
		Thread.sleep(2000);
		login.loginbtn.click();
	}

	@Then("^User is able to view Admin dashboard$")
	public void user_is_able_to_view_Admin_dashboard() throws Throwable {

		String title = driver.getCurrentUrl();
		assertTrue(title.contains("Dashboard"));
		String admin = elements.LoggedUser.getText();
		assertTrue(admin.contains("NYDFS Admin"));

	}

	@Given("^User is on Admin Dashboard$")
	public void user_is_on_Admin_Dashboard() throws Throwable {

	}

	@When("^Clicks on client Management$")
	public void clicks_on_client_Management() throws Throwable {

		Thread.sleep(2000);
		elements.ClientMgnt.click();
		Thread.sleep(2000);
		String url1 = driver.getCurrentUrl();
		assertTrue(url1.contains("ClientUserManagement.aspx"));

	}

	@Then("^User is able to view all client list$")
	public void user_is_able_to_view_all_client_list() throws Throwable {

		Thread.sleep(2000);
		String viewList = elements.ClientMgntGrid.getText();
		assertTrue(viewList.contains("Username"));

	}

	@Given("^User is on client management dashboard$")
	public void User_is_on_client_management_dashboard() throws Throwable {
	}

	@When("^User enters appropriate filters$")
	public void user_enters_appropriate_filters() throws Throwable {
		Thread.sleep(2000);
		elements.SearchText.sendKeys("Pakali");
		;
		Thread.sleep(2000);
		elements.Searchbtn.click();
	}

	@Then("^User is able to view filtered data$")
	public void user_is_able_to_view_filtered_data() throws Throwable {
		Thread.sleep(2000);
		elements.Clearbtn.click();
	}

	@Given("^User is on Client Management$")
	public void user_is_on_Client_Management() throws Throwable {
	}

	@When("^select active admin and clicks on inactive button$")
	public void select_active_admin_and_clicks_on_inactive_button() throws Throwable {
		Thread.sleep(3000);

		elements.SelectUser.click();
		Thread.sleep(3000);
		elements.Deactivatebtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		String successmsg = elements.Successmsg.getText();
		assertTrue(successmsg.contains("User inactivated successfully"));

	}

	@Then("^admin inactivating successfully$")
	public void admin_inactivating_successfully() throws Throwable {
	}

	@Given("^User clicks on Inactivate filter$")
	public void user_clicks_on_Inactivate_filter() throws Throwable {
		Thread.sleep(3000);
		elements.select_status("Inactive");
		Thread.sleep(3000);

	}

	@When("^select inactive admin and clicks on active button$")
	public void select_inactive_admin_and_clicks_on_active_button() throws Throwable {
		Thread.sleep(3000);
		elements.SelectUser1.click();
		Thread.sleep(3000);
		elements.Activatebtn.click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		String successmsg = elements.Successmsg.getText();
		assertTrue(successmsg.contains("Client user activated successfully"));

	}

	@Then("^admin activating successfully$")
	public void admin_activating_successfully() throws Throwable {
		Thread.sleep(2000);
		elements.Clearbtn.click();
	}

	@Given("^User is on Client page$")
	public void User_is_on_Client_page() throws Throwable {
	}

	@When("^Clicks on edit button$")
	public void Clicks_on_edit_button() throws Throwable {
		Thread.sleep(2000);
		elements.Editbtn.click();
	}

	@Then("^User is able to edit and save the details$")
	public void User_is_able_to_edit_and_save_the_details() throws Throwable {
		Thread.sleep(2000);
		Select status = new Select(elements.SelectPlan);
		status.selectByVisibleText("Paid");
		Thread.sleep(2000);
		elements.Savebtn.click();

		Thread.sleep(5000);
		String successmsg = elements.Successmsg.getText();
		assertTrue(successmsg.contains("User updated successfully"));

	}

	@Given("^User is on client management page$")
	public void User_is_on_client_management_page() throws Throwable {

	}

	@When("^User clicks on back button$")
	public void user_clicks_on_back_button() throws Throwable {
		Thread.sleep(4000);
		elements.Backbtn.click();
		Thread.sleep(2000);
	}

	@Then("^User is able to redirect on dashboard page$")
	public void user_is_able_to_redirect_on_dashboard_page() throws Throwable {
		String url = driver.getCurrentUrl();
		assertTrue(url.contains("Dashboard.aspx"));

	}

	@Given("^User is on admin dashboard$")
	public void user_is_on_admin_dashboard() throws Throwable {

	}

	@When("^Clicks on Trail Checklist$")
	public void clicks_on_Trail_Checklist() throws Throwable {
		Thread.sleep(2000);
		elements.Traillist.click();
		Thread.sleep(2000);
	}

	@Then("^User is able to view all trail checklist details$")
	public void user_is_able_to_view_all_trail_checklist_details() throws Throwable {
		String url = driver.getCurrentUrl();
		assertTrue(url.contains("ViewChecklist.aspx"));
		String viewList = elements.TraillistGrid.getText();
		assertTrue(viewList.contains("Checklist Name"));

	}

	@Given("^User is on Trial Checklist Page$")
	public void user_is_on_Trial_Checklist_Page() throws Throwable {
	}

	@When("^Apply appropriate Filter$")
	public void apply_appropriate_Filter() throws Throwable {
		Thread.sleep(2000);
		elements.SearchText.sendKeys("version1");
	}

	@Then("^User is able to view filtered details for trail checklist$")
	public void user_is_able_to_view_filtered_details_for_trail_checklist() throws Throwable {

		Thread.sleep(2000);
		elements.SearchChecklist.click();
		Thread.sleep(2000);
		elements.Clearbtn.click();
	}

	@Given("^User is on Trial Management page$")
	public void User_is_on_Trial_Management_page() throws Throwable {

	}

	@When("^Clicks on Checklist name$")
	public void Clicks_on_Checklist_name() throws Throwable {
		Thread.sleep(2000);
		elements.ChecklistName.click();
	}

	@Then("^User is able view trail checklist details$")
	public void User_is_able_view_trail_checklist_details() throws Throwable {
		Thread.sleep(2000);
		elements.NoOfQuestions.click();
		Thread.sleep(2000);
		elements.CloseQuestions.click();
		Thread.sleep(2000);
		elements.CloseDetails.click();
	}

	@Given("^User is on Trial Checklist page$")
	public void user_is_on_Trial_Checklist_page() throws Throwable {

	}

	@When("^clicks on back button$")
	public void clicks_on_back_button() throws Throwable {
		Thread.sleep(4000);
		elements.Backbtn.click();
		Thread.sleep(2000);
	}

	@Then("^user is able to redirect on dashboard$")
	public void user_is_able_to_redirect_on_dashboard() throws Throwable {
		String url = driver.getCurrentUrl();
		assertTrue(url.contains("Dashboard.aspx"));
	}

	@Given("^User is on admin Dashboard$")
	public void user_is_on_admin_Dashboard() throws Throwable {

	}

	@When("^Clicks on Paid Checklist$")
	public void clicks_on_Paid_Checklist() throws Throwable {
		Thread.sleep(2000);
		elements.PaidChecklist.click();
		Thread.sleep(2000);
	}

	@Then("^User is able to view all paid checklist details$")
	public void user_is_able_to_view_all_paid_checklist_details() throws Throwable {
		String url = driver.getCurrentUrl();
		assertTrue(url.contains("ViewChecklist.aspx"));
		String viewList = elements.PaidChecklistGrid.getText();
		assertTrue(viewList.contains("Checklist Name"));

	}

	@Given("^User is on Paid Checklist Page$")
	public void user_is_on_Paid_Checklist_Page() throws Throwable {

	}

	@When("^Apply appropriate Filters$")
	public void apply_appropriate_Filters() throws Throwable {
		Thread.sleep(2000);
		elements.SearchText.sendKeys("version4");
	}

	@Then("^User is able to view filtered details for paid checklist$")
	public void user_is_able_to_view_filtered_details_for_paid_checklist() throws Throwable {
		Thread.sleep(2000);
		elements.SearchChecklist.click();
		Thread.sleep(2000);
		elements.Clearbtn.click();
	}

	@Given("^User is on Paid Checklist page$")
	public void user_is_on_Paid_Checklist_page() throws Throwable {

	}

	@When("^User click on back button$")
	public void User_click_on_back_button() throws Throwable {
		Thread.sleep(4000);
		elements.Backbtn.click();
		Thread.sleep(2000);
	}

	@Then("^user should be able to redirect on dashboard$")
	public void user_should_be_able_to_redirect_on_dashboard() throws Throwable {
		String url = driver.getCurrentUrl();
		assertTrue(url.contains("Dashboard.aspx"));
	}

	@Given("^User is on Admin Dashboard page$")
	public void User_is_on_Admin_Dashboard_page() throws Throwable {

	}

	@When("^User clicks on Logout Button$")
	public void user_clicks_on_Logout_Button() throws Throwable {
		Thread.sleep(2000);
		elements.logout.click();
	}

	@Then("^User able to redirect on Login page$")
	public void user_able_to_redirect_on_Login_page() throws Throwable {
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		assertTrue(url.contains("Login.aspx"));
		// driver.quit();
	}
}
