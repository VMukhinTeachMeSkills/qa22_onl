package lesson7;

public abstract class Car
{
    private String vin;

    public abstract void drive();

    public String getVin()
    {
        return vin;
    }

    public void setVin(String vin)
    {
        this.vin = vin;
    }

    @Override
    public String toString()
    {
        return "Car{" +
                "vin='" + vin + '\'' +
                '}';
    }
}
