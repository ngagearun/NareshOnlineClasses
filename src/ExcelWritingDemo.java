import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelWritingDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fi=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet2");	
		sh.createRow(4).createCell(2).setCellValue("Welcometo excel writing programm");
		FileOutputStream fo=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
		wb.write(fo);
		System.out.println("Programm is executed");
		wb.close();
		fo.close();
		fi.close();

	}

}
