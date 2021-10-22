package Aggeration;

import java.util.*;

public class GFG
{
    public static void main (String[] args)
    {
        Lecturers s1 = new Lecturers("Ardhian", 1, "CSE");
        Lecturers s2 = new Lecturers("Wendi", 2, "CSE");
        Lecturers s3 = new Lecturers("Zulkifli", 1, "EE");
        Lecturers s4 = new Lecturers("Rahul", 2, "EE");

        //membuat daftar class (association)
//        Class x1 = new Class("D-3 TeknikInformatika 2A");
//        Class x2 = new Class("D-3 Teknik Informatika 2B");
//        Class x3 = new Class("D-4 Teknik Informatika 2A");
//        Class x4 = new Class("D-4 Teknik Informatika 2B");

        Data d = new Data();

        //membuat daftar student (komposit)
        DataStudent k1 = new DataStudent("Han So Hee", 201511048);
        DataStudent k2 = new DataStudent("Park Bo Young", 201511049);
        DataStudent k3 = new DataStudent("Park Shin Hye", 201511050);
        DataStudent k4 = new DataStudent("Kim Yoon Hye", 201511052);

        List<DataStudent> students = new ArrayList<DataStudent>();
        students.add(k1);
        students.add(k2);
        students.add(k3);
        students.add(k4);

// making a List of
// CSE Students.
        List <Lecturers> cse_students = new ArrayList<Lecturers>();
        cse_students.add(s1);
        cse_students.add(s2);
// making a List of
// EE Students
        List <Lecturers> ee_students = new ArrayList<Lecturers>();
        ee_students.add(s3);
        ee_students.add(s4);
        Department CSE = new Department("CSE", cse_students);
        Department EE = new Department("EE", ee_students);
        List <Department> departments = new ArrayList<Department>();
        departments.add(CSE);
        departments.add(EE);
// creating an instance of Institute.
        Institute institute = new Institute("BITS", departments);
        System.out.print("Total lecturers in institute: ");
        System.out.println(institute.getTotalStudentsInInstitute());
//        System.out.println(x2.getStudentName+" is student of "+s2.name);
        d.data2();
        System.out.println(" is student of "+s2.name);

        Student list = new Student(students);
        List<DataStudent> sts = list.getTotalListStudent();
        for (DataStudent stk : sts){
            System.out.printf("Nama : %-15s NIM : %d\n",stk.name,stk.nim);
        }
    }
}
