package src.structural.adapter.socket;

public class ThreeLeggedAdapter implements EUInterface {

    USInterface USInterface;

    public ThreeLeggedAdapter(USInterface USInterface) {
        this.USInterface = USInterface;
        System.out.println("Three legged adapter");
    }

    @Override
    public void intro() {
        USInterface.intro();
    }

    @Override
    public void twoLeggedSocket() {
        USInterface.threeLeggedSocket();
    }
}
