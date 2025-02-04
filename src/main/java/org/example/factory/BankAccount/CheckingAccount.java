package org.example.factory.BankAccount;

public class CheckingAccount implements BankAccount {
    @Override
    public void openAccount() {
        System.out.println("Opening a Checking Account.");
    }
}
