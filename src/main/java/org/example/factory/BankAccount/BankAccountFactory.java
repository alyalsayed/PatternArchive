package org.example.factory.BankAccount;

public class BankAccountFactory {
    public BankAccount createAccount(AccountType type) {
        if (type == null) {
            return null;
        }
        switch (type) {
            case CHECKING:
                return new CheckingAccount();
            case SAVINGS:
                return new SavingsAccount();
            case MONEY:
                return new MoneyAccount();
            case CERTIFICATE:
                return new CertificateAccount();
            default:
                return null;
        }
    }
}
