package ex_02_RA_Concepct;

public class APITesting_03_NP
{
    public void step1()
    {
        System.out.println("Step 1");
    }
    public  void step2()
    {
        System.out.println("Step 2");
    }

    public void step3(String param1)
    {
        System.out.println("Step 3");
    }

    public static void main(String[] args)
    {
        APITesting_03_NP nbp = new APITesting_03_NP ();
        nbp.step1();
        nbp.step3("gajanan");
        nbp.step2();

    }



}
