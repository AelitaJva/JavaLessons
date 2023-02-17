package com.java.class26;

public class Exam {
    String nameOfBook;
    String language;
    int price;


    Exam () {
        System.out.println("Hello, welcome to out book shop");
    }

    Exam (String nameOfBookFromUser, String languageFromUser) {
        nameOfBook = nameOfBookFromUser;
        language = languageFromUser;
        price = 2500;

    }

}
