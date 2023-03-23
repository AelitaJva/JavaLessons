package com.java.Practice.John;

import java.util.Scanner;

class Browser {
    void openWebsite () {
        System.out.println("Opening website");
    }

    void doLogin () {
        System.out.println("Login in");
    }

    void doLogout () {
        System.out.println("Login out");
    }
}

class Chrome extends Browser {

}
class Firefox extends Browser {

}
class Safari extends Browser {

}

public class DynamicalPolymorphism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter browser ");
        String browser = scanner.next();

        Browser br = null;

        if (browser.equals("chrome")) {
            br = new Chrome();
        } else if (browser.equals("firefox")) {
            br = new Firefox();
        } else if (browser.equals("safari")) {
            br = new Safari();
        } else {
            throw  new RuntimeException("Invalid browser specified");
        }

        br.openWebsite();
        br.doLogin();
        br.doLogout();
    }
}
