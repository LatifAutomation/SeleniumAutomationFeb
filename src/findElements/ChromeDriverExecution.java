package findElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverExecution {

	public static void main(String[] args) 
	{
		
		//System.setProperty("Webdriver.chrome.driver", "C://ChromeDriver//chromedriver_win32 (4).zip/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chromedriver.chromium.org/downloads");
		driver.manage().window().maximize();
		
	}

}
