import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReadingDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fi=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");		
		int total_rows=sh.getLastRowNum();
		int total_cols=sh.getRow(8).getLastCellNum();
		
		for(int row=0;row<total_rows;row++){
			XSSFRow r=sh.getRow(row);
			for(int col=0;col<total_cols;col++){
				XSSFCell cell=r.getCell(col);
				System.out.println(cell.getStringCellValue());
			}
		}	
		
//		XSSFRow row =sh.getRow(2);
//		XSSFCell cell=row.getCell(1);
//		System.out.println(cell.getStringCellValue());
		
		
		wb.close();
		fi.close();

	}

}
