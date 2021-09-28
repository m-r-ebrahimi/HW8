package ir.maktab.classes;

public class Car implements Turner{
    @Override
    public void turn() {
        System.out.println("Start engine");
    }
}
