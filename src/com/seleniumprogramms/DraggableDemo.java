package com.seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.reusable.BaseClass;

public class DraggableDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
	
	    launchapp("https://jqueryui.com/draggable/");			
		Thread.sleep(3000);			
		frame(0);
		draggable(By.id("draggable"), 235, 67);
		Thread.sleep(3000);
		driver.close();

	}

}
