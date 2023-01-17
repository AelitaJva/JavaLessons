package com.java.class14;

// concat
public class StringPractice2 {
    public static void main(String[] args) {
        // two ways to concatenating String
        // one via + sign

        String str = "<html>";
        str+= "</body>";


        String str1 = "Hello public class";
        str1 = str1.concat("{");
        str1 = str1.concat("\n\t {");


        // examples
        String str4 = "Hello";
        str4.concat("DevX!");
        System.out.println(str4);

        String str5 = "I";
        str5.concat("Love");
        str5 = str5.concat("Java");
        System.out.println(str5);
    }
}
