package com.seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("homeval")).clear();
		WebElement caps=driver.findElement(By.id("text"));
		caps.click();
		Thread.sleep(3000);
		driver.findElement(By.id("homeval")).sendKeys("32344555");
		Thread.sleep(3000);
		driver.findElement(By.name("cal")).click();
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		

	}

}
