package com.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchPractice {
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\SeleniumPractice\\Selenium\\Drivers\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	
	
	
}
}
