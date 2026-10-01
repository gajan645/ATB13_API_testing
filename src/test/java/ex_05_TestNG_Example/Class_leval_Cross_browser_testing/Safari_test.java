package ex_05_TestNG_Example.Class_leval_Cross_browser_testing;

import org.testng.annotations.Test;

public class Safari_test {

    @Test
    public void safari_test()
    {
        System.out.println("3");
        System.out.println(Thread.currentThread().getId());
    }
}
