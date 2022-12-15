package com.java.class06;

// u have to be able to use Scanner
// import statement is a statment that tell out classes to use functionalities
// from different packages
import java.util.Scanner;

public class inputFromUser {
    //compiling a cose -> checking if we are matching all syntax rules
    public static void main(String[] args) {

        // before u can use scanner u have to have import statement
        Scanner info = new Scanner(System.in);
        System.out.println("Type here: ");


        // this -> will enable us to input data to our programe
        // I have never be able to type anything without this
        // it allows us to enter an integer

        info.nextInt();


        //write any text
//        input.nextLine();

        //any decimal value
          //info.nextDouble();

        // user can write true or false o ly
        // input.nextBoolean();



    }
}
