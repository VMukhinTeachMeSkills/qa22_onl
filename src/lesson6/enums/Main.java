package lesson6.enums;

public class Main
{
    public static void main(String[] args)
    {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;

        dayOfWeek.getName();

        if (dayOfWeek == DayOfWeek.WEDNESDAY)
        {
            dayOfWeek.testMethod();
            System.out.println("3");
        }
    }
}
