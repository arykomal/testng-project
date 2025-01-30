package projectdemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameterization1 {

	
	WebDriver driver;
	
	
	@Parameters("URL")
	@BeforeMethod
	public void SetUp (String URL) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		
		
		
	}
	
	
	@Parameters ({"USERNAME", "PASSWORD","EXPECTEDRESULT"})
	@Test
	
	public void LoginTest (String UN, String PW, String ER) {
		
		WebElement username = driver.findElement(By.id("email"));

		WebElement password = driver.findElement(By.id("pass"));
		
		username.sendKeys(UN);
		password.sendKeys(PW);
		
		
		String title = driver.getTitle();
		if(title.equals(ER)) {
			System.out.println("correct title");}
			
			else {
				System.out.println("incorrect title");
			}
		}
	
	@AfterMethod
	public void terDown () {
		
		driver.quit();
	}
	
	
}
