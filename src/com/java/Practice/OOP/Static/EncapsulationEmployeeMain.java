package com.java.Practice.OOP.Static;

public class EncapsulationEmployeeMain {
    public static void main(String[] args) {
        EncapsulationEmployee employee = new EncapsulationEmployee(1, "Aelita");
        employee.setName("Adelina");
        System.out.println("Employee name " + employee.getName());
    }
}
