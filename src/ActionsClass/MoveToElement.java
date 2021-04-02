package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fatcow.com/");
		driver.manage().window().maximize();
		
		WebElement help = driver.findElement(By.xpath("//*[@id='nav-container']/ul/li[5]/a"));
		WebElement cntus = driver.findElement(By.xpath("//*[@id='nav-container\']/ul/li[5]/ul/li/a"));
		
		Actions act=new Actions(driver);
		
		//moveToElemnt--> to perform theb mouse action
		
		
		act.moveToElement(help).build().perform();
		Thread.sleep(300);
		act.click(cntus).build().perform();
		
		act.
		
		
	}

}
