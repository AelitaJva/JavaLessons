package com.java.class30;
class Drinks {

}

class HotDrinks {

    HotDrinks() {
        System.out.println("HotDrinks");
    }

    HotDrinks (String name) {
        System.out.println(name);
    }

}

class Tea extends HotDrinks {
    Tea () {
        this ("Original");  // this has to be a first statement only
        System.out.println("Preparing tea");
    }

    Tea (String flavour) {
        this("Masala", false);  // this has to be a first statement only
        System.out.println("Prep tea with flavour " + flavour);
    }

    Tea (String flavour, boolean withSugar) {
        System.out.println("Prep tea with flavour " + flavour);
    }
}
 public class ThisAndSupperWithConstructors {
     public static void main(String[] args) {
         Tea tea = new Tea();
     }
}
