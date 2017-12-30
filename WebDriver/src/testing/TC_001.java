package testing;

import java.util.ResourceBundle;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_001 {


	@Test
	public void tcase1() throws InterruptedException
	{
		ResourceBundle rb = ResourceBundle.getBundle("Elements");
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver2.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(10000);
		driver.get("https://www.facebook.com");
		
		
	}
	
}
