package org.example.strategy;

public class AdditionStrategy implements CalculationStrategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
