package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleText {

	public static void main(String[] args) 
	{

       WebDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com/r.php");
       driver.manage().window().maximize();
       
      WebElement year = driver.findElement(By.xpath("//*[@id='day']"));
      
      Select select=new Select(year);
      
      select.selectByVisibleText("23");
      
    
       
	}

}
