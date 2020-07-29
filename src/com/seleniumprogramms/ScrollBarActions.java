package com.seleniumprogramms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.reusable.BaseClass;

public class ScrollBarActions extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		launchapp("https://www.flipkart.com/");
		Thread.sleep(6000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px dotted blue'", driver.findElement(By.linkText("Sony Camera")));

		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.linkText("Sony Camera")));
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sony Camera")).click();
		Thread.sleep(3000);
		//driver.close();
		
		

	}

}
