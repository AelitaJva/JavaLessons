package com.java.Practice.OOP.Static;
class Student {
    String name;
    double gpa;
    static int numStudents = 0;
    static double totalGpa = 0;


    // parameterized constructor
    Student (String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
        numStudents++;
        totalGpa+=gpa;
    }


    // instance method
    void setName (String name) {
        this.name = name;
    }

    void setGpa (double gpa) {
        totalGpa-=this.gpa;
        totalGpa+=gpa;
        this.gpa = gpa;
    }

    String getName () {
        return name;
    }

    double getGpa () {
        return gpa;
    }

    // static method
    static double getAvgGpa () {
        return totalGpa / numStudents;
    }
}

public class Students {
    public static void main(String[] args) {
        Student s1 = new Student("Aelita", 5.5);
        Student s2 = new Student("Bekjan", 7.5);
        Student s3 = new Student("Bob", 4.0);
        Student s4 = new Student("Alex", 3.5);
        String getName = s1.getName();
        double getGpa = s1.getGpa();
        double getAverageGpa = Student.getAvgGpa();
        System.out.println(getName + " is name of student");
        System.out.println(getGpa + " is gpa of this student");
        System.out.println(getAverageGpa + " is the average of the all students");
    }
}
