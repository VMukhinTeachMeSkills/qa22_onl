package lesson4;

public class DiagonalsExample
{
    public static void main(String[] args)
    {
        int arr[][] = {{4, 0, 5, 9},{5, 8, 9, 0},{1, 2, 3, 4},{6, 6, 6, 7}};

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (i == j)
                {
                    System.out.println(arr[i][j] + " ");
                }
            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = arr[i].length - 1; j >= 0; j--)
            {
                if (i == arr[i].length - j - 1)
                {
                    System.out.println(arr[i][j] + " ");
                }
            }
        }
    }
}
