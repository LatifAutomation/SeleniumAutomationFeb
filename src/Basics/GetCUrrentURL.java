package Basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCUrrentURL {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();  //MAaximize the window
		
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}

}
