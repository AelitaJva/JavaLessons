package com.java.class16;

public class whileLoop3B {
    public static void main(String[] args) {

        String str = "Hello DevXer, today we are learning new theme: Loops";
        int vowel = 0;
        int cons = 0;
        int let = 0;

        while (let < str.length()) {
            if (str.charAt(let) == 'a' || str.charAt(let) == 'e' || str.charAt(let) == 'i' || str.charAt(let) == 'o'
                    || str.charAt(let) == 'u') {
                vowel++;
            } else {
                cons++;
            }
            let++;
        }
        System.out.println("There are" + " "  + vowel + " " +  "vowels");
        System.out.println("There are" + " " + cons + " " +  "consonants");
    }
}
