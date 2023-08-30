package M;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. Initialize Webdriver object through ChromeDriver class.
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        ChromeDriver browserObject = new ChromeDriver();
        
	// 3. Open the http://www.demo.itlearn360.com.com/ link using get method.
        
        browserObject.get("http://demo.itlearn360.com/login");
        browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        browserObject.findElement(By.xpath("//*[@id=\"loginlabel\"]")).click();
        
        WebElement Username =browserObject.findElement(By.name("log"));
        Username.sendKeys("Demo12");
        
        WebElement pass= browserObject.findElement (By.name("pwd"));
        pass.sendKeys("Test123456$$");
        browserObject.findElement (By.name("wp-submit")).click();
      
        
	}
	 
}
