 package com.qa.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.utilities.AppConfigurations;

public class BaseClass {
	
	
	public WebDriver driver;
	public WebDriver initializeDriver() throws NumberFormatException, IOException, InterruptedException {
		
		String browser =AppConfigurations.getProperty("Browser");
		
		if (browser.equalsIgnoreCase("Chrome"))
		
		{
			System.setProperty("webdriver.chrome.driver",AppConfigurations.getProperty("ChromeDriverpath") );
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(AppConfigurations.getProperty("Appurl"));
		Thread.sleep(3000);
		driver.manage().window().maximize();
		}
		return driver;
		
	}
	




public void closeDriver()
{
	driver.close();
}

public void closeAllDriver()
{
	driver.quit();
}

}