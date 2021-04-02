package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Name2 {

	public static void main(String[] args) 
	{

    FirefoxDriver driver=new FirefoxDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    
    driver.findElement(By.name("email")).sendKeys("Test@gmail.com");
    
    
    driver.findElement(By.name("pass")).sendKeys("Test@1223445");
    
    driver.findElement(By.name("login")).click();

	}

}
