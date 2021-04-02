package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args)
	{
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/r.php");
        driver.manage().window().maximize();
        
       WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
       
       Select select=new Select(day);
       
       if(select.isMultiple())
       {
    	   System.out.println("The given drop down is Multi selected");
       }
       
       else
       {
    	   System.out.println("The given drop down is Not Multi selected");
    	   
       }
       
  
	}

}
