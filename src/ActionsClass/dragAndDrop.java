package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		
		WebElement src = driver.findElement(By.xpath("//*[@id=\'draggable\']"));
		
		WebElement dest = driver.findElement(By.xpath("//*[@id=\'droppable\']"));
		
		Actions act=new Actions(driver);
		
		//act.dragAndDrop(src, dest).build().perform();
		
		//act.moveToElement(src, 120, 130).build().perform();
		
		act.clickAndHold(src).build().perform();
		
		act.release(src).build().perform();
		

	}

}
