package com.dropdown1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdownPractice {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\SeleniumPractice\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2/");
		driver.manage().window().maximize();
		WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select sc1=new Select(fruits);
		System.out.println("------------");
		boolean check=sc1.isMultiple();
		System.out.println(check);
		System.out.println("------------");
		List<WebElement>list1=sc1.getOptions();
		for(WebElement it1:list1) {
			System.out.println(it1.getText());
		}
		System.out.println("------------");
		sc1.selectByVisibleText("Banana");
		sc1.selectByValue("Orange");
		sc1.selectByIndex(3);
		//sc1.deselectByVisibleText("Orange");
		System.out.println("-----------");
		List<WebElement>list2=sc1.getOptions();
		for(WebElement it2:list2) {
			System.out.println(it2.getText());
		}
		System.out.println("-----------");
		WebElement fso=sc1.getFirstSelectedOption();
		System.out.println(fso.getText());
		sc1.deselectAll();
		
	}
	

}
