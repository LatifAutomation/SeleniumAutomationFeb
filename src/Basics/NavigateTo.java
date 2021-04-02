package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTo {

	public static void main(String[] args) throws InterruptedException 
	{
		
	FirefoxDriver  driver=new FirefoxDriver();
	driver.navigate().to("https://www.google.com/");
	driver.manage().window().maximize();
	
	String title1 = driver.getTitle();
	System.out.println(title1);
	
	String url1 = driver.getCurrentUrl();
	System.out.println(url1);
	
	Thread.sleep(300);
	
	driver.get("https://www.amazon.in/");
	
	String title2 = driver.getTitle();
	System.out.println(title2);
	
	String url2 = driver.getCurrentUrl();
	System.out.println(url2);
	
	Thread.sleep(300);
	
	//Navigate Back
	
	driver.navigate().back();
	
	String title3 = driver.getTitle();
	System.out.println(title3);
	
	String url3 = driver.getCurrentUrl();
	System.out.println(url3);
	
	Thread.sleep(300);
	
   //Navigate Forward
	
	driver.navigate().forward();
	
	String title4 = driver.getTitle();
	System.out.println(title4);
	
	String url4 = driver.getCurrentUrl();
	System.out.println(url4);
	
	Thread.sleep(300);
	
	// Navigate Refresh
	
	driver.navigate().refresh();
	
	String title5 = driver.getTitle();
	System.out.println(title5);
	
	String url5 = driver.getCurrentUrl();
	System.out.println(url5);
	
	
	
	
	
	
	
	}

}
