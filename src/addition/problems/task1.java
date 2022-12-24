package addition.problems;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter any number: ");

        int num = sc.nextInt();

        if(num % 5 == 0 && num % 11 == 0) {
            System.out.println(num + " - this number is divisible by 5 or 11");
        } else
            System.out.println(num + " - this number isn't divisible");
    }
}
