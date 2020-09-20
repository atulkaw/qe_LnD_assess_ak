package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class mobileSearch {

       public static void main(String[] args) throws InterruptedException {
             // TODO Auto-generated method stub
             System.out.println("Hello, this is my selenium project");
             // 1. Launch Amazon
     		WebDriver driver = utilities.LaunchBrowser.open();

             driver.get("https://www.amazon.com/");
             
             //2. Search iPhone11 in search bar
            driver.findElement(By.id("twotabsearchtextbox")).clear();
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone");
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
             //TimeUnit.SECONDS.sleep(5);
             Thread.sleep(5000);
             List<WebElement> links = driver.findElements(By.tagName("li"));
             //System.out.println(links.size());
             for (int i = 1; i < links.size(); i++)
             {
                 try {
                    String linktxt = links.get(i).getText().trim();
                    if(linktxt.equals("iPhone 11 Pro"))
                    links.get(i).click();
                 } catch (Exception e) {
                    //Correction required in code if link is not present as it is printing for everyobject
                        //System.out.println("Link not found");
                    continue;
                 }
                 
             }
             if(driver.findElement(By.id("comparison-chart")).isDisplayed()) {
             System.out.println("Comparison chart exists");
             
             }

             List<WebElement> ratingelements = driver.findElements(By.tagName("span"));
             //System.out.println(ratingelements.size());
             String rtxt = null;
             for (int i = 1; i < ratingelements.size(); i++)
             {
                 try {
                 String ratingtxt = ratingelements.get(i).getAttribute("class");

                    String rt = "out of 5";
                    if(ratingtxt.equals("a-icon-alt"))
                          //System.out.println(ratingelements.get(i).getAttribute("innerText"));       
                    rtxt = ratingelements.get(i).getAttribute("innerText");
                    if(rtxt.contains(rt))     
                          System.out.println(rtxt);
                          break;
                 } catch (Exception e) {
                    //Correction required in code if link is not present as it is printing for everyobject
                        //System.out.println("Link2 not found");
                    continue;
                 }
                 
             }
System.out.println("Add to cart button not exists instead signing option is available");         
String test1 = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-price qa-price-block-our-price']")).getAttribute("innerText");
System.out.println(test1);

       } 
}

