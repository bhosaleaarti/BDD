package stepDefinition;

import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import DriverFactory.DriverManager;
import DriverFactory.DriverManagerFactory;
import DriverFactory.DriverType;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageFactory.ClientPage;
import pageFactory.ControlOfficerPage;
import pageFactory.LoginPage;
import pages.PomClick;

public class ControlOfficerSteps {

	public String getCurrentURL;
	DriverManager driverManager = DriverManagerFactory.getManager(DriverType.FIREFOX);
	public WebDriver driver = driverManager.getDriver();
	LoginPage login = new LoginPage(driver);
	ControlOfficerPage elements = new ControlOfficerPage(driver);

	@Given("^User is redirected to NYDFS application$")
	public void User_is_redirected_to_NYDFS_application() throws Throwable {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://10.0.0.92:8085/Login.aspx");
		String url = driver.getCurrentUrl();
		assertTrue(url.contains("Login.aspx"));

	}

	@And("^User enters valid credentials$")
	public void User_enters_valid_credentials() throws Throwable {
		Thread.sleep(2000);

		login.enter_Email("emmawatson@eqw.io");
		login.enter_Password("admin@123");

	}

	@When("^Clicks again on Login button$")
	public void Clicks_again_on_Login_button() throws Throwable {
		login.click_Loginbtn();

	}

	@Then("^User is able to view Control Officers Dash board$")
	public void User_is_able_to_view_Control_Officers_Dashboard() throws Throwable {
		String title = driver.getCurrentUrl();
		assertTrue(title.contains("AuditorDashboard"));
		String ControlOff = elements.LoggedUser.getText();
		assertTrue(ControlOff.contains("Emma Watson"));
		System.out.println(ControlOff);

	}

	@Given("^List of Task are dispalyed$")
	public void list_of_Task_are_dispalyed() throws Throwable {
		String entity = elements.BranchID.getText();
		assertTrue(entity.contains("Legal Entity Name: Axis Bank"));
	}

	@When("^user clicks on given arrow$")
	public void user_clicks_on_given_arrow() throws Throwable {

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		elements.evaluatenbtn.click();
		String LegalEN = elements.Branchname.getText();
		assertTrue(LegalEN.contains("Legal Entity Name: Axis Bank"));
		String Checklist = elements.Checklistname.getText();
		assertTrue(Checklist.contains("NYDFS Version3 Paid"));
	}

	@Then("^user is able to update and submit the task$")
	public void user_is_able_to_upadte_and_submit_the_task() throws Throwable {

		elements.Comments.sendKeys("cybersecurity program is based on the Covered Entity’s Risk ");
		// WebElement uploadElement = elements.Uploadbtn;
		// uploadElement.sendKeys("src\\test\\resources\\Files\\annual_report_2009.pdf");
		// elements.Uploadbtn1.click();

		PomClick objClick;
		objClick = new PomClick(driver);
		objClick.clickAns();

	}

	@And("^User Can view Submitted task$")
	public void User_Can_view_Submitted_task() throws Throwable {

		Thread.sleep(3000);
		elements.Savebtn.click();
		Thread.sleep(3000);

	}

	@Given("^Control Officer is on Dashboard$")
	public void Control_Officer_is_on_Dashboard() throws Throwable {

		Thread.sleep(4000);
	}

	@When("^Control Officer Clicks on Logout Button$")
	public void Control_Officer_Clicks_on_Logout_Button() throws Throwable {

		Thread.sleep(3000);
		elements.Logoutbtn.click();

	}

	@Then("^Control Officer should be able to redirect on Login page$")
	public void Control_Officer_should_be_able_to_redirect_on_Login_page() throws Throwable {
		Thread.sleep(2000);
		getCurrentURL = driver.getCurrentUrl();
		assertTrue(getCurrentURL.contains("Login.aspx"));

	}

	@After()
	public void killBrowser(Scenario scenario) {
		if (scenario.isFailed()) {
			scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
			scenario.write("Failed");
		}

		// driver.quit();
	}
}
