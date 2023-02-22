package com.java.class29;

class Phone {
    void call () {
        System.out.println("Phone is calling");
    }

    void text () {
        System.out.println("Phone is texting");
    }

    Phone () {
        System.out.println("Constructor from Phone");
    }
}

class iPhone extends Phone {
    void callSiri () {
        System.out.println();
    }

    void takeSelfie () {

    }

    iPhone () {
        System.out.println("Constructor from iPhone");
    }
}

class iPhonePro extends iPhone  {
    void rotate () {
        System.out.println("iPhone can be rotated");
    }

    void bend () {
        System.out.println("iPhone can be bended");
    }

    iPhonePro () {
        System.out.println("Constructor from iPhone");

    }
}
public class ClassAssignment2 {
    public static void main(String[] args) {
        iPhonePro c1 = new iPhonePro();
    }
}
