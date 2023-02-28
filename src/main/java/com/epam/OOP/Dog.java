package com.epam.OOP;

public class Dog extends Animal {

    public Dog() {
        this.color = "brown";
        this.numberOfPaws = 4;
        this.hasFur = true;
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("This animal is mostly "+color+". It has "+numberOfPaws+" paws and a fur. Moreover, it has a tail.");
    }
}
