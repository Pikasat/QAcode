package M;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	  //System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
			// 2. Initialize Webdriver object through ChromeDriver class.
		        
		        ChromeDriver browserObject= new ChromeDriver();
		        
			// 3. Open the http://www.google.com/ link using get method.
		        
		        browserObject.get("http://amazon.com");
		
		        List<WebElement> links =  browserObject.findElements(By.tagName("a"));

		        // Print no. of links stored in list
		        System.out.println(links.size());

		        for 
		        (int i = 1; i<=links.size(); i=i+1)
		         
		        {

		         // Print text of all the links
		         System.out.println(((WebElement) links.get(i)).getText());
		         
	}

	}}
