package udemytask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		 driver.manage().window().maximize();
		 
		 //create javascriptexecutor variable
         JavascriptExecutor js = (JavascriptExecutor)driver;
		 //Approach 1 no.of pixels
         
        //js.executeScript("window.scrollBy(0,4000)", "");
         
         //Approach 2- finding the certain element on webpage
         
        // WebElement flag = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[1]/img"));
         
        // js.executeScript("arguments[0].scrollintoview();", flag);
         
        // Approach 2- finding the certain element by end of the webpage
         WebElement flag = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[1]/img"));
         
         js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
         

	}

}
