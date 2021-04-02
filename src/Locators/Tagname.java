package Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tagname {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///C:/HTML_Feb2021/Tagname.html");
		driver.manage().window().maximize();
		
		// Username
		
		
		 driver.findElement(By.tagName("input")).sendKeys("Testing");
		 
		
		WebElement ele2 = driver.findElement(By.tagName("input"));
		ele2.sendKeys("Automation Testing");
		
		 
		    By ele = By.tagName("input");
			WebElement fe = driver.findElement(ele);
			fe.sendKeys("Testing Auto");
		

	}

}
