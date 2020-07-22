package com.reusable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
	static String browsername="chrome";
	
	public static void launchapp(String appurl){	
		 if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
		 }else  if(browsername.equalsIgnoreCase("firefox")){
			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\geckodriver.exe");
				driver=new FirefoxDriver(); 
		 }
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(appurl);		
	}
	
	public static void click(By locatorname){
		driver.findElement(locatorname).click();
	}
	
	public static void sendText(By locatorname,String text){
		driver.findElement(locatorname).clear();
		driver.findElement(locatorname).sendKeys(text);
	}
	
	public static String readtext(By locatorname){
		
		String value=driver.findElement(locatorname).getText();
		return value;
	}
	
	public static void dropdown(By locatorname,String text){
		
		Select select=new Select(driver.findElement(locatorname));
		select.selectByVisibleText(text);
	}
	
	
	public static void alert(){
		driver.switchTo().alert().accept();
	}
	
	public static boolean isEnabled(By locatorname){
		
		boolean status=driver.findElement(locatorname).isEnabled();
		return status;
	}

	public static void draggable(By locatorname,int x,int y){
		Actions action=new Actions(driver);
		action.dragAndDropBy(driver.findElement(locatorname), x, y).build().perform();
	}
	
	public static void frame(int index){
		driver.switchTo().frame(index);
	}
	
	
}
