package com.screenmatch.exercises.module3;

public class Cat extends Animal {
    private int livesNumber = 7;

    @Override
    public String emitAnimalSound() {
        return "Meeeh meeeeeeeeeh!";
    }

    public int getLivesNumber() {
        return livesNumber;
    }

    public void makeSomethingRisky() {
        if (livesNumber > 1) {
            System.out.println("Your cat tried to get a bug, but throws from somewhere high");
            livesNumber -= 1;
        } else {
            System.out.println("Your cat has fear to do something dangerous :(");
        }
    }
}
