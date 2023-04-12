package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipleapp {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepak\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
        Thread.sleep(10000);
		
		String title = driver.getTitle();
		System.out.println("Insta title:" +title);
		
		String URL = driver.getCurrentUrl();
		System.out.println("Insta URL:" +URL);
		
		String PgSc = driver.getPageSource();
		System.out.println("Insta pagesource:" +PgSc);

        driver.navigate().to("https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoiZW4ifQ%3D%3D%22%7D");
		
        driver.navigate().back();
        Thread.sleep(5000);

        driver.navigate().forward();
        Thread.sleep(5000);

        driver.navigate().refresh();
        Thread.sleep(5000);

        driver.close();
        
        Thread.sleep(10000);
        driver.quit();
	}

}
