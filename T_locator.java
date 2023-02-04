package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T_locator extends all{
	
	
	@Test (priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();

	}
	
	@Test (priority = 1)
	public void textlocator() throws InterruptedException {
		//id
		//WebElement id = driver.findElement(By.id("login-username"));
		//id.sendKeys("test@yahoo.com");
		//Thread.sleep(1000);
		
		//id.clear();
		//Thread.sleep(1000);
		
		//name
		//WebElement name = driver.findElement(By.name("username"));
		//name.sendKeys("test1@yahoo.com");
		//Thread.sleep(1000);
		
		//id.clear();
		//Thread.sleep(1000);
		
		//className
		//WebElement className = driver.findElement(By.className("phone-no"));
		//className.sendKeys("test2@yahoo.com");
		//Thread.sleep(1000);
		
		//id.clear();
		//Thread.sleep(1000);
		
		//css Id=#value class=.value
		//WebElement cssId = driver.findElement(By.cssSelector("#login-username"));
		//cssId.sendKeys("test3@yahoo.com");
		//Thread.sleep(1000);
		
		//id.clear();
		//Thread.sleep(1000);
				
		//xpath
		//WebElement xpath = driver.findElement(By.xpath("//input[@type='text']"));
		//xpath.sendKeys("test4@yahoo.com");
		//Thread.sleep(1000);
		
		//id.clear();
		//Thread.sleep(1000);	
		
		//xath = //tagname[@attributeName='value']
		
		WebElement xpath = driver.findElement(By.xpath("//input[@name='username' or @id='login-username' or @class='phone-no']"));
		xpath.sendKeys("test4@yahoo.com");
		Thread.sleep(3000);
	
		
		//linktext
		//WebElement linkText = driver.findElement(By.linkText("Forgot username?"));
		//linkText.sendKeys("test5@yahoo.com");
		//Thread.sleep(2000);
		//linkText.click();
		//Thread.sleep(2000);
		
	
	}
	
	
}
