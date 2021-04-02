package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathwithAnd {

	public static void main(String[] args)
	{

		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		//Username
		
	    driver.findElement(By.xpath("//input[@name='email' and @id='email']")).sendKeys("Test@test.com");

	}

}
