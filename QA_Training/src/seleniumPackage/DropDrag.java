package seleniumPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDrag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
		WebDriver browserObject = new ChromeDriver();
		// 3. Open the web page http://jqueryui.com/droppable/	
		browserObject.get("http://jqueryui.com/droppable/");
	        // 4. In this case we switch the focus to frame 
	        browserObject.switchTo().frame(0);
	        // 5. Get the reference of source element using xpath.
	        WebElement source = browserObject.findElement(By.xpath("//div[@id='draggable']"));
		// 6. Get the reference of target element using xpath.
	        WebElement target = browserObject.findElement(By.xpath("//div[@id='droppable']"));
	       
		// 7. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
	        Thread.sleep(3000);

		// 8. In case of dropdown we use Actions class.Create refernce and pass the driver to the reference
	        Actions act = new Actions(browserObject);
	        
	        // 9. Using the action reference call the dragAndDrop method and pass the source and target element
	        act.dragAndDrop(source, target).build().perform();
	        
	        Thread.sleep(3000);
	}

}
