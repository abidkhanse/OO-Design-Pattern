package src.creational.prototype;

public class Circle implements Shape {

    int posX;
    int posY;
    int radius;

    public Circle(int posX, int posY, int radius) {
        this.posX = posX;
        this.posY = posY;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Circle is drawn on %d %d position and its radius is %d%n", posX, posY, radius);
    }

    @Override
    public Shape clone() {
        return new Circle(posX, posY, radius);
    }

}
