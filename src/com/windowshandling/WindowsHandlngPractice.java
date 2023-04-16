package com.windowshandling;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;


public class WindowsHandlngPractice {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\SeleniumPractice\\Selenium\\Drivers\\chromedriver.exe" );
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement es = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		Actions act= new Actions(driver);
	    act.contextClick(es).build().perform();
	    Robot robo=new Robot();
	    robo.keyPress(KeyEvent.VK_PAGE_DOWN);
	    robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    robo.keyPress(KeyEvent.VK_ENTER);
	    robo.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);
		WebElement ap = driver.findElement(By.xpath("//a[text()='Amazon Pay']"));
	    act.contextClick(ap).build().perform();
	    robo.keyPress(KeyEvent.VK_PAGE_DOWN);
	    robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    robo.keyPress(KeyEvent.VK_ENTER);
	    robo.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);
	    WebElement fs = driver.findElement(By.xpath("//a[text()='Fashion']"));
	    act.contextClick(fs).build().perform();
	    robo.keyPress(KeyEvent.VK_PAGE_DOWN);
	    robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    robo.keyPress(KeyEvent.VK_ENTER);
	    robo.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(4000);
	    System.out.println("-----------------");
	    int s1=driver.getWindowHandles().size();
	    System.out.println(s1);
	    System.out.println("---------------");
	    String pw=driver.getWindowHandle();
	    System.out.println(pw);
	    System.out.println("---------------");
        Set<String> allwin=driver.getWindowHandles();
		for(String cp:allwin) {		
			String title=driver.switchTo().window(cp).getTitle();
			System.out.println(title);
			
		}
		System.out.println("-----------------");
		String afs="Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids";
		for(String cp:allwin) {
		if(driver.switchTo().window(cp).getTitle().equals(afs)){
			break;

			}
            
			
		}
		
        String azp="Amazon Pay";
        for(String cp:allwin) {
    		if(driver.switchTo().window(cp).getTitle().equals(azp)){
    			break;

    			}
    		    	
    			
    		}
        TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dos=new File("C:\\Users\\Administrator\\SeleniumPractice\\Selenium\\Screenshots\\pic1.png");
		FileHandler.copy(source, dos);
		Thread.sleep(5000);
		String ets="Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";
        for(String cp:allwin) {
    		if(driver.switchTo().window(cp).getTitle().equals(ets)){
    			break;

    			}
    		    	
    			
    		}
        JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(5000);
		je.executeScript("window.scrollBy(0,-3000)");
		WebElement bottom = driver.findElement(By.xpath("//a[text()='Help']"));    
		je.executeScript("arguments[0].scrollIntoView()",bottom);
		Thread.sleep(5000);
		
		 for(String cp:allwin) {
	    		if(!cp.equals(pw)){
	    	driver.switchTo().window(cp).close();
	    	}
		 }


        
        

		
	}

}
