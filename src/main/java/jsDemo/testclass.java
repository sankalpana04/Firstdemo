package jsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\FirstDemo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("pavanonlinetraining");
		WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("xyz");
		driver.navigate().refresh();
		username.sendKeys("pavanonlinetraining");
	}

}
