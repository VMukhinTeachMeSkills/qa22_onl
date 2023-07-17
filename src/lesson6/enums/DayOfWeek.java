package lesson6.enums;

public enum DayOfWeek
{
    MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday");

    DayOfWeek(String name)
    {
        this.name = name;
    }

    private String name;

    public void testMethod()
    {
        System.out.println("123");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
