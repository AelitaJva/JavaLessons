package com.java.class27;


public class Static {
    String name;
    int age;

    static int count; // to keep track of number of Static objects;

    public Static (String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }


    public static int getCount () {
        return count;
    }

}
