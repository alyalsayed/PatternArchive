package org.example.strategy;

public class Main {
    public static void main(String[] args) {
        // Use AdditionStrategy
        Calculator calculator = new Calculator(new AdditionStrategy());
        System.out.println("Addition (10 + 5): " + calculator.calculate(10, 5));  // Output: 15

        // Change strategy to SubtractionStrategy
        calculator.setStrategy(new SubtractionStrategy());
        System.out.println("Subtraction (10 - 5): " + calculator.calculate(10, 5));  // Output: 5

        // Change strategy to MultiplicationStrategy
        calculator.setStrategy(new MultiplicationStrategy());
        System.out.println("Multiplication (10 * 5): " + calculator.calculate(10, 5));  // Output: 50
    }
}
