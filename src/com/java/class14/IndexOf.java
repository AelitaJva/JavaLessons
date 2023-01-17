package com.java.class14;

import org.w3c.dom.ls.LSOutput;

public class IndexOf {
    public static void main(String[] args) {
        String str = "tik tak";
        System.out.println(str.indexOf("tak"));
        System.out.println(str.indexOf("k"));
        // indexOf(String str) - returns the index of the first occurrence
        // occurrence

       //whenever there is no matching string then it will return -1
       // -1 => error
        String str2 = "bla bla bla";
        System.out.println(str2.indexOf("jkfksfbssf")); // -1
        System.out.println(str2.indexOf("bla")); // -1


        // indexOf(String str, int i) ->
        // figure it out
        String str3 = "Macbook Air ,Nike Air, Ipod Air";
        System.out.println(str3.indexOf("Air", 10));
        System.out.println(str3.indexOf("Air", 19));

        String str4 = "Lala polluza lala land la lakers";
        System.out.println(str4.indexOf("la", 5));
        System.out.println(str4.indexOf("la", 13));
        System.out.println(str4.indexOf("la", 14));


        // indexOf(String str -
        String str5 = "Java Developer, Java Coding";
        System.out.println(str5.lastIndexOf("Java"));

        String str6 = "Almazova";
        int last2Chars = str6.lastIndexOf("va");
    }


}
