package ex_05_TestNG_Example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_023_Soft_VS_Hard_With_AlwaysRUN {
@Test
    public void login()
    {
        Assert.assertTrue(false);

        //might failed
    }

@Test(dependsOnMethods = {"login"})
    public void placeorder()
    {
        Assert.assertTrue(true);
        //Hard dependency - Only run when the login passed

    }
    @Test(dependsOnMethods = "login" , alwaysRun = true)
    public void close_browser()
    {
        Assert.assertTrue(true);

        //Soft dependency - Run even login failed
    }


}
