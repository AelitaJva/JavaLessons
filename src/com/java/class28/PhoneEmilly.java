package com.java.class28;
class iPhone3 {
    static  String brand = "iPhone";
    static String operationSystem = "IOS";
    String model;
    int memory;
    String color;

    static void getBasicInfo () {
        System.out.println("The operation system of your " + brand + " is " + operationSystem);

    }

    void getMoreDetails () {
        if (color != null) {
            System.out.println("The color is " + color);
        } else {
            System.out.println("The color is black");
        }
    }

    iPhone3 (String model, int memory, String color) {
        this.model = model;
        this.memory = memory;
        this.color = color;
    }
}

public class PhoneEmilly {
    public static void main(String[] args) {
        iPhone3 c1 = new iPhone3("iPhone 14", 99, "Pink");
        c1.getMoreDetails();
        c1.getMoreDetails();
    }
}
