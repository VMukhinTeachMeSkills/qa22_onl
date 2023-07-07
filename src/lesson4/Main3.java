package lesson4;

import java.util.Arrays;

public class Main3
{
    public static void main(String[] args)
    {
        int a[] = {5, 13, 6, 9, 0};
        int b[] = new int[4];

        System.arraycopy(a, 1, b, 2, 2);

        System.out.println(Arrays.toString(b));
    }
}
