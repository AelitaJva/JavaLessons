package com.java.Class38;
class Box <T>{
    T num;

    T getData () {
        return num;
    }

    void setData (T num) {
        this.num = num;
    }
}

public class NeedOfGeneric {
    public static void main(String[] args) {
        Box <String> b1 = new Box();
        b1.setData("Hello");
        System.out.println(b1.getData());

        Box <Integer> b2 = new Box();
        b1.setData(String.valueOf(22));
        System.out.println(b1.getData());
    }
}
