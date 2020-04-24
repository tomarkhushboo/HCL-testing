package com.selenium.switchto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchAlertEx2 {



	public static void main(String[] args) throws InterruptedException  {                                                                                                                                      

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Alert Message handling

		driver.get("http://the-internet.herokuapp.com/javascript_alerts");                                  

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alert = driver.switchTo().alert(); 
		
	   // Capturing alert message.    
     String alertMessage= driver.switchTo().alert().getText();                       

      // Displaying alert message                

		System.out.println(alertMessage);  

		Thread.sleep(5000);

		// Accepting alert                    

		alert.accept();   
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		alert.dismiss();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).sendKeys("1234");;
		alert.accept();
		
		//driver.close();
	}  
}
