package src.creational.prototype;

public class Rectangle implements Shape {

    int width;
    int height;;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;;
    }

    @Override
    public void draw() {
        System.out.printf("Size of rectangle is width %d, height %d %n", width, height);
    }

    @Override
    public Shape clone() {
        return new Rectangle(width, height);
    }

}
