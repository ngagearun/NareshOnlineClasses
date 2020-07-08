package com.seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Select date=new Select(driver.findElement(By.name("param[start_month]")));
		date.selectByIndex(2);
		Thread.sleep(3000);
		date.selectByValue("5");
		Thread.sleep(3000);
		date.selectByVisibleText("Jun");
		Thread.sleep(3000);
		driver.close();
		

	}

}
