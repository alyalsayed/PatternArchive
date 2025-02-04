package org.example.factory.BankAccount;

public class CertificateAccount implements BankAccount {
    @Override
    public void openAccount() {
        System.out.println("Opening a Certificate of Deposit Account.");
    }
}
