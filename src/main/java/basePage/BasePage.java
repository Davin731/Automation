package basePage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	public static WebDriver driver;
	
	public static void getDriver() throws IOException 
	{
		
		
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\31dav\\OneDrive\\Documents\\Automation\\Automation\\Drivers\\chromedriver\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

}
