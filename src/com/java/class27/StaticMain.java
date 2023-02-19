package com.java.class27;

public class StaticMain {
    public static void main(String[] args) {
        Static p1 = new Static("Aelita", 22);
        Static p2 = new Static("Anara", 22);
        Static p3 = new Static("Anjelina", 22);
        Static p4 = new Static("Adelina", 22);
        Static p5 = new Static("Danis", 22);
        Static p6 = new Static("Danis", 22);


        int totalPeople = Static.getCount();
        System.out.println(totalPeople);

    }
}
