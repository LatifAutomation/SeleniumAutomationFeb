package POPUPS;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://naukri.com/");
		driver.manage().window().maximize();
		
		
		//Parent window
		
		String rid = driver.getWindowHandle();
		System.out.println(rid);
		
		//getWindowHandles
		
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		
		int sz = ids.size();
		System.out.println(sz);
		
		Iterator<String>c=ids.iterator();
		while(c.hasNext())
		{
			String d = c.next();
			driver.switchTo().window(d);
			String title = driver.getTitle();
			System.out.println(title);
		}
		
		
		
	
		
		

	}

}
