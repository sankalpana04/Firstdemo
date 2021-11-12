package HelloWorld;


import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplication {

	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\FirstDemo\\chromedriver.exe");
		
	
	String str="test123";
	
	byte[] encodedString=Base64.encodeBase64(str.getBytes());
	System.out.println("encoded string:"+new String(encodedString));
	
	
	byte[] decodedString=Base64.decodeBase64(encodedString);
	System.out.println("decoded string:"+new String(decodedString));
	
}

}


