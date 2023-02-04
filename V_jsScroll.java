package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class V_jsScroll extends all{
	
	@Test (priority = 0)
	public void openurl() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	}

	@Test (priority = 1)
	public void jsScroll() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		Thread.sleep(2000);
		
		WebElement mousehover = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mousehover")));
		js.executeScript("arguments[0].scrollIntoView();", mousehover);
		Thread.sleep(2000);
		
	}
}
