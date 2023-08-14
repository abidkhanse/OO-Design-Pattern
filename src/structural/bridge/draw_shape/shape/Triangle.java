package src.structural.bridge.draw_shape.shape;

import src.structural.bridge.draw_shape.draw.Drawing;

public class Triangle extends Shape {

    private Drawing drawing;

    double x1Pos;
    double y1Pos;
    double x2Pos;
    double y2Pos;
    double x3Pos;
    double y3Pos;
    public Triangle(double x1Pos, double y1Pos, double x2Pos, double y2Pos, double x3Pos, double y3Pos, Drawing drawing) {

        super(drawing);

        this.x1Pos = x1Pos;
        this.y1Pos = y1Pos;
        this.x2Pos = x2Pos;
        this.y2Pos = y2Pos;
        this.x3Pos = x3Pos;
        this.y3Pos = y3Pos;
        this.drawing = drawing;

    }

    @Override
    public void draw() {
        this.drawing.drawTriangle(this.x1Pos, this.y1Pos, this.x2Pos, this.y2Pos , this.x3Pos, this.y3Pos);
    }
}
