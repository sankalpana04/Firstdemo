package udemytask;



import java.sql.DriverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FixedDepositCalculator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		String path = "C:\\Excel_Data\\caldata.xlsx";
		XLUtils.setExcelFile(path, "Sheet1");
		int rowcount = XLUtils.getRowCount(path, "Sheet1");
		for(int i=0;i<=rowcount;i++) {
			int princ = Integer.parseInt(XLUtils.getCellData(path, "Sheet1", i, 0));
			int RateofInterest = Integer.parseInt(XLUtils.getCellData(path, "Sheet1", i, 1));
			int Period = Integer.parseInt(XLUtils.getCellData(path, "Sheet1", i, 2));
			String Frequency = XLUtils.getCellData(path, "Sheet1", i, 3);
			double exp_mvalue = Double.parseDouble(XLUtils.getCellData(path, "Sheet1", i, 4));
			
			driver.findElement(By.id("principal")).sendKeys(String.valueOf(princ));
			driver.findElement(By.id("interest")).sendKeys(String.valueOf(RateofInterest));
			driver.findElement(By.id("tenure")).sendKeys(String.valueOf(Period));
			
			Select periodropdown = new Select(driver.findElement(By.id("tenurePeriod")));
			
			periodropdown.selectByVisibleText("year(s)");
			
			Select freqdropdown = new Select(driver.findElement(By.id("frequency")));
			freqdropdown.selectByVisibleText("frequency");
			driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")).click();
			String act_mvalue=driver.findElement(By.xpath("//*[@id='resp_matval']/strong")).getText();	
			
			if(exp_mvalue== Double.parseDouble(act_mvalue)) {
				
				System.out.println("TEST PASSED");
				
			}
			else {
				System.out.println("TEST FAILED");
			}
			
			driver.findElement(By.xpath("//*[@id='fdMatVal']/div[2]/a[2]/img")).click();
			Thread.sleep(3000);
			
		}
		
		

	}

}
