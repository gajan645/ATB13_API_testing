package ex_05_TestNG_Example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting_16_Beforetest
{
    // PUT Request
    // 1. getToken
    // 2. getBookingId
    // 3. test_PUT ( which will use the above two methods)
    // 4. closeAllThings
     @BeforeTest
    public void get_Token()
    {
        System.out.println("Before GET Token");
    }

    @BeforeTest
    public void getBookingID()
    {
        System.out.println("Before Get Booking");
    }

    @Test
    public void test_put()
    {
        //Token and BookingID
        System.out.println("PUT Request");
    }

    @AfterTest
    public void closeAllTesting()
    {
        System.out.println("close");
    }

}
