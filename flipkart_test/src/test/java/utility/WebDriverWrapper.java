package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverWrapper {
	private WebDriverWrapper() {
		
	}
	private static WebDriver driver=new ChromeDriver();
	
	public static WebDriver getDriver() {
		return driver;
	}

}
