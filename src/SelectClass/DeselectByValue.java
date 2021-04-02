package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByValue {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		WebElement pts = driver.findElement(By.name("cars"));

		Select sel=new Select(pts);
		
		sel.selectByIndex(0);
		sel.selectByValue("saab");
		sel.selectByIndex(2);
		
		Thread.sleep(1000);
		
		List<WebElement> opt = sel.getAllSelectedOptions();
		int sz = opt.size();
		System.out.println(sz);

		for(int i=0;i<sz;i++)
		{
			WebElement el = opt.get(i);
			String text = el.getText();
			System.out.println(text);
		}
		
		sel.deselectAll();
	}

}
