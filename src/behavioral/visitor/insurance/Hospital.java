package src.behavioral.visitor.insurance;

public class Hospital implements Client {

    String name;

    public Hospital(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitHospital(this);
    }

}
