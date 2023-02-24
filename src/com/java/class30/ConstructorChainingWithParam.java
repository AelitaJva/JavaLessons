package com.java.class30;
class Animal {
    Animal (String name) {
        System.out.println("From Animal" + name);
    }

    Animal (int age ) {
        System.out.println("From Animal " + age);
    }
}

class Dog extends Animal {
    Dog (String name) {
        super ("xyz");
        System.out.println("From Dog" + name);
    }
}

class Pets extends Dog {
    Pets () {
        super ("Jhonty");
        System.out.println("From Pets");
    }
}


public class ConstructorChainingWithParam {
    public static void main(String[] args) {
        Pets pets = new Pets();
    }
}
