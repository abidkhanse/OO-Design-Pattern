package src.creational.factory.with_interface;

public class Circle implements IShape{
    @Override
    public void draw() {
        System.out.println("Circle drawn");
    }
}
