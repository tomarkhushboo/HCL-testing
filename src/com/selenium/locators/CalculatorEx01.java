package com.selenium.locators;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalculatorEx01 {
	
	static{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	@Test
	
	public void calculatorTest() {

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.calculator.net/");
	driver.findElement(By.xpath("//img[@src='//d26tpo4cm8sb6k.cloudfront.net/img/svg/all-calculators.svg']")).click();
	
	System.out.println(" ");
	
	
	
}
}
