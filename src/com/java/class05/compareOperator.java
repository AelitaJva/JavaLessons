package com.java.class05;

public class compareOperator {
    public static void main(String[] args) {

        boolean giveCertificateAelita = false;
        double aelitaGPA = 4.0;
        int aelitaMissedClass = 0;

        giveCertificateAelita = aelitaGPA > 3.5 && aelitaMissedClass < 3;
        System.out.println("Yes: " + giveCertificateAelita);
    }
}
