package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookClass 
{

	@FindBy(id="email")
	WebElement un;
	
	
	@FindBy(id="pass")
	WebElement pass;
	
	
	@FindBy(name="login")
	WebElement login;
	
	
	public FaceBookClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username()
	{
		un.sendKeys("test@gmail.com");
	}
	
	public void pass()
	{
		pass.sendKeys("Test@1234");
	}
	
	public void login()
	{
		login.click();
	}
	
}
