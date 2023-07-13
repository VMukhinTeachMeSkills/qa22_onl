package lesson5;

public class Main
{
    public static void main(String[] args)
    {
        Person person = new Person();
        Person person1 = new Person(person);
        person1.move(10, "Lenina");
        System.out.println(person1);
    }
}


