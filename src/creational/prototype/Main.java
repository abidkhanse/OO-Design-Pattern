package src.creational.prototype;

public class Main {

    public static void main(String[] args) {

        ShapeCache shapeCache = new ShapeCache();

        Shape circle = shapeCache.getClone(Circle.class.getSimpleName());
        Shape rectangle = shapeCache.getClone(Rectangle.class.getSimpleName());

        circle.draw();
        rectangle.draw();

    }
}
