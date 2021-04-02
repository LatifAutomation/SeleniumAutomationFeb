package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathbyText {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		
		
	driver.findElements(By.xpath("//a[text()='Get started free      ']"));
		
				
				
	}

}
