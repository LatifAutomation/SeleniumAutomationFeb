package Basics;

import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class GetTitle {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//Title  of page
		 
		
		String title = driver.getTitle();
		System.out.println(title);
		
    
	}

}
