package com.java.class33;
class Phone {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private String model;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private String brand;
    private int memory;

    public int getMemory () {   // Getter
        return memory;
    }

    public void setMemory (int memory) {  // Setter
        System.out.println("Setting the memory to " + memory + " by user");
        this.memory = memory;
    }
}

public class GettingAndSetting {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.setMemory(70000);
        System.out.println(p.getMemory());
    }
}
