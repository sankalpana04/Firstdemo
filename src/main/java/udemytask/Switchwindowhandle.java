package udemytask;

import java.util.BitSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import okio.ByteString;

public class Switchwindowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.automationtesting.in/Windows.html");
		 
		//String handlevalue = driver.getWindowHandle();
		
		//System.out.println(handlevalue);
		
		 driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		 
		 Set <String> handleval = driver.getWindowHandles();
		 
		 for(String h : handleval) {
			 
			 //System.out.println(h);
			 
			 String title = driver.switchTo().window(h).getTitle();
			// System.out.println(title);
			 
			 if(title.equals("Selenium")) {
				 driver.close();
			 }
		
		 }
		 

	}

}
