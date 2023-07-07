package lesson4;

import java.util.Arrays;

public class Main5
{
    public static void main(String[] args)
    {
        int a[] = {5, 10, 4, 13, 9};

        int buf;
        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length - 1 - i; j++)
            {
                count++;
                if (a[j] > a[j + 1])
                {
                    buf = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = buf;
                }
            }
        }

        System.out.println(Arrays.toString(a) + ", count = " + count);
    }
}
