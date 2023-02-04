package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class U_hover extends all{

	@Test (priority = 0)
	public void open() {
		
		driver.get("https://www.daraz.com.bd/");
		driver.manage().window().maximize();
	}
	
	@Test (priority = 1)
	public void hover() throws InterruptedException {
		
		Actions actions = new Actions(driver);
		
		WebElement electronics = driver.findElement(By.xpath("//span[contains(text(),'Electronic Devices')]"));
		actions.moveToElement(electronics).perform();
		Thread.sleep(2000);
		
		WebElement mobile = driver.findElement(By.xpath("//span[contains(text(),'Latest Mobile Accessories')]"));
		actions.moveToElement(mobile).perform();
		Thread.sleep(6000);
		
		WebElement cable = driver.findElement(By.xpath("//span[contains(text(),'Cable & Converter')]"));
		cable.click();
		Thread.sleep(6000);
		
		//categories(H-W)
		WebElement categories = driver.findElement(By.xpath("//span[contains(text(),'Categories')]"));
		actions.moveToElement(categories).perform();
		Thread.sleep(2000);
		
		WebElement homes = driver.findElement(By.xpath("//span[contains(text(),'Home & Lifestyle')]"));
		actions.moveToElement(homes).perform();
		Thread.sleep(2000);
		
		WebElement stationary = driver.findElement(By.xpath("//span[contains(text(),'Stationery & Craft')]"));
		actions.moveToElement(stationary).perform();
		Thread.sleep(2000);
		
		WebElement pens = driver.findElement(By.xpath("//span[contains(text(),'Pens')]"));
		pens.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		
	}
}
