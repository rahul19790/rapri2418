package SDK_Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class core {
	
public static WebDriver driver = null;
	
	@BeforeTest
	public void init()
	{
		System.setProperty("webdriver.gecko.driver", "D:/FreeWare/geckodriver.exe");
		driver = new FirefoxDriver();
	    driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void tearoff()
	{
		driver.close();
	}
}
