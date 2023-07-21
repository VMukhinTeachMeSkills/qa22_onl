package lesson8.example;

import java.util.Scanner;

public class Main
{
    static Student[] students =
            {
                    new Student("Ivan", 4f),
                    new Student("Slava", 10f),
                    new Student("Petya", 7f)
            };

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        Student result;
        try
        {
            try
            {
                result = findStudent(name);
            }
            catch (StudentNotFoundException exception)
            {
                System.out.println("Input error, student with name '" + exception.getStudentName() + "' is not found");
                throw new NullPointerException();
            }
        }
        catch (NullPointerException exception)
        {
            System.out.println("Caught null pointer");
        }
    }

    public static Student findStudent(String name) throws StudentNotFoundException
    {
        for (Student student : students)
        {
            if (student.getName() != null && student.getName().equals(name))
            {
                System.out.println("Found student " + name);
                return student;
            }
        }
        StudentNotFoundException exception =
                new StudentNotFoundException("Student with name " + name + " is not found.");
        exception.setStudentName(name);
        throw exception;
    }
}
