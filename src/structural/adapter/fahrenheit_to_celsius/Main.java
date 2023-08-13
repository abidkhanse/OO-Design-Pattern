package src.structural.adapter.fahrenheit_to_celsius;
public class Main {
    public static void main(String[] args) {

        FahrenheitTemperature fahrenheitTemperature = new FahrenheitTemperature(98.0);
        Temperature fahrenheitToCelsiusAdapter = new FahrenheitToCelsiusAdapter(fahrenheitTemperature);

        System.out.println("Fahrenheit Temperature: " + fahrenheitTemperature.getTemperatureInFahrenheit());
        System.out.println("Celsius Temperature: " + fahrenheitToCelsiusAdapter.getTemperatureToCelsius());
    }
}