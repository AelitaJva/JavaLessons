//package com.java.Practice.Nursultan.Example01;
//
//import static com.java.Practice.Nursultan.Example01.CashMachine.scanner;
//
//public class CashMachine1 {
//    public static void main(String[] args) {
//        // variables
//        String pin;
//        int chooseTheOption;
//        String[][] person = {
//                {"Nurs", "n", "1200"},
//                {"Aelita", "a", "2000"}
//        };
//
//
//        // Input data
//        for (int i = 0; i < 1; i++) {
//            for (int j = 0; j < 3; j++) {
//                person[i][j] = scanner.nextLine();
//            }
//        }
//
//        while (true) {
//            System.out.println("Input your PIN, please");
//            pin = scanner.nextLine();
//            for (int i=0; i<3; i++) {
//                for (int j=0; j<3; j++) {
//                    if (pin.equals(person[i][1])) {
//                        System.out.println("Hello" + person[i][j] + " what you want to do: 1 change name, 2 chnage PIN, 3 take money, 4 add money, 5 exit, 6 all info");
//                         chooseTheOption = scanner.nextInt();
//                         switch (chooseTheOption) {
//                             case 1-> person[i][0] = change;
//                         }
//                    }
//                }
//            }
//        }
//
//        private stati
//    }
//}
