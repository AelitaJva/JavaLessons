package com.java.TrickyQuestions;

class Test {
    int count;
    Test () {
        count++;
    }
    public void printNumber () {
        System.out.println(count);
    }
}
public class Question9 {
    public static void main(String[] args) {
        Test d1 = new Test ();
        Test d2 = new Test ();
        Test d3 = new Test ();
        Test d4 = new Test ();

        d1.printNumber();
        d2.printNumber();
        d3.printNumber();
        d4.printNumber();
    }
}
