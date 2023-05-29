package com.rsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class kiran_files {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
	//	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    WebDriver  driver= new ChromeDriver();
		driver.navigate().to("file:///C:/Users/HP/Downloads/JARS/selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		
		
/*	WebElement  element= driver.findElement(By.linkText("More info"));
	  System.out.println(element.getText());
	  
	  WebElement  ele= driver.findElement(By.partialLinkText("More "));
	 System.out.println( ele.getText());
	  
	  List<WebElement> element= driver.findElements(By.linkText("More info"));
	  for (WebElement elements : element) {
		   
		   System.out.println(elements.getText());*/
		   
		   driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
		   
	    List<WebElement> element =driver.findElements(By.tagName("tr"));
		    for(WebElement elements : element) {
		    	System.out.println(elements.getText());
		    }
	
		  
		/*	 for(int i=1;i<10;i++) {
				 for (int j = 1; j < 10; j++) {	
        List<WebElement> elements =  driver.findElements(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+i+"]/td["+j+"]"));
			 
			   for (WebElement element : elements) {
		            
		            System.out.print( element.getText());
		            
		        }
			   System.out.println();
			 }
				   
			 } */
					
				}
				
			}
			   
		   
		  
	       
	
	   

	


