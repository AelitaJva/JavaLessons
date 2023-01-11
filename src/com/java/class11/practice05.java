package com.java.class11;

public class practice05 {
    public static void main(String[] args) {
        int brand = 4;
        String nameOfBrand;

        switch(brand) {
            case 1:
                nameOfBrand = "Nike";
                System.out.println("Brand name is " + nameOfBrand);
                break;
            case 2:
                nameOfBrand = "Adidas";
                System.out.println("Brand name is " + nameOfBrand);
                break;
            case 3:
                nameOfBrand = "Prada";
                System.out.println("Brand name is " + nameOfBrand);
                break;
            case 4:
                nameOfBrand = "Louis Vuitton";
                System.out.println("Brand name is " + nameOfBrand);
                break;
            default:
                System.out.println("Invalid name");
        }
    }
}
