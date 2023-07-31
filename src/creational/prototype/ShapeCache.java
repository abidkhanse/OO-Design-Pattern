package src.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    Map<String, Shape> shapeMap;

    public ShapeCache() {
        shapeMap = new HashMap<>();
        loadShapes();
    }

    Shape getClone(String shapeName) {

        Shape shape = shapeMap.get(shapeName);
        if (shape != null) {
            return shape.clone();
        }
        return null;
    }

    private void loadShapes() {

        Circle c = new Circle(5,5,10);
        Rectangle r = new Rectangle(20, 25);

        shapeMap.put(Circle.class.getSimpleName(), c);
        shapeMap.put(Rectangle.class.getSimpleName(), r);

    }


}
