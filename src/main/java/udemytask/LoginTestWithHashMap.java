package udemytask;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestWithHashMap {
	
	static HashMap<String,String> logindata(){
		
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("x", "mercury@mercury");
		hm.put("x", "mercury1@mercury1");
		hm.put("x", "mercury2@mercury2");
		
		return hm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(null);

	}

}
