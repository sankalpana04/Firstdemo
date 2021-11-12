package jsDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Javascriptutil {

		// TODO Auto-generated method stub
	
	public static void falsh(WebElement element, WebDriver driver) {
	
		String bgcolor = element.getCssValue("backgroundColor");//green
		
		for(int i=0;i<500;i++) {
			
			changeColor("#000000",element,driver);
			changeColor("bgcolor",element,driver);
			
		}
		
	}

		private static void changeColor(String color, WebElement element, WebDriver driver) {
			// TODO Auto-generated method stub
			
			JavascriptExecutor js =  ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
			try {
				Thread.sleep(20);
			}
			catch (InterruptedException e) {
			}
			}
			
		}

	


