package lesson5.hw;

public class Main
{
    public static void main(String[] args)
    {
        Computer computer1 = new Computer(1000f, "Lenovo IdeaPad");
        computer1.print();
        RAM ram = new RAM("Kingston", 16f);
        HDD hdd = new HDD("Kingston", 500f, "internal");
        Computer computer2 = new Computer(2000f, "Asus", ram, hdd);
        computer2.print();
        computer1.setPrice(2000f);
    }
}
