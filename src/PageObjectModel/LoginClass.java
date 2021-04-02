package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginClass 
{
  // Declaration
	private WebElement username;
	private WebElement pass;
	private WebElement login;
	private WebElement forgopass;
	
	
	//Initialization
	
	public LoginClass(WebDriver driver)
	{
		username=driver.findElement(By.xpath("//*[@id='email']"));
		pass=driver.findElement(By.xpath("//*[@id='pass']"));
		login=driver.findElement(By.name("login"));
		
	}
	
	
	public void username()
	{
		username.sendKeys("Test@test.com");
	}
	
	public void password()
	{
		pass.sendKeys("Test@1234");
	}
	
	public void login()
	{
		login.click();
	}
}
