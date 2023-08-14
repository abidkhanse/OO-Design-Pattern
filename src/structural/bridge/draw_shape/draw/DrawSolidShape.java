package src.structural.bridge.draw_shape.draw;

public class DrawSolidShape implements Drawing{


    @Override
    public void drawCircle(double xPos, double yPos, double radius) {
        System.out.printf("Draw Solid circle at position [%s,%s] with radius %s \n", xPos , yPos, radius);
    }

    @Override
    public void drawRectangle(double x1Pos, double y1Pos, double x2Pos, double y2Pos) {
        System.out.printf("Draw Solid rectangle from position [%s,%s] to [%s,%s] \n", x1Pos , y1Pos, x2Pos , y2Pos);
    }

    @Override
    public void drawTriangle(double x1Pos, double y1Pos, double x2Pos, double y2Pos, double x3Pos, double y3Pos) {
        System.out.printf("Draw Solid triangle at position [%s,%s], [%s,%s] and [%s,%s] \n", x1Pos , y1Pos, x2Pos , y2Pos,  x3Pos , y3Pos);
    }

}
