package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		WebElement dc = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[2]/div/div/a[3]"));
		Actions act=new Actions(driver);
		
		act.doubleClick(dc).build().perform();
		
		act.
	}

}
