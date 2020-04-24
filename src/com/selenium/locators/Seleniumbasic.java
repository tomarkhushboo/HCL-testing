package com.selenium.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumbasic {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");


		WebDriver driver = new ChromeDriver();

		//Puts an Implicit wait, Will wait for 10 seconds before throwing exception

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Launch website
		driver.navigate().to("https://www.makemytrip.com/");
		//driver.get("https://www.makemytrip.com/");
		//Maximize the browser
		driver.manage().window().maximize();

		//gettitle command
		String title = driver.getTitle();
		System.out.println(title);
		String current_url = driver.getCurrentUrl();
		System.out.println(current_url);
		String pagesource = driver.getPageSource();
		System.out.println("currenturl" +pagesource);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		driver.navigate().forward();
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//p[text()=' Login or Create Account']")).click();
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		boolean b = user.isDisplayed();
		System.out.println(b);
		String tag = user.getTagName();
		System.out.println(tag);
		user.sendKeys("tomarkhushboo11@gmail.com");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		System.out.println("click on continue");
		driver.close();

	}

}
