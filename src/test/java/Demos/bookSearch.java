package Demos;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.*;
public class bookSearch {

	@Test
	public void main() {
		// Open Amazon site
		WebDriver driver = utilities.LaunchBrowser.open();
		driver.get("https://www.amazon.com/");
	
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Appium Book");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER); 
		driver.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/span/a/div/img"	)).click();
        List<WebElement> ratingelements = driver.findElements(By.tagName("span"));
      
        String rtxt = null;
        for (int i = 1; i < ratingelements.size(); i++)
        {
            try {
            String ratingtxt = ratingelements.get(i).getAttribute("class");
            String rt = "acr-average-stars-rating-text";
               if(ratingtxt.equals("a-icon-alt")){
            	  System.out.println(ratingelements.get(i).getAttribute("innerText"));
            	   break;
               }   
            } catch (Exception e) {
               continue;
            }
        }
        driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
       
        System.out.println(driver.findElement(By.xpath("//*[@id='hlb-subcart']/div[1]/span/span[2]")).getText());
     }
}