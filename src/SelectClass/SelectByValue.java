package SelectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver(); 
		  driver.manage().window().maximize(); 
		  String URL = "file:///C:/HTML_Feb2021/SelectPets.html"; 
		  driver.get(URL); 
		  
		 WebElement se = driver.findElement(By.name("pets"));
		 
		 Select sel1=new Select(se);
		 

   if(sel1.isMultiple())
   {
	   System.out.println("Multiselected");
   }
   
   else
   {
	   System.out.println(" No Multiselected");
   }
		
   
   sel1.selectByValue("dog");
   
   sel1.selectByValue("cat");
   
   sel1.deselectAll();
	
	} 

	
	
	
	
	}


