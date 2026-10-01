package ex_05_TestNG_Example.Class_leval_Cross_browser_testing;

import org.testng.annotations.Test;

public class Firefox_test {

    @Test
    public void test_firfox()
    {
        System.out.println("2");
        System.out.println(Thread.currentThread().getId());
    }
}
