package builder.car_builder;

public class Main {
    public static void main(String[] args) {

        Car car = CarBuilder.builder()
                .setName("Toyota")
                .setModel("Lexus")
                .setColor("Black")
                .setYear(2023).build();

        System.out.println(car.toString());

    }
}
