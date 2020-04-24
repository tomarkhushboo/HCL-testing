package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class frameEx01 {

	@Test

	public void spicejetex() {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
          WebDriver driver = new FirefoxDriver(); //navigates to the Browser

			driver.get("https://www.spicejet.com/"); 

			// navigates to the page consisting an iframe



			driver.manage().window().maximize();
			
			int size = driver.findElements(By.tagName("iframe")).size();
			System.out.println(size);

			/*driver.switchTo().frame("//www.googletagmanager.com/ns.html?id=GTM-NS5W5Z"); //switching the frame by ID



			System.out.println("********We are switch to the iframe*******");

			driver.findElement(By.xpath("html/body/a/img")).click();

			//Clicks the iframe
			System.out.println("*********We are done***************");*/

		}

	}

