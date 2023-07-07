package lesson4;

import java.util.Arrays;
import java.util.Random;

public class Main6
{
    public static void main(String[] args)
    {
        int a[][] = {{1, 2}, {0, 7, 9}, {1, 6, 8, 9}};

        Random random = new Random();
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                a[i][j] = random.nextInt(10);
            }
        }

        //Одномерный
        /*
        for (int j = 0; j < a.length; j++)
        {
            [j] = random.nextInt(10);
        }
        */

        System.out.println(Arrays.deepToString(a));
    }
}
