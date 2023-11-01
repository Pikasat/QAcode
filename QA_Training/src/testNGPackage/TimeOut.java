package testNGPackage;

import org.testng.annotations.Test;

public class TimeOut {
	@Test(timeOut = 1000)
	// 1. Create a method waitFor2Seconds.
    public void waitFor2Seconds() throws InterruptedException{
       System.out.println("waiting for 2 seconds,will be printed but, fail this test eventually");
	// 3. Thread is applied and the time passed is greater than the timeOut time.
       Thread.sleep(2000);
    }
// 4. Create another method and pass the @Test and timeOut and because here no thread is applied so the test will pass as we get output in timeOut period.
    @Test(timeOut = 1000)
    public void simplePrint(){
           System.out.println("Printing is successful");
        }
}

