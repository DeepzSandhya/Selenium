package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Task {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepak\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://adactinhotelapp.com/index.php");
	    driver.manage().window().maximize();
	    
	    WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
	    Username.sendKeys("sandhyadeepz");
	    
	    Thread.sleep(3000);

	    WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
	    Password.sendKeys("Sandhya19!");
	    
	    WebElement Login = driver.findElement(By.xpath("//input[@id='login']"));
	    Login.click();
	    
	    WebElement Location = driver.findElement(By.xpath("//select[@id='location']"));
	    
	    Select s = new Select(Location);
	    s.selectByValue("New York");
	    Thread.sleep(3000);

        WebElement Hotels = driver.findElement(By.id("hotels"));
	    
	    Select s1 = new Select(Hotels);
	    s1.selectByVisibleText("Hotel Sunshine");
	    Thread.sleep(3000);

	    
        WebElement Roomtype = driver.findElement(By.id("room_type"));
	    
	    Select s2 = new Select(Roomtype);
	    s2.selectByIndex(1);
	    Thread.sleep(3000);

	    
        WebElement RoomNos = driver.findElement(By.id("room_nos"));
	    
	    Select s3 = new Select(RoomNos);
	    s3.selectByIndex(1);
	    
        WebElement CheckIn = driver.findElement(By.id("datepick_in"));
	    CheckIn.sendKeys("30/04/2023");
	    
	    WebElement Checkout = driver.findElement(By.id("datepick_out"));
	    Checkout.sendKeys("01/05/2023");
	    
        WebElement AdultRoom = driver.findElement(By.xpath("//select[@id='adult_room']"));
	    
	    Select s4 = new Select(AdultRoom);
	    s4.selectByValue("1");
	    Thread.sleep(3000);
	    
        WebElement childRoom = driver.findElement(By.id("child_room"));
	    
	    Select s5 = new Select(childRoom);
	    s5.selectByIndex(0);
	    Thread.sleep(3000);

	    
	    WebElement Search = driver.findElement(By.id("Submit"));
	    Search.click();
	    
	    WebElement Radiobtn = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
	    Radiobtn.click();
	    
	    WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
	    Continue.click();
	    
	    WebElement Firstname = driver.findElement(By.id("first_name"));
	    Firstname.sendKeys("Sandhya");
	    
	    WebElement Lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
	    Lastname.sendKeys("Somalingam");
	    
	    WebElement Address = driver.findElement(By.id("address"));
	    Address.sendKeys("Saligramam Vadapalani chennai 600093");
	    
	    WebElement cardNo = driver.findElement(By.id("cc_num"));
	    cardNo.sendKeys("6056204340120214");
	    
	    WebElement cardType = driver.findElement(By.id("cc_type"));
	    
	    Select s6 = new Select(cardType);
	    s6.selectByValue("VISA");
	    
        WebElement ExpiryMonth = driver.findElement(By.id("cc_exp_month"));
	    
	    Select s7 = new Select(ExpiryMonth);
	    s7.selectByValue("4");
	    
        WebElement Expiryyear = driver.findElement(By.id("cc_exp_year"));
	    
	    Select s8 = new Select(Expiryyear);
	    s8.selectByValue("2013");
	    
	    WebElement CVV = driver.findElement(By.id("cc_cvv"));
	    CVV.sendKeys("793");
	    
	    WebElement Booknow = driver.findElement(By.id("book_now"));
	    Booknow.click();
	    
	    Thread.sleep(3000);
	    
	    WebElement logout = driver.findElement(By.id("logout"));
	    logout.click();
	    
	}

	private static void click() {
		// TODO Auto-generated method stub
		
	}
	
	

}
