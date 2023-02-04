package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T_dropdown extends all{
	
	@Test (priority = 0)
	public void name1() {
		driver.get("https://qavbox.github.io/demo/signup/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void name2() throws InterruptedException {
		
		WebElement gender = driver.findElement(By.xpath("//select[@name='sgender']"));
		Select select = new Select(gender);
		
		select.selectByIndex(1);
		Thread.sleep(1000);
		
		select.selectByValue("na");
		Thread.sleep(1000);
		
		select.selectByVisibleText("Male");
		Thread.sleep(1000);
	}
}
