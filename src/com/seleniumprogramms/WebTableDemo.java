package com.seleniumprogramms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.reusable.BaseClass;

public class WebTableDemo extends BaseClass {

	public static void main(String[] args) {
		
		launchapp("https://money.rediff.com/gainers/bsc/dailygroupa?");
		WebElement table_body=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody"));
		List<WebElement> table_rows=table_body.findElements(By.tagName("tr"));
		for(int i=0;i<2;i++){
			
			List<WebElement> table_cols=table_rows.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<table_cols.size();j++){
				String  values=table_cols.get(j).getText();
				System.out.println(values);
			}
		}
		
		driver.close();

	}

}
