package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtoneEx1 {

	@Test

	public void checkboxex() {
		System.setProperty ("webdriver.chrome.driver","./drivers/chromedriver.exe" );



		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		
	}
}
