package com.java.class15;

public class replace {
    // replace(); => character, syntax
    // replaceFirst();
    public static void main(String[] args) {
        // replace Char
        String str = "earth is flat";
        String str1 = str.replace('a', 'w');
        System.out.println(str1);

        String str3 = "public static void main(String {} args))";
        String str4 = str3.replace('{', '[').replace('}', ']');
        System.out.println(str4);

        String str11 = "Rock and Roll, Spring Roll";
        str11 = str11.replace('o', 'B');
        System.out.println(str11);

        // replace string
        String str12 = "I hate Java";
        System.out.println(str12.replace("hate", "love"));

        // change the syntax
        String str13 = "system.out.println(Hello World)";

        String str14 = str13.replaceFirst("s", "S").replace(")", ");");
        System.out.println(str14);

        String ael = "Ael";
        System.out.println(ael.replace("A", "B"));
    }
}
