package com.Base;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.cache.LoadingCache;

import io.github.bonigarcia.wdm.WebDriverManager;




public class Base {
	
	 static WebDriver driver;
	 static Actions a;
	 
	 public static  void lauchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	 
	 public static  void title() {
		 
		 String ttl = driver.getTitle();
		 System.out.println(ttl);
		 
	 }
	 
	 public static  void close() {
		
		 driver.close();
		 
		 }
	 public static  void load(String url) {
		 
		 driver.get("https://www.facebook.com/");
		 
		 		

	}
	 
	 public static  void filText(WebElement element,String value) {
		element.sendKeys(value); 
		
}
	 public static  void btnClick(WebElement element) {
		 
		 element.click();
		 
		 

	}
	 
	 public static  void dragdrop(WebElement src, WebElement dst) {
		 a = new Actions(driver);
		 a.dragAndDrop(src, dst).perform();
		 
	}
	 
	 public static  void filetext(WebElement  element, String value) {
		 element.sendKeys(value);
		
		 }
	 public static void printtext(WebElement element) {
		 String text = element.getText();
		 System.out.println(text);
		 

	}
	 
	 public static void printAttribute(WebElement element,String ref) {
		 String given = element.getAttribute(ref);
		 System.out.println(given);
		 

	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	

	
	 
		

	}
	 
	 
	 
	 
	
		

	}
	 
