package com.java.class28;
class iPhone {
    static int year = 2023;
    static int price;

    iPhone () {
        price = 95000;
    }

    static void info () {
        System.out.println(year);
    }

    void setPrice () {
        System.out.println(price);
    }
}

public class Phone {
    public static void main(String[] args) {
        iPhone client1 = new iPhone();

        iPhone.info();
        client1.setPrice();
        client1.info();
        System.out.println(client1.year);
        System.out.println(iPhone.price);


    }
}
