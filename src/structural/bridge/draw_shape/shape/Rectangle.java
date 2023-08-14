package src.structural.bridge.draw_shape.shape;

import src.structural.bridge.draw_shape.draw.Drawing;

public class Rectangle extends Shape {

    private Drawing drawing;

    double x1Pos;
    double y1Pos;
    double x2Pos;
    double y2Pos;
    public Rectangle(double x1Pos, double y1Pos, double x2Pos, double y2Pos, Drawing drawing) {

        super(drawing);

        this.x1Pos = x1Pos;
        this.y1Pos = y1Pos;
        this.x2Pos = x2Pos;
        this.y2Pos = y2Pos;
        this.drawing = drawing;

    }

    @Override
    public void draw() {
        this.drawing.drawRectangle(this.x1Pos, this.y1Pos, this.x2Pos, this.y2Pos);
    }
}
