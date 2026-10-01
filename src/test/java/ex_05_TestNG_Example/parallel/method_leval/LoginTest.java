package ex_05_TestNG_Example.parallel.method_leval;

import org.testng.annotations.Test;

public class LoginTest {


    @Test
    public void valid_login()
    {
        System.out.println("valid login-Thread " +Thread.currentThread().getId());
    }


    @Test
    public void invalid_login()
    {
        System.out.println("Invalid logn-thread " +Thread.currentThread().getId());
    }

    @Test
    public void Invalid_login2()
    {
        System.out.println("Invalid Login-thread " + Thread.currentThread().getId());
    }
}
