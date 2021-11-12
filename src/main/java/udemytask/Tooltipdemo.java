package udemytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltipdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://jqueryui.com/tooltip/");
		 driver.manage().window().maximize();
		 driver.switchTo().frame(0);
		 WebElement agebox = driver.findElement(By.id("age"));
		 String tooltiptxt = agebox.getAttribute("title");
		 System.out.println(tooltiptxt);
		 
		 if(tooltiptxt.equals("We ask for your age only for statistical purposes.")) {
			 System.out.println("test is passed");
		 }
		 else
		 {
			 System.out.println("TEST IS FAILED");
		 }
		 

	}

}
