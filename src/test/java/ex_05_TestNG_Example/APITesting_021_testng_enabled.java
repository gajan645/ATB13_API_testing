package ex_05_TestNG_Example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_021_testng_enabled {
    @Test
    public void test01()
    {
        Assert.assertTrue(true);
    }
    @Test
    public void test02()
    {
        Assert.assertTrue(true);
    }

    @Test (enabled = false)
    public void test03()
    {
        Assert.assertTrue(true);
    }
}
