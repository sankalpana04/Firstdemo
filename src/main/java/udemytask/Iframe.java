package udemytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();//button
		WebElement outerframe = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));//identifying outer frame
		
         driver.switchTo().frame(outerframe);
         
         WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
         
         driver.switchTo().frame(innerframe);
         
         driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("text");
	}

}
