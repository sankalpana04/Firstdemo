package udemytask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		
       driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
       driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]")).click();
       int rows = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr")).size();
       
       System.out.println(rows);
       int count =0;
       for(int i=1;i<rows;i++) {
    	   String status = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr["+i+"]/td[5]")).getText();
    	   if(status.equals("Enabled")) {
    		   count++;
    	   }
       }
       System.out.println("Number of enabled employees is:"+count);
       System.out.println("Number of disabled employess is:"+(rows-count));
	}

}
