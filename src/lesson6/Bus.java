package lesson6;

public class Bus extends Car
{
    private int placesAmount;

    public Bus()
    {
    }

    public Bus(int placesAmount)
    {
        this.placesAmount = placesAmount;
    }

    public void testMethod()
    {
        System.out.println("Bus test method");
    }

    public int getPlacesAmount()
    {
        return placesAmount;
    }

    public void setPlacesAmount(int placesAmount)
    {
        this.placesAmount = placesAmount;
    }
}
