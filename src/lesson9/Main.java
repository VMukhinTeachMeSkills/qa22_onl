package lesson9;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static final String DELIMITER = " ";

    public static void main(String[] args)
    {
        System.out.println("Enter string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] words = str.split(DELIMITER);
        System.out.println(Arrays.toString(words));


        if (words.length == 0)
        {
            System.out.println("Incorrect input");
            return;
        }
        else if (words.length == 1)
        {
            System.out.println("Result: '" + words[0] + "', unique symbols: " + calculateUniqueSymbols(words[0]));
            return;
        }

        String minWord = words[0];
        int minUniqueSymbols = calculateUniqueSymbols(words[0]);
        for (int i = 0; i < words.length; i++)
        {
            int currentUniqueSymbols = calculateUniqueSymbols(words[i]);
            if (currentUniqueSymbols < minUniqueSymbols)
            {
                minUniqueSymbols = currentUniqueSymbols;
                minWord = words[i];
            }
        }
        System.out.println("Result: '" + minWord + "', unique symbols: " + minUniqueSymbols);
    }

    public static int calculateUniqueSymbols(String str)
    {
        char[] uniqueSymbols = new char[str.length()];
        int uniqueSymbolsCounter = 1;
        uniqueSymbols[0] = str.charAt(0);

        for (char symbol : str.substring(1).toCharArray())
        {
            boolean unique = true;
            for (int i = 0; i < uniqueSymbolsCounter; i++)
            {
                if (symbol == uniqueSymbols[i])
                {
                    unique = false;
                    break;
                }
            }

            if (unique)
            {
                uniqueSymbols[uniqueSymbolsCounter] = symbol;
                uniqueSymbolsCounter++;
            }
        }

        return uniqueSymbolsCounter;
    }
}
