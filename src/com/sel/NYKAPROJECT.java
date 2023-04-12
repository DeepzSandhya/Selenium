package com.sel;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NYKAPROJECT {
	
public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepak\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/sp/new-customers/new-customers?utm_content=ads&utm_source=GooglePaid&utm_medium=search&utm_campaign=Search_Nykaa_NCA&gclid=EAIaIQobChMIg9e94Izo_QIVmAsrCh3KhgDuEAAYASAAEgKsQfD_BwE");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement Makeup = driver.findElement(By.xpath("//a[@href='https://www.nykaa.com/sp/makeup-sale/makeup-sale']"));
		a.clickAndHold(Makeup).perform();
		
		
	

}
}
