package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class U_assertion extends all{

	
	@Test (priority = 0)
	public void startHard_assertion() {
	
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
	}
	
	
	@Test (priority = 1)
	public void execute() throws InterruptedException {
		

		//Alert
		WebElement jsAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement jsConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		WebElement jsPromt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		
		
		jsAlert.click();
		driver.switchTo().alert().accept();	
		Thread.sleep(2000);
		
		String seen = result.getText();
		
		//Assert.assertEquals(seen, "You successfully clicked an alert");
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(seen, "You successfully clicked an");
		
		if(seen.contains("You successfully clicked an alert"));
		System.out.println(seen);
		Thread.sleep(2000);
	
		
		
		//Confirm
		//WebElement jsConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		//WebElement resultC = driver.findElement(By.xpath("//p[@id='result']"));
		Thread.sleep(2000);
		jsConfirm.click();

		String console = driver.switchTo().alert().getText();
		System.out.println(console);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		String seennn = result.getText();
		if(seennn.contains("You clicked: Cancel"));
		System.out.println(seennn);
		Thread.sleep(2000);
		
	
		
		//Promt
		//WebElement jsPromt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
//		WebElement resultP = driver.findElement(By.xpath("//p[@id='result']"));
//		Thread.sleep(2000);
		jsPromt.click();
		
		driver.switchTo().alert().sendKeys("Hello JS");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
        String seenn = result.getText();
        if(seenn.contains("Hello JS"));
        System.out.println(seenn);
        Thread.sleep(2000);
		
		soft.assertAll();
		
	}
}
