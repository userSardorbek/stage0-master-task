package com.epam.OOP;

public class Bird extends Animal {

    public Bird() {
        this.color = "blue";
        this.numberOfPaws = 2;
        this.hasFur = false;
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println(" Moreover, it has 2 wings and can fly.");
    }
}
