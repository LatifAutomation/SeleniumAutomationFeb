package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElement {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		
		int size = ele.size();
		
		System.out.println(size);
		
		
		
		for(int i=0;i<size;i++)
		{
			
			WebElement fe = ele.get(i);
			String text = fe.getText();
			System.out.println(text);
			
		}
		
	}

}
