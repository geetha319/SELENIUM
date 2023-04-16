package com.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethodsPractice {
	public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\SeleniumPractice\\Selenium\\Drivers\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	//navigation methods
	driver.navigate().to("https://www.facebook.com/login/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	//get title
	String title= driver.getTitle();
	System.out.println(title);
	//get current url
	String cu=driver.getCurrentUrl();
	System.out.println(cu);
	//close
	driver.close();

	
}

}
