package udemytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablecountrowsandcol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
	   driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
	   driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	   driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
	   driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
	   driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
	   driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
	   
	  int rows = driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr")).size();
	  
	  int cols = driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/td")).size();
	  
	   
	  
	  for(int i=1;i<rows;i++) {
		  
		  System.out.println(i);
		  
	  }
	
	
	 for(int j=1;j<cols;j++)
	 {
		 
		 System.out.println(j);
	 }
}
}