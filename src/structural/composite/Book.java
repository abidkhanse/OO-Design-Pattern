package src.structural.composite;

public class Book extends Product {
    String title;
    double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        return this.price;
    }

}
