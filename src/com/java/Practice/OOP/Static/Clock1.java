package com.java.Practice.OOP.Static;

class Clock {
    int hour;
    int minute;
    int second;
    static int numClocks = 0;

    Clock(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
        numClocks++;
    }

    void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour value");
        }
    }


    void setMinute(int minute) {
        if(minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid minute value");
        }
    }

    void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid minute value");
        }
    }

    int getHour () {
        return hour;
    }

    int getMinute () {
        return minute;
    }

    int getSecond () {
        return second;
    }

    void tick () {
        second++;
        if(second == 60) {
            second = 0;
            minute++;
            if(minute == 60) {
                minute=0;
                hour = (hour + 1) / 24;
            }
        }
    }

    void reset () {
        hour = 0;
        minute = 0;
        second = 0;
    }

    static int getNumClocks () {
        return numClocks;
    }
}

public class Clock1 {
    public static void main(String[] args) {
        Clock cl1 = new Clock(3, 34, 56);
        Clock cl2 = new Clock(6, 12, 8);

        System.out.println("Clock 1: " + cl1.getHour() + ":" + cl1.getMinute() + ":" + cl1.getSecond());

        cl1.tick();

        System.out.println("Clock 1 after ticking: " + cl1.getHour() + ":" + cl1.getMinute() + ":" + cl1.getSecond());

        cl1.reset();
        System.out.println("Clock 1 after ticking: " + cl1.getHour() + ":" + cl1.getMinute() + ":" + cl1.getSecond());

        int numClocks = Clock.getNumClocks();
        System.out.println("Number of clock objects: " + numClocks);
    }
}
