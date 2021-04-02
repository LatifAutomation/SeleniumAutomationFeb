package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Name {

	public static void main(String[] args)
	{
	
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///C:/HTML_Feb2021/Name.html");
		driver.manage().window().maximize();
		
		//username
		
		driver.findElement(By.tagName("input")).sendKeys("Test");
		
		//Password
		
		driver.findElement(By.id("pass")).sendKeys("Test@1234");
		
		//Email
		driver.findElement(By.id("email")).sendKeys("Test@test.com");
		
		//Confirm Email
		
		driver.findElement(By.name("email")).sendKeys("Test@12345");
		
	}

}
