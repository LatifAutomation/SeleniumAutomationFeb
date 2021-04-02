package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByAttribute {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		//Username
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test@test.com");
		
		//Password
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Test@1234");

	}

}
