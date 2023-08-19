package src.structural.flyweight.fonts;

import java.util.HashMap;

public class FontFactory {

    private HashMap<String, Font> fontCollection;

    public FontFactory() {
        fontCollection = new HashMap<>();
    }

    public Font getFont(String name, String size) {

        String key = name + size;
        Font font = fontCollection.get(key);
        if (font == null) {

            System.out.println("Font " + name + " not found in Factory");
            font = new SharedFont(name,size);
            fontCollection.put(key, font);

        } else {
            // just for verification, otherwise not need this else statement
            System.out.println("Font " + name + " found in Factory");
        }

        return font;
    }

}
