package ir.maktab.classes;

public class Car implements Turner {
    private boolean isOn;

    public Car(boolean isOn) {
        this.isOn = isOn;
    }

    @Override
    public void turn() {
        System.out.println(isOn ? "Start engine" : "turn off");
    }
}
