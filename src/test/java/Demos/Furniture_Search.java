package Demos;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;

public class Furniture_Search {

	@Test
	public void main() {
		// Open Wayfair sit
		WebDriver driver = utilities.LaunchBrowser.open();
		driver.get("https://www.wayfair.com/");
		driver.manage().window().maximize();
		
		
		// Select Furniture
		driver.findElement(By.xpath("//body/div[@id='doc3']/div/header[@id='store_nav']/nav/ul/li[1]/a[1]")).click();
		
		
		new Furniture_Search().HomePage(driver);
		new Furniture_Search().Finalpurchase(driver);
		
		//Close Browser
		
	}
	
	public void HomePage(WebDriver driver) { 
		
		//Select sectional living room Furniture
		driver.findElement(By.linkText("Living Room Furniture")).click();
		driver.findElement(By.xpath("//*[@id='45982']/div/article/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id='45982']/div/article/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id='45982']/div/article/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id='45982']/div/article/div[2]/div/ul/li[12]/a/div/div/img")).click();
	
	
	}
	
	public void Finalpurchase(WebDriver driver) { 
		
				//Print Rating
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
				driver.findElement(By.xpath("//*[@id='45982']/div/div/div[2]/div/div[1]/div/a/div[2]/div")).click();
				//driver.findElement(By.xpath("//*[@id='bd']/div[2]/div[2]/div[1]/div/div/div/a/div[2]/div[2]/h2")).click();
				
				driver.findElement(By.xpath("//*[@id='bd']/div[2]/div[2]/div[1]/div/div/div/a/div[2]/div[2]/h2")).click();
				
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				 // Store all currently open tabs in tabs
				 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				 			 
				 // Switch newly open Tab
				 driver.switchTo().window(tabs.get(1));
					
			
				String rating = driver.findElement(By.xpath("//*[@id='bd']/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/header/div/button/span/span[1]")).getText();
				System.out.println("Product Rating - " + rating);
				
				//Add item to cart
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//*[@id='btn-add-to-cart']")).click();
				
				//Print total amount
				
				String price = driver.findElement(By.xpath("//*[@id='bd']/div[1]/div[2]/div/div[2]/div/div[1]/div[2]/div/div/span")).getText();
				System.out.println("Total Amount - " + price);
				
		
	}

}
