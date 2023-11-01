package M;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialize Webdriver object through ChromeDriver class.
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        ChromeDriver browserObject = new ChromeDriver();
        
	// 01. Open the http://www.demo.itlearn360.com.com/ link using get method.
        //01. verify login
        browserObject.manage().window().maximize();
        browserObject.get("http://demo.itlearn360.com/login");
        browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        //02.click on login buton
        browserObject.findElement(By.xpath("//*[@id=\"loginlabel\"]")).click();
        
        //03.enter name and pwd
        WebElement Username =browserObject.findElement(By.name("log"));
        Username.sendKeys("Demo12");
        
        WebElement pass= browserObject.findElement (By.name("pwd"));
        pass.sendKeys("Test123456$");
        //04.click on submit button
        browserObject.findElement (By.name("wp-submit")).click();
        
        // 5. In homepage go to search box and search courses 
        //06. Click on search icon and search the course."
        WebElement searchBox = browserObject.findElement(By.name("search_course"));
        searchBox.sendKeys("Demo");
        WebElement searchIcon = browserObject.findElement(By.xpath("//*[@id=\"primary_menu\"]/nav[1]/form/button"));
        searchIcon.click();
        
//.Click on dashboard button 

        WebElement dashboard = browserObject.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a"));
        dashboard.click();
        //06.Check if directed to dashboard page or not
        String currentUrl = browserObject.getCurrentUrl();
        if (currentUrl.contains("dashboard")) {
            System.out.println("Success: Directed to the dashboard page.");
        } else {
            System.out.println("Fail: Not directed to the dashboard page.");
        }
        
        //OFFERED ACCADEMICS
            //0 7. Click on Offered Academices 
        
        WebElement offeredAcademics = browserObject.findElement(By.xpath("//*[@id=\"learn-press-user-profile\"]/ul/li[3]/a")) ;
        offeredAcademics.click();
        JavascriptExecutor js = (JavascriptExecutor) browserObject;
        js.executeScript("window.scrollBy(0,350)", "");
        //Click on "Subscribe now" button of any course*****
        //WebElement subscribeNow = browserObject.findElement(By.xpath("//*[@id=\"tab-academies\"]/div/div/ul/li[1]/form/div/button"));
        WebElement subscribeNow = browserObject.findElement(By.cssSelector("#tab-academies > div > div > ul > li:nth-child(1) > form > div > button"));
        subscribeNow.click();
        // Click on "Pay with stripe" button

        WebElement payWithStripeButton = browserObject.findElement(By.xpath("//*[@id=\"learn-press-payment\"]/ul/li/label"));
        payWithStripeButton.click();

        // Click on "Place Order" button
        WebElement placeOrderButton = browserObject.findElement(By.id("payment_method_stripe"));
        placeOrderButton.submit();
        
        WebElement cardFrame = browserObject.findElement(By.xpath("//*[@id=\"card-element\"]/div/iframe"));
        browserObject.switchTo().frame(cardFrame)  ;   
        // Enter the card number, expiry date, and cvc 
        WebElement cardNumberField = browserObject.findElement(By.name("cardnumber"));
        WebElement expiryDateField = browserObject.findElement(By.name("exp-date"));
        WebElement cvcField = browserObject.findElement(By.name("cvc"));
       
        cardNumberField.sendKeys("1234567845677865");
        expiryDateField.sendKeys("01/25");
        cvcField.sendKeys("234");
    
     // Click on "Pay Now" button
        WebElement payNowButton = browserObject.findElement(By.xpath("//*[@id=\"payment-button\"]"));
        payNowButton.click();

	}
}

        


      