package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T_form extends all{
	@Test (priority = 0)
	public void name1() {
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void name2() throws InterruptedException {
		WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstname.sendKeys("Ishu");
		Thread.sleep(1000);
		
		WebElement lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.sendKeys("Jahan");
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("Ishu@gmail.com");
		Thread.sleep(1000);
		
		WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'Other')]"));
		gender.click();
		Thread.sleep(1000);
		
		WebElement mobile = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobile.sendKeys("01723946694");
		Thread.sleep(1000);
		
		WebElement subject = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		subject.sendKeys("Automation");
		Thread.sleep(1000);
		
		WebElement hobies = driver.findElement(By.xpath("//label[contains(text(),'Reading')]"));
		hobies.click();
		Thread.sleep(1000);
		
		WebElement address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		address.sendKeys("Naogaon");
		Thread.sleep(1000);
		
	}

}
