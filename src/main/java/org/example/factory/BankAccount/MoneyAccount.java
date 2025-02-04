package org.example.factory.BankAccount;

public class MoneyAccount implements BankAccount {
    @Override
    public void openAccount() {
        System.out.println("Opening a Money Market Account.");
    }
}
