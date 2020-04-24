package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdownex {

	WebDriver driver;
	
	@Test

	public void selectBrowsers() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/dropdown");

		WebElement dropdown = driver.findElement(By.id("dropdown"));

		Select select = new Select(dropdown);

		select.selectByVisibleText("Option 1");
		Thread.sleep(2000);
		select.selectByValue("2");
		Thread.sleep(2000);
		select.selectByIndex(1);
		driver.close();

	}

}

