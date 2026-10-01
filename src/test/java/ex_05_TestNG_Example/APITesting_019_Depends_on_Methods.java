package ex_05_TestNG_Example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_019_Depends_on_Methods
{
    @Test
    public void serverstartedok()
    {
        System.out.println("I will run first");
        Assert.assertTrue(true);
    }

@Test(dependsOnMethods ="serverstartedok" )
    public void test1()
    {
        System.out.println("Method1");
        Assert.assertTrue(true);
    }
     @Test (dependsOnMethods = "serverstartedok")
    public void test2()
    {
        System.out.println("Method2");
        Assert.assertTrue(true);
    }
}
