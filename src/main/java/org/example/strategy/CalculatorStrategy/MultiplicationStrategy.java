package org.example.strategy;

public class MultiplicationStrategy implements CalculationStrategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
