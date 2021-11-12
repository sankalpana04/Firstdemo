package udemytask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Totalrownadcol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]")).click();
		 
		
		
		driver.findElement(By.xpath("//*[@id=\"resultTable\"]")); //Locating web table
		String rows =  driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[3]")).getText();//Locating row in webtable
		  System.out.println(rows);//displays row 3 cell data
		
		String cols = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[1]/td[2]")).getText();//displays first row and 2 nd col data
		
		System.out.println("The number of col is "+cols);
		
		
	
		

				

	}

}
