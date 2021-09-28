package ir.maktab.classes;

public class DemoTurners2 {
    public static void main(String[] args) {
        Car car =new Car(true);
        Window openWindow = new Window(true);
        Window closeWindow = new Window(false);

        car.turn();
        openWindow.turn();
        closeWindow.turn();

    }
}
