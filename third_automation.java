package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class third_automation extends third{
	
	@Test (priority = 0)
	public void openurl() throws InterruptedException {
	driver.get(priyoshop);	
	driver.manage().window().maximize();
	Thread.sleep(6000);
	}
    
	@Test (priority = 1)
	public void login() throws InterruptedException {
		
		String title = driver.getTitle();
		System.out.println(title);
	
		String actual = "PriyoShop.com - Online Shopping in Bangladesh";
		if(title.equals(actual)) {
			System.out.println("verified");
		}
		
		WebElement logintext = driver.findElement(By.xpath("//label[contains(text(),'My Account')]"));
		logintext.click();
		Thread.sleep(6000);
		
		WebElement dailyneeds = driver.findElement(By.xpath("//span[contains(text(),'Daily Needs')]"));
		dailyneeds.click();
		Thread.sleep(6000);
	}
}
