package util;

import org.openqa.selenium.WebDriver;

public class DriverContext {

	public static WebDriver driver;

public static WebDriver getDriver() {
	return driver;
	
}

public static void setDriver(WebDriver driver) {
	DriverContext.driver = driver;
}

}
