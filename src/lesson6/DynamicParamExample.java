package lesson6;

public class DynamicParamExample
{
    public static void main(String[] args)
    {
        DynamicParamExample object = new DynamicParamExample();
    }

    public void testMethod(String... d)
    {
        for (int i = 0; i < d.length; i++)
        {
            System.out.println(d[i]);
        }
    }
}
