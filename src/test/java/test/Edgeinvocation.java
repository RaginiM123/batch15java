package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edgeinvocation {
	public static void main (String args[])
	{
		
		System.getProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
	}

}
