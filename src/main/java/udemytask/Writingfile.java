package udemytask;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream file = new FileOutputStream("E:\\DDT_ExcelData\\Book1.xlsx");//writing file
		XSSFWorkbook workbook = new XSSFWorkbook();//writiing workbook
		XSSFSheet sheet = workbook.createSheet("Data");//writing sheet
		for(int i=0;i<5;i++) {
			XSSFRow row = sheet.createRow(i);
		
		
		for(int j=0;j<5;j++) {
		
			row.createCell(j).setCellValue("welcome");
			
		}

	}
		workbook.write(file);
		System.out.println("WRITING TO FILE IS COMPLETED");

}
}
