package findElements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElements {

	public static void main(String[] args) 
	{
		
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("file:///C:/HTML_Feb2021/AbsoluteXpath.html");
	driver.manage().window().maximize();
	
	List<WebElement> webelmnts = driver.findElementsByTagName("input");
	
	int sz = webelmnts.size();
	System.out.println(sz);
	
	for(int i=0;i<webelmnts.size();i++)
	{
		WebElement ele = webelmnts.get(i);
		String elename = ele.getText();
		System.out.println(elename);
		
	}
	
	
	}

}
