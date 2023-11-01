package testNGPackage;

import static org.testng.Assert.assertEquals;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class MultipeTestCases {

	@Test (groups="MTC")
    public void test1() {
        System.out.println("I am test 1 and I will pass");
    }
// 2. In second case we skip the test case using SkipException
    @Test (groups="MTC")
    public void test2() {
        System.out.println("I am test 2 and I will skip");
        throw new SkipException("I am skipping");
        
    }
// 3. In third  case we fail the test case passing the unequal value.
    @Test (groups="MTC3")
    public void test3() {
        System.out.println("I am test 3 and I will fail");
        assertEquals(true, false);
    }
	
}

