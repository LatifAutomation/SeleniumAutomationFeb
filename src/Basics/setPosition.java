package Basics;

import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class setPosition {

	public static void main(String[] args) 
	{
       
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		Point p=new Point(220,250);
		
		driver.manage().window().setPosition(p);
		
		
		int x = driver.manage().window().getPosition().getX();
		System.out.println("X cordinate value is "+x);
		
		int y = driver.manage().window().getPosition().getY();
		System.out.println("Y cordinate value is "+y);
		
	}

}
