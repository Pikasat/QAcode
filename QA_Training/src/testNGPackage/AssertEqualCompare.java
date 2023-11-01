package testNGPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertEqualCompare {

	WebDriver browserObject ;
	// 4. Use @Test to generate the test report
	 @Test
	    public void performLogin() throws InterruptedException {
	        System.out.println("Performing Login and wait for 2 seconds");
		   // 5. Open login page of https://admin-demo.nopcommerce.com/login
	        browserObject .get("https://admin-demo.nopcommerce.com/login");
		   // 6. Get reference of Email input box by locate the id method.
	        WebElement username = browserObject .findElement(By.name("Email"));
		    // 7. Get reference of Password input box by locate the id method.
	        WebElement password = browserObject .findElement(By.name("Password"));
		    // 8. Get reference of login button by locate the classname method.
	        WebElement submitBtn = browserObject .findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		    // 9. Clear the Email input box.
	        username.clear();
		    // 10. Provide/Enter the correct email to email input box through reference.
	        username.sendKeys("admin@yourstore.com");
		    // 11. Clear the Password input box.
	        password.clear();
		    // 12. Provide/Enter the correct password to password input box through reference.
	        password.sendKeys("admin");
		    // 13. Submit the button.
	        submitBtn.click();
	        System.out.println("End Result: Form submitted");
	        Thread.sleep(2000);
	    }
	// 14. Create another method name assertHomePage and use @Test and also add dependsOnMethods keyword. 
	 @Test(dependsOnMethods = "performLogin")
	    public void assertHomePage() throws InterruptedException {
	        System.out.println("--using Assert - Checking Homepage Text else, this test will fail");
		    // 15. Intialize a expected value.
	        String expectedTextFromPage="Dashboard";
		    // 16. Get the actual value using getText method 
	        String actualTextFromHomePage= browserObject .findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
		    //17. Using assertEquals method pass both value and check the value matches or not.
	        assertEquals(actualTextFromHomePage, expectedTextFromPage);
	 // 18. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
	        Thread.sleep(2000);
	    }
	// 1. Use @BeforeTest to execute the part of method before the test method. 
	@BeforeTest
    public void beforeTest() {
        System.out.println("--@beforeTest, set the browser, maximise the window");
	 // 2. setup the property of chromedriver because we will perform testing of login process through chrome web browser.
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	// 3. Initialize Webdriver object through ChromeDriver class.
        browserObject  = new ChromeDriver();
	 browserObject .manage().window().maximize();
    }
	//19. @AfterTest is used to excute the test case after the test is exceuted
	 @AfterTest
	    public void afterTest() {
	        System.out.println("--@afterTest, closing the browser window");
		// 20.    Close the web browser.
	        browserObject .close();
	 } 
}
