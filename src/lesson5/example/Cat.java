package lesson5.example;

public class Cat
{
    String name;
    int age;
    int amount;

    boolean feed(int food)
    {
        if (food < amount)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
