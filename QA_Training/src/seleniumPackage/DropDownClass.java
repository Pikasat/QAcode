package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		 ChromeDriver browserObject = new ChromeDriver();
	        
			// 3. Open the http://www.google.com/ link using get method.
		        
		  browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		  
		  
		  Select countrySelect = new Select(browserObject.findElement(By.name("country")));
		  
		  countrySelect.selectByVisibleText("Ethiopia");
		  
	        Select skillSelect = new Select(browserObject.findElement(By.name("skill")));

		  
		  //using skillSelect to select menu options -- Programming
	        skillSelect.selectByVisibleText("Programming");
	     
	        skillSelect.selectByVisibleText("Database");
	        System.out.println("selectByVisibleText(\"Database");
		
	}

}
