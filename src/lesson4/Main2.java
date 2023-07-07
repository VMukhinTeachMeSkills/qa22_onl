package lesson4;

import java.util.Arrays;

public class Main2
{
    public static void main(String[] args)
    {
        int a[] = {1, 2, 3, 4, 6};
        int b[] = new int[a.length];

        for (int i = 0; i < a.length; i++)
        {
            b[i] = a[i];
        }

        a[1] = 10;

        System.out.println(Arrays.toString(b));
    }
}
