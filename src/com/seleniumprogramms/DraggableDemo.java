package com.seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableDemo {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");		
		Thread.sleep(3000);			
		Actions action=new Actions(driver);
		Thread.sleep(3000);	
		driver.switchTo().frame(0);
		
		WebElement draggable =driver.findElement(By.id("draggable"));
		action.dragAndDropBy(draggable,235,67).perform();
		Thread.sleep(3000);
		driver.close();

	}

}
