package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepak\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spotify.com/us/signup");
		
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s = new Select(Month);
		s.selectByIndex(1);
		
		Thread.sleep(3000);
		
		WebElement Day = driver.findElement(By.xpath("//input[@id='day']"));
		Day.sendKeys("19");
		
		Thread.sleep(3000);
		
		WebElement Year = driver.findElement(By.xpath("//input[@id='year']"));
		Year.sendKeys("1994");
		
		Thread.sleep(3000);
		
		WebElement Signup = driver.findElement(By.xpath("//span[text()='Sign up']"));
		Signup.click();		
		
	}

}
