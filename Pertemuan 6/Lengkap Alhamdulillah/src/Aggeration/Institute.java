package Aggeration;

import java.util.*;

public class Institute
{
    String instituteName;
    private List<Department> departments;
    Institute(String instituteName, List<Department> departments)
    {
        this.instituteName = instituteName;
        this.departments = departments;
    }
    // count total students of all departments
// in a given institute
    public int getTotalStudentsInInstitute()
    {
        int noOfStudents = 0;
        List<Lecturers> students;
        for(Department dept : departments)
        {
            students = dept.getStudents();
            for(Lecturers s : students)
            {
                noOfStudents++;
            }
        }
        return noOfStudents;
    }
}
