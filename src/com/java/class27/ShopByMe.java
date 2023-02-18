package com.java.class27;

public class ShopByMe {
    String name;
    String choiceClothes;
    int price;
    int result;


    ShopByMe() {
        System.out.println("Welcome to our shop!");
    }

    ShopByMe(String nameFromUser, String userChoice) {
        name = nameFromUser;
        choiceClothes = userChoice;
        price = 7000;
    }


    void check() {
        result = result + price;
        System.out.println(choiceClothes + " was your choice and they cost " + price + " som");
        System.out.println("You have to pay: " + result);
    }

}
