package ex_05_TestNG_Example.test_leval;

import org.testng.annotations.Test;

public class API_smoke {

    @Test
    public void test_API_smoke()
    {
        System.out.println(Thread.currentThread().getId());
    }
}
