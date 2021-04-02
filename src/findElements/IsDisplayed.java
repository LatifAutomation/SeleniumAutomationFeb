package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsDisplayed {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Serch button
		
		WebElement searchbtn = driver.findElement(By.xpath("//*[@id=\'nav-search-submit-button\']"));
		WebElement serchfield = driver.findElement(By.id("twotabsearchtextbox"));
		
		if(searchbtn.isDisplayed())
		{
			System.out.println("Search button is visible");
			serchfield.sendKeys("Apple phone");
			searchbtn.click();
			
		}
		
		else
		{
			System.out.println("Search button is not visible");
		}

	}

}
