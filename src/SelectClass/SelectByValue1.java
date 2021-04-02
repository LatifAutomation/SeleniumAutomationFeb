package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue1 {

	public static void main(String[] args) 
	{

      WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/r.php");
      driver.manage().window().maximize();
      
      //Identify the elemnts on which you need to perform
      
      WebElement month = driver.findElement(By.xpath("//*[@id=\'month\']"));
      
      
      
      Select sel=new Select(month);
      
      
      
      sel.selectByValue("13");
      
      
      
      
      

	}

}
