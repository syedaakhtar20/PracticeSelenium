package com.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearingCss {
	
	@Test
	public void openBrowser() {
		//WebDriver driver;
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Login-Portal/index.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Syeda");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//button[@id='login-button']")).click();
		
		
	}

}
