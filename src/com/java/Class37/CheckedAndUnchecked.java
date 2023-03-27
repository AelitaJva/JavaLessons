package com.java.Class37;

import java.time.Duration;

public class CheckedAndUnchecked {
    public static void main(String[] args) throws InterruptedException, NullPointerException{
        System.out.println("Hello");
        Thread.sleep(Duration.ofMillis(5000));
        System.out.println("How are you?");
    }
}