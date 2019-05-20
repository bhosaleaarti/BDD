package DriverFactory;



import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager {
	 @Override
	    public void stopService() {
	       quitDriver();
	    }

	    
		@Override
	    public void createDriver() {
	      	System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\Drivers\\geckodriver.exe");
	        driver = new FirefoxDriver();
	    }

}
