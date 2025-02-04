package org.example.adapter.Temperature;

public class Main {
    public static void main(String[] args) {
        // Create a Celsius temperature sensor with a reading of 25°C.
        TemperatureSensor celsiusSensor = new CelsiusTemperatureSensor(25);

        // Wrap the Celsius sensor with the adapter to get Fahrenheit values.
        FahrenheitTemperature fahrenheitSensor = new CelsiusToFahrenheitAdapter(celsiusSensor);

        // Output the temperature in Fahrenheit.
        System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheitSensor.getTemperatureFahrenheit());
    }
}
