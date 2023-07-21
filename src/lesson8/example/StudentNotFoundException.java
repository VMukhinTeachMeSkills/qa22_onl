package lesson8.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentNotFoundException extends RuntimeException
{
    private String studentName;

    public StudentNotFoundException(String message)
    {
        super(message);
    }
}
