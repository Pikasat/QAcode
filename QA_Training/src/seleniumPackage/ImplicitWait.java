package seleniumPackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		// 2. Initialize WebDriver object through ChromeDriver class.
		WebDriver browserObject = new ChromeDriver(); 
		// 3. Apply implict wait to webpage .implicitlyWait method  holds the webdriver for a certain amount of time before throwing "No Such Element Exception".
		// In this given time the wait will  locate the element.
		browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		// 4. Intialize the value of title.
		String eTitle = "Google";

		// 5. Open the web page https://www.google.com/
		browserObject.get("https://www.google.com/");
			
		// 6. maximaize the browser window
		browserObject.manage().window().maximize() ;
		// 7. Get the title of webpage 
		String aTitle = browserObject.getTitle();
		// 8. Compare the actual element and expected element
		if (aTitle.equals(eTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
		}
		// 9. close the web browser
		browserObject.close();
	}

}
