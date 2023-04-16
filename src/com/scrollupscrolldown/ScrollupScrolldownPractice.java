package com.scrollupscrolldown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupScrolldownPractice {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\SeleniumPractice\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement lbtn = driver.findElement(By.xpath("//button[text() = '✕']"));
		lbtn.click();
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(5000);
		je.executeScript("window.scrollBy(0,-3000)");
		WebElement bottom = driver.findElement(By.xpath("//span[text() = 'Help Center']"));    
		je.executeScript("arguments[0].scrollIntoView()",bottom);
		
		
		
		
	
	}
}
