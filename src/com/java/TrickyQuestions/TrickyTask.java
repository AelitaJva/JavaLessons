package com.java.TrickyQuestions;

public class TrickyTask {

    // answer: 123 infinite times
    public static void main(String[] args) {
        for (int i=0; i<3; i++) {
            for (int j=1; j<4; j++) {
                i=i%4;
                System.out.println(j);
            }
        }
    }
}
