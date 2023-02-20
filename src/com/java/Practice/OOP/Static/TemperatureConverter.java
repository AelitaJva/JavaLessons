package com.java.Practice.OOP.Static;
class TempConvert {

    static void toFahrenheit (Double tempInCelsius) {
        tempInCelsius = (tempInCelsius * 1.8) + 32;
    }

    static void toCelsius (Double tempInFahrenheit) {
        tempInFahrenheit = tempInFahrenheit / 32 * 5.9;
    }
}

public class TemperatureConverter {
    public static void main(String[] args) {
        TempConvert n1 = new TempConvert();
        TempConvert n2 = new TempConvert();

//        n1.tempInFahrenheit();

    }
}
