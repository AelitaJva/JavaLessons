package com.java.Practice.OOP.Static;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    double calculatePay() {
        return 0.0;
    }
}

class HourlyEmployee extends Employee {

    double hourlyRate;
    double hourlyWorked;

    HourlyEmployee(String name, double hourlyRate, double hourlyWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hourlyWorked = hourlyWorked;
    }

    double calculatePay() {
        return hourlyRate * hourlyWorked;
    }
}

class SalaryEmployee extends Employee {
    double salary;

    SalaryEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    double calculatePay() {
        return salary / 52;
    }
}

public class Employee1 {
    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee("John",10.0, 40.0);
        SalaryEmployee salaryEmployee = new SalaryEmployee("Tom", 52000.00);

        System.out.println(hourlyEmployee.getName() + " earned $ " + hourlyEmployee.calculatePay() + " this week");
        System.out.println(salaryEmployee.getName() + " earned $ " + salaryEmployee.calculatePay() + " this week");
    }
}
