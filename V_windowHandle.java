package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class V_windowHandle extends all{
	
	@Test (priority = 0)
	public void openurl() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	}

	@Test (priority = 1)
	public void window() throws InterruptedException {
		
		//tab & window open
//		driver.switchTo().newWindow(WindowType.TAB);
//		Thread.sleep(1000);
//		driver.get("https://jqueryui.com/checkboxradio/");
//		Thread.sleep(1000);
//		
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		Thread.sleep(1000);
//		driver.get("https://google.com");
//		Thread.sleep(1000);
	
		
		//window handle
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getWindowHandle());
//		
//		driver.switchTo().newWindow(WindowType.TAB);
//		Thread.sleep(1000);
//		driver.get("https://jqueryui.com/checkboxradio/");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getWindowHandle());
//		Thread.sleep(1000);
//	
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		Thread.sleep(1000);
//		driver.get("https://google.com");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getWindowHandle());
//		Thread.sleep(1000);
		
		
		//multiple window handle
		
		driver.findElement(By.xpath("//a[@id='opentab']")).click();;
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();;
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		
		
		List<String>whandleList = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(whandleList.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		
		driver.switchTo().window(whandleList.get(0));
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		
		driver.switchTo().window(whandleList.get(2));
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		
	}
}
