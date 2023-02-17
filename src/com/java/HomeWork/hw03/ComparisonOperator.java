package com.java.HomeWork.hw03;

public class ComparisonOperator {
    public static void main(String[] args) {
        int creditScore = 1500;
        boolean maritalStatus = true;
        int numberofChildren = 3;
        boolean haveFamilyHealthInsurance;

        haveFamilyHealthInsurance = creditScore > 600 && maritalStatus == true && numberofChildren > 2;

        System.out.println(haveFamilyHealthInsurance);





//        boolean haveNotFamilyHealthInsurance = false;

//        if(creditScore > 680 && maritalStatus == true && numberofChildren > 2) {
//            System.out.println("Yes: " + haveFamilyHealthInsurance);
//        } else  {
//            System.out.println("No: " + haveNotFamilyHealthInsurance);
//        }
    }
}
