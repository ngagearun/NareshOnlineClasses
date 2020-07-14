package com.seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebBasedAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.com/");		
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
	}

}
