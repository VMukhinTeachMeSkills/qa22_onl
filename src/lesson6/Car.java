package lesson6;

public class Car
{
    private String vin;
    private int maxSpeed;

    public Car()
    {
    }

    public Car(String vin, int maxSpeed)
    {
        this.vin = vin;
        this.maxSpeed = maxSpeed;
    }

    public void testMethod()
    {
        System.out.println("Car test method");
    }

    public String getVin()
    {
        return vin;
    }

    public void setVin(String vin)
    {
        this.vin = vin;
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }
}
