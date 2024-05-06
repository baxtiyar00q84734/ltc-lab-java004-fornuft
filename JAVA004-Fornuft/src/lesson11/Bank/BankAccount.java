package lesson11.Bank;

public class BankAccount {
    private static int totalAccounts = 0;

    public BankAccount() {
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}
