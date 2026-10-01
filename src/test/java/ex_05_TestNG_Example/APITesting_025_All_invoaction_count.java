package ex_05_TestNG_Example;

import org.testng.annotations.*;

public class APITesting_025_All_invoaction_count
{


   @BeforeSuite
    void demo1()
    {
        System.out.println("Before suite");
    }

    @BeforeTest
    void demo2()
    {
        System.out.println("Before test");
    }

    @BeforeClass
    void demo3()
    {
        System.out.println("Before class");
    }

    @BeforeMethod
    void demo4()
    {
        System.out.println("Before Method");
    }


    @Test
    void demo5()
    {
        System.out.println("Test");
    }

    @AfterMethod
    void demo6()
    {
        System.out.println("After Method");
    }

    @AfterClass
    void demo7()
    {
        System.out.println("After class");
    }

    @AfterTest
    void demo8()
    {
        System.out.println("After test");
    }

    @AfterSuite
    void demo9()
    {
        System.out.println("After suite");
    }




}
