package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElemnt2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/slider/");
		driver.manage().window().maximize();
		
		
		WebElement mv = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/form/div/div[1]/span/input"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(mv, 50, 0).build().perform();
		
		act.
		
	}

}
