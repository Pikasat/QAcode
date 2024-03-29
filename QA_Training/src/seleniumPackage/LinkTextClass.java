package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        ChromeDriver browserObject = new ChromeDriver();
        
	// 3. Open the http://www.google.com/ link using get method.
        
        browserObject.get("https://www.google.com/");
        
        WebElement link= browserObject.findElement(By.linkText("Gmail"));
        
        if(link.isDisplayed())
        {
        	System.out.println("The test passed");
        	
        }
        else
        {
        	System.out.println("The test failed");
        }
	}

}
