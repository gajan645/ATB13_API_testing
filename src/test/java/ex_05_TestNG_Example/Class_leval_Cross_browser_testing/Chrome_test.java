package ex_05_TestNG_Example.Class_leval_Cross_browser_testing;

import org.testng.annotations.Test;

public class Chrome_test {

    @Test
    public void test_01()
    {
        System.out.println("01");
        System.out.println(Thread.currentThread().getId());
    }


    @Test
    public void test_02()
    {
        System.out.println("02");
        System.out.println(Thread.currentThread().getId());
    }
}
