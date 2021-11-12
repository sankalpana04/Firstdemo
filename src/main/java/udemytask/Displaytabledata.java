package udemytask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displaytabledata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    	WebDriver driver = new ChromeDriver();
	    	driver.get("http://demo.guru99.com/test/web-table-element.php");
	    	driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table")); //Locating table
	    	
	    	List <WebElement> header = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	    	for(int head=1;head<=header.size();head++) {
	    		WebElement headval = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th["+head+"]"));
	    		System.out.println(headval.getText());
	    		
	    	}
	    	
	  List <WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));//Locate rows
	  
	    int row_count = rows.size();//counting size
	    System.out.println(row_count);
	    for(int i=0;i<row_count;i++) {
	        	List <WebElement> cols = driver.findElements(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr["+i+"]/td"));
	        	for(int j=1;j<=cols.size();j++) {
	        		
	        		WebElement cell = driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr["+i+"]/td["+j+"]"));
	        		
	        		System.out.println(cell.getText());
	        		
	        	}
	    }	

	}
	}

