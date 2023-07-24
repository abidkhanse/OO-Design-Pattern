package src.creational.builder.car_builder;

public class CarBuilder {
    private String name;
    private int year;
    private String model;
    private String color;

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public Car build() {
        return new Car(this.name, this.year, this.model, this.color);
    }

}
