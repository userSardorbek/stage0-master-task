package com.epam.OOP;

public class Animal {
    String color;
    int numberOfPaws;
    boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public Animal() {
    }

    public void getDescription() {
        String result;
        if (hasFur) {
            System.out.print("This animal is mostly " + color + " It has " + numberOfPaws + " and a fur");
        } else {
            System.out.print("This animal is mostly " + color + " It has " + numberOfPaws + " and no fur");
        }
    }
}
