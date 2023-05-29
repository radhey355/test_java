package com.rsp;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_page {

	public static void main(String[] args) throws Exception {
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		
		Thread.sleep(3000);
		
	List<WebElement> texts=	driver.findElements(By.xpath("//ul[@role='listbox']//span"));
     for( WebElement text:texts) {
    	 System.out.println(text.getText());
    	 driver.quit();
     }
    	 
	}

}
