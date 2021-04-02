package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathWothOR {

	public static void main(String[] args) 
	{
	
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.browserstack.com/users/sign_in");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id=\'user_email_login\' or @name=\'user[login]\']")).sendKeys("Test@test.com");

	}

}
