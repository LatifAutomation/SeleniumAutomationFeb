package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextClick {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement fb = driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[1]/div/img"));
		
		Actions act=new Actions(driver);
		act.contextClick(fb).build().perform();
		act.d

	}

}
