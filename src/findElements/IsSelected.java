package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsSelected {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		
		
		
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		driver.manage().window().maximize();
		
		
		WebElement redchck = driver.findElement(By.xpath("//*[@id=\'post-body-7702345506409447484\']/div/input[1]"));
		
		if(redchck.isEnabled())
		{
			System.out.println("Red Check box is enabled");
		}
		
		else
		{
			System.out.println("Red Check box is disabled");
		}
		
		if(redchck.isSelected())
		{
			System.out.println("Red Check box is Seleted");
		}
		else
		{
			System.out.println("Red Check box is not selected");
		}
		
		
		
		
		WebElement opera = driver.findElement(By.xpath("//*[@id=\'post-body-7702345506409447484\']/div/div/input[3]"));
		if(opera.isSelected())
		{
			System.out.println("OperaCheck box is Seleted");
		}
		else
		{
			System.out.println("OperaCheck box is not selected");
		}
			
	}

	
	
}
