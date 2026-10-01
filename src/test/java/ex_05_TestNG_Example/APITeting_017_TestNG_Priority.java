package ex_05_TestNG_Example;

import org.testng.annotations.Test;

public class APITeting_017_TestNG_Priority
{

    @Test (priority = 1)
    public void test_t1()
    {
        System.out.println("1");
    }

    @Test
    public void test_t2()
    {
        System.out.println("3");
    }

   @Test (priority = -1)
    public void test_t3()
    {
        System.out.println("2");
    }

   @Test (priority = -3)
    public void test_t4()
    {
        System.out.println("4");
    }

//Priority (-3,-1,0,1)
    //Runs first negative (-3, -1,0,1)


}
