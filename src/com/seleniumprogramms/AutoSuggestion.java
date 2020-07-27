package com.seleniumprogramms;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.reusable.BaseClass;

public class AutoSuggestion extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException{
		
		launchapp("www.jqueryui.com/autocomplete/");				
		frame(0);
		sendText(By.id("tags"), "A");
	   
	   
	   for(int i=0;i<ele.size();i++){
		   
		   String text=ele.get(i).getText();
		   if(text.equalsIgnoreCase("BASIC")){
			   ele.get(i).click();
			   break;
		   }
		   
	   }
	   
	   Thread.sleep(4000);
	   driver.close();

	}

}
