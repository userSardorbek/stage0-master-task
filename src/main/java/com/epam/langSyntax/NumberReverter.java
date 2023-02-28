package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int reverted = 0;
        for (int i = 0; i < 3; i++) {
            reverted = reverted * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(reverted);
    }

}
