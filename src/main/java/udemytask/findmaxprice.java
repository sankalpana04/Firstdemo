package udemytask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findmaxprice {
    public static void main(String[] args) throws Exception {
    	double max=0;
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://demo.guru99.com/test/web-table-element.php");
    	driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table")); //Locating table
    	
  List <WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));//Locate rows
    int row_count = rows.size();//counting size
    System.out.println(row_count);
    for(int i=1;i<row_count;i++) {
        	WebElement cell = driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr["+i+"]/td[4]"));
        	String val = cell.getText();
          double value = Double.valueOf(val);
        	if(value>max) {
        		max = value;	
        	}
    }
    System.out.println(max);	
    }
}			
			
        
    