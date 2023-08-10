package src.behavioral.visitor.insurance;

public interface Client {

    String getName();

    void accept(Visitor visitor);
}
