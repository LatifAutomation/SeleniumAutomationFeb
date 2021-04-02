package POPUPS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDdivision {

	public static void main(String[] args) 
	{
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	

driver.findElement(By.linkText("Forgotten password?")).click();

driver.findElement(By.xpath("//*[@id='identify_email']")).sendKeys("test@test.com");

driver.findElement(By.xpath("//*[@id='did_submit']")).click();



















	}

}
