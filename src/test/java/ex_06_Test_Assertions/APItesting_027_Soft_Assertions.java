package ex_06_Test_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APItesting_027_Soft_Assertions {


//    @Test
//    public void test_hard_assert_example()
//    {
//        System.out.println("start of the program");
//        Assert.assertEquals("gajanan","Gajanan");
//        System.out.println("End of the program ");
//
//
//    }


    @Test
    public void soft_test_assert_example()
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("gajanan","Gajanan");
        System.out.println("End of the program");
    }
}
