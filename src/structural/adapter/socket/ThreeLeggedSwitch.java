package src.structural.adapter.socket;

public class ThreeLeggedSwitch implements USInterface {

    public ThreeLeggedSwitch() {
        System.out.println("Three legged Switch");
    }
    @Override
    public void intro() {
        System.out.println("I am a THREE Legged Switch");
    }

    @Override
    public void threeLeggedSocket() {
        System.out.println("I worked with THREE legged sockets");

    }
}
