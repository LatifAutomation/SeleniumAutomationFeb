package Basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetMethod {

	public static void main(String[] args) 
	{

      FirefoxDriver driver=new FirefoxDriver();
      
      driver.get("https://www.google.com/");
      
      driver.close();
      
	}

}
