package com.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExpediaBrowser {
	WebDriver driver;
	
	@Test
	public void openBrowser() throws InterruptedException {
		
		driver= new ChromeDriver();
		
		driver.get("https://www.expedia.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[contains(text(),'Sign in')])[1]")).click();
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Syedashaki17@gmail.com");
		
		driver.findElement(By.id("loginFormSubmitButton")).click();
		
		driver.findElement(By.id("passwordButton")).click();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Type20");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
System.out.println(driver.findElement(By.xpath("//div[contains(text(),\"Email and password don't match. Please try again.\")]")).getText());

	
	}

}
