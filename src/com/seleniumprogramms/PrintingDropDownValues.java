package com.seleniumprogramms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.reusable.BaseClass;

public class PrintingDropDownValues extends BaseClass {

	public static void main(String[] args) {
		
		launchapp("https://www.mortgagecalculator.org/");
		
		List<WebElement> month=driver.findElements(By.xpath("//*[@id='calc']/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[8]/select/option"));
		System.out.println(month.size());
        for(int i=0;i<month.size();i++){
		String text=month.get(i).getText();
		System.out.println(text);
        }
        driver.close();
	}

}
