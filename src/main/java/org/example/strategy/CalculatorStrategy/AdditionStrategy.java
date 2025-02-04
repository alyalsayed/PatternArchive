package org.example.strategy.CalculatorStrategy;

public class AdditionStrategy implements CalculationStrategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
