package src.behavioral.template.construction;

public abstract class HouseTemplate {

    public void buildHouse() {

        buildFoundation();
        buildPillars();
        buildWalls();
        installWindows();

    }

    protected void installWindows() {
        System.out.println("Installing Glass windows");
    }

    protected abstract void buildWalls();

    protected abstract void buildPillars();

    protected void buildFoundation() {
        System.out.println("Building foundation with cement,iron rods and sand");
    }

}
