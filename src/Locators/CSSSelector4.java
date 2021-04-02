package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelector4 {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//usernae
		driver.findElement(By.cssSelector("input[id='m_login_email']")).sendKeys("Test@test.cim");
		
		//password
		
		driver.findElement(By.cssSelector("input[id='m_login_password']")).sendKeys("TEst@1234");
		
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
	}

}
