package udemytask;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class EbayDDT_sampleDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		XSSFWorkbook wb = new XSSFWorkbook("E:\\DDT_ExcelData\\Book1.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rows = ws.getPhysicalNumberOfRows();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		for(int i=1;i<rows;i++)
		{
			String ddvalue =  ws.getRow(i).getCell(0).getStringCellValue();
			String textValue = ws.getRow(i).getCell(1).getStringCellValue();
			WebElement dd = driver.findElement(By.id("gh-cat"));
			Select s = new Select(dd);
			s.selectByVisibleText(ddvalue);
			
			WebElement text = driver.findElement(By.id("gh-ac"));
			text.clear();
			text.sendKeys(textValue);
			//text.sendKeys(textValue);
			
			driver.findElement(By.id("gh-btn")).click();
		}
	}

}
