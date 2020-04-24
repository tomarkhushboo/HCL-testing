package com.selenium.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowserEx02 {

	@Test
	@Parameters({ "browser" })
	public void launch_Browser(String browser){
		

		if (browser.equalsIgnoreCase("chrome"))
		{
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.spicejet.com/");
			System.out.println("Browser name"+ browser );
		}

		else if(browser.equalsIgnoreCase("gecko")){


			WebDriver driver;
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.spicejet.com/");
			System.out.println("Browser name"+ browser );
		}   







	}

}
