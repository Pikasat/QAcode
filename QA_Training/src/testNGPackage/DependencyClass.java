package testNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependencyClass {

	WebDriver browserObject;
	// 1. The @Test will generate the test report of each method used
		
     // 1. The @Test will generate the test report of each method used
    @Test 
    public void openingCnbcSite() throws InterruptedException {
	 // 2. setup the property of chromedriver to perform mutiple test case through chrome web browser.
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	// 3. Initialize WebDriver object through ChromeDriver class.
        browserObject = new ChromeDriver();
        System.out.println("Open /close  cnn.com in chrome browser");
	 // 4. Open the web page http://www.cnn.com/ in first second case 
        browserObject.get("cnbc.com/");
	 // 5. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
        Thread.sleep(2000);
	 // 6. close the browser
        browserObject.close();
    }
    
     // 1. The @Test will generate the test report of each method used
    @Test (dependsOnMethods="openingCnbcSite")
    public void openingYahooSite() throws InterruptedException {
        // 2. setup the property of chromedriver to perform mutiple test case through chrome web browser.
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	// 3. Initialize WebDriver object through ChromeDriver class.
        browserObject = new ChromeDriver();
        System.out.println("Open /close  yahoo.com in chrome browser");
	// 4. Open the web page http://www.yahoo.com/ in first test case 
        browserObject.get("http://www.yahoo.com/");
	  // 5. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
        Thread.sleep(2000);
	  // 6. close the browser
        browserObject.close();
    }
    @Test (dependsOnMethods="openingYahooSite")
    
    public void openingAmazonSite() throws InterruptedException {
        // 2. setup the property of chromedriver to perform mutiple test case through chrome web browser.
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	// 3. Initialize WebDriver object through ChromeDriver class.
        browserObject = new ChromeDriver();
        System.out.println("Open /close  amazon.com in chrome browser");
	 // 4. Open the web page http://www.amazon.com/ in first test case 
        browserObject.get("http://www.amazon.com/");
	 // 5. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
        Thread.sleep(2000);
	// 6. close the browser
        browserObject.close();
    }

}
	
