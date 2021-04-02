package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndex {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/HTML_Feb2021/SelectPets.html");
		driver.manage().window().maximize();
		
		WebElement pts = driver.findElement(By.name("pets"));

		Select sel=new Select(pts);
		
		sel.selectByIndex(1);
		Thread.sleep(900);
		sel.deselectByIndex(1);
		 
	}

}
