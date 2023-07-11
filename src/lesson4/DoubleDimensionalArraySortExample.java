package lesson4;

import java.util.Arrays;

public class DoubleDimensionalArraySortExample
{
    public static void main(String[] args)
    {
        int arr[][] = {{4, 0, 5, 9},{5, 8, 9, 0},{1, 2, 3, 4},{6, 6, 6, 7}};

        /*for (int i = 0; i < arr.length; i++)
        {
            Arrays.sort(arr[i]);
        }

        System.out.println(Arrays.deepToString(arr));*/

        int doubleDimArrLength = 0;
        for (int i = 0; i < arr.length; i++)
        {
            doubleDimArrLength += arr[i].length;
        }

        int arr1[] = new int[doubleDimArrLength];
        int counter = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                arr1[counter] = arr[i][j];
                counter++;
            }
        }

        Arrays.sort(arr1);

        counter = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = arr1[counter];
                counter++;
            }
        }

        System.out.println(Arrays.deepToString(arr));
    }
}
