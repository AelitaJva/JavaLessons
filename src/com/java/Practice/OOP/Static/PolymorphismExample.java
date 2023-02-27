package com.java.Practice.OOP.Static;
class Shape1 {
    void draw () {
        System.out.println("Drawing a shape");
    }
}

class Circle1 extends Shape1 {
    void draw () {
        System.out.println("Drawing a circle");
    }
}

class Square1 extends Shape1 {
    void draw () {
        System.out.println("Drawing a square");
    }
}

class Triangle extends Shape1 {
    void draw () {
        System.out.println("Drawing a triangle");
    }
}


public class PolymorphismExample {
    public static void main(String[] args) {
        Shape1 [] shapes = new Shape1[3];
        shapes[0] = new Circle1 ();
        shapes [1] = new Square1();
        shapes [2] = new Triangle();

        for (Shape1 shape1 : shapes) {
            shape1.draw();
        }

    }
}
