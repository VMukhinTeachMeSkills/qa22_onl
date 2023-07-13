package lesson5;

public class Person
{
    String name;
    float weight;
    int age;

    {

    }

    public Person()
    {
    }

    public Person(String name, float weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }



    Person(Person personToCopy)
    {
        this();
        this.name = personToCopy.name;
    }

    void move(int steps, String road)
    {
        System.out.println("person moving " + steps + " steps, " + road + " road, name " + name);
    }
}
