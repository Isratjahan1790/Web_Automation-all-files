package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class all {
	
	WebDriver driver;
	
	static String yahoo_locator = "https://login.yahoo.com/";
	static String foodpanda = "https://www.foodpanda.com.bd/";
	static String form = "https://demoqa.com/automation-practice-form";
	static String drop_down = "https://qavbox.github.io/demo/signup/";
	static String daraz_dropdown_month = "https://member.daraz.com.bd/user/register";
	static String daraz_navigate = "https://member.daraz.com.bd/user/register?spm=a2a0e.login_signup.0.0.1bcf2829I2ViYh&redirect=https%3A%2F%2Fwww.daraz.com.bd%2F";
	static String rahul ="https://rahulshettyacademy.com/AutomationPractice/";
	
	@BeforeSuite
	public void start() {
		
		String browser = System.getProperty("browser", "chrome");
		
		if(browser.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(browser.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}
	
	@AfterSuite
	public void end() {
		driver.quit();
		
	}

}
