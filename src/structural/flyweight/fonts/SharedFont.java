package src.structural.flyweight.fonts;

public class SharedFont implements Font {

    private final String type;
    private final String size;

    public SharedFont(String type, String size) {
        this.type = type;
        this.size = size;
    }

    @Override
    public void render(String text) {
        System.out.printf("Rendering text %s with font type %s and font size %s \n", text, this.type, this.size);
    }

}
