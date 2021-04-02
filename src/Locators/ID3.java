package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ID3 {

	public static void main(String[] args)
	{
	
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.browserstack.com/users/sign_in");
		
		driver.manage().window().maximize();
		
		//Business Email
		
		driver.findElement(By.id("user_email_login")).sendKeys("Test@gmail.com");
		
		//Password
		
		driver.findElement(By.id("user_password")).sendKeys("Test@1234");

	}

}
