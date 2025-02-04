package org.example.adapter.Temperature;

public class CelsiusToFahrenheitAdapter implements FahrenheitTemperature {
    private TemperatureSensor celsiusSensor;

    public CelsiusToFahrenheitAdapter(TemperatureSensor sensor) {
        this.celsiusSensor = sensor;
    }

    @Override
    public double getTemperatureFahrenheit() {
        double celsius = celsiusSensor.getTemperatureCelsius();
        return celsius * 9 / 5 + 32;
    }
}
