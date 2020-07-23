package com.seleniumprogramms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.reusable.BaseClass;

public class AutoSuggestion extends BaseClass {

	public static void main(String[] args) throws InterruptedException{
		
		launchapp("https://jqueryui.com/autocomplete/");				
		frame(0);
		sendText(By.id("tags"), "A");
	   List<WebElement> autosuggestion=driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
	   
	   for(int i=0;i<autosuggestion.size();i++){
		   
		   String text=autosuggestion.get(i).getText();
		   if(text.equalsIgnoreCase("BASIC")){
			   autosuggestion.get(i).click();
			   break;
		   }
		   
	   }
	   
	   Thread.sleep(4000);
	   driver.close();

	}

}
