package com.java.class15;

public class Contains {
    public static void main(String[] args) {
        String str = "Hello, Aelita! \n thank for interviewing for Apple." +
                "We want to congratulate u on receving an offer";
        System.out.println(str);

        boolean doesContain = str.contains("Apple");
        System.out.println(doesContain);

        if (str.contains("Apple")) {
            System.out.println();
        }

        String str2 = "Course Offerings: Java, Python";
        if (str2.contains("JavaScript")) {
            // go and scehdule a call
            // and enroll
        }

        String anyOfTheWebsites = "";
        if (anyOfTheWebsites.contains("Turkish rest near me")) {

        }


    }
}
