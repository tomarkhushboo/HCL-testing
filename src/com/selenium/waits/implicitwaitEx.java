package com.selenium.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class implicitwaitEx {

	@Test
	
	public void mmtex() {
	System.setProperty ("webdriver.chrome.driver","./drivers/chromedriver.exe" );

	WebDriver driver = new ChromeDriver(); 

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

	String eTitle = "Demo Guru99 Page";

	String aTitle = "" ;

	// launch Chrome and redirect it to the Base URL

	driver.get("hhttp://demo.guru99.com/test/guru99home/" );

	//Maximizes the browser window

	driver.manage().window().maximize() ;

	//get the actual value of the title

	aTitle = driver.getTitle();

	//compare the actual title with the expected title

	if (aTitle.equals(eTitle))

	{

		System.out.println( "Test Passed") ;

	}

	else {

		System.out.println( "Test Failed" );

	}

	//close browser

	driver.close();

}

}


