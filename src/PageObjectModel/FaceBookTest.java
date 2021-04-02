package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTest {

	public static void main(String[] args) 
	{
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		
		
		/*LoginClass log=new LoginClass(driver);
		
		log.username();
		log.password();
		log.login();*/
		
		
		CraeteNewAccount acc=new CraeteNewAccount(driver);
		acc.createAccount();
		acc.fname();
		acc.lastname();
		acc.mobile();
		acc.password();
		

	}

}
