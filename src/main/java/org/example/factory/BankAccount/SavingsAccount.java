package org.example.factory.BankAccount;

public class SavingsAccount implements BankAccount {
    @Override
    public void openAccount() {
        System.out.println("Opening a Savings Account.");
    }
}
