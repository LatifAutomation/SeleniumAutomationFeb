package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Id {

	public static void main(String[] args) 
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///C:/HTML_Feb2021/Id.html");
		driver.manage().window().maximize();
		
		//Username
		
		WebElement fe = driver.findElement(By.tagName("input"));
       fe.sendKeys(" Manual Testing");
       
       //Password
       
       WebElement se = driver.findElement(By.id("pass"));
       se.sendKeys("Automation Testing");

	}

}
