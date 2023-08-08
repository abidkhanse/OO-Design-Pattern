package src.behavioral.template.construction;

public class WoodenHouse extends HouseTemplate {

    public WoodenHouse() {
        System.out.println("Wooden house construction started");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building walls with wood");
    }

    @Override
    protected void buildPillars() {
        System.out.println("Building pillars with wooden sheet");
    }
}
