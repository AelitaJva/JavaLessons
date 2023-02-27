package com.java.Practice.OOP.Static;
class Shape {
    void draw () {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw () {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    void draw () {
        System.out.println("Drawing a square");
    }
}

class DynamicalPolymorphism {
    public static void main(String[] args) {
        Shape sh1 = new Circle();
        Shape sh2 = new Square();

        sh1.draw();
        sh2.draw();
    }
}
