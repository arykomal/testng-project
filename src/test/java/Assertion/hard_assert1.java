package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hard_assert1 {

	WebDriver driver;
	@Test
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();	
	}
	@Test
	void testTitle() {
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("passwors"));
		
		Assert.assertTrue(username.isDisplayed(), "Assertion failed as username is not displaid");
		Assert.assertTrue(true, driver.getTitle());
		
		
	}
	
	
	
	
	
}
