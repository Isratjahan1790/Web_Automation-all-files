package practice;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class V_waitt extends all{
	
	@Test (priority = 0)
	public void openurl() {
		driver.get("https://qavbox.github.io/demo/delay/");
		driver.manage().window().maximize();
		
	}
	
	
	@Test (priority = 1)
	public void waitt() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
//		
//		driver.findElement(By.xpath("//input[@name='commit1']")).click();
//		WebElement text = driver.findElement(By.xpath("//h2[@id='delay']"));
//		System.out.println(text.getText());
//		Thread.sleep(2000);
		
		By latetextby = By.xpath("//h2[@id='two']");
		By delaytextby = By.xpath("//h2[@id='delay']");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		WebElement latetext = driver.findElement(latetextby);
		
		
		System.out.println("line 1"+latetext.getText());
		wait.until(ExpectedConditions.textToBePresentInElement(latetext, "I am here!"));
		System.out.println("line 2 " +latetext.getText());
		
		driver.findElement(By.xpath("//input[@name='commit1']")).click();
		WebElement textElement = wait.until(ExpectedConditions.visibilityOfElementLocated(delaytextby));
		System.out.println(textElement.getText());
		
	
		
	}

}
