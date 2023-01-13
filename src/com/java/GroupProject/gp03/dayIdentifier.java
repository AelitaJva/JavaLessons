package com.java.GroupProject.gp03;

import java.util.Scanner;

public class dayIdentifier {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose number from 1 to 7: ");

        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("You selected Monday! ");
        } else if (num == 2) {
            System.out.println("You selected Tuesday! ");
        } else if (num == 3) {
            System.out.println("You selected Wednesday! ");
        } else if (num == 4) {
            System.out.println("You selected Thursday! ");
        } else if (num == 5) {
            System.out.println("You selected Friday! ");
        } else if (num == 6) {
            System.out.println("You selected Saturday! ");
        } else if (num == 7) {
            System.out.println("You selected Sunday! ");
        } else
            System.out.println("You selected Wrong Day! ");
    }
}
