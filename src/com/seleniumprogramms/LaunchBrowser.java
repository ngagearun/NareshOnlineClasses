package com.seleniumprogramms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.reusable.BaseClass;

public class LaunchBrowser extends BaseClass {
	
	

	public static void main(String[] args) throws InterruptedException, IOException {
		launchapp("https://www.mortgagecalculator.org/");
		driver.findElement(By.id("homeval")).clear();
		
		sendText(By.id("homeval2"), "544666");
		Thread.sleep(3000);
		driver.findElement(By.name("cal")).click();
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		

	}

}
