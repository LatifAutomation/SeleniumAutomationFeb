package POPUPS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='alertButton']")).click();
		
		Alert alt=driver.switchTo().alert();
		
		//Click on OK button
		
		//alt.accept();
		
		//Click on Cancel Button
		//alt.dismiss();
		
		//Print the text of alert
		
		String text = alt.getText();
		System.out.println(text);
		
	}

}
