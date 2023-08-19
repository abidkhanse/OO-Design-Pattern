package src.structural.flyweight.fonts;

public class Main {
    public static void main(String[] args) {

        /* Without Fly Weight */
        Font times1 = new SharedFont("Times New Roman", "12");
        Font times2 = new SharedFont("Times New Roman", "12");
        Font thoma = new SharedFont("Thoma", "15");

        times1.render("** FlyWeight Text 1 **");
        times2.render("** FlyWeight Text 2 **");
        thoma.render("** FlyWeight Text 3 **");

        System.out.println("Are times1 and times2 same objects: " + (times1.equals(times2)) );

        System.out.println("***************************************************************");
        System.out.println("***************************************************************");

        /* With Fly Weight */
        FontFactory fontFactory = new FontFactory();

        Font flyWeight1 = fontFactory.getFont("Times New Roman" , "12");
        Font flyWeight2 = fontFactory.getFont("Times New Roman" , "12");
        Font flyWeight3 = fontFactory.getFont("Thoma" , "15");

        flyWeight1.render("** FlyWeight Text 1 **");
        flyWeight2.render("** FlyWeight Text 2 **");
        flyWeight3.render("** FlyWeight Text 3 **");

        System.out.println("Are fly Weight1 and fly Weight2 same objects: " + (flyWeight1.equals(flyWeight2)) );

    }
}
