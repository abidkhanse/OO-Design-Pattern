package builder.car_builder;

public class Car {

    String name;
    int year;
    String model;
    String color;

    public Car(String name, int year, String model, String color) {
        this.name = name;
        this.year = year;
        this.model = model;
        this.color = color;
    }

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
