package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbsoluteXpath {

	public static void main(String[] args) 
	{
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("file:///C:/HTML_Feb2021/AbsoluteXpath.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("html/body/div[1]/input[3]")).sendKeys("Testing");
	
	String text = driver.findElement(By.xpath("/html/body/div[3]/a[2]")).getText();
	System.out.println(text);
	

	}

}
