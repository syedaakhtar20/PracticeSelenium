package com.homework;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

    public class Homework {

    @Test
	public void openBrowser() throws InterruptedException {
	 //WebDriver driver;
	 
	 ChromeDriver driver = new ChromeDriver();
	 
	 driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
	 
	 driver.manage().window().maximize();
	 
     driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Syeda");
	 
	 driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Akhtar");
	 
	 driver.findElement(By.cssSelector("input[placeholder='Email Address']")).sendKeys("Syedaakhtar17@yahoo.com");
	 
	 driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Testing website");
	 
	 driver.findElement(By.cssSelector("//input[value='SUBMIT']"));
	 
	 Thread.sleep(3000);
	
	 System.out.println(driver.findElement(By.xpath("//h1[text()='Thank You for your Message!")).getText());
	 
	 driver.close();
	}

	}

