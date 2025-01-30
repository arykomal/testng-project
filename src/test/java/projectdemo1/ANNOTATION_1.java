package projectdemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ANNOTATION_1 {

	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test
	private void At() {
		String Title = driver.getTitle();
		System.out.println("page title"+ Title);
		System.out.println("verify title");
	}
	
	@Test
	public void VerifyLog() {
		
		boolean islogoDisplayed = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println("logo validation:"+islogoDisplayed);
	}
	
	public void TearDown() {
		driver.quit();
	}
	
	
}
