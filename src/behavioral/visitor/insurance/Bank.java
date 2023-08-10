package src.behavioral.visitor.insurance;

public class Bank implements Client{

    private String name;

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBank(this);
    }

}

