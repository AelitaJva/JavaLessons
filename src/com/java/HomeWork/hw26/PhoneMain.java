package com.java.HomeWork.hw26;

public class PhoneMain {
    public static void main(String[] args) {
        Phone client1 = new Phone("Aelita", "Pink");
        client1.setChange(50000);

        System.out.println("=======================");

        Phone client2 = new Phone();
        System.out.println("Made year: " + client2.madeYear);
        System.out.println("Brand Name: " + client2.brandName);


    }
}
