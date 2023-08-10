package src.behavioral.visitor.online_shopping;

import src.behavioral.visitor.online_shopping.entities.Item;
import src.behavioral.visitor.online_shopping.entities.Keyboard;
import src.behavioral.visitor.online_shopping.entities.Monitor;
import src.behavioral.visitor.online_shopping.entities.Mouse;
import src.behavioral.visitor.online_shopping.visitors.DisplayItems;
import src.behavioral.visitor.online_shopping.visitors.ShoppingCartTotal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        DisplayItems visitor = new DisplayItems();

        Mouse       mouse       = new Mouse("HP", 20);
        Keyboard    keyboard    = new Keyboard("Razor", 200);
        Monitor     monitor     = new Monitor("Sony", 500);

        List<Item> items = new ArrayList<>();

        items.add(mouse);
        items.add(keyboard);
        items.add(monitor);

        for (Item item : items) {
            item.accept(visitor);
        }

        System.out.println("**************");

        ShoppingCartTotal ShoppingCartTotal = new ShoppingCartTotal();
        for (Item item : items) {
            item.accept(ShoppingCartTotal);
        }
        System.out.println( ShoppingCartTotal.getAmount() );


    }
}
