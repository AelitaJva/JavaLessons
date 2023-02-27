package com.java.class31;

class Shape {
    void draw () {
        System.out.println("Drawing");
    }
    void erase () {
    }
}
class Circle extends Shape {
    @Override
    void draw () {
        System.out.println("Drawing circle");
    }
}

class Square extends Shape {
    @Override
    void draw () {
        System.out.println("Drawing square");
    }
}
public class Assignment {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}
