package src.structural.adapter.socket;

public class Main {
    public static void main(String[] args) {

        EUInterface euInterface = new TwoLeggedSwitch();
        euInterface.intro();
        euInterface.twoLeggedSocket();
        System.out.println("****************\n");

        USInterface usInterface = new ThreeLeggedSwitch();
        usInterface.intro();
        usInterface.threeLeggedSocket();
        System.out.println("****************\n");

        EUInterface europeanSwitch = new ThreeLeggedAdapter(usInterface);
        europeanSwitch.intro();
        europeanSwitch.twoLeggedSocket();

    }
}
