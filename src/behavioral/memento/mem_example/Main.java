package src.behavioral.memento.mem_example;

public class Main {


    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();

        Organizer organizer = new Organizer();
        careTaker.add(organizer.execute("State # 1"));
        careTaker.add(organizer.execute("State # 2"));
        careTaker.add(organizer.execute("State # 3"));

        String s;
        s = organizer.getStateFromMemento(careTaker.getMemento(0));
        System.out.println(s);

        s = organizer.getStateFromMemento(careTaker.getMemento(1));
        System.out.println(s);

    }
}
