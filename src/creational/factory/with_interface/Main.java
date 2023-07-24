package src.creational.factory.with_interface;

public class Main {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        IShape circle = shapeFactory.getShape(ShapeFactory.CIRCLE);
        IShape diamond = shapeFactory.getShape(ShapeFactory.DIAMOND);

        circle.draw();
        diamond.draw();

    }
}
