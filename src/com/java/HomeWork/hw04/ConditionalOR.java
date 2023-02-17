package com.java.HomeWork.hw04;

public class ConditionalOR {
    public static void main(String[] args) {
        String userName = "aelita@gmail.com";
        String password = "infinityLoop1";
        String location = "USA";

        boolean logIn = userName == "steve@aplle.com" || password == "innfinityLoop1" || location != "California";
        System.out.println(logIn);
    }
}
