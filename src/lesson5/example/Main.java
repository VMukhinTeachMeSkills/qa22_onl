package lesson5.example;

public class Main
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        cat.amount = 5;
        boolean notHungry = cat.feed(6);
        if (notHungry)
        {
            System.out.println("Наелся");
        }
        else
        {
            System.out.println("Не наелся");
        }
    }
}
