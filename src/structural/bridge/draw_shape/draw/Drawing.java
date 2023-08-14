package src.structural.bridge.draw_shape.draw;

public interface Drawing {
    void drawCircle(double xPos, double yPos, double radius);
    void drawRectangle(double x1Pos, double y1Pos, double x2Pos, double y2Pos);
    void drawTriangle(double x1Pos, double y1Pos, double x2Pos, double y2Pos, double x3Pos, double y3Pos);
}
