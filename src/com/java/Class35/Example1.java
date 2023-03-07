package com.java.Class35;

import java.util.Scanner;

interface Browser {
    void openBrowser();

    void viewHistory();

    void openURL();
}

interface MobileBrowser extends Browser {
    void shareURLWhatsApp();

    void rotate();
}

//interface WebBrowser extends Browser {
//    void inspectElement();
//
//    void printPage();
//}

class Chrome implements Browser {

    @Override
    public void openBrowser() {
        System.out.println("Chrome Web Open Browser");
    }

    @Override
    public void viewHistory() {
        System.out.println("Chrome view history");
    }

    @Override
    public void openURL() {
        System.out.println("Chrome open URL");
    }
}

class FireFox implements Browser {

    @Override
    public void openBrowser() {
        System.out.println("Firefox Web Open Browser");
    }

    @Override
    public void viewHistory() {
        System.out.println("Firefox view history");
    }

    @Override
    public void openURL() {
        System.out.println("Firefox open URL");
    }
}

//class ChromeMobile implements MobileBrowser {
//
//    @Override
//    public void openBrowser() {
//
//    }
//
//    @Override
//    public void viewHistory() {
//
//    }
//
//    @Override
//    public void openURL() {
//
//    }
//
//    @Override
//    public void shareURLWhatsApp() {
//
//    }
//
//    @Override
//    public void rotate() {
//
//    }
//}


public class Example1 {
    public static void main(String[] args) {
        System.out.println("Please, Enter your browser");
        Scanner sc = new Scanner(System.in);
        String browserFromUser = sc.next();

        Browser browser = null;

        if (browserFromUser.contains("Mobile")) {
           browser = new Chrome ();
        } else if (browserFromUser.contains("Web")) {
            browser = new FireFox();
        }

        browser.openBrowser(); // we call just Browsers methods
        browser.openURL();
        browser.viewHistory();  // we can not call specific methods

//        if (browserFromUser.contains("Mobile")) {
//            MobileBrowser mobileBrowser = null;
//            mobileBrowser = new ChromeMobile();
//            mobileBrowser.rotate();
//            mobileBrowser.shareURLWhatsApp();
//        } else if (browserFromUser.contains("Web")) {
//            WebBrowser webBrowser = null;
//            if (browserFromUser.contains("Chrome")) {
//                webBrowser = new ChromeWeb();
//            } else {
//                webBrowser = new FireFoxWeb();
//            }
//            webBrowser.openBrowser();
//            webBrowser.viewHistory();
//            webBrowser.openURL();
//        }
    }
}
