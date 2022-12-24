package addition.problems;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        if(num1 % 2 == 0) {
            System.out.println("This is even number");
        } else
            System.out.println("This number is odd number");
    }
}
