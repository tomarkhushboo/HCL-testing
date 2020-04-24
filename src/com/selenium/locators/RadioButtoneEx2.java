package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtoneEx2 {

	@Test

	public void checkboxex() throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","./drivers/chromedriver.exe" );



		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@name='radio1'])[2]")).click();

		driver.findElement(By.xpath("(//input[@name='radio1'])[3]")).click();
		
		driver.findElement(By.xpath("(//input[@name='radio1'])[1]")).click();
		
	}
}
