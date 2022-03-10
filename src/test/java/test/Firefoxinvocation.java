package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxinvocation {
public static void main(String args[])
{
System.setProperty("webdriver.gekcko.driver",System.getProperty("user.dir")+ "/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 driver.get("https://www.facebook.com/");
 
 String Titleofpage= driver.getTitle();
 System.out.println("Title of page " +Titleofpage);
 
// if(Titleofpage.equals("Facebook – log in or sign up"))
// {System.out.println("correct title");}
//
// else
// {System.out.println("title is incorrect test fail");}
	 WebElement signinbutton= driver.findElement(By .id("u_0_d_mt"));
	 signinbutton.click();
	
 
}
}
