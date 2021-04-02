package Basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Quit {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		
		//driver.close();  //closing the parent window
		
		driver.quit();    //close the parent as well as child window
		

	}

}
