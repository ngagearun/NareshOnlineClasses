package com.seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Downloads")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Projects")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText(" ఆంధ్రప్రదేశ్ ")).click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		String currenturl=driver.getCurrentUrl();
		driver.get(currenturl);
		Thread.sleep(3000);
		driver.navigate().to(currenturl);;
		Thread.sleep(3000);
		driver.findElement(By.id("search-by")).sendKeys(Keys.F5);
		Thread.sleep(3000);
		driver.close();
		
		
		

	}

}
