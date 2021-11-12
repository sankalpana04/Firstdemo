package udemytask;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Fileupload
{

	public static void main(String[] args) throws InterruptedException, FindFailed {
		
		//System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='imagesrc']")).click();
		
		String imagesFilepath="C:\\SeleniumPractice\\Fruites\\";
		String inputFilepath="C:\\SeleniumPractice\\Fruites\\inputfiles\\";
		
		 Screen s = new Screen();
		 
	     Pattern fileInputTextBox = new Pattern(imagesFilepath + "FileTextBox.PNG");
	     Pattern openButton = new Pattern(imagesFilepath + "OpenButton.PNG");
		
		Thread.sleep(5000);
		
		s.wait(fileInputTextBox, 20);
		s.type(fileInputTextBox,inputFilepath+"apple.jpg");
		s.click(openButton);
		
	}

}



