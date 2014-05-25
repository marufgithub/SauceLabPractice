package com.bit.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseTest 
{
	WebDriver driver;
	
	@Before
	public void start() throws MalformedURLException
	{		
		String b=System.getProperty("Browser");
		if (b.equals("ie"))
		{
			if(b.equals("local"))
			{
				System.setProperty("webdriver.ie.driver", "C:/Driver/IEDriverServer.exe");
				driver= new InternetExplorerDriver();
			}
		if(b.equals("remote"))
		{
		System.setProperty("webdriver.ie.driver", "C:/Driver/IEDriverServer.exe");
		DesiredCapabilities capabillities = DesiredCapabilities.internetExplorer();
        capabillities.setCapability("version", "10");
        capabillities.setCapability("platform", Platform.WIN8);
        capabillities.setCapability("name", "ps");
        this.driver = new RemoteWebDriver(
					  new URL("http://murshedmaruf:975db472-9d52-4c28-b95f-246030bc5222@ondemand.saucelabs.com:80/wd/hub"),
					  capabillities);
		
//		System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");
//		driver= new InternetExplorerDriver();
		}
		}
		else if(3<2)
		{
			System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");
//		System.setProperty("webdriver.ie.driver", "C:/Driver/IEDriverServer.exe");
		DesiredCapabilities capabillities = DesiredCapabilities.chrome();
        capabillities.setCapability("version", "25");
        capabillities.setCapability("platform", Platform.MAC);
        capabillities.setCapability("name", "ps");
        this.driver = new RemoteWebDriver(
					  new URL("http://murshedmaruf:975db472-9d52-4c28-b95f-246030bc5222@ondemand.saucelabs.com:80/wd/hub"),
					  capabillities);
		
//		
//		driver= new InternetExplorerDriver();
		}
		else if(3<2)
		{
//			driver = new FirefoxDriver();
			 DesiredCapabilities capabillities = DesiredCapabilities.firefox();
		        capabillities.setCapability("version", "25");
		        capabillities.setCapability("platform", Platform.MAC);
		        this.driver = new RemoteWebDriver(
							  new URL("http://murshedmaruf:975db472-9d52-4c28-b95f-246030bc5222@ondemand.saucelabs.com:80/wd/hub"),
							  capabillities);
		}
		
//		if (3>2)
//		{
//		driver= new ChromeDriver();
//		}
	}
	@After
	public void end()
	{
		driver.quit();
	}

}
