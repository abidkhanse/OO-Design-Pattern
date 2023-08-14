package src.structural.bridge.draw_shape.shape;

import src.structural.bridge.draw_shape.draw.Drawing;

public abstract class Shape {
    private Drawing drawing;
    Shape(Drawing drawing) {
        this.drawing = drawing;
    }

    public abstract void draw();

}
