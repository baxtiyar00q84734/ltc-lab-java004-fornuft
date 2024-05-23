package lesson16.task2;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double depositAmount) throws InvalidDepositException {
        if (depositAmount > 0) {
            balance += depositAmount;
        } else {
            throw new InvalidDepositException("Deposit amount must be positive.");
        }
    }

    public void withdraw(double withdrawAmount) throws InsufficientFundsException {
        if (withdrawAmount > 0) {
            if (withdrawAmount <= balance) {
                balance -= withdrawAmount;
            } else {
                throw new InsufficientFundsException("Insufficient balance. Withdrawal amount exceeds the current balance.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }


    public void transferFunds(BankAccount toAccount, double amount) throws InsufficientFundsException, InvalidAccountException, InvalidDepositException {
        if (toAccount == null) {
            throw new InvalidAccountException("The destination account is invalid.");
        }
        if (amount <= 0) {
            throw new InvalidAccountException("Transfer amount must be positive.");
        }
        if (balance < amount) {
            throw new InsufficientFundsException("Insufficient funds for the transfer.");
        }
        this.withdraw(amount);
        toAccount.deposit(amount);
    }




    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
