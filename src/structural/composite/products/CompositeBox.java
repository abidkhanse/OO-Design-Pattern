package src.structural.composite.products;

import java.util.ArrayList;
import java.util.List;

public class CompositeBox implements Box {

    private List<Box> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }


    @Override
    public double calculatePrice() {

        double price = 0;

        for(Box product : products) {
            price += product.calculatePrice();
        }

        return price;
    }
}
