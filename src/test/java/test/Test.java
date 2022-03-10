package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test 
{
  public static void main (String args[])
  {
  
  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  
  driver.manage().window().maximize();
  driver.manage().deleteAllCookies();
  driver.get("https://www.google.com");
  WebElement searchbox=driver.findElement(By.name("q"));
   searchbox.sendKeys("selenium" + Keys.ENTER);
     if (driver.getTitle().equals("selenium - Google Search"))
     {System.out.println("test pass");}
     else
     {System.out.println("Test fail");}
     String Titleofpage= driver.getTitle();
     System.out.println("Title of page " +Titleofpage);
     
  
  }
  
  }

