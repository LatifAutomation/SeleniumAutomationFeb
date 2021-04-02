package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassName {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.airbnb.co.in/");
		driver.manage().window().maximize();
		
		//
		
		driver.findElement(By.className("_1xq16jy")).sendKeys("Pune");
		
	}

}
