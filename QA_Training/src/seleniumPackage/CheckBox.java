package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2. Initialize Webdriver object through ChromeDriver class.
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		        ChromeDriver browserObject = new ChromeDriver();
		        
			// 3. Open the http://www.google.com/ link using get method.
		        
		        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		        browserObject.findElement(By.xpath("/html/body/form/input[7]")).click();
		        
		        browserObject.findElement(By.xpath("/html/body/form/input[9]")).click();
		        browserObject.findElement(By.xpath("/html/body/form/input[10]")).click();
		        browserObject.findElement(By.name("submit")).click();
	}

}
