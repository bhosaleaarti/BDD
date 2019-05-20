package DriverFactory;

public class DriverManagerFactory {
	
	
	public static DriverManager getManager(DriverType type) {

        DriverManager driverManager;

        switch (type) {
            case CHROME:
            case Chrome:
            case chrome:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
            case Firefox:
            case firefox:
                driverManager = new FirefoxDriverManager();
                break;
            default:
                driverManager = new FirefoxDriverManager();
                break;
        }
        return driverManager;

    }

}
