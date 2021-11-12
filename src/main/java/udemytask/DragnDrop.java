package udemytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.id("box6"));//souce element italy
		WebElement target = driver.findElement(By.id("box106"));//target element
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();//drag and drop

	}

}
