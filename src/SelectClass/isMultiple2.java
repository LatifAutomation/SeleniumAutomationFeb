package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultiple2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.id("cars"));
		
		Select sel=new Select(ele);
		
		if(sel.isMultiple())
		{
			System.out.println("Multi selected dropdown");
			sel.selectByValue("volvo");
			sel.selectByVisibleText("Audi");
			
			
		}
		
		else
		{
			System.out.println("Not Multi selected");
		}
		
	}

}
