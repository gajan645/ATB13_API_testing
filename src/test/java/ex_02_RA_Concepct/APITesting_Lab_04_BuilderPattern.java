package ex_02_RA_Concepct;

public class APITesting_Lab_04_BuilderPattern
{
    public APITesting_Lab_04_BuilderPattern step1()
    {
        System.out.println("Step 1");
        return this;

    }
    public APITesting_Lab_04_BuilderPattern Step2 ()
    {
        System.out.println("Step 2");
        return this;
    }
    public APITesting_Lab_04_BuilderPattern Step3(String param)
    {
        System.out.println("Step 3");
        return this;

    }

    public static void main(String[] args) {

        APITesting_Lab_04_BuilderPattern bp = new APITesting_Lab_04_BuilderPattern();
        bp.step1().Step2().Step3("Gajanan");


    }
}
