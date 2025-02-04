package org.example.factory.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccountFactory factory = new BankAccountFactory();

        // Create and open a Checking Account
        BankAccount checking = factory.createAccount(AccountType.CHECKING);
        if (checking != null) {
            checking.openAccount();
        }

        // Create and open a Savings Account
        BankAccount savings = factory.createAccount(AccountType.SAVINGS);
        if (savings != null) {
            savings.openAccount();
        }

        // Create and open a Money Market Account
        BankAccount money = factory.createAccount(AccountType.MONEY);
        if (money != null) {
            money.openAccount();
        }

        // Create and open a Certificate of Deposit Account
        BankAccount certificate = factory.createAccount(AccountType.CERTIFICATE);
        if (certificate != null) {
            certificate.openAccount();
        }
    }
}

