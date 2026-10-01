package ex_05_TestNG_Example;

import org.testng.annotations.Test;

public class APITesting_024_Invocationcount {

 @Test (invocationCount = 2)
    public void test_01()
    {
        System.out.println("Hi");
    }

    @Test (invocationCount = 3)
    public void test_02()
    {
        System.out.println("By");
    }
}
