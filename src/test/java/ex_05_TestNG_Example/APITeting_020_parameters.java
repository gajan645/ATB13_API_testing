package ex_05_TestNG_Example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITeting_020_parameters {

    @Parameters("browser")
    @Test
    public void demo1(String value)
    {
        System.out.println("I am demo");
        System.out.println("you are running the parameters");

        if (value.equalsIgnoreCase("firefox"))
        {
            System.out.println("Stsart the firefox");
        }
        if ((value.equalsIgnoreCase("chrome")))
        {
            System.out.println("start the chrome");
        }
    }


}
