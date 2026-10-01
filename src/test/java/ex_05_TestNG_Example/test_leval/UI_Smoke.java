package ex_05_TestNG_Example.test_leval;

import org.testng.annotations.Test;

public class UI_Smoke {

    @Test
    public void Ui_smoke()
    {
        System.out.println(Thread.currentThread().getId());
    }
}
