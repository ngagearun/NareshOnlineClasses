package com.seleniumprogramms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//implicit wait
		driver.navigate().to("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Downloads")).click();
		
		driver.findElement(By.linkText("Projects")).click();
		
		
		
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		String currenturl=driver.getCurrentUrl();
		driver.get(currenturl);
		
		driver.navigate().to(currenturl);;
		
		driver.findElement(By.id("search-by")).sendKeys(Keys.F5);
		
		driver.close();
		
		
		

	}

}
