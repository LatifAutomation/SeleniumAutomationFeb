package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagName2 {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///C:/HTML_Feb2021/Tagname2.html");
		driver.manage().window().maximize();
		
		//UserName
		
		WebElement un = driver.findElement(By.tagName("input"));
		un.sendKeys("Automation");
		
		
		//Password
		
		WebElement pwd = driver.findElement(By.tagName("input"));
		pwd.sendKeys("Testing");

	}

}
