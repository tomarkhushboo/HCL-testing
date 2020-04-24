package com.selenium.locators;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameter {
	WebDriver driver; // global variable

	@Test	
	@Parameters({"uname","pass"})
	public void Login(String uname,String pass) {


		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
	} 

	@BeforeTest //predefined

	public void LaunchBrowser(){

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//String absolutePath = System.getProperty("user.dir");
		//String filePath = absolutePath+"\\Drivers"+"\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", filePath);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://newtours.demoaut.com/mercurywelcome.php");


	}

	@AfterTest //post defined

	public void closeBrowser(){
		driver.quit();
	}

}

