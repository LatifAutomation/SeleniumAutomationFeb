package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptions {

	public static void main(String[] args) 
	{
		   WebDriver driver=new ChromeDriver();
	       driver.get("https://www.facebook.com/r.php");
	       driver.manage().window().maximize();

	       WebElement mnths = driver.findElement(By.xpath("//*[@id='year']"));
	       
	       Select select=new Select(mnths);
	       
	      List<WebElement> opts = select.getOptions();
	      
	      select. 
	      sz = opts.size();
	      
	      System.out.println(sz);
	      
	      
	      for(int i=0;i<sz;i++)
	      {
	    	  WebElement opt = opts.get(i);
	    	  String txt = opt.getText();
	    	  System.out.println(txt);
	    	  
	    	  
	      }
	        
	}

}
