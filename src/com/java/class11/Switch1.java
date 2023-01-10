package com.java.class11;

public class Switch1 {
    public static void main(String[] args) {
        int rate = 2;




        // break statement is an optional statement
        // u end the vase with the break statement
        // when u want to end the switch statement with the logic
//        // of the case


//        switch (rate) {
//            case 1: //2==1?
//                System.out.println("Awful service");
//            case 2: //case 2 ==2
//                System.out.println("Extremely poor service");
//                break;
//            case 3:
//                System.out.println("Bad service");
//        }


        String shipmentState = "Hawaii";

       switch (shipmentState) {
           // Alyaska || Hawaii
           case "Hawaii":
           case "Alyaska":
               System.out.println("Shipment cost is $10");
               break;
           case "NY":
               System.out.println("Shipment cost is $5");
               break;
           case "Florida":
               System.out.println("Shipment cost is $7");
               break;
           case "California":
               System.out.println("Shipment cost is $12");
               break;
       }

       // if u have the same body for 2 or more cases it will merge it
    }
}
