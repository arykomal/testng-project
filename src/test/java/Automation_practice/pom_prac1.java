package Automation_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_prac1 {

	WebDriver driver;
	
	
	@FindBy (id="user-name")
	static
	WebElement username;
	
	@FindBy (id="password")
	static
	WebElement password;
	
	@FindBy (xpath ="//div[contains(text(),'Sauce Labs Backpack')]")
	WebElement item_name;
	
	@FindBy (xpath = "//button[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement addtoCart;
	
	@FindBy (xpath ="//a[@class=\"shopping_cart_link\"]")
	WebElement cart;
	
	@FindBy (xpath = "(//div[@class=\"inventory_item_price\"])[1]")
	WebElement item_price;
	
	@FindBy (xpath = "//button[@id=\"react-burger-menu-btn\"]")
	WebElement options;
	
	@FindBy (xpath = "//a[contains(text(),'Logout')]")
	WebElement logout;


	
	
	
	public pom_prac1 (WebDriver driver) {
		
		
		this.driver = driver;
		
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public static void enterUsername (String name) {
		
		try {
			username.sendKeys(name);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public static void enterPassword (String pass) {
		try {
		password.sendKeys (pass);
	}
		catch (Exception e) {
			
			e.printStackTrace();
		}
}
	
	
	
	
	
	
	
	
	
}
