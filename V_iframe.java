package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class V_iframe extends all{
	
	@Test (priority = 0)
	public void openurl() {
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.manage().window().maximize();
	}
	
	@Test (priority = 1)
	public void iframe() throws InterruptedException {
		
		WebElement Iframe = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(Iframe);
//		driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		WebElement newyork = driver.findElement(By.xpath("//label[normalize-space()='New York']"));
		newyork.click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		WebElement text = driver.findElement(By.className("desc"));
		System.out.println(text.getText());
		Thread.sleep(2000);
	}

}
