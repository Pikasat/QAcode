package M;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	  //System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
			// 2. Initialize Webdriver object through ChromeDriver class.
		        
		        ChromeDriver browserObject= new ChromeDriver();
		        
			// 3. Open the http://www.google.com/ link using get method.
		        
		        
		        String url = "http://amazon.com";
		        browserObject.get(url);
		        browserObject.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		        //Using tagname with anchor
		        List<WebElement> links = browserObject.findElements(By.tagName("a"));
		        System.out.println("The number of links is " + links.size());
		        browserObject.close();
		     }
		  
	

	}
