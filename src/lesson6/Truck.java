package lesson6;

public class Truck extends Car
{
    private int volume;

    public Truck()
    {
    }

    public Truck(int volume, String vin, int maxSpeed)
    {
        super(vin, maxSpeed);
        this.volume = volume;
    }

    @Override
    public void testMethod()
    {
        System.out.println("Truck test method");
    }

    public int getVolume()
    {
        return volume;
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }
}
