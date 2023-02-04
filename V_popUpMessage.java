package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class V_popUpMessage extends all{
	
	@Test(priority = 0)
	public void openurl() {
		
		driver.get("https://member.daraz.com.bd/user/login");
		driver.manage().window().maximize();
	}
	 
	
	@Test (priority = 1)
	public void popup() throws InterruptedException {
		
		WebElement mobile = driver.findElement(By.xpath("//input[@placeholder='Please enter your Phone Number or Email']"));
		mobile.sendKeys("1216398163");
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Please enter your password']"));
		password.sendKeys("121633");
		Thread.sleep(1000);
		
		WebElement login = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		login.click();
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.className("next-feedback-content")).getText());
		Thread.sleep(1000);
		
	}
}
