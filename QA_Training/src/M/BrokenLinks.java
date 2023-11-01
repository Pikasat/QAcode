package M;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	  //System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
			// 2. Initialize Webdriver object through ChromeDriver class.
		        
		        ChromeDriver browserObject= new ChromeDriver();
		        
			// 3. Open the http://www.google.com/ link using get method.
		        
		        
		        //String url = "http://amazon.com";
		        browserObject.get("http://amazon.com");
		        List<WebElement> links = browserObject.findElements(By.tagName("a"));
		        
		        String url = "";
		        HttpURLConnection connection = null;
		        int respCode = 0;
		        for(WebElement link: links) {
		            try {
		                url = link.getAttribute("href");
		                connection = (HttpURLConnection)(new URL(url).openConnection());
		                connection.setRequestMethod("HEAD");
		                connection.connect();
		 
		                respCode = connection.getResponseCode();
		                if(respCode == 400 ||
		                        respCode == 403 ||
		                        respCode == 404 ||
		                        respCode == 408 ||
		                        respCode == 410 ||
		                        respCode == 503){
		                    System.out.println("[Broken]     - " + url);
		                }
		                else{
		                    System.out.println("[Not Broken] - " + url);
		                }
		            } catch (MalformedURLException e) {
		                e.printStackTrace();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        }
		        //connection.disconnect();
		 
		       // browserObject.quit();
		     }
		  
	

	}
