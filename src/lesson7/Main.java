package lesson7;

public class Main
{
    public static void main(String[] args)
    {
        Truck car = new Truck();
        car.setVin("123123");
        car.drive();
        car.printer = new Printable()
        {
            @Override
            public void print()
            {
                Printable innerPrinter = new Printable()
                {
                    @Override
                    public void print()
                    {

                    }
                };
            }
        };
        System.out.println(car.printer.getClass());

    }
}
