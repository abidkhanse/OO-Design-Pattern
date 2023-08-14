package src.structural.bridge.draw_shape.draw;

public class DrawDottedShape implements Drawing{

    @Override
    public void drawCircle(double xPos, double yPos, double radius) {
        System.out.printf("Draw dotted circle at position [%s,%s] with radius %s", xPos , yPos, radius);
    }

    @Override
    public void drawRectangle(double x1Pos, double y1Pos, double x2Pos, double y2Pos) {
        System.out.printf("Draw dotted rectangle from position [%s,%s] to [%s,%s] ", x1Pos , y1Pos, x2Pos , y2Pos);
    }

    @Override
    public void drawTriangle(double x1Pos, double y1Pos, double x2Pos, double y2Pos, double x3Pos, double y3Pos) {
        System.out.printf("Draw dotted triangle at position [%s,%s], [%s,%s] and [%s,%s] ", x1Pos , y1Pos, x2Pos , y2Pos,  x3Pos , y3Pos);
    }

}
