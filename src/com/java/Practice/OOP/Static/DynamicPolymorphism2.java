package com.java.Practice.OOP.Static;

import java.util.Scanner;

class Browser2 {
    void openWebsite () {
        System.out.println("Open website");
    }

    void doLogin () {
        System.out.println("Log in");
    }

    void doLogOut () {
        System.out.println("Login out");
    }
}

class Chrome extends Browser2 {
    @Override
    void openWebsite () {
        System.out.println("Open website in Chrome");
    }

    void doLogin () {
        System.out.println("Log in in Chrome");
    }

    void doLogOut () {
        System.out.println("Login out in Chrome");
    }
}

class FireFox extends Browser2 {
    @Override

    void openWebsite () {
        System.out.println("Open website in Firefox");
    }

    void doLogin () {
        System.out.println("Log in in Firefox");
    }

    void doLogOut () {
        System.out.println("Login out in Firefox");
    }
}

class Safari extends Browser2 {
    @Override
    void openWebsite () {
        System.out.println("Open website in Safari");
    }

    void doLogin () {
        System.out.println("Log in in Safari");
    }

    void doLogOut () {
        System.out.println("Login out in Safari");
    }

}
public class DynamicPolymorphism2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a browser: ");
        String browser = scanner.next();

        Browser2 myBrowser2;

        if (browser.equalsIgnoreCase("Chrome")) {
            myBrowser2 = new Chrome();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            myBrowser2 = new FireFox();
        } else if (browser.equalsIgnoreCase("Safari")) {
            myBrowser2 = new Safari();
        } else {
            return;
        }

        myBrowser2.openWebsite();
        myBrowser2.doLogin();
        myBrowser2.doLogOut();
    }
}
