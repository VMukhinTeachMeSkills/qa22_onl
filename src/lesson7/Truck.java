package lesson7;

public class Truck extends Car
{

    Printable printer;

    @Override
    public void drive()
    {
        System.out.println("Truck with vin " + getVin() + " driving.");
    }

    @Override
    public String toString()
    {
        return "Truck{" +
                "printer=" + printer +
                '}';
    }
}
