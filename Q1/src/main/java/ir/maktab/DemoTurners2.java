package main.java.ir.maktab;

import main.java.ir.maktab.classes.Car;
import main.java.ir.maktab.classes.Window;

public class DemoTurners2 {
    public static void main(String[] args) {
        Car car =new Car();
        Window openWindow = new Window(true);
        Window closeWindow = new Window(false);

        car.turn();
        openWindow.turn();
        closeWindow.turn();

    }
}
