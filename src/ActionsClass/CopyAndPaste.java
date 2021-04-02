package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPaste {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2");
		driver.manage().window().maximize();
		
		
		WebElement fname = driver.findElement(By.xpath("//*[@id=\'firstName\']"));
		WebElement lname = driver.findElement(By.xpath("//*[@id=\'lastName\']"));
		
		fname.sendKeys("testing");
		
		
		Actions act=new Actions(driver);
		
		/*act.keyDown(Keys.CONTROL).sendKeys("a")
		.keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("c").
		keyUp(Keys.CONTROL).build().perform();
		
		lname.click();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").
		keyUp(Keys.CONTROL).build().perform();*/
		
		
		act.keyDown(fname, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(lname, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
	}

}
