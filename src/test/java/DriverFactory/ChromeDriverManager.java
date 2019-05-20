package DriverFactory;



import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeDriverManager extends DriverManager {

   
   
    @Override
    public void stopService() {
       quitDriver();
    }

    
	@Override
    public void createDriver() {
      	System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }
}


