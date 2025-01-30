package projectdemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallel_testing1 {


	WebDriver driver ;
	
	
	@BeforeClass
	public void setUp () {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	
	@Test
	public void test1() {
		
		driver.get("https://www.facebook.com/?_rdr");
	}
	@Test
	public void test2() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void test3() {
		driver.get("https://demo.automationtesting.in/Register.html");
	}
	
	@Test
	public void test4 () {
		driver.get("https://www.instagram.com/");
	}
	
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}
	
	
}
