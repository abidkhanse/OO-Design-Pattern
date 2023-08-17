package src.structural.composite.products;

public class VideoGame extends Product {
    String title;
    double price;

    public VideoGame(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        return this.price;
    }

}
