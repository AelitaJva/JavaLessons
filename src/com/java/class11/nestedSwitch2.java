package com.java.class11;

public class nestedSwitch2 {
    public static void main(String[] args) {

        // switch can not able with double
        // use typecasting

        double totalSpending = 720;
        String destination = "USA";

        if ((int) totalSpending > 0) {
        switch ((int) totalSpending) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Shipping cost is $10");
                break;

            default:
                // convert destination to uppercase
                switch (destination.toUpperCase()) {
                    case "USA": //10%
                        System.out.println("Shipping cost is in USA " + (int) totalSpending * 0.1 + "$");
                        break;
                    case "Canada": //15%
                        System.out.println("Shipping cost is in Canada " + (int) totalSpending * 0.15 + "$");
                        break;
                    case "Europe": //20%
                        System.out.println("Shipping cost is in Europe" + (int) totalSpending * 0.2 + "$");
                }


        }
    } else {
            System.out.println("Wrong");
        }
    }
}
