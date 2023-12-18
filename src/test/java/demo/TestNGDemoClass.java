/**
 * 
 */
package demo;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePage.BasePage;

/**
 * @author 31dav
 *
 */
public class TestNGDemoClass{
	 
	 @BeforeClass
	 public void setUp() throws IOException
	 {
	 System.out.println("Browser setup by Thread "+Thread.currentThread().getId() +" and Driver reference is : " + BasePage.driver);
	 BasePage.getDriver();
	 }

	 @Test
	 public void GoogleTest() throws InterruptedException
	 {
	 BasePage.driver.get("https://www.google.com/");
	 Thread.sleep(15000);
	 System.out.println("Title printed by Thread "+Thread.currentThread().getId()+" - "+BasePage.driver.getTitle());
	 BasePage.driver.manage().deleteAllCookies();
	 }
	 
	 @Test
	 public void FacebookTest() throws InterruptedException
	 {
	 BasePage.driver.get("https://www.facebook.com/");
	 Thread.sleep(15000);
	 System.out.println("Title printed by Thread "+Thread.currentThread().getId()+" - "+BasePage.driver.getTitle());
	 BasePage.driver.manage().deleteAllCookies();
	 
	 }
	 
	 @AfterClass
	 public void tearDown()
	 {
	 System.out.println("Browser closed by Thread "+Thread.currentThread().getId());
	 BasePage.driver.close();
	 }
	}