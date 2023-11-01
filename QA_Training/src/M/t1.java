package M;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class t1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        ChromeDriver browserObject = new ChromeDriver();
        
	// 3. Open the Webpage link using get method.
        
        browserObject.get("https://vcwnorthern.com");
        
        WebElement link= browserObject.findElement(By.linkText("EVENTS"));
        
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
