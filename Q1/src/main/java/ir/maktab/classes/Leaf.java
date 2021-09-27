package main.java.ir.maktab.classes;

import main.java.ir.maktab.classes.Turner;

public class Leaf implements Turner {
    private String firstColor;
    private String secondColor;

    public Leaf(String firstColor, String secondColor) {
        this.firstColor = firstColor;
        this.secondColor = secondColor;
    }

    @Override
    public void turn() {
        System.out.println("Changing color!");
        System.out.println(firstColor + " changed to " + secondColor);
    }
}
