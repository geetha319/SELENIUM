package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropdownPractice {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\SeleniumPractice\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	    WebElement cna = driver.findElement(By.xpath("//a[text()='Create new account']"));
	    cna.click();
	    Thread.sleep(4000);
	    WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
	    Select sc1=new Select(Month);
	    sc1.selectByVisibleText("Mar");
	    WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	    Select sc2=new Select(year);
	    sc2.selectByVisibleText("1999");
	    System.out.println("-------------");
	    boolean check=sc1.isMultiple();
	    boolean check1=sc2.isMultiple();
	    System.out.println(check);
	    System.out.println(check1);
	    System.out.println("-------------");
	    List<WebElement> list1=sc1.getOptions();
	    for(WebElement it1:list1) {
	    	String text=it1.getText();
	    	System.out.println(text);    	
	    }
	    List<WebElement> list2=sc2.getOptions();
	    for(WebElement it1:list2) {
	    	String text=it1.getText();
	    	System.out.println(text);
	    	
	    	
	    }
	    
	    
	}

}
