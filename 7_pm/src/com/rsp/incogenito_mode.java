package com.rsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class incogenito_mode {

	public static void main(String[] args) {
		
         WebDriverManager.chromedriver().setup();
         ChromeOptions options= new ChromeOptions();
         options.addArguments("incognito");
         DesiredCapabilities cap= new DesiredCapabilities();
         cap.setCapability(ChromeOptions.CAPABILITY, options);

         options.merge(cap);
         WebDriver driver= new ChromeDriver(options);
         driver.get("https://www.google.com");
         driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
         driver.findElement(By.id("password")).sendKeys("123456");
         driver.findElement(By.xpath("//button")).click();
}
}