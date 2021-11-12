package udemytask;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("E:\\DDT_ExcelData/Book1.xlsx");//locating file
		XSSFWorkbook workbook = new XSSFWorkbook(file); //navigating through fie
		XSSFSheet sheet = workbook.getSheet("sheet2");//navigating through sheet
		int rowsnumber = sheet.getLastRowNum();//counting rows
        int colnumber = sheet.getRow(0).getLastCellNum();//counting cols
         System.out.println(rowsnumber);
         System.out.println(colnumber);
        
        for(int r=0;r<rowsnumber;r++) {
        	
        	XSSFRow row = sheet.getRow(r); 
        	
        	for(int c=0;c<colnumber;c++) {
        		
        		String value=row.getCell(c).toString();
        		
        		System.out.print(value+"       ");

        		
        	}
        	
        	System.out.println("   ");
        }
		
	}

}
