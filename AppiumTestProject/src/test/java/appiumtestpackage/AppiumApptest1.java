package appiumtestpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.remote.HttpCommandExecutor;

import io.appium.java_client.android.AndroidDriver;

public class AppiumApptest1 {
	static AndroidDriver driver;
	public static void main(String[] args)throws MalformedURLException {
		// TODO Auto-generated method stub
		UIAutomatorOptions options= new UIAutomatorOptions();
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),options.getApiDemo());
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"App\"]")).click();
		
		System.out.println("-----Api stopped -----");
	}

}


