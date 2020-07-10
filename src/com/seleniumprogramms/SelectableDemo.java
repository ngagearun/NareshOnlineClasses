package com.seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");		
		Thread.sleep(3000);			
		Actions action=new Actions(driver);	
		driver.switchTo().frame(0);
		
		WebElement item1=driver.findElement(By.xpath("//*[@id='selectable']/li[1]"));
		WebElement item3=driver.findElement(By.xpath("//*[@id='selectable']/li[3]"));
		WebElement item5=driver.findElement(By.xpath("//*[@id='selectable']/li[5]"));
		
		action.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).build().perform();
		action.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
