package lesson4;

import java.util.Arrays;

public class Sort
{
    public static void main(String[] args)
    {
        int arr[] = {4, 0, 5, 9, 1, 8, 9};

        int buf;
        for (int i = 1; i < arr.length; i++)
        {
            for (int j = i; j > 0; j--)
            {
                if (arr[j] < arr[j - 1])
                {
                    buf = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = buf;
                }
                else
                {
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
