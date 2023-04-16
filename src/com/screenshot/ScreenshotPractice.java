package com.screenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotPractice {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\SeleniumPractice\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement un = driver.findElement(By.xpath("//input[@type='text']"));
		un.sendKeys("geethaminion");
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("balaji33");
		WebElement btn = driver.findElement(By.xpath("//div[text()='Log in']"));
		btn.click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dos=new File("C:\\Users\\Administrator\\SeleniumPractice\\Selenium\\Screenshots\\pic8.png");
		FileHandler.copy(source, dos);
	
}
}

