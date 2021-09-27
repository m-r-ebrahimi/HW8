package main.java.ir.maktab.classes;

public class Window implements Turner {
    private boolean isOpen;

    public Window(boolean isOpen) {
        this.isOpen = isOpen;
    }

    @Override
    public void turn() {
        System.out.println(isOpen ? "Close the window." : "Open the window.");
    }
}
