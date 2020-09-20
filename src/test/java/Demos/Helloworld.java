package Demos;

import org.openqa.selenium.WebDriver;

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, this is my selenium project");
		
		WebDriver driver;
		driver = utilities.LaunchBrowser.open();
		driver.get("https://www.amazon.com/");
	}

}