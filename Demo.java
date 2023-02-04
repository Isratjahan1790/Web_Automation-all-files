package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

public class Demo extends all{
	
	@Test (priority = 0)
	public void test1() {
		driver.get("https://best.aliexpress.com/?af=5c675ee46b398&dp=5c675ee46b398&aff_fcid=01a9c99e9f94412b994f827be299244f-1671598292015-08028-_DBDXrxD&tt=CPS_NORMAL&aff_fsk=_DBDXrxD&aff_platform=portals-promotion&sk=_DBDXrxD&aff_trace_key=01a9c99e9f94412b994f827be299244f-1671598292015-08028-_DBDXrxD&terminal_id=6e98a04388e04ef390f197e4a9d92007");
		driver.manage().window().maximize();
	}
	
	@Test (priority = 1)
	public void name2() throws InterruptedException {
		
	
		Actions actions = new Actions(driver);
		WebElement womens = driver.findElement(By.linkText("Women's Fashion"));
		actions.moveToElement(womens).perform();
		Thread.sleep(2000);
		
		WebElement Dresses = driver.findElement(By.linkText("Dresses"));
		actions.moveToElement(Dresses).perform();
		Thread.sleep(2000);
		
		WebElement Jeans = driver.findElement(By.linkText("Jeans"));
		actions.moveToElement(Jeans).perform();
		Thread.sleep(1000);
		
		WebElement hats = driver.findElement(By.linkText("Bucket Hats"));
		hats.click();
		Thread.sleep(3000);
		
		
		WebElement checkbox = driver.findElement(By.xpath("//span[contains(text(),'PLUS')]"));
		checkbox.click();
		Thread.sleep(1000);
		

	}

}


