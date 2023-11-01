package appiumtestpackage;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class BasicDetails {
static AndroidDriver driver;

public void testflow()
{
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"App\"]")).click();
}
}
