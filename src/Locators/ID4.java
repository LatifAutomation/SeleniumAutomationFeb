package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ID4 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Business Email
		
		driver.findElement(By.id("email")).sendKeys("TEst@1234");
		
		//Password
		
		driver.findElement(By.id("pass")).sendKeys("Test@123435");
		

	}

}
