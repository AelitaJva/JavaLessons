package com.java.class26;

public class ExamMain {
    public static void main(String[] args) {
        Exam welcome = new Exam();

        Exam choice = new Exam("Mountains", "English");
        System.out.println("Price is " + choice.price);
        System.out.println("Your choice was " + choice.nameOfBook + " which is in " + choice.language + " language");


    }
}
