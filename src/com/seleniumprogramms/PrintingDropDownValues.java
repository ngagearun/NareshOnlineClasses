package com.seleniumprogramms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.reusable.BaseClass;

public class PrintingDropDownValues extends BaseClass {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fi=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("WritingData");	
		
		launchapp("https://www.mortgagecalculator.org/");
		
		List<WebElement> month=driver.findElements(By.xpath("//*[@id='calc']/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[8]/select/option"));
		System.out.println(month.size());
        for(int i=0;i<month.size();i++){
        	
		String text=month.get(i).getText();
		sh.createRow(i).createCell(2).setCellValue(text);		
        }
        FileOutputStream fo=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
		wb.write(fo);
        wb.close();
        fi.close();
        fo.close();
        driver.close();
	}

}
