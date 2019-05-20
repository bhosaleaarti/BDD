package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

 WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.ID, using = "UserName") 
	private WebElement userName;
	
	
	@FindBy(how = How.ID, using = "Password") 
	private WebElement password;
	
	@FindBy(how = How.ID, using = "cphBody_LoginControl_LoginButton")
	public WebElement loginbtn;
	
	
	public void enter_Email(String email) {
		userName.sendKeys(email);
	}
	
	public void enter_Password(String Pass) {
		password.sendKeys(Pass);
	}
 
	public void click_Loginbtn() {
		loginbtn.click();
		
	}
 
	
}





