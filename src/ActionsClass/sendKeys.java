package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sendKeys {

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//Identify the elemnt on which you need to perform the action
		
       WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
       
       //Create the object of Actions class
       
       Actions act=new Actions(driver);
       
       //Perfom  the actions by 
       
     //  act.sendKeys(ele, "Selenium Testing").build().perform();
       ele.sendKeys("Manual Testing");
       
       act.
		
	}

}
