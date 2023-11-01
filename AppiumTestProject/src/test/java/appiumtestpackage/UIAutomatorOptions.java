package appiumtestpackage;

import java.io.File;

import io.appium.java_client.android.options.UiAutomator2Options;

public class UIAutomatorOptions {

	public UiAutomator2Options getApiDemo()
	{
		System.out.println("------- STarted the api---");
		
		File file = new File ("C:\\Users\\MBK\\eclipse-workspace\\AppiumTestProject\\Build\\ApiDemos-debug.apk");
		
		String apkPath = file.getAbsolutePath();
		
		UiAutomator2Options options= new UiAutomator2Options();
		
		options.setPlatformName("Android")
				.setPlatformVersion("13.0")
		
				.setAutomationName("UiAutomator2")
				.setDeviceName("JAAZB76044168JK")
		        
				.setAppPackage("io.appium.android.apis")
				.setAppActivity(".ApiDemos")
				
				.setApp(apkPath)
				.setNoReset(false);
		return options;
	}
}

