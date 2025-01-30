package projectdemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;

public class cross_browser {

	WebDriver driver;
	
	
	
	
	@Parameters ("browser")
	
	@Test
	public void setUp(String browsername) {
		
		if(browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browsername.equals("opera")) {
			
			WebDriverManager.operadriver().setup();
			driver = (WebDriver) new OperaDriverManager();
			
		}
		
else if (browsername.equals("safari")) {
			
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
	}
	}
	
			
		@Parameters ("URL")
		@AfterMethod
		public void logIn1(String URL) {
	
			driver.get(URL);
	
	WebElement user =	driver.findElement(By.name("username"));
	WebElement pass = driver.findElement(By.name("password"));
	
	user.sendKeys("Admin");
	user.sendKeys("admin123");
	
	String title = driver.getTitle();
	System.out.println(title);
	
		}
	}




	

