package src.structural.composite.products;

public class Main {
    public static void main(String[] args) {

        Product designPattern = new Book("Design Pattern", 25);
        Product marioBrose = new VideoGame("Mario Brose", 12);

        CompositeBox compositeBox = new CompositeBox();
        compositeBox.addProduct(designPattern);
        compositeBox.addProduct(marioBrose);

        System.out.println(compositeBox.calculatePrice());

    }

}
