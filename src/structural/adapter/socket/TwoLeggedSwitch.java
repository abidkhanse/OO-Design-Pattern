package src.structural.adapter.socket;

public class TwoLeggedSwitch implements EUInterface {

    public TwoLeggedSwitch() {
        System.out.println("Two legged Switch");
    }
    @Override
    public void intro() {
        System.out.println("I am TWO Legged Switch");
    }

    @Override
    public void twoLeggedSocket() {
        System.out.println("I worked with TWO legged sockets");
    }
}
