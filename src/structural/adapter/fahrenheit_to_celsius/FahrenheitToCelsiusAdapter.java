package src.structural.adapter.fahrenheit_to_celsius;

public class FahrenheitToCelsiusAdapter implements Temperature {
    private final FahrenheitTemperature fahrenheitTemperature;

    public FahrenheitToCelsiusAdapter(FahrenheitTemperature fahrenheitTemperature) {
        this.fahrenheitTemperature = fahrenheitTemperature;
    }

    @Override
    public double getTemperatureToCelsius() {
        return (this.fahrenheitTemperature.getTemperatureInFahrenheit() - 32) * 5.0 / 9.0;
    }

}
