package src.behavioral.template.sports;

public class Main {

    public static void main(String[] args) {

        Game cricket = new Cricket();
        cricket.play();

        System.out.println("*************");

        Game hockey = new Hockey();
        hockey.play();

    }

}
