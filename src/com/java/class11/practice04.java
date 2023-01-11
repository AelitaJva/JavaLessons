package com.java.class11;
public class practice04 {
    public static void main(String[] args) {

        enum shoes {
            Adidas, Nike, Puma, Rebook;
        }
        shoes n1 = shoes.Adidas;

        switch (n1) {
            case Adidas:
                System.out.println("Adidas - Impossible is nothing");
                break;
            case Nike:
                System.out.println("Nike - Just do it");
                break;
            case Puma:
                System.out.println("Puma - Forever fast");
                break;
            case Rebook:
                System.out.println("Rebook - I am what I am");
                break;
        }
    }
}
