package Aggeration;

import java.util.*;

public class Student {
    private final List<DataStudent> students;
    Student(List<DataStudent> students){
        this.students = students;
    }

    public List<DataStudent> getTotalListStudent() {
        return students;
    }
}
