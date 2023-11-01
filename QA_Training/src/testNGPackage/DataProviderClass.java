package testNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

		
		WebDriver browserObject;
		// 4. Now in method checking the @Test is passed along with the dataProvider keyword and the dataprovider method name dp
		 @Test(dataProvider = "dp")
		    public void checking(String userName, String passWord, String msg) throws InterruptedException {
			    // 5. setup the property of chromedriver because we will perform testing of login process through chrome web browser.
		        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		        // create object name driver of type ChromeDriver
		        browserObject = new ChromeDriver();
			   
		        browserObject.get("https://admin-demo.nopcommerce.com/login");
			     // 6. Get reference of Email input box by locate the id method.
		        WebElement username = browserObject.findElement(By.name("Email"));
			  // 7. Get reference of Password input box by locate the id method.
		        WebElement password = browserObject.findElement(By.name("Password"));
			    // 8. Get reference of login button by locate the classname method.
		        WebElement submitBtn = browserObject.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
			    // 9. Clear the Email input box.
		        username.clear();
			    // 10. Provide/Enter the correct email to email input box through reference.
		        username.sendKeys(userName);
			    // 11. Clear the Password input box.
		        password.clear();
			    // 12. Provide/Enter the correct password to password input box through reference.
		        password.sendKeys(passWord);
			   // 13. Click Submit the button.
		        submitBtn.click();
		        System.out.println("End Result: Form submitted");
		        Thread.sleep(2000);
		    }
		 @DataProvider
		public Object[][] dp()
		{
			return new Object[][] {
		    	new Object[] { "admin", "admin132" ,"Wrong Credentials"}, 
		        new Object[] { "admin", "admnhhj","Wrong Credentials" },
		        new Object[] { "admin@yourstore.com", "admin","Test Passed" }
		    };
	}

}
