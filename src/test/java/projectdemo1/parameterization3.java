package projectdemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameterization3 {

	WebDriver driver;
	
	@Parameters ("URL")
	
	@BeforeMethod
	public void setUp(String URL) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get(URL);
		
	}
	
	@Parameters ({"USERNAME", "PASS"})
	
	@Test
	public void logIn (String UN, String PS,String ER) {
		
	WebElement USER =	driver.findElement(By.id("email"));
	WebElement PASS =	driver.findElement(By.id("pass"));
	
	USER.sendKeys(UN);
		PASS.sendKeys(PS);
		
		
	}
	
	
}
