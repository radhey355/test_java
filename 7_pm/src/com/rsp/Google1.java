package com.rsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google1 {

	public static void main(String[] args) throws Exception {
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		
	
		driver.findElement(By.className("gb_h")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href, 'https://mail.google.com/mail')]")).click();

	}

}
