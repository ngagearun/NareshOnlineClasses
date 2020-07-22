package com.seleniumprogramms;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.reusable.BaseClass;

public class ExplicitWaitCommand extends BaseClass{

	public static void main(String[] args) {
		launchapp("http://only-testing-blog.blogspot.com/2014/06/alert_6.html");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		alert();
       driver.close();
	}

}
