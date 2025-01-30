package projectdemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class grouping {

	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void openApp () {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test (groups = "LoginPage")
	public void logInVerification () {
		
		driver.findElement(By.name("username")).isDisplayed();
		driver.findElement(By.name("password")).isDisplayed();
		
	}
	
	@Test (groups = "LoginPage")
	public void logVerify () {
		
		driver.findElement(By.xpath("(//img[@alt=\"orangehrm-logo\"])[1]"));
	}
	
	@Test (groups = "Homepage")
	public void homePage() {
		System.out.println("homepage");
	}
	
	@Test (groups = "Homepage")
	public void homepage1() {
		System.out.println("homepage1");
	}
	
	@Test (groups = "Dashboard")
	public void dashboard() {
		System.out.println("dashboard1");
	}
	
	@Test (groups = "Dashboard")
	public void dashboard1() {
		System.out.println("Dashboard");
	}
	
	@AfterClass
	public void tearDown () {
		driver.quit();
	}
	
}
