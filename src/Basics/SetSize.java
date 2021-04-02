package Basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetSize {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		Dimension d=new Dimension(120,100);
		
		driver.manage().window().setSize(d);
		
		int width = driver.manage().window().getSize().getWidth();
		System.out.println(width);
		
		
		int heigt = driver.manage().window().getSize().getHeight();
		System.out.println(heigt);
		
		
		

	}

}
