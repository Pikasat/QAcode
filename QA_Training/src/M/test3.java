package M;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	  //System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
			// 2. Initialize Webdriver object through ChromeDriver class.
		        
		        ChromeDriver browserObject= new ChromeDriver();
		        
			// 3. Open the http://www.google.com/ link using get method.
		        
		        browserObject.get("http://Amazon.com");
		        String Title =  browserObject.getTitle();
		        System.out.println(Title);
		      WebElement SearchBox = browserObject.findElement(By.name("field-keywords"));
		       SearchBox.sendKeys("Is selenium worth it");
		      SearchBox.sendKeys(Keys.RETURN);
		        String CurentUrl = browserObject.getCurrentUrl();
		       System.out.println(CurentUrl);
	}

}
