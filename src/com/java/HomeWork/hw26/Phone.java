package com.java.HomeWork.hw26;

public class Phone {
    static String brandName = "Samsung";
    static int madeYear = 2016;
    String name;
    String color;
    int price;
    double change;

    Phone (String nameFromUser, String colorFromUser) {
        name = nameFromUser;
        color = colorFromUser;
    }

    Phone () {
        price = 36000;
        System.out.println("The price starts from " + price);
        Phone.madeYear = madeYear;
        Phone.brandName = brandName;
    }


    void setChange (int amount) {
        change = amount - price;
        System.out.println("Given amount of number from you was " + amount + " and phones price is " + price);
        System.out.println("You change is  " + change);

    }


}
