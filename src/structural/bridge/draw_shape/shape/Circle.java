package src.structural.bridge.draw_shape.shape;

import src.structural.bridge.draw_shape.draw.Drawing;

public class Circle extends Shape{

    private Drawing drawing;
    double xPos;
    double yPos;
    double radius;

    public Circle(double xPos, double yPos, double radius, Drawing drawing) {

        super(drawing);

        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
        this.drawing = drawing;
    }

    @Override
    public void draw() {
        this.drawing.drawCircle(this.xPos, this.yPos, this.radius);
    }
}
