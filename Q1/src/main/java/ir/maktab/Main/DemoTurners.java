package main.java.ir.maktab.Main;

import main.java.ir.maktab.classes.Leaf;
import main.java.ir.maktab.classes.Page;
import main.java.ir.maktab.classes.Pancake;

public class DemoTurners {
    public static void main(String[] args) {
        Leaf leaf = new Leaf("Red", "Blue");
        Page page = new Page(10);
        Pancake pancake = new Pancake();

        leaf.turn();
        page.turn();
        pancake.turn();
    }

}
