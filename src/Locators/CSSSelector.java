package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelector {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///C:/HTML_Feb2021/CSSSelector.html");
		driver.manage().window().maximize();
		
		//USername
		
		driver.findElement(By.cssSelector("input[id='uname']")).sendKeys("Test@gmail.com");
		
		//Password
		
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("TEst@12345");
		
	}

}
