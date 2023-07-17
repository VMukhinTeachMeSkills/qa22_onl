package lesson5.hw;

public class Computer
{
    private float price;
    private String model;
    private RAM ram;
    private HDD hdd;

    public Computer(float price, String model)
    {
        this.price = price;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(float price, String model, RAM ram, HDD hdd)
    {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void print()
    {
        System.out.println(this.toString());
    }

    @Override
    public String toString()
    {
        return "Computer{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }

    public float getPrice()
    {
        return price;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }
}
