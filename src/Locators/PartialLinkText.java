package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartialLinkText {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///C:/HTML_Feb2021/PartialLinkText2.html");
		driver.manage().window().maximize();
		
		
		String text = driver.findElement(By.partialLinkText("k2")).getText();
		System.out.println(text);
	}

}
