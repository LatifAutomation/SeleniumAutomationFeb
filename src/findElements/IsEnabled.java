package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsEnabled {

	public static void main(String[] args) 
	{
	
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);

		
		WebElement search = driver.findElement(By.name("q"));
		
		
		if(search.isEnabled())
		{
			System.out.println("Search button is enabled");
			search.sendKeys("Selenium");
		}
		
		else
		{
			System.out.println("Search button is not enabled");
		}
		
		
	}

}
