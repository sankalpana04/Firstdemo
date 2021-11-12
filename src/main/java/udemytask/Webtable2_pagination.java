package udemytask;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable2_pagination {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.get("http://www.seleniumeasy.com/test/table-pagination-demo.html");
      driver.manage().window().maximize();
      Thread.sleep(3000);
      WebElement paging_element = driver.findElement(By.xpath("//*[@id=\"myPager\"]"));
      List<WebElement> sub_links = paging_element.findElements(By.tagName("a"));
      System.out.println("Total num of paging links is:"+sub_links.size());
      
      if(sub_links.size()>0) {
    	  
    	  System.out.println("Links are present");
    	  
    	  for(int i=0;i<sub_links.size()-1;i++) {
    		  
    		 WebElement link = driver.findElement(By.xpath("//a[contains(text(),'"+i+"')]"));
    		 link.click();
    		 Thread.sleep(2000);
    		 int rows = driver.findElements(By.xpath("//*[@id=\"myTable\"]/tr")).size();
    		 
    		 for(int r=1;r<rows;r++) {
    			 
    			 String col1 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr["+r+"]/td[1]")).getText();
    			 String col2 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr["+r+"]/td[2]")).getText();
    			 String col3 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr["+r+"]/td[3]")).getText();

    			 String col4 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr["+r+"]/td[4]")).getText();

    			 String col5 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr["+r+"]/td[5]")).getText();

    			 String col6 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr["+r+"]/td[6]")).getText();
    			 String col7 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr["+r+"]/td[7]")).getText();
    			 
    			 System.out.println(col1+" "+col2+" "+col3+" "+col4+" "+col5+" "+col6+" "+col7);

    		 }
    	  }
    	  
    	  
      }
      
      else {
    	  System.out.println("links are not present");
      }
      
	}

}
