package src.behavioral.template.construction;

public class GlassHouse extends HouseTemplate {

    public GlassHouse() {
        System.out.println("Glass house construction started");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building glass walls");
    }

    @Override
    protected void buildPillars() {
        System.out.println("Building pillars with glass coating");
    }

}
