package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
			// 2. Initialize Webdriver object through ChromeDriver class.
		        ChromeDriver browserObject = new ChromeDriver();
		        
			// 3. Open the http://www.google.com/ link using get method.
		        
		        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		        
		        browserObject.findElement(By.name("name")).sendKeys("Mubarek");
		        
		        browserObject.findElement(By.name("email")).sendKeys("Pikasat@gmail.com");
		        
		        browserObject.findElement(By.name("website")).sendKeys("www.ItLearn360.com");
		        
		        browserObject.findElement(By.name("comment")).sendKeys("this is a fun");
		        
		        browserObject.findElement(By.name("submit")).click();
		      


	}

}

