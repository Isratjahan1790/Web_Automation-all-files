package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class U_alert extends all{

	@Test (priority = 0)
	public void openURL() {
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
	}
	
	
	@Test (priority = 1)
	public void alertget() throws InterruptedException {
		
		
		//Alert
		WebElement jsAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
//		Thread.sleep(2000);
		jsAlert.click();
	
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();	
		
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		String seen = result.getText();
		if(seen.contains("You successfully clicked an alert"));
		System.out.println(seen);
		Thread.sleep(2000);
	
		
		//Confirm
		WebElement jsConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		Thread.sleep(2000);
		jsConfirm.click();

		String console = driver.switchTo().alert().getText();
		System.out.println(console);
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		WebElement resultC = driver.findElement(By.xpath("//p[@id='result']"));
		String seennn = resultC.getText();
		if(seennn.contains("You clicked: Cancel"));
		System.out.println(seennn);
		Thread.sleep(2000);
		
	
		//Promt
		WebElement jsPromt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		Thread.sleep(2000);
		jsPromt.click();
		
		driver.switchTo().alert().sendKeys("Hello JS");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement resultP = driver.findElement(By.xpath("//p[@id='result']"));
        String seenn = resultP.getText();
        if(seenn.contains("Hello JS"));
        System.out.println(seenn);
        Thread.sleep(2000);
	}
}
