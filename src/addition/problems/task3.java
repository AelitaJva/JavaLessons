package addition.problems;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if (ch >= '1' && ch <= '9') {
            System.out.println("This is digit");
        } else if ((ch >= 'a' && ch <= 'z') || ( ch >= 'A' && ch <= 'Z')) {
            System.out.println("This is String");
        } else
            System.out.println("This is special character");
    }
}
