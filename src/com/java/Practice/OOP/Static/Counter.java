package com.java.Practice.OOP.Static;
class Count {
    static int count;
    String name;
    int age;


    Count (String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    static int getCount () {
        return count;
    }


}

public class Counter {
    public static void main(String[] args) {
        Count p1 = new Count("Aelita", 22);
        Count p2 = new Count("Adelina", 22);
        Count p3 = new Count("Bekjan", 22);

        //System.out.println(Count.getCount());
        // or

        int totalPeople = Count.getCount();
        System.out.println(totalPeople);

    }
}
