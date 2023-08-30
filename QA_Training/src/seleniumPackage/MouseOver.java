package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		// 2. Initialize WebDriver object through ChromeDriver class.
		WebDriver browserObject = new ChromeDriver();
		
		// 3. Open the web page https://www.amazon.com/
		 browserObject.get("https://www.amazon.com/");
		
		// 4. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
	        Thread.sleep(3000);
		// 5. Locate the element using the xpath and store in the reference SiginInelement 
	        WebElement element = browserObject.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]")) ;
	        
		
	      
		 // 6. In case of RightClick we use Actions class.Create object and pass the driver to the reference
	        Actions action = new Actions(browserObject);
	        System.out.println("Mouse is over the - HELLO, SIGN IN - option");
	        
	        // 7. Using the action object call the moveToElement method and pass  SigiInelement reference to this method and perform mouseOver
	        action.moveToElement(element).build().perform();
	        //Thread.sleep(3000);
		// 8. Select a element from the pop up box and perform click
	        browserObject.findElement(By.xpath("//span[contains(text(),'Create a List')]")).click();
		// 9. Close the browser
	}		
	
}
