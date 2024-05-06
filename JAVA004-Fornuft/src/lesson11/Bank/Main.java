package lesson11.Bank;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        System.out.println("Total number of bank accounts: " + BankAccount.getTotalAccounts());
    }
}
