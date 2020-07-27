package com.seleniumprogramms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.reusable.BaseClass;

public class WebTableDemo extends BaseClass {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fi=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("WritingData");	
		
		launchapp("https://money.rediff.com/gainers/bsc/dailygroupa?");
		WebElement table_body=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody"));
		List<WebElement> table_rows=table_body.findElements(By.tagName("tr"));
		for(int i=0;i<2;i++){
			
			List<WebElement> table_cols=table_rows.get(i).findElements(By.tagName("td"));
			XSSFRow row=sh.createRow(i);
			for(int j=0;j<table_cols.size();j++){
				String  values=table_cols.get(j).getText();
				row.createCell(j).setCellValue(values);
			}
		}
		FileOutputStream fo=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
		wb.write(fo);
        wb.close();
        fi.close();
        fo.close();
		driver.close();

	}

}
