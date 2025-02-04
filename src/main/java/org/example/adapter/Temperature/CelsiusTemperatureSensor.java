package org.example.adapter.Temperature;

public class CelsiusTemperatureSensor implements TemperatureSensor {
    private double temperature;

    public CelsiusTemperatureSensor(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperatureCelsius() {
        return temperature;
    }
}
