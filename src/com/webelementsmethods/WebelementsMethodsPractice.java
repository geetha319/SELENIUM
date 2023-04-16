package com.webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementsMethodsPractice {
		public static void main(String[]args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\SeleniumPractice\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("a_g_consultancy");
		//email.clear();
		WebElement pass= driver.findElement(By.name("pass"));
		pass.sendKeys("Info@2022");
		WebElement btn= driver.findElement(By.name("login"));
		btn.click();
		
		

		}
}
