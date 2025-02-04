package org.example.strategy;

public class SubtractionStrategy implements CalculationStrategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
