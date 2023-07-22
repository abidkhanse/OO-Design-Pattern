package factory.with_interface;

import java.awt.*;

public class ShapeFactory {
    public static final String CIRCLE = "circle";
    public static final String DIAMOND = "diamond";

    ShapeFactory(){}

    public IShape getShape(String shapeName) {

        IShape shape = null;

        if (shapeName.toLowerCase().equals(CIRCLE)) {
            shape = new Circle();

        } else if (shapeName.toLowerCase().equals(DIAMOND)) {
            shape = new Diamond();
        }

        return shape;

    }


}
