package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RelativeXpath {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/HTML_Feb2021/AbsoluteXpath.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[4]/input[3]")).sendKeys("Automation Testing");
	}

}
