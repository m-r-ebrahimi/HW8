package main.java.ir.maktab.classes;

import main.java.ir.maktab.classes.Turner;

public class Pancake implements Turner {
    @Override
    public void turn() {
        System.out.println("Flipping!");
    }
}
