package com.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Task {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepak\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458755421&hvpos=&hvnetw=g&hvrand=9740841487749464336&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061897&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQiA6rCgBhDVARIsAK1kGPJ1XFu_p2dWER70N_9HXbPqgMpoaa33dQdRWPoxvGluMTiZ4Z2c4PUaApkCEALw_wcB");
	driver.manage().window().maximize();
	
	Actions mobiles = new Actions(driver);
	
	WebElement rightclick = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[5]"));
	mobiles.contextClick(rightclick).perform();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);


	}

}
