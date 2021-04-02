package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ID2 {

	public static void main(String[] args) 
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///C:/HTML_Feb2021/Id2.html");
		driver.manage().window().maximize();
		
		//USername
		
		driver.findElement(By.tagName("input")).sendKeys("Sagar");
		
		//Password
		
		driver.findElement(By.id("A")).sendKeys("Mayur");
		
		//Email
		
		driver.findElement(By.id("B")).sendKeys("Test@gmail.com");
		
		//Phone
		
		driver.findElement(By.id("C")).sendKeys("8796541023");
		

	}

}
