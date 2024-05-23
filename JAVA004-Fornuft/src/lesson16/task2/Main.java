package lesson16.task2;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1", "Sam Winchester", 1000);
        BankAccount bankAccount2 = new BankAccount("2", "Dean Winchester", 500);

        try {
            bankAccount.transferFunds(bankAccount2, 1100);
        } catch (InvalidAccountException | InsufficientFundsException | InvalidDepositException e) {
            System.err.println(e.getMessage());
        }

//        try {
//            bankAccount.withdraw(1100);
//
//        } catch (InsufficientFundsException e) {
//            System.err.println(e.getMessage());
//        }

//        try {
//            bankAccount.deposit(-1100);
//
//        } catch (InvalidDepositException e) {
//            System.err.println(e.getMessage());
//            System.out.println("Negative Deposit");
//        }
    }
}
