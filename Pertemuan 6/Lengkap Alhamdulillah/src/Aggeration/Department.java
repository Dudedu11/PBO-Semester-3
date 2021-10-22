package Aggeration;

import java.util.*;

public class Department
{
    String name;
    private List<Lecturers> students;
    Department(String name, List<Lecturers> students)
    {
        this.name = name;
        this.students = students;
    }
    public List<Lecturers> getStudents()
    {
        return students;
    }
}
