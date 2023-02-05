package com.java.class21;

public class nestedForLoop {

    // print out bellow pattern:
    // 12345
    // 12345
    // 12345
    // 12345
    // 12345

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {      // column

            for (int j = 1; j <= 5; j++) {  // row
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
