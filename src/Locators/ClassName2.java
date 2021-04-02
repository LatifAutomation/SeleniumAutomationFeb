package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassName2 {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		
		//TextBox
		
		driver.findElement(By.id("fname")).sendKeys("Sagar");
		
		//Submit Button
		
		driver.findElement(By.id("idOfButton")).click();
		
		//Gender
		
		driver.findElement(By.id("male")).click();
		
		//Automation checkbox
		
		driver.findElement(By.className("Automation")).click();
	}

}
