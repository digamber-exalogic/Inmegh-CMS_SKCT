/**This java program will create all the different browser drivers like: Chrome,
 * Firefox, Internet Explorer etc.
 * 
 */
package com.inmegh.cms.utils.projectspec;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author digamber
 *
 */
public class CreateBrowserDriver {

	public static WebDriver createDriver(String browserName, String url) {
		
		WebDriver driver = null;
		
		if(browserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/home/exalogic/Documents/selenium_videos/geckodriver");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
					"/home/exalogic/Documents/selenium_videos/chromedriver");
			driver = new ChromeDriver();
		}
		else
		{
			System.out.println("Invalid Browser Name");
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}
	
}
