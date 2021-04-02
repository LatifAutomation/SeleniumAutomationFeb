package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelector2 {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Wikipedia");
		driver.manage().window().maximize();
		
		//Username
		
		driver.findElement(By.cssSelector("input[id='wpName1']")).sendKeys("Tets User");
		
		//Password
		
		driver.findElement(By.cssSelector("input[name='wpPassword']")).sendKeys("Test@12345");
		
		
		driver.findElement(By.cssSelector("button[id='wpLoginAttempt']")).click();
	}

}
