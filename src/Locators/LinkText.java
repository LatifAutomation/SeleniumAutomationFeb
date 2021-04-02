package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///C:/HTML_Feb2021/Link.html");
		driver.manage().window().maximize();
		
		//Link1
		
		driver.findElement(By.linkText("Link1")).click();

	}

}
