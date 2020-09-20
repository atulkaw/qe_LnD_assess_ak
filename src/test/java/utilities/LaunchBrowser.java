package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	//return a webdriver object
	public static WebDriver open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Software\\chromedriver.exe");
		return new ChromeDriver();
		
	}
	
}
