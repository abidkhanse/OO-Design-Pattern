package src.behavioral.visitor.insurance;

public class Restaurant implements Client {
    private String name;

    public Restaurant(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitRestaurant(this);
    }
}
