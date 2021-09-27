package main.java.ir.maktab.classes;

import main.java.ir.maktab.classes.Turner;

public class Page implements Turner {
    private int page;

    public Page(int page) {
        this.page = page;
    }

    @Override
    public void turn() {
        System.out.println("Going to next page!");
        System.out.println(page + " -> " + (page + 1));
    }
}
