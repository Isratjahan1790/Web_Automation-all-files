package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T_dropdown_month extends all{
	
	@Test (priority = 0)
	public void name1() {
		
		driver.get("https://member.daraz.com.bd/user/register");
		driver.manage().window().maximize();
	}
	
	
	@Test (priority = 1)
	public void name2() throws InterruptedException {
		
		WebElement month = driver.findElement(By.xpath("//span[contains(text(),'Month')]"));
		month.click();
		Thread.sleep(1000);
		
		WebElement april = driver.findElement(By.xpath("//li[contains(text(),'April')]"));
		april.click();
		Thread.sleep(1000);
		
		WebElement day = driver.findElement(By.xpath("//span[contains(text(),'Day')]"));
		day.click();
		Thread.sleep(1000);
		
		WebElement nine = driver.findElement(By.xpath("//li[contains(text(),'29')]"));
		nine.click();
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.xpath("//span[contains(text(),'Year')]"));
		year.click();
		Thread.sleep(1000);
		
		WebElement sal = driver.findElement(By.xpath("//li[contains(text(),'1998')]"));
		sal.click();
		Thread.sleep(1000);
		
		WebElement gender = driver.findElement(By.xpath("//span[contains(text(),'Select')]"));
		gender.click();
		Thread.sleep(1000);
		
		WebElement female = driver.findElement(By.xpath("//li[contains(text(),'female')]"));
		female.click();
		Thread.sleep(9000);
		
	}

}
