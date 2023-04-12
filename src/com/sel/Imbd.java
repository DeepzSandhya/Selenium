package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imbd {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepak\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.imdb.com/");
	
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("Tiruchitarambalam");
	
	Thread.sleep(3000);
	
	WebElement sbtn = driver.findElement(By.xpath("//button[@id = 'suggestion-search-button']"));
	sbtn.click();
	
	WebElement Movie = driver.findElement(By.xpath("//a[@class='ipc-metadata-list-summary-item__t'][1]"));
	Movie.click();
	
	Thread.sleep(5000);
	
	WebElement Dirname = driver.findElement(By.xpath("//a[text()='Mithran Jawahar']"));

    String Dir = Dirname.getText();	
    System.out.println("Director Name:" +Dir);
    
    WebElement Story = driver.findElement(By.xpath("//div[@class='ipc-html-content-inner-div'][1]"));

    String Storyline = Story.getText();	
    System.out.println("StoryLine:" +Storyline);
	}
	}
