package lesson4;

public class Main
{
    public static void main(String[] args)
    {
        int[] a = {};

        if (a != null && a.length >= 1)
        {
            int max = a[0];
            for (int i = 1; i < a.length; i++)
            {
                if (a[i] > max)
                {
                    max = a[i];
                }
            }
            System.out.println(max);
        }
        else
        {
            System.out.println("Empty array");
        }
    }
}
