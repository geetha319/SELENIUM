package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathPractice {
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\SeleniumPractice\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
	    driver.get("https://adactinhotelapp.com/");
	    driver.manage().window().maximize();
	    WebElement un = driver.findElement(By.xpath("//input[contains(@id,'username')]"));
	    un.sendKeys("geethu319");
	    WebElement fg = driver.findElement(By.xpath("//a[contains(text(),'Forgot')]"));
	    fg.click();
	}

}
