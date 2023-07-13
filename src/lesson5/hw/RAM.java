package lesson5.hw;

public class RAM
{
    String name;
    float volume;

    public RAM()
    {
    }

    public RAM(String name, float volume)
    {
        this.name = name;
        this.volume = volume;
    }

    public void print()
    {
        System.out.println(this.toString());
    }

    @Override
    public String toString()
    {
        return "RAM{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
