package com.java.class25;

public class Dog {
    String name;
    int age;
    char gender;

    // no return type
     Dog (String nameFromUser, int ageFromUser, char genderFromUser) {
         name = nameFromUser;
         age = ageFromUser;
         gender = genderFromUser;
     }

     Dog () {

     }

     // void: return type
    void bark () {
        System.out.println(name +  " is barking " + "( " + "age: " +  age + " , " + "gender: " + gender + " )");
    }

    void play () {
        System.out.println(name +  " is palying " + "( " + "age: " +  age + " , " + "gender: " + gender + " )");
    }
}
