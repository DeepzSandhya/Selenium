package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bookmyshow {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Deepak\\\\eclipse-workspace\\\\Selenium\\\\New\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/chennai");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement search = driver.findElement(By.xpath("//div[@class='sc-jTzLTM sc-chbbiW hPUYXB']"));
		search.sendKeys("Tu jhooti main makkar");
	}

}
