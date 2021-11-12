package udemytask;

import java.awt.Desktop.Action;
import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();
	driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	Actions action = new Actions(driver);

	WebElement button = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
	
	action.contextClick(button).build().perform();
	
driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();	
	Alert a = driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();

	
	
	

	}

}
