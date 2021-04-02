package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CraeteNewAccount 
{
	

	private WebElement createacc;
	private WebElement fname;
	private WebElement lname;
	private WebElement mob;
	private WebElement pass;
	
	
	//Initialization
	
	public CraeteNewAccount(WebDriver driver)
	{
		createacc=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
		fname=driver.findElement(By.className("mbm _1iy_ _a4y _3-90 lfloat _ohe"));
		lname=driver.findElement(By.name("lastname"));
		mob=driver.findElement(By.name("reg_email__"));
		pass=driver.findElement(By.xpath("//*[@id='password_step_input']"));
		
	}
	
	
	
	//Utilization
	
	public void createAccount()
	{
		createacc.click();
	}
	
	public void fname()
	{
		fname.sendKeys("Manual");
	}
	
	public void lastname()
	{
		lname.sendKeys("Testing");
	}
	
	public void mobile()
	{
		mob.sendKeys("9874563210");
	}
	
	public void password()
	{
		pass.sendKeys("Test@134");
	}
}
