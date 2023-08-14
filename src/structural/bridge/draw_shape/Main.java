package src.structural.bridge.draw_shape;

import src.structural.bridge.draw_shape.draw.DrawDottedShape;
import src.structural.bridge.draw_shape.draw.DrawSolidShape;
import src.structural.bridge.draw_shape.draw.Drawing;
import src.structural.bridge.draw_shape.shape.Circle;
import src.structural.bridge.draw_shape.shape.Rectangle;
import src.structural.bridge.draw_shape.shape.Shape;
import src.structural.bridge.draw_shape.shape.Triangle;

public class Main {

    public static void main(String[] args) {

        Drawing solid = new DrawSolidShape();
        Drawing dotted = new DrawDottedShape();

        Shape circle = new Circle(5,5, 20, solid);
        Shape rectangle = new Rectangle(5,5, 20, 20, solid);
        Shape triangle  = new Triangle(5,5, 20, 20, 50, 50, solid);

        circle.draw();
        System.out.println("*********************");
        rectangle.draw();
        System.out.println("*********************");
        triangle.draw();
        System.out.println("*********************");

    }
}
