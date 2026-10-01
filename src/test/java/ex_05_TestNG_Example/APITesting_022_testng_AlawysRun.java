package ex_05_TestNG_Example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_022_testng_AlawysRun {

    @Test
    public void test_new_register()
    {
        Assert.assertTrue(true);
    }
    @Test (alwaysRun = true)
    public void test_login_page()
    {
        Assert.assertTrue(true);
    }
 @Test
    public void test_normal()
    {
Assert.assertTrue(true);
    }
}
