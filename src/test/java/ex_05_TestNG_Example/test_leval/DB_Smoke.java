package ex_05_TestNG_Example.test_leval;

import org.testng.annotations.Test;

public class DB_Smoke {

    @Test
    public void db_smoke()
    {
        System.out.println(Thread.currentThread().getId());
    }
}
