package lesson5.hw;

public class HDD
{
    String name;
    float volume;
    String type;

    public HDD()
    {
    }

    public HDD(String name, float volume, String type)
    {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public void print()
    {
        System.out.println(this.toString());
    }

    @Override
    public String toString()
    {
        return "HDD{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", type='" + type + '\'' +
                '}';
    }
}
